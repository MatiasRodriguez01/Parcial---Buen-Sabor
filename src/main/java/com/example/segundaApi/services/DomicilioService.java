package com.example.segundaApi.services;

import com.example.segundaApi.entities.Domicilio;
import com.example.segundaApi.repositories.DomicilioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DomicilioService extends BaseService<Domicilio, Long>{
    @Autowired
    private DomicilioRepository domicilioRepository;

    public DomicilioService(DomicilioRepository domicilioRepository){
        super(domicilioRepository);
    }

    @Transactional
    public List<Domicilio> localidad(Long id) throws Exception{
        try {
            return domicilioRepository.findAllByLocalidad_Id(id);
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
