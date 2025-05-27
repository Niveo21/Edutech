package com.example.Edutech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Edutech.model.Persona;
import com.example.Edutech.services.PersonaService;

@RestController
@RequestMapping("/personas")
public class PersonaController {

@Autowired
    private PersonaService personaService;

    @PostMapping
    public String almacenar(@RequestBody Persona persona) {
        return personaService.almacenar(persona);
    }

    @GetMapping
    public List<Persona> listar() {
        return personaService.listar();
    }

    @PostMapping("/asignar/{rut}/{email}")
    public String asignarUsuario(@PathVariable String rut, @PathVariable String email){

        return personaService.asignarUsuario(rut, email);
    }


}
