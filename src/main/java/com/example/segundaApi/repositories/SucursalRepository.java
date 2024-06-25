package com.example.segundaApi.repositories;

import com.example.segundaApi.entities.Sucursal;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SucursalRepository extends BaseRepository<Sucursal, Long>{
    List<Sucursal> findAllByDomicilio_Id(Long domicilioId);

    List<Sucursal> findAllByEmpresa_Id(Long empresaId);

    List<Sucursal> findAllByPromocion_Id(Long promocionId);
}
