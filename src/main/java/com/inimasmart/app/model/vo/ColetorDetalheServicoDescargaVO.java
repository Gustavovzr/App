package com.inimasmart.app.model.vo;

public class ColetorDetalheServicoDescargaVO {

    private int codigoRubrica = 0;
    private int idVendaDetalheParcela = 0;
    private double creditoRemanescente = 0.0;
    private double creditoUtilizado = 0.0;

    public int getCodigoRubrica() {
        return codigoRubrica;
    }

    public void setCodigoRubrica(int codigoRubrica) {
        this.codigoRubrica = codigoRubrica;
    }

    public double getCreditoRemanescente() {
        return creditoRemanescente;
    }

    public void setCreditoRemanescente(double creditoRemanescente) {
        this.creditoRemanescente = creditoRemanescente;
    }

    public double getCreditoUtilizado() {
        return creditoUtilizado;
    }

    public void setCreditoUtilizado(double creditoUtilizado) {
        this.creditoUtilizado = creditoUtilizado;
    }

    public int getIdVendaDetalheParcela() {
        return idVendaDetalheParcela;
    }

    public void setIdVendaDetalheParcela(int idVendaDetalheParcela) {
        this.idVendaDetalheParcela = idVendaDetalheParcela;
    }
}
