package com.example.segundaApi.controllers;

import com.example.segundaApi.entities.Cliente;
import com.example.segundaApi.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController extends BaseController<Cliente, Long>{
    @Autowired
    private ClienteService clienteService;

    public ClienteController(ClienteService clienteService){
        super(clienteService);
    }

    @GetMapping("/domicilio/{id}")
    public ResponseEntity<List<Cliente>> buscarPorDomicilio(@PathVariable Long id) throws Exception{
        List<Cliente> clientes = clienteService.domicilio(id);
        return ResponseEntity.ok(clientes);
    }

}
