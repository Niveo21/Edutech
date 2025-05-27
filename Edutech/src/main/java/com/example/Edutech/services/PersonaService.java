package com.example.Edutech.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Edutech.model.Persona;
import com.example.Edutech.repository.PersonaRepository;

@Service
public class PersonaService {


@Autowired
    private PersonaRepository personaRepository;

    public String almacenar(Persona persona) {
        personaRepository.save(persona);
        return "Persona almacenada correctamente";
    }

    public List<Persona> listar() {
        return personaRepository.findAll();
    }



}
