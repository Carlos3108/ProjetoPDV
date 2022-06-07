package com.api.pdv.services;

import com.api.pdv.repositories.ComandasRepository;
import org.springframework.stereotype.Service;

@Service
public class ComandasServices {

    final ComandasRepository comandasRepository;

    public ComandasServices(ComandasRepository comandasRepository){
        this.comandasRepository = comandasRepository;
    }

}
