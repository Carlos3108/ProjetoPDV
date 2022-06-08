package com.api.pdv.controllers;

import com.api.pdv.services.UsuariosServices;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/usuario")
public class UsuarioController {
    final UsuariosServices usuariosServices;

    public UsuarioController(UsuariosServices usuariosServices) {
        this.usuariosServices = usuariosServices;
    }
}
