package com.devappron.backendjava.shared;

import java.io.Serializable;

public class RelacionPagosDto implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private long id_relacion;
    private String fecha_aplicacion;
    private String userId;
    private String id_servicio;
    private long monto;
    private String Estado;
    private String Id_pago;
    private String fecha_pago;  

    public RelacionPagosDto() {
    }

    public String getId_servicio() {
        return this.id_servicio;
    }

    public void setId_servicio(String id_servicio) {
        this.id_servicio = id_servicio;
    }

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

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public RelacionPagosDto id_relacion(long id_relacion) {
        setId_relacion(id_relacion);
        return this;
    }

    public RelacionPagosDto fecha_aplicacion(String fecha_aplicacion) {
        setFecha_aplicacion(fecha_aplicacion);
        return this;
    }

    public RelacionPagosDto userId(String userId) {
        setUserId(userId);
        return this;
    }

    public RelacionPagosDto monto(long monto) {
        setMonto(monto);
        return this;
    }

    public RelacionPagosDto Estado(String Estado) {
        setEstado(Estado);
        return this;
    }

    public RelacionPagosDto Id_pago(String Id_pago) {
        setId_pago(Id_pago);
        return this;
    }

    public RelacionPagosDto fecha_pago(String fecha_pago) {
        setFecha_pago(fecha_pago);
        return this;
    }

  
    
}
