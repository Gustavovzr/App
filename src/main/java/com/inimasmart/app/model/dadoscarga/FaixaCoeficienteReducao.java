package com.inimasmart.app.model.dadoscarga;

import java.math.BigDecimal;

public class FaixaCoeficienteReducao {

    private String codigo;
    private int consumoInicial;
    private int consumoFinal;
    private BigDecimal coeficiente;
    private boolean exibirFatura;
    private String descricaoFatura;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getConsumoInicial() {
        return consumoInicial;
    }

    public void setConsumoInicial(int consumoInicial) {
        this.consumoInicial = consumoInicial;
    }

    public int getConsumoFinal() {
        return consumoFinal;
    }

    public void setConsumoFinal(int consumoFinal) {
        this.consumoFinal = consumoFinal;
    }

    public BigDecimal getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(BigDecimal coeficiente) {
        this.coeficiente = coeficiente;
    }

    public boolean isExibirFatura() {
        return exibirFatura;
    }

    public void setExibirFatura(boolean exibirFatura) {
        this.exibirFatura = exibirFatura;
    }

    public String getDescricaoFatura() {
        return descricaoFatura;
    }

    public void setDescricaoFatura(String descricaoFatura) {
        this.descricaoFatura = descricaoFatura;
    }
}
