package com.example.segundaApi.repositories;

import com.example.segundaApi.entities.DetallePedido;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetallePedidoRepository extends BaseRepository<DetallePedido, Long> {
    List<DetallePedido> findAllByPedido_Id(Long idPedido);
}
