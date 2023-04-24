package com.inimasmart.app.model.dadoscarga;

import java.math.BigInteger;

public class DadosSubCategoriaAtual {

    private BigInteger codigoCategoria;


    private BigInteger codigoSubCategoria;

    private BigInteger qtdeUnidadeMensuracao;

    private BigInteger economias;




    public BigInteger getCodigoCategoria() {
        return codigoCategoria;
    }

    public void setCodigoCategoria(BigInteger codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }

    public BigInteger getCodigoSubCategoria() {
        return codigoSubCategoria;
    }

    public void setCodigoSubCategoria(BigInteger codigoSubCategoria) {
        this.codigoSubCategoria = codigoSubCategoria;
    }

    public BigInteger getQtdeUnidadeMensuracao() {
        return qtdeUnidadeMensuracao;
    }

    public void setQtdeUnidadeMensuracao(BigInteger qtdeUnidadeMensuracao) {
        this.qtdeUnidadeMensuracao = qtdeUnidadeMensuracao;
    }

    public BigInteger getEconomias() {
        return economias;
    }

    public void setEconomias(BigInteger economias) {
        this.economias = economias;
    }
}
