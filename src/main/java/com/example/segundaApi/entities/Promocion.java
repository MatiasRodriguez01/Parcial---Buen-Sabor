package com.example.segundaApi.entities;

import com.example.segundaApi.entities.enums.TipoPromocion;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "promociones")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Promocion extends Base {
    @Column(name = "denominacion")
    private String denominacion;

    @Column(name = "fecha_desde")
    private LocalDate fechaDesde;

    @Column(name = "fecha_hasta")
    private LocalDate fechaHasta;

    @Column(name = "hora_desde")
    private LocalTime horaDesde;

    @Column(name = "hora_hasta")
    private LocalTime horaHasta;

    @Column(name = "descripcion_descuento")
    private String descripcionDescuento;

    @Column(name = "precio_descuento")
    private double precioDescuento;

    @Column(name = "tipo_promocion")
    private TipoPromocion tipoPromocion;

    @ManyToOne
    protected Imagen imagenPromocion;

}
