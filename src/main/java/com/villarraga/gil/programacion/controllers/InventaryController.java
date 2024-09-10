package com.villarraga.gil.programacion.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import com.villarraga.gil.programacion.dto.InventaryDto;
import com.villarraga.gil.programacion.services.inventary.IInventaryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/inventary")
public class InventaryController {
    private final IInventaryService service;

    public InventaryController(@Autowired IInventaryService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public List<InventaryDto> getMethodName() {
        return service.getAll();
    }
}
