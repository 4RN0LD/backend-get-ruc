package com.marathon.evaluacion.entity;

import java.util.Objects;

public class Usuario {

    private String usuario;
    private String password;

    public Usuario(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public Usuario() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario1 = (Usuario) o;
        return Objects.equals(usuario, usuario1.usuario) && Objects.equals(password, usuario1.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuario, password);
    }
}
