package com.villarraga.gil.programacion.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InventaryDto {
    private Long id;
    private String name;
    private String category;
    private Integer quantity;
}
