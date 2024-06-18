package com.example.segundaApi.controllers;

import com.example.segundaApi.entities.Pais;
import com.example.segundaApi.services.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paises")
public class PaisController extends BaseController<Pais, Long>{

    @Autowired
    private PaisService paisService;

    public PaisController(PaisService paisService) {
        super(paisService);
    }
}
