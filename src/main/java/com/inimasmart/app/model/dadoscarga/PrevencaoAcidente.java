package com.inimasmart.app.model.dadoscarga;

public class PrevencaoAcidente {

    private int codigoPrevencaoAcidente;
    private int tipoAvisoSonoro;
    private String mensagemAviso;

    public int getCodigoPrevencaoAcidente() {
        return codigoPrevencaoAcidente;
    }

    public void setCodigoPrevencaoAcidente(int codigoPrevencaoAcidente) {
        this.codigoPrevencaoAcidente = codigoPrevencaoAcidente;
    }

    public int getTipoAvisoSonoro() {
        return tipoAvisoSonoro;
    }

    public void setTipoAvisoSonoro(int tipoAvisoSonoro) {
        this.tipoAvisoSonoro = tipoAvisoSonoro;
    }

    public String getMensagemAviso() {
        return mensagemAviso;
    }

    public void setMensagemAviso(String mensagemAviso) {
        this.mensagemAviso = mensagemAviso;
    }
}
