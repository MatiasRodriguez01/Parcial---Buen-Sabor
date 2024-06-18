package com.example.segundaApi.repositories;

import com.example.segundaApi.entities.ArticuloInsumo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticuloInsumoRepository extends BaseRepository<ArticuloInsumo, Long>{
    List<ArticuloInsumo> findAllByCategoria_Id(Long id);
}
