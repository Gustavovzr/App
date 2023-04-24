package com.inimasmart.app.model.dadoscarga;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ExcecaoVolMinCategoria {

    private BigDecimal volMedidoInicial;
    private BigDecimal volMedidoFinal;
    private BigDecimal volFat;

    private BigInteger nrMaxEco;
    private boolean exigeLeitura;
    private boolean faturarVolFixo;

    public BigDecimal getVolMedidoInicial() {
        return volMedidoInicial;
    }

    public void setVolMedidoInicial(BigDecimal volMedidoInicial) {
        this.volMedidoInicial = volMedidoInicial;
    }

    public BigDecimal getVolMedidoFinal() {
        return volMedidoFinal;
    }

    public void setVolMedidoFinal(BigDecimal volMedidoFinal) {
        this.volMedidoFinal = volMedidoFinal;
    }

    public BigDecimal getVolFat() {
        return volFat;
    }

    public void setVolFat(BigDecimal volFat) {
        this.volFat = volFat;
    }

    public BigInteger getNrMaxEco() {
        return nrMaxEco;
    }

    public void setNrMaxEco(BigInteger nrMaxEco) {
        this.nrMaxEco = nrMaxEco;
    }

    public boolean isExigeLeitura() {
        return exigeLeitura;
    }

    public void setExigeLeitura(boolean exigeLeitura) {
        this.exigeLeitura = exigeLeitura;
    }

    public boolean isFaturarVolFixo() {
        return faturarVolFixo;
    }

    public void setFaturarVolFixo(boolean faturarVolFixo) {
        this.faturarVolFixo = faturarVolFixo;
    }
}
