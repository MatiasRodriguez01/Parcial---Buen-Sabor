package com.example.segundaApi.entities;

import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "articulo_insumo")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ArticuloInsumo extends Articulo {

    @Column(name = "precio_compra")
    private Double precioCompra;

    @Column(name = "stock_actual")
    private Integer stockActual;

    @Column(name = "stock_maximo")
    private Integer stockMaximo;

    @Column(name = "es_para_elaborar")
    private Boolean esParaElaborar;
}
