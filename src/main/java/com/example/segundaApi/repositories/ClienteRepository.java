package com.example.segundaApi.repositories;

import com.example.segundaApi.entities.Cliente;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends BaseRepository<Cliente, Long>{
    List<Cliente> findAllByDomicilio_Id(Long id);
}
