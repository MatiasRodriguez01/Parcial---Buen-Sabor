package com.example.segundaApi.controllers;

import com.example.segundaApi.entities.PromocionDetalle;
import com.example.segundaApi.services.BaseService;
import com.example.segundaApi.services.PromocionDetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/promocionDetalle")
public class PromocionDetalleController extends BaseController<PromocionDetalle, Long>{

    @Autowired
    private PromocionDetalleService promocionDetalleService;

    public PromocionDetalleController(PromocionDetalleService promocionDetalleService) {
        super(promocionDetalleService);
    }
}
