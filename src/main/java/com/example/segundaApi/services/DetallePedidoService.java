package com.example.segundaApi.services;

import com.example.segundaApi.entities.DetallePedido;
import com.example.segundaApi.repositories.BaseRepository;
import com.example.segundaApi.repositories.DetallePedidoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetallePedidoService extends BaseService<DetallePedido, Long>{

    @Autowired
    private DetallePedidoRepository detallePedidoRepository;

    public DetallePedidoService(DetallePedidoRepository detallePedidoRepository) {
        super(detallePedidoRepository);
    }

    @Transactional
    public List<DetallePedido> listarPorPedido(Long idPedido) throws Exception {
        try{
            return detallePedidoRepository.findAllByPedido_Id(idPedido);
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }

    }

}
