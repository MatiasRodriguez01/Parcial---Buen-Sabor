package com.example.segundaApi.controllers;

import com.example.segundaApi.entities.ArticuloInsumo;
import com.example.segundaApi.entities.ArticuloManuFacturado;
import com.example.segundaApi.services.ArticuloManuFacturadoService;
import com.example.segundaApi.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/articuloManufacturados")
public class ArticuloManuFacturadoController extends BaseController<ArticuloManuFacturado, Long>{

    @Autowired
    private ArticuloManuFacturadoService autoArticuloManuFacturadoService;

    public ArticuloManuFacturadoController(ArticuloManuFacturadoService autoArticuloManuFacturadoService) {
        super(autoArticuloManuFacturadoService);
    }

    @GetMapping("/categoria/{id}")
    public ResponseEntity<List<ArticuloManuFacturado>> buscarPorCategoria(@PathVariable Long id) throws Exception {
        List<ArticuloManuFacturado> articuloManuFacturado = autoArticuloManuFacturadoService.categoria(id);
        return ResponseEntity.ok(articuloManuFacturado);
    }

    @GetMapping("/unidadMedida/{id}")
    public ResponseEntity<List<ArticuloManuFacturado>> buscarPorUnidadMedida(@PathVariable Long id) throws Exception {
        List<ArticuloManuFacturado> articuloManuFacturado = autoArticuloManuFacturadoService.unidadMedida(id);
        return ResponseEntity.ok(articuloManuFacturado);
    }
}

