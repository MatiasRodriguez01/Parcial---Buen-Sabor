package com.example.segundaApi.controllers;

import com.example.segundaApi.entities.ArticuloManuFacturado;
import com.example.segundaApi.entities.ArticuloManuFacturadoDetalle;
import com.example.segundaApi.services.ArticuloManuFacturadoDetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/articulosManufacturadosMetalles")
public class ArticuloManuFacturadoDetalleController extends BaseController<ArticuloManuFacturadoDetalle, Long>{

    public ArticuloManuFacturadoDetalleController(ArticuloManuFacturadoDetalleService articuloManuFacturadoDetalleService) {
        super(articuloManuFacturadoDetalleService);
    }

    @Autowired
    private ArticuloManuFacturadoDetalleService articuloManuFacturadoDetalleService;

    @GetMapping("/ArticuloManuFacturado/{id}")
    public ResponseEntity<List<ArticuloManuFacturadoDetalle>> listarArticulosManufacturados(@PathVariable Long id) throws Exception {
        List<ArticuloManuFacturadoDetalle> am = articuloManuFacturadoDetalleService.listarPorArticuloManu(id);
        return ResponseEntity.ok(am);
    }

    @GetMapping("/ArticuloInsumo/{id}")
    public ResponseEntity<List<ArticuloManuFacturadoDetalle>> listarArticulosInsumos(@PathVariable Long id) throws Exception {
        List<ArticuloManuFacturadoDetalle> ai = articuloManuFacturadoDetalleService.listarPorArticuloInsumo(id);
        return ResponseEntity.ok(ai);
    }
}
