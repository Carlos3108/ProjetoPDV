package com.api.pdv.services;

import com.api.pdv.repositories.ProdutoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    final ProdutoRepository produtosRepository;

    public ProdutoService(ProdutoRepository produtosRepository){
        this.produtosRepository = produtosRepository;
    }
}
