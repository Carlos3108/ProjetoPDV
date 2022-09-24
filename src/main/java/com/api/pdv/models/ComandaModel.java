package com.api.pdv.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "TB_COMANDA")
public class ComandaModel {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long codComanda;

    @OneToOne
    @JoinColumn(name = "codProdutos")
    private ProdutoModel codProdutos;

    @Column(nullable = false)
    private LocalDateTime abertura;

    @Column(nullable = false)
    private boolean status;

    public Long getCodComanda() {
        return codComanda;
    }

    public void setCodComanda(Long codComanda) {
        this.codComanda = codComanda;
    }

    public ProdutoModel getCodProdutos() {
        return codProdutos;
    }

    public void setCodProdutos(ProdutoModel codProdutos) {
        this.codProdutos = codProdutos;
    }

    public LocalDateTime getDataAberturaComanda() {
        return abertura;
    }

    public void setDataAberturaComanda(LocalDateTime dataAberturaComanda) {
        this.abertura = dataAberturaComanda;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
