package com.example.segundaApi.services;

import com.example.segundaApi.entities.Empresa;
import com.example.segundaApi.repositories.BaseRepository;
import com.example.segundaApi.repositories.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService extends BaseService<Empresa, Long>{

    @Autowired
    private EmpresaRepository empresaRepository;

    public EmpresaService(EmpresaRepository empresaRepository) {
        super(empresaRepository);
    }
}
