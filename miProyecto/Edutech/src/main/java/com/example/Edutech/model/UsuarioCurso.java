package com.example.Edutech.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UsuarioCurso {

    @Id
    private int id;
    private String usuario_email;
    private String curso_sigla;



    public UsuarioCurso() {
        this.id = 0;
        this.usuario_email = "";
        this.curso_sigla = "";
    }



    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }



    public String getUsuario_email() {
        return usuario_email;
    }



    public void setUsuario_email(String usuario_email) {
        this.usuario_email = usuario_email;
    }



    public String getCurso_sigla() {
        return curso_sigla;
    }



    public void setCurso_sigla(String curso_sigla) {
        this.curso_sigla = curso_sigla;
    }

    
}
