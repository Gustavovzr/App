package com.inimasmart.app.model.dadoscarga;

import java.math.BigDecimal;
import java.math.BigInteger;

public class CategoriaConsumo {

    private BigInteger codigo;
    private int economias;
    private Integer pesoCategoria;
    private Integer prioridadeCategoria;
    private BigInteger subCategoria;
    private BigDecimal percentualFaturado;




    public BigInteger getCodigo() {
        return codigo;
    }

    public void setCodigo(BigInteger codigo) {
        this.codigo = codigo;
    }

    public int getEconomias() {
        return economias;
    }

    public void setEconomias(int economias) {
        this.economias = economias;
    }

    public Integer getPesoCategoria() {
        return pesoCategoria;
    }

    public void setPesoCategoria(Integer pesoCategoria) {
        this.pesoCategoria = pesoCategoria;
    }

    public Integer getPrioridadeCategoria() {
        return prioridadeCategoria;
    }

    public void setPrioridadeCategoria(Integer prioridadeCategoria) {
        this.prioridadeCategoria = prioridadeCategoria;
    }

    public BigInteger getSubCategoria() {
        return subCategoria;
    }

    public void setSubCategoria(BigInteger subCategoria) {
        this.subCategoria = subCategoria;
    }

    public BigDecimal getPercentualFaturado() {
        return percentualFaturado;
    }

    public void setPercentualFaturado(BigDecimal percentualFaturado) {
        this.percentualFaturado = percentualFaturado;
    }
}
