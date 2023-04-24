package com.inimasmart.app.model.dadoscarga;

import java.util.ArrayList;
import java.util.List;

public class ObservacaoLeitura {

    private int codigo;
    private String descricao;
    private Boolean exigeFoto;
    private Boolean exigeObservacao;
    private List<MensagemFatura> mensagemFatura =new ArrayList<>();
    private int idCodigoLeitura;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getExigeFoto() {
        return exigeFoto;
    }

    public void setExigeFoto(Boolean exigeFoto) {
        this.exigeFoto = exigeFoto;
    }

    public List<MensagemFatura> getMensagemFatura() {
        return mensagemFatura;
    }

    public void setMensagemFatura(List<MensagemFatura> mensagemFatura) {
        this.mensagemFatura = mensagemFatura;
    }

    public int getIdCodigoLeitura() {
        return idCodigoLeitura;
    }

    public void setIdCodigoLeitura(int idCodigoLeitura) {
        this.idCodigoLeitura = idCodigoLeitura;
    }

    public Boolean getExigeObservacao() {
        return exigeObservacao;
    }

    public void setExigeObservacao(Boolean exigeObservacao) {
        this.exigeObservacao = exigeObservacao;
    }
}
