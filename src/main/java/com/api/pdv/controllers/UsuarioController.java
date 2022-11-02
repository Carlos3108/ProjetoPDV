package com.api.pdv.controllers;

import com.api.pdv.dto.UsuarioDTO;
import com.api.pdv.models.UsuarioModel;
import com.api.pdv.repositories.UsuarioRepository;
import com.api.pdv.services.UsuarioService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping(value = "/usuario", method = RequestMethod.POST)
public class UsuarioController {
    final UsuarioService usuarioService;
     final UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioService usuarioService, UsuarioRepository usuarioRepository) {
        this.usuarioService = usuarioService;
        this.usuarioRepository = usuarioRepository;
    }

    @PostMapping
    public ResponseEntity<Object> saveUsuario(@RequestBody @Valid UsuarioDTO usuarioDTO){
        var usuarioModel = new UsuarioModel();
        BeanUtils.copyProperties(usuarioDTO, usuarioModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.save(usuarioModel));
    }

    @GetMapping
    public List<UsuarioModel> obterUsuario(){
        return this.usuarioService.obetrUsuario();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Object> obterUsuarioId(@PathVariable(value = "id_func")){
        Optional<UsuarioModel> usuarioModelOptional = usuarioService.find
        return this.usuarioService.obterUsuarioId();
    }
}
