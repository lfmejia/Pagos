package com.devappron.backendjava.data.entidades;

import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.List;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Index;


@Entity(name = "relacion_pago")

@Table(indexes = {
    @Index(columnList = "id_relacion", name="index_id_relacion", unique = true),
    @Index(columnList = "id_servicio", name="index_Servicio", unique = true), 
    @Index(columnList = "fecha_aplicacion", name="index_Fecha_Aplicacion", unique = true) 
})

public class RelacionPagosEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private long id_relacion;

    @Column(nullable = false, length = 20)
    private String fecha_aplicacion;

    @ManyToOne
    @JoinColumn(name = "userId")
    private UsuarioEntity usuarioEntity;
    
    @ManyToOne
    @JoinColumn(name = "id_servicio")
    private ServicioEntity servicioEntity;
    
    @Column(nullable = false, length = 20)
    private long monto;

    @Column(nullable = false, length = 20)
    private String Estado;

    @Column(nullable = false, length = 20)
    private String Id_pago;

    @Column(nullable = false, length = 20)
    private String fecha_pago;    
    

    public long getId_relacion() {
        return this.id_relacion;
    }

    public void setId_relacion(long id_relacion) {
        this.id_relacion = id_relacion;
    }

    public String getFecha_aplicacion() {
        return this.fecha_aplicacion;
    }

    public void setFecha_aplicacion(String fecha_aplicacion) {
        this.fecha_aplicacion = fecha_aplicacion;
    }

    public UsuarioEntity getUsuarioEntity() {
        return this.usuarioEntity;
    }

    public void setUsuarioEntity(UsuarioEntity usuarioEntity) {
        this.usuarioEntity = usuarioEntity;
    }

    public ServicioEntity getServicioEntity() {
        return this.servicioEntity;
    }

    public void setServicioEntity(ServicioEntity servicioEntity) {
        this.servicioEntity = servicioEntity;
    }

    public long getMonto() {
        return this.monto;
    }

    public void setMonto(long monto) {
        this.monto = monto;
    }

    public String getEstado() {
        return this.Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getId_pago() {
        return this.Id_pago;
    }

    public void setId_pago(String Id_pago) {
        this.Id_pago = Id_pago;
    }

    public String getFecha_pago() {
        return this.fecha_pago;
    }

    public void setFecha_pago(String fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

}
