package com.api.pdv.models;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "TB_USUARIO")
public class UsuariosModel {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idUser;

    @Column(nullable = false, length = 50)
    private String nomeFunc;

    @Column(nullable = false, unique = true,length = 10)
    private int login;

    @Column(nullable = false, length = 10)
    private String senha;

    public UUID getIdUser() {
        return idUser;
    }

    public void setIdUser(UUID idUser) {
        this.idUser = idUser;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public int getLogin() {
        return login;
    }

    public void setLogin(int login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
