package com.example.segundaApi.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

//@EqualsAndHashCode(callSuper = true)
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Articulo extends Base{

    @Column(name = "denominacion")
    protected String denominacion;

    @Column(name = "precio_venta")
    protected  double precioVenta;

    //Relaciones

    @OneToMany
    @Builder.Default
    protected Set<Imagen> imagenesArticulo = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    protected Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "unidad_medida_id")
    protected UnidadMedida unidadMedida;
}
