package com.api.pdv.services;

import com.api.pdv.repositories.ComandaRepository;
import org.springframework.stereotype.Service;

@Service
public class ComandaService {

    final ComandaRepository comandasRepository;

    public ComandaService(ComandaRepository comandasRepository){
        this.comandasRepository = comandasRepository;
    }

}
