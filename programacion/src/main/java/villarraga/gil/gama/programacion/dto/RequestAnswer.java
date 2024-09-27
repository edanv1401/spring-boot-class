package villarraga.gil.gama.programacion.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestAnswer {
    @JsonProperty("answer_id")
    private Long answerId;
}
