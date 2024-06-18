package com.example.segundaApi.entities;

import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "localidades")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Localidad extends Base {

    @Column(name = "nombre")
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "fk_provincia")
    private Provincia provincia;
}
