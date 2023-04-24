package com.inimasmart.app.model.vo;

public class ColetorDetalheFaturaEntregaAlternativaVO {

    private int idFatura = 0;
    private int idEntregaAvisoDebito = 0;
    private boolean faturaImpressa = false;

    public boolean isFaturaImpressa() {
        return faturaImpressa;
    }

    public void setFaturaImpressa(boolean faturaImpressa) {
        this.faturaImpressa = faturaImpressa;
    }

    public int getIdEntregaAvisoDebito() {
        return idEntregaAvisoDebito;
    }

    public void setIdEntregaAvisoDebito(int idEntregaAvisoDebito) {
        this.idEntregaAvisoDebito = idEntregaAvisoDebito;
    }

    public int getIdFatura() {
        return idFatura;
    }

    public void setIdFatura(int idFatura) {
        this.idFatura = idFatura;
    }
}
