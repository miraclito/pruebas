package com.example.msgestiondocentes.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GestionareasylineasDto {
    private Integer id_area;
    private String nombre_area;
    private String descripcion;
}
