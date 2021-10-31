package com.devappron.backendjava.models.respuestas;



public class RelacionPagosRestModel {
    
    private long id_relacion;
    private String fecha_aplicacion;
    private String userId;
    private long monto;
    private String Estado;
    private String Id_pago;
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


}
