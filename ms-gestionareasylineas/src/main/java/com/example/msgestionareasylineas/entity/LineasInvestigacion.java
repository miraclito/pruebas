package com.example.msgestionareasylineas.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class LineasInvestigacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id_linea;
    private String nombre_linea;
    private String descripcion;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "area_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private AreasEspecializacion areasEspecializacion;


}
