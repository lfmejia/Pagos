package com.devappron.backendjava.data.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity(name = "servicio")
@Table(indexes = {
    @Index(columnList = "id_servicio", name="index_ServicioId", unique = true)
})

public class ServicioEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private long id_servicio;

    @Column(nullable = false, length = 20)
    private String descripcion;

    @Column(nullable = false, length = 20)
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


    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}
