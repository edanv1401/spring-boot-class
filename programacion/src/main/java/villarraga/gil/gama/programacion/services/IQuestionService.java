package villarraga.gil.gama.programacion.services;

import java.util.*;

import villarraga.gil.gama.programacion.dto.QuestionDto;
import villarraga.gil.gama.programacion.dto.ResponseAnswer;

public interface IQuestionService {
    List<QuestionDto> getAll();
    ResponseAnswer validateAnswer(Long questionId, Long answerId);
}
