package com.example.segundaApi.entities;

import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "articulo_manu_facturado")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ArticuloManuFacturadoDetalle extends Base{

    @Column(name = "cantidad")
    private Integer cantidad;

    @ManyToOne
    @JoinColumn(name = "fk_articuloManuFacturado")
    private ArticuloManuFacturado articuloManuFacturado;

    @ManyToOne
    @JoinColumn(name = "fk_articuloInsumo")
    private ArticuloInsumo articuloInsumo;
}
