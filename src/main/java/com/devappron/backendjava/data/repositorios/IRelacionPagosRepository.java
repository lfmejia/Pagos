package com.devappron.backendjava.data.repositorios;

import java.util.List;

import com.devappron.backendjava.data.entidades.RelacionPagosEntity;
import com.devappron.backendjava.shared.UsuarioCrearDto;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IRelacionPagosRepository extends PagingAndSortingRepository<RelacionPagosEntity, Long> {
    

    List<RelacionPagosentity> getByRelacionPagosentities(UsuarioCrearDto usuarioCrearDto);

    @Query(value = "SELECT * FROM  relacion_pago ORDER BY created_at DESC LIMIT 20",
            nativeQuery = true)
    List<RelacionPagosEntity> getRelacionPagos();
   
}
