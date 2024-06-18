package com.example.segundaApi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "paises")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pais extends Base{

    @Column(name = "nombre")
    private String nombre;
}
