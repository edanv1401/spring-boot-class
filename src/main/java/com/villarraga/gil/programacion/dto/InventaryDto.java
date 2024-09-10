package com.villarraga.gil.programacion.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventaryDto {
    private Long id;
    private String name;
    private String category;
    private Integer quantity;
}
