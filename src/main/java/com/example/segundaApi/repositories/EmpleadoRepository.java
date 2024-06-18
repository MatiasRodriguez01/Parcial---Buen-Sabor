
package com.example.segundaApi.repositories;
import java.util.List;
import com.example.segundaApi.entities.Empleado;
import com.example.segundaApi.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends BaseRepository<Empleado,Long> {
    List<Empleado> findAllBySucursal_Id(Long idSucursal);
}

