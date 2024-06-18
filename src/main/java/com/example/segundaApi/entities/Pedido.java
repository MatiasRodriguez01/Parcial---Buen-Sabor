package com.example.segundaApi.entities;

import com.example.segundaApi.entities.enums.*;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
//import java.util.HashSet;
//import java.util.Set;


@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "pedidos")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pedido extends Base{

    @Column(name = "hora_estimada_finalizacion")
    private LocalTime horaEstimadaFinalizacion;

    @Column(name = "total")
    private Double total;

    @Column(name = "total_costo")
    private Double totalCosto;

    @Column(name = "estado")
    private Estado estado;

    @Column(name = "tipo_envio")
    private TipoEnvio tipoEnvio;

    @Column(name = "forma_pago")
    private FormaPago formaPago;

    @Column(name = "fecha_pedido")
    private LocalDate fechaPedido;

    // Relaciones

    @ManyToOne
    @JoinColumn(name = "fk_cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "fk_empleado")
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name = "fk_domicilio")
    private Domicilio domicilio;

    @ManyToOne
    @JoinColumn(name = "fk_sucursal")
    private Sucursal sucursal;

    @ManyToOne
    @JoinColumn(name = "factura")
    private Factura factura;

}
