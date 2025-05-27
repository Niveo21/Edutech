package com.example.Edutech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Edutech.model.Usuario;
import com.example.Edutech.services.UsuarioService;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {



    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public String almacenar(@RequestBody Usuario usuario) {
        return usuarioService.almacenar(usuario);
    }

    @GetMapping
    public List<Usuario> listar() {
        return usuarioService.listar();
    }
}
