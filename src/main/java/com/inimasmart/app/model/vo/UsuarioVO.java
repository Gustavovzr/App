package com.inimasmart.app.model.vo;

import java.io.Serializable;

public class UsuarioVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idUnidadeNegocio;
    private String nomeUsuario;

    private String senha;

    public UsuarioVO(){}

    public UsuarioVO(Integer idUnidadeNegocio, String nomeUsuario, String senha) {
            this.idUnidadeNegocio = idUnidadeNegocio;
            this.nomeUsuario = nomeUsuario;
            this.senha = senha;
    }

    public Integer getIdUnidadeNegocio() {
        return idUnidadeNegocio;
    }

    public void setIdUnidadeNegocio(Integer idUnidadeNegocio) {
        this.idUnidadeNegocio = idUnidadeNegocio;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
