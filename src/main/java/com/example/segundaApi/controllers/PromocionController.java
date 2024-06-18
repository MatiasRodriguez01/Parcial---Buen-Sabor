package com.example.segundaApi.controllers;

import com.example.segundaApi.entities.Promocion;
import com.example.segundaApi.services.BaseService;
import com.example.segundaApi.services.PromocionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/promocion")
public class PromocionController extends BaseController<Promocion, Long>{
    @Autowired
    private PromocionService promocionService;

    public PromocionController(PromocionService promocionService) {
        super(promocionService);
    }
}
