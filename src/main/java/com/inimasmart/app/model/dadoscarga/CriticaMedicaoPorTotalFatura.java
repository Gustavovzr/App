package com.inimasmart.app.model.dadoscarga;

import java.math.BigDecimal;

public class CriticaMedicaoPorTotalFatura {

    private int codigoIDCritica;
    private BigDecimal valorPorEconomia;
    private boolean reterConta;

    public int getCodigoIDCritica() {
        return codigoIDCritica;
    }

    public void setCodigoIDCritica(int codigoIDCritica) {
        this.codigoIDCritica = codigoIDCritica;
    }

    public BigDecimal getValorPorEconomia() {
        return valorPorEconomia;
    }

    public void setValorPorEconomia(BigDecimal valorPorEconomia) {
        this.valorPorEconomia = valorPorEconomia;
    }

    public boolean isReterConta() {
        return reterConta;
    }

    public void setReterConta(boolean reterConta) {
        this.reterConta = reterConta;
    }
}
