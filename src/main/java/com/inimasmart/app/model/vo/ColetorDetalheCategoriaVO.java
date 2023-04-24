package com.inimasmart.app.model.vo;

public class ColetorDetalheCategoriaVO {

    private int id;
    private int idFatura;
    private int idLigacao;
    private int idCidade;
    private int idGrupo;
    private int idPeriodo;
    private int idLeituraDetalhe;
    private int idCategoria;
    private int idSubCategoria;
    private int qtdEconomias;
    private int peso;
    private int consumo;
    private int economiasAgua;
    private double valorAgua;
    private int economiasEsgoto;
    private double valorEsgoto;
    private int percentualFat = 0;
    private int totalEconomias = 0;
    private int volConsMinimo = 0;

    public int getVolConsMinimo() {
        return volConsMinimo;
    }

    public void setVolConsMinimo(int volConsMinimo) {
        this.volConsMinimo = volConsMinimo;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Getters">
    public int getConsumo() {
        return consumo;
    }

    //<editor-fold defaultstate="collapsed" desc="Setters">
    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public int getEconomiasAgua() {
        return economiasAgua;
    }

    public void setEconomiasAgua(int economiasAgua) {
        this.economiasAgua = economiasAgua;
    }

    public int getEconomiasEsgoto() {
        return economiasEsgoto;
    }

    public void setEconomiasEsgoto(int economiasEsgoto) {
        this.economiasEsgoto = economiasEsgoto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdLeituraDetalhe() {
        return idLeituraDetalhe;
    }

    public void setIdLeituraDetalhe(int idLeituraDetalhe) {
        this.idLeituraDetalhe = idLeituraDetalhe;
    }

    public int getIdSubCategoria() {
        return idSubCategoria;
    }

    public void setIdSubCategoria(int idSubCategoria) {
        this.idSubCategoria = idSubCategoria;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getQtdEconomias() {
        return qtdEconomias;
    }

    public void setQtdEconomias(int qtdEconomias) {
        this.qtdEconomias = qtdEconomias;
    }

    public double getValorAgua() {
        return valorAgua;
    }

    public void setValorAgua(double valorAgua) {
        this.valorAgua = valorAgua;
    }

    public double getValorEsgoto() {
        return valorEsgoto;
    }

    public void setValorEsgoto(double valorEsgoto) {
        this.valorEsgoto = valorEsgoto;
    }

    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }

    public int getIdFatura() {
        return idFatura;
    }

    public void setIdFatura(int idFatura) {
        this.idFatura = idFatura;
    }

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }

    public int getIdLigacao() {
        return idLigacao;
    }

    public void setIdLigacao(int idLigacao) {
        this.idLigacao = idLigacao;
    }

    public int getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(int idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public int getPercentualFat() {
        return percentualFat;
    }

    public void setPercentualFat(int percentualFat) {
        this.percentualFat = percentualFat;
    }

    public int getTotalEconomias() {
        return totalEconomias;
    }

    public void setTotalEconomias(int totalEconomias) {
        this.totalEconomias = totalEconomias;
    }
}
