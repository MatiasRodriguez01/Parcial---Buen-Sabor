package com.example.segundaApi.entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Persona extends Base {

    protected String nombre;

    protected String apellido;

    protected String telefono;

    protected String email;

    protected LocalDate fechaDeNacimiento;
}
