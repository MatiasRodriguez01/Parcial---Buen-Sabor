package com.example.segundaApi.services;

import com.example.segundaApi.entities.Sucursal;
import com.example.segundaApi.repositories.SucursalRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SucursalService extends BaseService<Sucursal, Long> {

    @Autowired
    private SucursalRepository sucursalRepository;

    public SucursalService(SucursalRepository sucursalRepository) {
        super(sucursalRepository);
    }

    @Transactional
    public List<Sucursal> domicilio(Long id) throws Exception{
        try {
            return sucursalRepository.findAllByDomicilio_Id(id);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<Sucursal> empresa(Long id) throws Exception{
        try {
            return sucursalRepository.findAllByEmpresa_Id(id);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<Sucursal> promocion(Long id) throws Exception{
        try {
            return sucursalRepository.findAllByPromocion_Id(id);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
