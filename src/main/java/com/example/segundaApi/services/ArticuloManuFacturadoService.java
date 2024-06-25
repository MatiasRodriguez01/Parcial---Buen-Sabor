package com.example.segundaApi.services;

import java.util.ArrayList;

import com.example.segundaApi.entities.ArticuloManuFacturado;
import com.example.segundaApi.repositories.ArticuloManuFacturadoRepository;
import com.example.segundaApi.repositories.BaseRepository;
import com.example.segundaApi.services.BaseService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticuloManuFacturadoService extends BaseService<ArticuloManuFacturado, Long> {

    @Autowired
    private ArticuloManuFacturadoRepository articuloManuFacturadoRepository;

    public ArticuloManuFacturadoService(ArticuloManuFacturadoRepository articuloManuFacturadoRepository) {
        super(articuloManuFacturadoRepository);
    }

    @Transactional
    public List<ArticuloManuFacturado> categoria(Long id) throws Exception{
        try {
            return articuloManuFacturadoRepository.findAllByCategoria_Id(id);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<ArticuloManuFacturado> unidadMedida(Long id) throws Exception{
        try {
            return articuloManuFacturadoRepository.findAllByUnidadMedida_Id(id);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
