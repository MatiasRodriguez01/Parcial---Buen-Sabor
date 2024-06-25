package com.example.segundaApi.controllers;

import com.example.segundaApi.entities.Imagen;
import com.example.segundaApi.services.ImagenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/imagenes")
public class ImagenController extends BaseController<Imagen, Long> {

    @Autowired
    private ImagenService imagenService;

    public ImagenController(ImagenService imagenService) {
        super(imagenService);
    }
}
