package com.example.Edutech.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Edutech.model.Persona;
import com.example.Edutech.model.Usuario;
import com.example.Edutech.repository.PersonaRepository;
import com.example.Edutech.repository.UsuarioRepository;

@Service
public class PersonaService {


@Autowired
    private PersonaRepository personaRepository;

@Autowired
private UsuarioRepository usuarioRepository;

    public String almacenar(Persona persona) {
        personaRepository.save(persona);
        return "Persona almacenada correctamente";
    }

    public List<Persona> listar() {
        return personaRepository.findAll();
    }
    
    public String asignarUsuario(String rut, String email){

        if(!personaRepository.existsById(rut)){
            return "El rut ingresado no existe";
        }else if(!usuarioRepository.existsById(email)){
            return "El usuario ingresado no existe";
        }else{
            Persona persona = personaRepository.findById(rut).get();
            Usuario usuario = usuarioRepository.findById(email).get();

            persona.setUsuario(usuario);
            personaRepository.save(persona);

            return "Usuario asignada exitosamente";
        }
    }


}
