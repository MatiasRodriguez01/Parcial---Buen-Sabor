package com.example.segundaApi.controllers;

import com.example.segundaApi.entities.Base;
import com.example.segundaApi.entities.Persona;
import com.example.segundaApi.services.BaseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class BaseController <E extends Base, ID extends Serializable >{

    protected BaseService<E, ID> service;

    public BaseController(BaseService<E, ID> service){
        this.service =service;
    }

    @PostMapping() // http:/localhost:3000/personas (POST)
    public ResponseEntity<E> crear(@RequestBody E entity) throws Exception{
        E entidadCreada = service.crear(entity);
        return ResponseEntity.ok(entidadCreada);
    }

    @GetMapping("{id}") // http:/localhost:3000/personas/1 (Get)
    public Optional<E> buscarPorId(@PathVariable ID id) throws Exception{
        return service.buscarPorId(id);

    }

    @GetMapping() // http:/localhost:3000/personas (Get)
    public ResponseEntity<List<E>> listar() throws Exception{
        List<E> entities = service.listar();
        return ResponseEntity.ok(entities);
    }

    @PutMapping()  // http:/localhost:3000/personas (PUT)
    public ResponseEntity<E> actualizar(@RequestBody E entity) throws Exception{
        E entidadAct = service.actualizar(entity);
        return ResponseEntity.ok(entidadAct);
    }

    @DeleteMapping("{id}") // http:/localhost:3000/personas/1 (DELETE)
    public void eliminar(@PathVariable ID id) throws Exception{
        service.eliminar(id);
    }
}
