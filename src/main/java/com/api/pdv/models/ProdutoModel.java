package com.api.pdv.models;

import javax.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_PRODUTO")
public class ProdutoModel implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID codProdutos;

    @Column(nullable = false, unique = true, length = 255)
    private String nomeProduto;

    @Column(nullable = false, unique = true, length = 6)
    private float valorProduto;

    @Column(nullable = false, length = 3)
    private Integer quantidade;

    public UUID getCodProdutos() {
        return codProdutos;
    }

    public void setCodProdutos(UUID codProdutos) {
        this.codProdutos = codProdutos;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public float getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(float valorProduto) {
        this.valorProduto = valorProduto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
