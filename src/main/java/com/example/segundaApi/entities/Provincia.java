package com.example.segundaApi.entities;

import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "provincias")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Provincia extends Base{

    @Column(name = "nombre")
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "fk_pais")
    private Pais pais;
}
