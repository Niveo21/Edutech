package com.example.Edutech.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Usuario {

@Id
private String email;
private String estado;

@OneToOne(mappedBy = "usuario")
    private Persona persona;


public Usuario (){

    this.email = "";
    this.estado = "";
    
    

}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getEstado() {
    return estado;
}

public void setEstado(String estado) {
    this.estado = estado;
}

public Persona getPersona() {
    return persona;
}

public void setPersona(Persona persona) {
    this.persona = persona;
}


}
