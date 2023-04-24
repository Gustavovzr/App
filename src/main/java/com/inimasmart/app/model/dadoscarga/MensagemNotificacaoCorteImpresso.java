package com.inimasmart.app.model.dadoscarga;

import java.util.ArrayList;
import java.util.List;

public class MensagemNotificacaoCorteImpresso {

    private int codigoMensagem;
    private int codigoTipoFaturamento;
    private boolean ligacaoCortada;
    private boolean fraude;
    private List<MensagemReaviso> mensagemReaviso=new ArrayList<>();

    public int getCodigoMensagem() {
        return codigoMensagem;
    }

    public void setCodigoMensagem(int codigoMensagem) {
        this.codigoMensagem = codigoMensagem;
    }

    public int getCodigoTipoFaturamento() {
        return codigoTipoFaturamento;
    }

    public void setCodigoTipoFaturamento(int codigoTipoFaturamento) {
        this.codigoTipoFaturamento = codigoTipoFaturamento;
    }

    public boolean isLigacaoCortada() {
        return ligacaoCortada;
    }

    public void setLigacaoCortada(boolean ligacaoCortada) {
        this.ligacaoCortada = ligacaoCortada;
    }

    public boolean isFraude() {
        return fraude;
    }

    public void setFraude(boolean fraude) {
        this.fraude = fraude;
    }

    public List<MensagemReaviso> getMensagemReaviso() {
        return mensagemReaviso;
    }

    public void setMensagemReaviso(List<MensagemReaviso> mensagemReaviso) {
        this.mensagemReaviso = mensagemReaviso;
    }
}
