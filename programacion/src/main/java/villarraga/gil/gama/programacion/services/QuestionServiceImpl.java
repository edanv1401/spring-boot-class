package villarraga.gil.gama.programacion.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import villarraga.gil.gama.programacion.dto.QuestionDto;
import villarraga.gil.gama.programacion.dto.ResponseAnswer;
import villarraga.gil.gama.programacion.entities.Question;
import villarraga.gil.gama.programacion.repositories.IQuestionRepository;
import villarraga.gil.gama.programacion.utils.QuestionMapper;

@Service
public class QuestionServiceImpl implements IQuestionService{
    private final IQuestionRepository repository;

    public QuestionServiceImpl(@Autowired IQuestionRepository _repository){
        repository = _repository;
    }

    @Override
    public List<QuestionDto> getAll() {
        return repository
            .findAll()
            .stream()
            .map(i -> QuestionMapper.toDto(i))
            .toList();
    }

    @Override
    public ResponseAnswer validateAnswer(Long questionId, Long answerId) {
        Question question = repository.findById(questionId).orElseThrow();
        Boolean answer = question.getAnswer()
            .stream()
            .filter(i -> (i.getId().equals(answerId) && i.getVerify() == true))
            .toList()
            .size() > 0;
        return new ResponseAnswer(answer);
    }    
}
