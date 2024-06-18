package com.example.segundaApi.controllers;

import com.example.segundaApi.controllers.BaseController;
import org.springframework.http.ResponseEntity;

import com.example.segundaApi.entities.Sucursal;
import com.example.segundaApi.services.BaseService;
import com.example.segundaApi.services.SucursalService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sucursales")
public class SucursalController extends BaseController<Sucursal, Long> {

    @Autowired
    private SucursalService sucursalService;

    public SucursalController(SucursalService sucursalService) {
        super(sucursalService);
    }

    @GetMapping("/empresa/{id}")
    public ResponseEntity<List<Sucursal>> listarEmpresa(@PathVariable Long id) throws Exception{
        List<Sucursal> emp = sucursalService.empresa(id);
        return ResponseEntity.ok(emp);
    }

    @GetMapping("/promocion/{id}")
    public ResponseEntity<List<Sucursal>> listarPromocion(@PathVariable Long id) throws Exception{
        List<Sucursal> emp = sucursalService.promocion(id);
        return ResponseEntity.ok(emp);
    }
}
