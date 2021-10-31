package com.devappron.backendjava.data.repositorios;

import com.devappron.backendjava.data.entidades.ServicioEntity;

import org.springframework.data.repository.CrudRepository;

public interface IServicioRepository extends CrudRepository<ServicioEntity, Long>{
    
    ServicioEntity findById(long id);
}
