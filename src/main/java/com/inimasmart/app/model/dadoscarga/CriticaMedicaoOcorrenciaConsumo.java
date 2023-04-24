package com.inimasmart.app.model.dadoscarga;

import java.util.ArrayList;
import java.util.List;

public class CriticaMedicaoOcorrenciaConsumo {

    private int codigoInterno;
    private int codigoIDCritica;
    private boolean confirmarLeitura;
    private boolean reterConta;
    private String mensagemDispositivo;
    private List<MensagemAvisoRetencao> mensagemAvisoRetencao= new ArrayList<>();

    public int getCodigoInterno() {
        return codigoInterno;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public int getCodigoIDCritica() {
        return codigoIDCritica;
    }

    public void setCodigoIDCritica(int codigoIDCritica) {
        this.codigoIDCritica = codigoIDCritica;
    }

    public boolean isConfirmarLeitura() {
        return confirmarLeitura;
    }

    public void setConfirmarLeitura(boolean confirmarLeitura) {
        this.confirmarLeitura = confirmarLeitura;
    }

    public boolean isReterConta() {
        return reterConta;
    }

    public void setReterConta(boolean reterConta) {
        this.reterConta = reterConta;
    }

    public String getMensagemDispositivo() {
        return mensagemDispositivo;
    }

    public void setMensagemDispositivo(String mensagemDispositivo) {
        this.mensagemDispositivo = mensagemDispositivo;
    }

    public List<MensagemAvisoRetencao> getMensagemAvisoRetencao() {
        return mensagemAvisoRetencao;
    }

    public void setMensagemAvisoRetencao(List<MensagemAvisoRetencao> mensagemAvisoRetencao) {
        this.mensagemAvisoRetencao = mensagemAvisoRetencao;
    }
}
