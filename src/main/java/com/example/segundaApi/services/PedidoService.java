package com.example.segundaApi.services;

import com.example.segundaApi.entities.DetallePedido;
import com.example.segundaApi.entities.Pedido;
import com.example.segundaApi.repositories.PedidoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService extends BaseService<Pedido, Long> {
    @Autowired
    private PedidoRepository pedidoRepository;
    @Autowired
    private DetallePedidoService detallePedidoService;

    public PedidoService(PedidoRepository pedidoRepository){
        super(pedidoRepository);
    }

    @Transactional
    public List<Pedido> domicilio(Long idDomicilio) throws Exception {
        try {
            return pedidoRepository.findAllByDomicilio_Id(idDomicilio);
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Transactional
    public List<Pedido> cliente(Long idCliente) throws Exception {
        try {
            return pedidoRepository.findAllByCliente_Id(idCliente);
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Transactional
    public List<Pedido> empleado(Long idEmpleado) throws Exception {
        try {
            return pedidoRepository.findAllByEmpleado_Id(idEmpleado);
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Transactional
    public List<Pedido> sucursal(Long idSucursal) throws Exception {
        try {
            return pedidoRepository.findAllBySucursal_Id(idSucursal);
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Transactional
    public List<Pedido> factura(Long idFactura) throws Exception {
        try {
            return pedidoRepository.findAllByFactura_Id(idFactura);
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Transactional
    public Pedido calcularTotal(Pedido pedido) throws Exception {
        try{

            List<DetallePedido> detallePedidos = detallePedidoService.listarPorPedido(pedido.getId());
            Double total = 0.0;

            if (detallePedidos != null && !detallePedidos.isEmpty()) {
                total = detallePedidos.stream()
                        .mapToDouble(detalle -> detalle.getSubTotal())
                        .sum();
            }

            pedido.setTotal(total);
            return pedidoRepository.save(pedido);

        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    @Transactional
    public Pedido actualizar(Pedido pedido) throws Exception {
        try{
            calcularTotal(pedido);
            return pedidoRepository.save(pedido);
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

}
