package com.inimasmart.app.model.vo;

public class FatDadosMedCategVO {

    private int  idCategoria = 0;
    private int  nrEconomias = 0;
    private int  peso = 0;
    private int  idSubCategoria = 0;
    private int  idLigacao = 0;
    private int  prioridade = 0;
    private double  volConsMinimo = 0d;
    private int  percentualFat = 0;
    private double  taxadeservico = 0d;
    private double  aluguelhidrometro = 0d;
    private double  valorconsumozero = 0d;
    private double  servicoambiental = 0d;

    public FatDadosMedCategVO() {
    }

    public double  getTaxadeservico() {
        return taxadeservico;
    }

    public void setTaxadeservico(double  taxadeservico) {
        this.taxadeservico = taxadeservico;
    }

    public double  getAluguelhidrometro() {
        return aluguelhidrometro;
    }

    public void setAluguelhidrometro(double  aluguelhidrometro) {
        this.aluguelhidrometro = aluguelhidrometro;
    }

    public double  getValorconsumozero() {
        return valorconsumozero;
    }

    public void setValorconsumozero(double  valorconsumozero) {
        this.valorconsumozero = valorconsumozero;
    }

    public double  getservicoAmbiental() {
        return getServicoambiental();
    }

    public void setservicoAmbiental(double  servicoambiental) {
        this.setServicoambiental(servicoambiental);
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getNrEconomias() {
        return nrEconomias;
    }

    public void setNrEconomias(int nrEconomias) {
        this.nrEconomias = nrEconomias;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getIdSubCategoria() {
        return idSubCategoria;
    }

    public void setIdSubCategoria(int idSubCategoria) {
        this.idSubCategoria = idSubCategoria;
    }

    public int getIdLigacao() {
        return idLigacao;
    }

    public void setIdLigacao(int idLigacao) {
        this.idLigacao = idLigacao;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public double getVolConsMinimo() {
        return volConsMinimo;
    }

    public void setVolConsMinimo(double volConsMinimo) {
        this.volConsMinimo = volConsMinimo;
    }

    public int getPercentualFat() {
        return percentualFat;
    }

    public void setPercentualFat(int percentualFat) {
        this.percentualFat = percentualFat;
    }

    public double getServicoambiental() {
        return servicoambiental;
    }

    public void setServicoambiental(double servicoambiental) {
        this.servicoambiental = servicoambiental;
    }
}
