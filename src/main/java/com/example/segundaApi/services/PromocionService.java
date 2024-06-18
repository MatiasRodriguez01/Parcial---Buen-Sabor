package com.example.segundaApi.services;

import com.example.segundaApi.entities.Promocion;
import com.example.segundaApi.repositories.PromocionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PromocionService extends BaseService<Promocion, Long>{
    @Autowired
    private PromocionRepository promocionRepository;

    public PromocionService(PromocionRepository promocionRepository) {
        super(promocionRepository);
    }
}
