package com.inimasmart.app.model.dadoscarga;

import java.math.BigDecimal;
import java.math.BigInteger;

public class AplicacaoDesconto {

    private BigInteger codigoSubCategoria;
    private int tipoValorDesconto;
    private BigDecimal valorDesconto;
    private BigInteger limiteDeConsumo;
    private BigInteger limiteNrEconomias;
    private String codigoRubrica;
    private String descricaoRubrica;
    private BigDecimal aliqISS;
    private BigDecimal aliqICMS;
    private BigDecimal aliqPis;
    private BigDecimal aliqCofins;
    private BigDecimal aliqINSS;
    private boolean imprimirRubrica;

    public BigInteger getCodigoSubCategoria() {
        return codigoSubCategoria;
    }

    public void setCodigoSubCategoria(BigInteger codigoSubCategoria) {
        this.codigoSubCategoria = codigoSubCategoria;
    }

    public int getTipoValorDesconto() {
        return tipoValorDesconto;
    }

    public void setTipoValorDesconto(int tipoValorDesconto) {
        this.tipoValorDesconto = tipoValorDesconto;
    }

    public BigDecimal getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(BigDecimal valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public BigInteger getLimiteDeConsumo() {
        return limiteDeConsumo;
    }

    public void setLimiteDeConsumo(BigInteger limiteDeConsumo) {
        this.limiteDeConsumo = limiteDeConsumo;
    }

    public BigInteger getLimiteNrEconomias() {
        return limiteNrEconomias;
    }

    public void setLimiteNrEconomias(BigInteger limiteNrEconomias) {
        this.limiteNrEconomias = limiteNrEconomias;
    }

    public String getCodigoRubrica() {
        return codigoRubrica;
    }

    public void setCodigoRubrica(String codigoRubrica) {
        this.codigoRubrica = codigoRubrica;
    }

    public String getDescricaoRubrica() {
        return descricaoRubrica;
    }

    public void setDescricaoRubrica(String descricaoRubrica) {
        this.descricaoRubrica = descricaoRubrica;
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

    public boolean isImprimirRubrica() {
        return imprimirRubrica;
    }

    public void setImprimirRubrica(boolean imprimirRubrica) {
        this.imprimirRubrica = imprimirRubrica;
    }
}
