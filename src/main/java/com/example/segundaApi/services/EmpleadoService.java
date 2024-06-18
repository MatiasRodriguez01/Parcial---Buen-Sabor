package com.example.segundaApi.services;

import com.example.segundaApi.entities.Empleado;
import com.example.segundaApi.entities.Sucursal;
import com.example.segundaApi.repositories.EmpleadoRepository;
import com.example.segundaApi.services.BaseService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class EmpleadoService extends BaseService<Empleado, Long> {
    @Autowired
    private EmpleadoRepository empleadoRepository;

    public EmpleadoService(EmpleadoRepository empleadoRepository) {
        super(empleadoRepository);
    }

    @Transactional
    public List<Empleado> buscarPorSucursal(Long idSucursal) throws Exception{
        try {
            return empleadoRepository.findAllBySucursal_Id(idSucursal);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
