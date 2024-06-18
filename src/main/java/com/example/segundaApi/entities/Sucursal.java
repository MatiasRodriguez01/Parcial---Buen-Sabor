package com.example.segundaApi.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalTime;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "sucursal")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Sucursal extends Base{

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "horario_apertura")
    private LocalTime horarioApertura;

    @Column(name = "horario_cierre")
    private LocalTime horarioCierre;

    @Column(name = "casa_matriz")
    private Boolean casaMatriz;

    // Relaciones

    @OneToOne
    @JoinColumn(name = "fk_domicilio")
    private Domicilio domicilio;

    @ManyToOne
    @JoinColumn(name = "fk_empresa")
    private Empresa empresa;

    @ManyToOne
    @JoinColumn(name = "fk_promocion")
    private Promocion promocion;
}
