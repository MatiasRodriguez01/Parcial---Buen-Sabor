package com.example.segundaApi.repositories;

import com.example.segundaApi.entities.Domicilio;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DomicilioRepository extends BaseRepository<Domicilio,Long>{
    List<Domicilio> findAllByLocalidad_Id(Long idLocalidad);
}
