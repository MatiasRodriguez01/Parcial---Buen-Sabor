package com.example.segundaApi.controllers;

import com.example.segundaApi.entities.Pedido;
import com.example.segundaApi.services.PedidoService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pedidos")
public class PedidoController extends BaseController<Pedido, Long> {
    @Autowired
    private PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService){
        super(pedidoService);
    }

    @GetMapping("/domicilios/{idDomicilio}")
    public ResponseEntity<List<Pedido>> pedidoPorDomicilio(@PathVariable Long idDomicilio) throws Exception {
        List<Pedido> domicilios = pedidoService.domicilio(idDomicilio);
        return ResponseEntity.ok(domicilios);
    }

    @GetMapping("/clientes/{idCliente}")
    public ResponseEntity<List<Pedido>> pedidoPorCliente(@PathVariable Long idCliente) throws Exception {
        List<Pedido> clientes = pedidoService.cliente(idCliente);
        return ResponseEntity.ok(clientes);
    }

    @GetMapping("/empleados/{idEmpleado}")
    public ResponseEntity<List<Pedido>> pedidoPorEmpleado(@PathVariable Long idEmpleado) throws Exception {
        List<Pedido> empleados = pedidoService.empleado(idEmpleado);
        return ResponseEntity.ok(empleados);
    }

    @GetMapping("/sucursales/{idSucursal}")
    public ResponseEntity<List<Pedido>> pedidoPorSucursal(@PathVariable Long idSucursal) throws Exception {
        List<Pedido> sucursales = pedidoService.sucursal(idSucursal);
        return ResponseEntity.ok(sucursales);
    }

    @GetMapping("/facturas/{idFactura}")
    public ResponseEntity<List<Pedido>> pedidoPorFactura(@PathVariable Long idFactura) throws Exception {
        List<Pedido> facturas = pedidoService.factura(idFactura);
        return ResponseEntity.ok(facturas);
    }

    @PutMapping("/total")
    public Optional<Pedido> calcularTotal(@RequestBody Pedido pedido) throws Exception {
        Pedido pedido_aux = pedidoService.calcularTotal(pedido);
        return Optional.ofNullable(pedido_aux);
    }

}
