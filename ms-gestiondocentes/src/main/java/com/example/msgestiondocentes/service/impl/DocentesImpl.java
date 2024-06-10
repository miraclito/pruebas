package com.example.msgestiondocentes.service.impl;

import com.example.msgestiondocentes.dto.GestionareasylineasDto;
import com.example.msgestiondocentes.entity.Docentes;
import com.example.msgestiondocentes.feign.DocentesFeign;
import com.example.msgestiondocentes.feign.GestionareasylineasFeign;
import com.example.msgestiondocentes.repository.DocentesRepository;
import com.example.msgestiondocentes.service.DocentesService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@AllArgsConstructor
@Service
public class DocentesImpl implements DocentesService {
    @Autowired
    private DocentesRepository docentesRepository;
    @Autowired
    private GestionareasylineasFeign gestionareasylineasFeign;
    @Autowired
    private DocentesFeign docentesFeign;

    @Override
    public List<Docentes> listar() {
        return docentesRepository.findAll();
    }

    @Override
    public Docentes guardar(Docentes docentes) {
        return docentesRepository.save(docentes);
    }

    @Override
    public Docentes actualizar(Docentes docentes) {
        return docentesRepository.save(docentes);
    }

    @Override
    public Optional<Docentes> listarPorId(Integer id_docentes) {
        Optional<Docentes> docentes = docentesRepository.findById(id_docentes);
        if (docentes.isPresent()) {
        GestionareasylineasDto gestionareasylineasDto = gestionareasylineasFeign.listarPorId(docentes.get().getGestionareasylineasId()).getBody();
        docentes.get().setGestionareasylineasDto(gestionareasylineasDto);
        }

        return docentesRepository.findById(id_docentes);}
        /*for (PedidoDetalle pedidoDetalle: pedido.get().getDetalle()){
            pedidoDetalle.setProductoDto(catalogoFeign.productoBuscarPorId(pedidoDetalle.getProductoId()).getBody());
        }*/
     /*  List<Docentes> docentes = docentes.get().getId_docentes().stream().map(pedidoDetalle -> {
            pedidoDetalle.setGestionareasylineasDto(catalogoFeign.productoBuscarPorId(pedidoDetalle.getProductoId()).getBody());
            return pedidoDetalle;*/

        //docentes.get().setDetalle(pedidoDetalles);
        //docentes.get().setGestionareasylineasDto(gestionareasylineasDto);*/



    @Override
    public void eliminarporId(Integer id_docentes) {
        docentesRepository.deleteById(id_docentes);

    }
}
