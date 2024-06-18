package com.example.segundaApi.services;

import com.example.segundaApi.entities.Imagen;
import com.example.segundaApi.repositories.ImagenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImagenService extends BaseService<Imagen, Long>{

    @Autowired
    private ImagenRepository imagenRepository;

    public ImagenService(ImagenRepository imagenRepository) {
        super(imagenRepository);
    }
}
