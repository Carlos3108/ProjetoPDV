package com.api.pdv.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "TB_COMANDA")
public class ComandasModel {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codComanda;

    @ManyToOne
    @JoinColumn(name = "codProdutos")
    private ProdutosModel codProdutos;

    @Column(nullable = false, length = 3)
    private int quantidade;

    @ManyToOne
    @JoinColumn(name = "idUser")
    private UsuariosModel idUser;

    @Column(nullable = false)
    private LocalDateTime dataAberturaComanda;

    @Column(nullable = false)
    private boolean status;

    public int getCodComanda() {
        return codComanda;
    }

    public void setCodComanda(int codComanda) {
        this.codComanda = codComanda;
    }

    public ProdutosModel getCodProdutos() {
        return codProdutos;
    }

    public void setCodProdutos(ProdutosModel codProdutos) {
        this.codProdutos = codProdutos;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public UsuariosModel getIdUser() {
        return idUser;
    }

    public void setIdUser(UsuariosModel idUser) {
        this.idUser = idUser;
    }

    public LocalDateTime getDataAberturaComanda() {
        return dataAberturaComanda;
    }

    public void setDataAberturaComanda(LocalDateTime dataAberturaComanda) {
        this.dataAberturaComanda = dataAberturaComanda;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
