package com.example.segundaApi.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "categorias")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Categoria extends Base{

    @Column(name = "denominacion")
    private String denominacion;

    /*
    @OneToMany(mappedBy = "categoriaPadre", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Builder.Default
    private Set<Categoria> subcategorias = new HashSet<>();
   */

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoria_padre_id")
    private Categoria categoriaPadre;
}
