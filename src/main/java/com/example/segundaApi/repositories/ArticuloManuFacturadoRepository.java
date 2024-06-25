
package com.example.segundaApi.repositories;
import java.util.List;
import com.example.segundaApi.entities.ArticuloManuFacturado;
import com.example.segundaApi.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticuloManuFacturadoRepository extends BaseRepository<ArticuloManuFacturado, Long> {

    List<ArticuloManuFacturado> findAllByCategoria_Id(Long categoriaId);

    List<ArticuloManuFacturado> findAllByUnidadMedida_Id(Long unidadMedidaId);
}
