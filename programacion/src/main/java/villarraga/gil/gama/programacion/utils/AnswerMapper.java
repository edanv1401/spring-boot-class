package villarraga.gil.gama.programacion.utils;

import villarraga.gil.gama.programacion.dto.AnswerDto;
import villarraga.gil.gama.programacion.entities.Answer;

public class AnswerMapper {
    public static AnswerDto toDto(Answer a){
        return AnswerDto
            .builder()
            .id(a.getId())
            .paragraph(a.getParagraph())
            .build();
    }
}
