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
public class ArticuloManuFacturado extends Articulo{

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "tiempo_estimado_minuto")
    private Integer tiempoEstimadoMinutos;

    @Column(name = "preparacion")
    private String preparacion;
}
