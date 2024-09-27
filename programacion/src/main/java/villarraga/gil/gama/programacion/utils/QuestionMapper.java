package villarraga.gil.gama.programacion.utils;

import villarraga.gil.gama.programacion.dto.QuestionDto;
import villarraga.gil.gama.programacion.entities.Question;

public class QuestionMapper {
    public static QuestionDto toDto(Question q){
        return QuestionDto
            .builder()
            .id(q.getId())
            .text(q.getParagraph())
            .answers(
                q.getAnswer()
                    .stream()
                    .map(i -> AnswerMapper.toDto(i))
                    .toList()
            )
            .build();
    }
}
