package com.example.msgestiondocentes.entity;

import com.example.msgestiondocentes.dto.GestionareasylineasDto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Docentes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer GestionareasylineasId;
    private String especializacion;

    @Transient
    private GestionareasylineasDto gestionareasylineasDto;
   /* @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "area_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private AreasEspecializacion areasEspecializacion;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuarios")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Usuarios usuarios;*/


}
