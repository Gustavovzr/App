package com.inimasmart.app.model.dadoscarga;

import java.math.BigDecimal;
import java.math.BigInteger;

public class SubCategoria {

    private BigInteger codigo;
    private String descricao;
    private String sigla;
    private String tipoUnidadeMensuracao;
    private BigDecimal consumoMinimo;

    public BigInteger getCodigo() {
        return codigo;
    }

    public void setCodigo(BigInteger codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getTipoUnidadeMensuracao() {
        return tipoUnidadeMensuracao;
    }

    public void setTipoUnidadeMensuracao(String tipoUnidadeMensuracao) {
        this.tipoUnidadeMensuracao = tipoUnidadeMensuracao;
    }

    public BigDecimal getConsumoMinimo() {
        return consumoMinimo;
    }

    public void setConsumoMinimo(BigDecimal consumoMinimo) {
        this.consumoMinimo = consumoMinimo;
    }
}
