package com.marathon.evaluacion.entity;

public class Comercio {
    private String ruc;
    private String razon_social;
    private String estado;
    private String direccion;
    private String ubigeo;
    private String departamento;
    private String provincia;
    private String distrito;

    public Comercio() {
    }

    public Comercio(String ruc, String razon_social, String estado, String direccion, String ubigeo, String departamento, String provincia, String distrito) {
        this.ruc = ruc;
        this.razon_social = razon_social;
        this.estado = estado;
        this.direccion = direccion;
        this.ubigeo = ubigeo;
        this.departamento = departamento;
        this.provincia = provincia;
        this.distrito = distrito;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUbigeo() {
        return ubigeo;
    }

    public void setUbigeo(String ubigeo) {
        this.ubigeo = ubigeo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }
}
