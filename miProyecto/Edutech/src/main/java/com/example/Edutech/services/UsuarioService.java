package com.example.Edutech.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Edutech.model.Usuario;

import com.example.Edutech.repository.UsuarioRepository;

@Service
public class UsuarioService {


@Autowired
    private UsuarioRepository usuarioRepository;

    public String almacenar(Usuario usuario) {
        usuarioRepository.save(usuario);
        return "Persona almacenada correctamente";
    }

    public List<Usuario> listar() {
        return usuarioRepository.findAll();
    }



}
