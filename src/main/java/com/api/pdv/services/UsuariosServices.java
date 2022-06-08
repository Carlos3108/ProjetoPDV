package com.api.pdv.services;

import com.api.pdv.repositories.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuariosServices {

    final UsuarioRepository usuariosRepository;

    public UsuariosServices(UsuarioRepository usuariosRepository){
        this.usuariosRepository = usuariosRepository;
    }
}
