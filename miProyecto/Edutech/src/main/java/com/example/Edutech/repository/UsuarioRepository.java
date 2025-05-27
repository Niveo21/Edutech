package com.example.Edutech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Edutech.model.Usuario;

public interface UsuarioRepository extends JpaRepository <Usuario, String> {

}
