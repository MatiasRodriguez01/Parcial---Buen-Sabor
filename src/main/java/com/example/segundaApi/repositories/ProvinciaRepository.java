package com.example.segundaApi.repositories;

import com.example.segundaApi.entities.Provincia;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProvinciaRepository extends BaseRepository<Provincia, Long>{
    List<Provincia> findAllByPais_Id(Long id);
}
