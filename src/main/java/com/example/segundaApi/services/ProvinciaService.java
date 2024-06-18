package com.example.segundaApi.services;

import com.example.segundaApi.entities.Provincia;
import com.example.segundaApi.repositories.ProvinciaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinciaService extends BaseService<Provincia, Long> {

    @Autowired
    private ProvinciaRepository provinciaRepository;

    public ProvinciaService(ProvinciaRepository provinciaRepository) {
        super(provinciaRepository);
    }

    @Transactional
    public List<Provincia> pais(Long id) throws Exception {
        try {
            return provinciaRepository.findAllByPais_Id(id);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
