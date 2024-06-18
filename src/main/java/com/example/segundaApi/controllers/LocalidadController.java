package com.example.segundaApi.controllers;

import java.util.List;

import com.example.segundaApi.controllers.BaseController;
import com.example.segundaApi.controllers.BaseController;
import org.springframework.http.ResponseEntity;


import com.example.segundaApi.entities.Localidad;
import com.example.segundaApi.services.LocalidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/localidades")
public class LocalidadController extends BaseController<Localidad, Long> {

    @Autowired
    private LocalidadService localidadService;

    public LocalidadController(LocalidadService localidadService) {
        super(localidadService);
    }

    @GetMapping("/provincia/{id}")
    public ResponseEntity<List<Localidad>> buscarPorProvincia(@PathVariable Long id) throws Exception{
        List<Localidad> localidades = localidadService.provincia(id);
        return ResponseEntity.ok(localidades);
    }
}
