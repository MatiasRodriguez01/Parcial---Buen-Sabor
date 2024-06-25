package com.example.segundaApi.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name  = "imagenes")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Imagen extends Base{

    @Column(name = "imagen_persona")
    private String denominacion;
}
