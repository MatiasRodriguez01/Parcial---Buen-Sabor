package com.example.segundaApi.services;

import com.example.segundaApi.entities.Factura;
import com.example.segundaApi.repositories.BaseRepository;
import com.example.segundaApi.repositories.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturaService extends BaseService<Factura, Long>{

    @Autowired
    private FacturaRepository facturaRepository;

    public FacturaService(FacturaRepository facturaRepository){
        super(facturaRepository);
    }
}
