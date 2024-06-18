package com.example.segundaApi.repositories;

import com.example.segundaApi.entities.ArticuloManuFacturado;
import com.example.segundaApi.entities.ArticuloManuFacturadoDetalle;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticuloManuFacturadoDetalleRepository extends BaseRepository<ArticuloManuFacturadoDetalle, Long>{
    List<ArticuloManuFacturadoDetalle> findByArticuloManuFacturado_Id(Long articuloManuFacturadoId);

    List<ArticuloManuFacturadoDetalle> findByArticuloInsumo_Id(Long articuloInsumoId);

}
