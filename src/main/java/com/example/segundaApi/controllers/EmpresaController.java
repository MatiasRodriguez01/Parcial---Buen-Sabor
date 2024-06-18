package com.example.segundaApi.controllers;

import com.example.segundaApi.entities.Empresa;
import com.example.segundaApi.services.BaseService;
import com.example.segundaApi.services.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empresas")
public class EmpresaController extends BaseController<Empresa, Long>{

    @Autowired
    private EmpresaService empresaService;

    public EmpresaController(EmpresaService empresaService) {
        super(empresaService);
    }
}
