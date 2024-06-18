package com.example.segundaApi.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "detallePedido")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DetallePedido extends Base{

    @Column(name = "cantidad")
    private Integer cantidad;

    @Column(name = "sub_total")
    private double subTotal;

    @ManyToOne
    @JoinColumn(name = "fk_pedido")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "fk_articulo")
    private Articulo articulo;

}
