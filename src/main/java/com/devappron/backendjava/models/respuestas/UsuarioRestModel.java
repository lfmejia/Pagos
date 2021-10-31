package com.devappron.backendjava.models.respuestas;

public class UsuarioRestModel {

    private String userId; 
    private String descripcion;
    private String correo;
    private String userName;

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getdescripcion() {
        return descripcion;
    }
    public void setdescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
   
}
