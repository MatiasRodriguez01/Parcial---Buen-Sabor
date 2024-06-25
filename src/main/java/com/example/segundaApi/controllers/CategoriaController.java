package com.example.segundaApi.controllers;

import com.example.segundaApi.entities.Categoria;
import com.example.segundaApi.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categorias")
public class CategoriaController extends BaseController<Categoria, Long> {

    public CategoriaController(CategoriaService categoriaService){
        super(categoriaService);
    }

    @Autowired
    private CategoriaService categoriaService;

    @PostMapping("/subCategoria/{id_CP}")
    public Optional<Categoria> agregarSubcategoria(@PathVariable Long id_CP, @RequestBody Categoria subcategoria) throws Exception {
        Categoria catPadre = categoriaService.agregarSubcategoria(id_CP, subcategoria);
        return Optional.ofNullable(catPadre);
    }

    /*@GetMapping("/subcategoria/{id_CP}")
    public List<Categoria> listarSubcategorias(@PathVariable Long id_CP) throws Exception {
        List<Categoria> subcategorias = categoriaService.listarSubcategorias(id_CP);
        return subcategorias;
    }*/

    @GetMapping("/categoriaPadre/{id}")
    public ResponseEntity<List<Categoria>> listarPorCategoriaPadre(@PathVariable Long id) throws Exception {
        List<Categoria> categorias = categoriaService.listarPorCategoriaPadre(id);
        return ResponseEntity.ok(categorias);
    }

}
