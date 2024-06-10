package com.example.msgestiondocentes.feign;

import com.example.msgestiondocentes.dto.DocentesDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ms-gesDocente-service", path = "/docentes")
public interface DocentesFeign {
    @GetMapping("/{id}")
    public ResponseEntity<DocentesDto> buscarPorId(@PathVariable(required = true) Integer id);
    default ResponseEntity<DocentesDto> fallbackCliente(Integer id, Exception e) {

        return ResponseEntity.ok(new DocentesDto());
    }
}
