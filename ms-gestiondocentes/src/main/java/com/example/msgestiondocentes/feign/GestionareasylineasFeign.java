package com.example.msgestiondocentes.feign;


import com.example.msgestiondocentes.dto.GestionareasylineasDto;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "ms-gAreasLineas-service", path = "/GestionareasylineasDto")

public interface GestionareasylineasFeign {
    //por si acaso cambiar esto a id_docente creo
    @GetMapping("/{id_docentes}")

    ResponseEntity<GestionareasylineasDto> listarPorId(@PathVariable(required = true) Integer id_docentes);
    default ResponseEntity<GestionareasylineasDto> fallbackCliente(Integer id_docentes, Exception e) {

        return ResponseEntity.ok(new GestionareasylineasDto());
    }

    }

