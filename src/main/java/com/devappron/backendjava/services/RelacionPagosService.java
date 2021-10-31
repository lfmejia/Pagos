package com.devappron.backendjava.services;

import java.util.List;
import java.util.ArrayList;

import com.devappron.backendjava.data.entidades.RelacionPagosEntity;
import com.devappron.backendjava.data.repositorios.IRelacionPagosRepository;
import com.devappron.backendjava.shared.RelacionPagosDto;
import com.devappron.backendjava.shared.UsuarioCrearDto;
//import com.devappron.backendjava.shared.UsuarioDto;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class RelacionPagosService implements IRelacionPagosService{

    @Autowired
    ModelMapper modelmapper;

    @Autowired
    IRelacionPagosRepository iRelacionPagosRepository;

  
    @Override
    public List<RelacionPagosDto> listarRelacionPagos(UsuarioCrearDto usuarioCrearDto) {
        
        List<RelacionPagosEntity> relacionPagosEntityList = iRelacionPagosRepository.getRelacionPagos();

        List<RelacionPagosDto> relacionPagosDtoList=new ArrayList<>();

        for(RelacionPagosEntity relacionPagosEntityList_2 : relacionPagosEntityList  ){
            RelacionPagosDto relacionPagosDto=modelmapper.map(relacionPagosEntityList_2, RelacionPagosDto.class);
            relacionPagosDtoList.add(relacionPagosDto);
        }

        return relacionPagosDtoList;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
         return null;
    }

    
}
