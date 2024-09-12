package com.villarraga.gil.programacion.services.inventary;

import java.util.List;

import com.villarraga.gil.programacion.dto.InventaryDto;
import com.villarraga.gil.programacion.entities.Role;

public interface IInventaryService {
    List<InventaryDto> getAll(Long userId, Role role);    
}
