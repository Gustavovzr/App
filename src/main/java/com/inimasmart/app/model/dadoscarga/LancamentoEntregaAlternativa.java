package com.inimasmart.app.model.dadoscarga;

import java.math.BigDecimal;

public class LancamentoEntregaAlternativa {

    private String descricao;
    private int plano;
    private int parcela;
    private BigDecimal valorImpresso;
    private boolean credito;
    private BigDecimal aliqISS;
    private BigDecimal aliqICMS;
    private BigDecimal aliqPis;
    private BigDecimal aliqCofins;
    private BigDecimal aliqINSS;
    private Integer idClassificacaoVenda;
    private Integer codigoRubrica;



    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPlano() {
        return plano;
    }

    public void setPlano(int plano) {
        this.plano = plano;
    }

    public int getParcela() {
        return parcela;
    }

    public void setParcela(int parcela) {
        this.parcela = parcela;
    }

    public BigDecimal getValorImpresso() {
        return valorImpresso;
    }

    public void setValorImpresso(BigDecimal valorImpresso) {
        this.valorImpresso = valorImpresso;
    }

    public boolean isCredito() {
        return credito;
    }

    public void setCredito(boolean credito) {
        this.credito = credito;
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

    public Integer getIdClassificacaoVenda() {
        return idClassificacaoVenda;
    }

    public void setIdClassificacaoVenda(Integer idClassificacaoVenda) {
        this.idClassificacaoVenda = idClassificacaoVenda;
    }

    public Integer getCodigoRubrica() {
        return codigoRubrica;
    }

    public void setCodigoRubrica(Integer codigoRubrica) {
        this.codigoRubrica = codigoRubrica;
    }
}
