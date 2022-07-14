package com.api.pdv.dto;

import org.hibernate.validator.constraints.br.CPF;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

public class UsuarioDTO {
    @NotBlank
    private String nomeFunc;

    @NotBlank
    private LocalDate nascimento;

    @NotBlank
    @CPF()
    private String cpf;

    @NotBlank
    private String login;

    @NotBlank
    private String senha;

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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