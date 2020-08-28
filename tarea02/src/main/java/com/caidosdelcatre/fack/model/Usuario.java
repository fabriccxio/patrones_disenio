package com.caidosdelcatre.fack.model;

import static java.util.UUID.randomUUID;

public class Usuario {

    public String id;
    public String nombre;
    public String apellido;
    public String auto;

    public Usuario(String nombre, String apellido, String auto) {
        this.id = randomUUID().toString();
        this.nombre = nombre;
        this.apellido = apellido;
        this.auto = auto;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", auto='" + auto + '\'' +
                '}';
    }
}
