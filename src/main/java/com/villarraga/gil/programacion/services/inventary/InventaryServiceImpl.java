package com.villarraga.gil.programacion.services.inventary;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.villarraga.gil.programacion.dto.InventaryDto;
import com.villarraga.gil.programacion.repositories.IInventaryRepository;
import com.villarraga.gil.programacion.entities.Inventary;
import com.villarraga.gil.programacion.entities.Role;

@Service
public class InventaryServiceImpl implements IInventaryService {
    private final IInventaryRepository repository;

    public InventaryServiceImpl(@Autowired IInventaryRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<InventaryDto> getAll(Long userId, Role role) {
        return repository.findAll().stream()
                .filter(i -> userId.equals(1L) || i.getCategory().getId().equals(role.getCategory().getId()))
                .map(i -> converter(i)).toList();
    }

    private InventaryDto converter(Inventary i) {
        return InventaryDto.builder()
                .id(i.getId())
                .name(i.getName())
                .quantity(i.getQuantity())
                .category(i.getCategory().getName())
                .build();
    }
}
