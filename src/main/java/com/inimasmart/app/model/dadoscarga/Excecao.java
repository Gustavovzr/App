package com.inimasmart.app.model.dadoscarga;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Excecao {

    private BigInteger codigoExcecao;
    private int codigoInterno;
    private String codigoRubrica;
    private String rubrica;
    private boolean imprimirRubrica;
    private BigInteger volumeLimiteContratoDemanda;
    private BigDecimal valor;
    private Integer numeroMedicoes;
    private int tipoValor;
    private Boolean considerarTotalFatura;
    private Boolean aplicarEmLigacaoCortada;
    private BigDecimal aliqISS;
    private BigDecimal aliqICMS;
    private BigDecimal aliqPis;
    private BigDecimal aliqCofins;
    private BigDecimal aliqINSS;




    public BigInteger getCodigoExcecao() {
        return codigoExcecao;
    }

    public void setCodigoExcecao(BigInteger codigoExcecao) {
        this.codigoExcecao = codigoExcecao;
    }

    public int getCodigoInterno() {
        return codigoInterno;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public String getCodigoRubrica() {
        return codigoRubrica;
    }

    public void setCodigoRubrica(String codigoRubrica) {
        this.codigoRubrica = codigoRubrica;
    }

    public String getRubrica() {
        return rubrica;
    }

    public void setRubrica(String rubrica) {
        this.rubrica = rubrica;
    }

    public boolean isImprimirRubrica() {
        return imprimirRubrica;
    }

    public void setImprimirRubrica(boolean imprimirRubrica) {
        this.imprimirRubrica = imprimirRubrica;
    }

    public BigInteger getVolumeLimiteContratoDemanda() {
        return volumeLimiteContratoDemanda;
    }

    public void setVolumeLimiteContratoDemanda(BigInteger volumeLimiteContratoDemanda) {
        this.volumeLimiteContratoDemanda = volumeLimiteContratoDemanda;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Integer getNumeroMedicoes() {
        return numeroMedicoes;
    }

    public void setNumeroMedicoes(Integer numeroMedicoes) {
        this.numeroMedicoes = numeroMedicoes;
    }

    public int getTipoValor() {
        return tipoValor;
    }

    public void setTipoValor(int tipoValor) {
        this.tipoValor = tipoValor;
    }

    public Boolean getConsiderarTotalFatura() {
        return considerarTotalFatura;
    }

    public void setConsiderarTotalFatura(Boolean considerarTotalFatura) {
        this.considerarTotalFatura = considerarTotalFatura;
    }

    public Boolean getAplicarEmLigacaoCortada() {
        return aplicarEmLigacaoCortada;
    }

    public void setAplicarEmLigacaoCortada(Boolean aplicarEmLigacaoCortada) {
        this.aplicarEmLigacaoCortada = aplicarEmLigacaoCortada;
    }

    public BigDecimal getAliqISS() {
        return aliqISS;
    }

    public void setAliqISS(BigDecimal aliqISS) {
        this.aliqISS = aliqISS;
    }

    public BigDecimal getAliqICMS() {
        return aliqICMS;
    }

    public void setAliqICMS(BigDecimal aliqICMS) {
        this.aliqICMS = aliqICMS;
    }

    public BigDecimal getAliqPis() {
        return aliqPis;
    }

    public void setAliqPis(BigDecimal aliqPis) {
        this.aliqPis = aliqPis;
    }

    public BigDecimal getAliqCofins() {
        return aliqCofins;
    }

    public void setAliqCofins(BigDecimal aliqCofins) {
        this.aliqCofins = aliqCofins;
    }

    public BigDecimal getAliqINSS() {
        return aliqINSS;
    }

    public void setAliqINSS(BigDecimal aliqINSS) {
        this.aliqINSS = aliqINSS;
    }
}
