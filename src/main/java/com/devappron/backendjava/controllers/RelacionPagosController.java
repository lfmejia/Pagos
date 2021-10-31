package com.devappron.backendjava.controllers;

import java.util.ArrayList;
import java.util.List;


import com.devappron.backendjava.models.respuestas.RelacionPagosRestModel;
import com.devappron.backendjava.services.IRelacionPagosService;
import com.devappron.backendjava.services.IUsuarioService;
import com.devappron.backendjava.shared.RelacionPagosDto;
//import com.devappron.backendjava.shared.UsuarioDto;
import com.devappron.backendjava.shared.UsuarioCrearDto;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/RelacionPagoss")
public class RelacionPagosController {

    @Autowired(required=true)
    ModelMapper modelmapper;

    @Autowired 
    IRelacionPagosService iRelacionPagosService;

    @Autowired
    IUsuarioService iUsuarioService;

    
 
    @GetMapping(path="/ultimos")
    public List<RelacionPagosRestModel> ultimosPagos(UsuarioCrearDto usuarioCrearDto){
        
        
        List<RelacionPagosDto> relacionPagosDtoList=iRelacionPagosService.listarRelacionPagos(usuarioCrearDto);

        List<RelacionPagosRestModel> relacionPagosRestModelList=new ArrayList<>();

        for(RelacionPagosDto relacionPagosDto : relacionPagosDtoList){
            RelacionPagosRestModel RelacionPagosRestModel= modelmapper.map(relacionPagosDto, RelacionPagosRestModel.class);
            relacionPagosRestModelList.add(RelacionPagosRestModel);
        }

        return relacionPagosRestModelList;
    }

}

