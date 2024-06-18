package com.example.segundaApi.controllers;

import com.example.segundaApi.entities.UnidadMedida;
import com.example.segundaApi.services.UnidadMedidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/unidades-medidas")
public class UnidadMedidaController extends BaseController<UnidadMedida, Long>{

    @Autowired
    private UnidadMedidaService unidadMedidaService;

    public UnidadMedidaController(UnidadMedidaService unidadMedidaService) {
        super(unidadMedidaService);
    }
}
