
package com.example.segundaApi.controllers;

import com.example.segundaApi.entities.Factura;
import com.example.segundaApi.services.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/facturas")
public class FacturaController extends BaseController<Factura, Long>{

    @Autowired
    private FacturaService facturaService;

    public FacturaController(FacturaService facturaService) {
        super(facturaService);
    }
}
