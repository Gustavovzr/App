package com.inimasmart.app.model.vo;

public class FaturaDebitosVO {

    private int  id = 0;
    private int  idFatura = 0;
    private int  idFaturaEmAtraso = 0;
    private String periodo = "";
    private String vencimento = "";
    private double  valorTotal = 0d;
    private double  valor = 0d;
    private double  valorImposto = 0d;
    private boolean possuiRubricaSeguro;
    private int  idProcessoCorte = 0;
    private String tipoLayoutAvisoDebito = "";


    public int  getId() {
        return id;
    }

    public void setId(int  id) {
        this.id = id;
    }

    public int  getIdFatura() {
        return idFatura;
    }

    public void setIdFatura(int  idFatura) {
        this.idFatura = idFatura;
    }

    public int  getIdFaturaEmAtraso() {
        return idFaturaEmAtraso;
    }

    public void setIdFaturaEmAtraso(int  idFaturaEmAtraso) {
        this.idFaturaEmAtraso = idFaturaEmAtraso;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public double  getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double  valorTotal) {
        this.valorTotal = valorTotal;
    }

    public boolean isPossuiRubricaSeguro() {
        return possuiRubricaSeguro;
    }

    public void setPossuiRubricaSeguro(boolean possuiRubricaSeguro) {
        this.possuiRubricaSeguro = possuiRubricaSeguro;
    }

    public String getTipolayoutavisodebito() {
        return getTipoLayoutAvisoDebito();
    }

    public void setTipolayoutavisodebito(String tipolayoutavisodebito) {
        this.setTipoLayoutAvisoDebito(tipolayoutavisodebito);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValorImposto() {
        return valorImposto;
    }

    public void setValorImposto(double valorImposto) {
        this.valorImposto = valorImposto;
    }

    public int getIdProcessoCorte() {
        return idProcessoCorte;
    }

    public void setIdProcessoCorte(int idProcessoCorte) {
        this.idProcessoCorte = idProcessoCorte;
    }

    public String getTipoLayoutAvisoDebito() {
        return tipoLayoutAvisoDebito;
    }

    public void setTipoLayoutAvisoDebito(String tipoLayoutAvisoDebito) {
        this.tipoLayoutAvisoDebito = tipoLayoutAvisoDebito;
    }
}
