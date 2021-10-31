package com.devappron.backendjava.services;

import java.util.List;

import com.devappron.backendjava.shared.RelacionPagosDto;
import com.devappron.backendjava.shared.UsuarioCrearDto;


import org.springframework.security.core.userdetails.UserDetailsService;


public interface IRelacionPagosService extends UserDetailsService{

    public List<RelacionPagosDto> listarRelacionPagos(UsuarioCrearDto usuarioCrearDto);
  
 }
