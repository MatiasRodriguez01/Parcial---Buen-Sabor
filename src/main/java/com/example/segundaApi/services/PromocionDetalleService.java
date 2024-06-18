package com.example.segundaApi.services;

import com.example.segundaApi.entities.PromocionDetalle;
import com.example.segundaApi.repositories.BaseRepository;
import com.example.segundaApi.repositories.PromocionDetalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PromocionDetalleService extends BaseService<PromocionDetalle, Long>{

    @Autowired
    private PromocionDetalleRepository promocionDetalleRepository;

    public PromocionDetalleService(PromocionDetalleRepository promocionDetalleRepository) {
        super(promocionDetalleRepository);
    }
}
