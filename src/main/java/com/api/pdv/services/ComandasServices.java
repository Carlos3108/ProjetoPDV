package com.api.pdv.services;

import com.api.pdv.repositories.ComandaRepository;
import org.springframework.stereotype.Service;

@Service
public class ComandasServices {

    final ComandaRepository comandasRepository;

    public ComandasServices(ComandaRepository comandasRepository){
        this.comandasRepository = comandasRepository;
    }

}
