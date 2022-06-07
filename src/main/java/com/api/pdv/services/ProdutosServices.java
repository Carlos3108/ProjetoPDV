package com.api.pdv.services;

import com.api.pdv.repositories.ProdutosRepository;
import org.springframework.stereotype.Service;

@Service
public class ProdutosServices {

    final ProdutosRepository produtosRepository;

    public ProdutosServices(ProdutosRepository produtosRepository){
        this.produtosRepository = produtosRepository;
    }
}
