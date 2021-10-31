package com.devappron.backendjava.shared;

import java.io.Serializable;

public class ServicioDto implements Serializable {

    private static final long serialVersionUID= 1L;
    
    private long id_servicio;
    private String descripcion;
    private long monto;


    public long getId_servicio() {
        return this.id_servicio;
    }

    public void setId_servicio(long id_servicio) {
        this.id_servicio = id_servicio;
    }

 
    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public long getMonto() {
        return this.monto;
    }

    public void setMonto(long monto) {
        this.monto = monto;
    }


    
}