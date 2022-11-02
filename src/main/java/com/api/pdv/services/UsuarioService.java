package com.api.pdv.services;

import com.api.pdv.models.UsuarioModel;
import com.api.pdv.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    @Transactional
    public UsuarioModel save(UsuarioModel usuarioModel) {
        return usuarioRepository.save(usuarioModel);
    }

    public List<UsuarioModel> obetrUsuario() {
        return this.usuarioRepository.findAll();
    }

    public Optional<UsuarioModel> obterUsuarioId() {
        return this.usuarioRepository.findAllById(String cpf);
    }
}
