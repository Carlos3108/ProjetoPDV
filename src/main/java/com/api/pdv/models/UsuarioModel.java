package com.api.pdv.models;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "TB_USUARIO")
public class UsuarioModel implements Serializable{
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id_Func;

    @Column(nullable = false, length = 255)
    private String nomeFunc;

    @Column(nullable = false, unique = true)
    private String cpf;


    @Column(nullable = false)
    private Date nascimento;

    @Column(nullable = false, unique = true, length = 256)
    private String login;

    @Column(nullable = false, length = 10)
    private String senha;

    public UUID getId_Func() {
        return id_Func;
    }

    public void setId_Func(UUID id_Func) {
        this.id_Func = id_Func;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
