package com.example.segundaApi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "unidad_medida")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UnidadMedida extends Base{

    @Column(name = "denominacion")
    private String denominacion;
}
