package com.inimasmart.app.model.dadoscarga;

import java.math.BigDecimal;

public class Faixa {

    private int numeroFaixa;
    private BigDecimal consumoInicial;
    private BigDecimal consumoFinal;
    private BigDecimal tarifa;
    private BigDecimal tarifaComDesconto;
    private BigDecimal volumeLimite;

    public int getNumeroFaixa() {
        return numeroFaixa;
    }

    public void setNumeroFaixa(int numeroFaixa) {
        this.numeroFaixa = numeroFaixa;
    }

    public BigDecimal getConsumoInicial() {
        return consumoInicial;
    }

    public void setConsumoInicial(BigDecimal consumoInicial) {
        this.consumoInicial = consumoInicial;
    }

    public BigDecimal getConsumoFinal() {
        return consumoFinal;
    }

    public void setConsumoFinal(BigDecimal consumoFinal) {
        this.consumoFinal = consumoFinal;
    }

    public BigDecimal getTarifa() {
        return tarifa;
    }

    public void setTarifa(BigDecimal tarifa) {
        this.tarifa = tarifa;
    }

    public BigDecimal getTarifaComDesconto() {
        return tarifaComDesconto;
    }

    public void setTarifaComDesconto(BigDecimal tarifaComDesconto) {
        this.tarifaComDesconto = tarifaComDesconto;
    }

    public BigDecimal getVolumeLimite() {
        return volumeLimite;
    }

    public void setVolumeLimite(BigDecimal volumeLimite) {
        this.volumeLimite = volumeLimite;
    }
}
