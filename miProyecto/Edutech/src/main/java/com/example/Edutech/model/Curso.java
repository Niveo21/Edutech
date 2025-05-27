package com.example.Edutech.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Curso {

    @Id
    private String sigla;
    private String nombre;
    private String descripcion;

    public Curso() {
        this.sigla = "";
        this.nombre = "";
        this.descripcion = "";
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
