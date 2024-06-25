package com.example.segundaApi.controllers;
import java.util.List;

import com.example.segundaApi.controllers.BaseController;
import org.springframework.http.ResponseEntity;


import com.example.segundaApi.entities.ArticuloInsumo;
import com.example.segundaApi.services.ArticuloInsumoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/articuloInsumo")
public class ArticuloInsumoController extends BaseController<ArticuloInsumo, Long> {

    @Autowired
    private ArticuloInsumoService articuloInsumoService;

    public ArticuloInsumoController(ArticuloInsumoService articuloInsumoService) {
        super(articuloInsumoService);
    }

    @GetMapping("/categoria/{id}")
    public ResponseEntity<List<ArticuloInsumo>> buscarPorCategoria(@PathVariable Long id) throws Exception {
        List<ArticuloInsumo> articuloInsumo = articuloInsumoService.categoria(id);
        return ResponseEntity.ok(articuloInsumo);
    }

    @GetMapping("/unidadMedida/{id}")
    public ResponseEntity<List<ArticuloInsumo>> buscarPorUnidadMedida(@PathVariable Long id) throws Exception {
        List<ArticuloInsumo> articuloInsumo = articuloInsumoService.unidadMedida(id);
        return ResponseEntity.ok(articuloInsumo);
    }
}
