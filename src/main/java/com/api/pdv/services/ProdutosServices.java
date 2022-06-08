package com.api.pdv.services;

import com.api.pdv.repositories.ProdutoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProdutosServices {

    final ProdutoRepository produtosRepository;

    public ProdutosServices(ProdutoRepository produtosRepository){
        this.produtosRepository = produtosRepository;
    }
}
