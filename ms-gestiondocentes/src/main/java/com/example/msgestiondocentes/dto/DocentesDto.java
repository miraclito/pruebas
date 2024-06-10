package com.example.msgestiondocentes.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class DocentesDto {
    private Integer id_docentes;
    private String nombre;
    private GestionareasylineasDto gestionareasylineasDto;

}
