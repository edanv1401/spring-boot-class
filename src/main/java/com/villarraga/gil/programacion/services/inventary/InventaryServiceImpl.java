package com.villarraga.gil.programacion.services.inventary;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.villarraga.gil.programacion.dto.InventaryDto;
import com.villarraga.gil.programacion.repositories.IInventaryRepository;

@Service
public class InventaryServiceImpl implements IInventaryService {
    private final IInventaryRepository repository;
    private final ObjectMapper mapper;

    public InventaryServiceImpl(@Autowired IInventaryRepository repository) {
        this.repository = repository;
        mapper = new ObjectMapper();
    }

    @Override
    public List<InventaryDto> getAll() {
        return repository.findAll().stream().map(i -> mapper.convertValue(i, InventaryDto.class)).toList();
    }
}
