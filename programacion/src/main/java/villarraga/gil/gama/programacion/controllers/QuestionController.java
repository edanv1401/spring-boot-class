package villarraga.gil.gama.programacion.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

import villarraga.gil.gama.programacion.dto.QuestionDto;
import villarraga.gil.gama.programacion.dto.RequestAnswer;
import villarraga.gil.gama.programacion.dto.ResponseAnswer;
import villarraga.gil.gama.programacion.services.IQuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Validated
@RestController
@RequestMapping("/questions")
public class QuestionController {
    private final IQuestionService service;

    public QuestionController(@Autowired IQuestionService _service){
        service = _service;
    }

    @GetMapping
    public ResponseEntity<List<QuestionDto>> getAllQuestions() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @PostMapping("/{question_id}")
    public ResponseEntity<ResponseAnswer> validateAnswer(
        @PathVariable(name = "question_id") Long questionId,
        @RequestBody RequestAnswer request
    ) {
        return new ResponseEntity<>(service.validateAnswer(questionId, request.getAnswerId()), HttpStatus.OK);
    }
}
