package com.api.pdv.services;

import com.api.pdv.repositories.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuariosServices {

    final UsuariosRepository usuariosRepository;

    public UsuariosServices(UsuariosRepository usuariosRepository){
        this.usuariosRepository = usuariosRepository;
    }
}
