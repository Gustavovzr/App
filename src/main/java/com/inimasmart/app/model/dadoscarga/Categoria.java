package com.inimasmart.app.model.dadoscarga;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Categoria {

    private BigInteger codigo;
    private String descricao;
    private int ordemImpressao;
    private BigDecimal consumoMinimo;
    private BigDecimal consumoMinimoRetencao;
    private Boolean imprimirMsgExcedenteCobrado;
    private List<ExcecaoVolMinCategoria> excecaoVolMinCategoria= new ArrayList<>();
    private List<SubCategoria> subCategoria= new ArrayList<>();

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

    public int getOrdemImpressao() {
        return ordemImpressao;
    }

    public void setOrdemImpressao(int ordemImpressao) {
        this.ordemImpressao = ordemImpressao;
    }

    public BigDecimal getConsumoMinimo() {
        return consumoMinimo;
    }

    public void setConsumoMinimo(BigDecimal consumoMinimo) {
        this.consumoMinimo = consumoMinimo;
    }

    public BigDecimal getConsumoMinimoRetencao() {
        return consumoMinimoRetencao;
    }

    public void setConsumoMinimoRetencao(BigDecimal consumoMinimoRetencao) {
        this.consumoMinimoRetencao = consumoMinimoRetencao;
    }

    public Boolean getImprimirMsgExcedenteCobrado() {
        return imprimirMsgExcedenteCobrado;
    }

    public void setImprimirMsgExcedenteCobrado(Boolean imprimirMsgExcedenteCobrado) {
        this.imprimirMsgExcedenteCobrado = imprimirMsgExcedenteCobrado;
    }

    public List<ExcecaoVolMinCategoria> getExcecaoVolMinCategoria() {
        return excecaoVolMinCategoria;
    }

    public void setExcecaoVolMinCategoria(List<ExcecaoVolMinCategoria> excecaoVolMinCategoria) {
        this.excecaoVolMinCategoria = excecaoVolMinCategoria;
    }

    public List<SubCategoria> getSubCategoria() {
        return subCategoria;
    }

    public void setSubCategoria(List<SubCategoria> subCategoria) {
        this.subCategoria = subCategoria;
    }
}
