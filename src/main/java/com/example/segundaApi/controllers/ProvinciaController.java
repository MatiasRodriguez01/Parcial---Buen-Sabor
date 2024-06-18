package com.example.segundaApi.controllers;

import java.util.List;

import com.example.segundaApi.controllers.BaseController;
import org.springframework.http.ResponseEntity;


import com.example.segundaApi.entities.Provincia;
import com.example.segundaApi.services.ProvinciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/provincias")
public class ProvinciaController extends BaseController<Provincia, Long> {

    @Autowired
    private ProvinciaService provinciaService;

    public ProvinciaController(ProvinciaService provinciaService) {
        super(provinciaService);
    }

    @GetMapping("/pais/{id}")
    public ResponseEntity<List<Provincia>> buscarPorPais(@PathVariable Long id) throws Exception{
        List<Provincia> pais = provinciaService.pais(id);
        return ResponseEntity.ok(pais);
    }
}
