package com.inimasmart.app.model.dadoscarga;

import java.util.ArrayList;
import java.util.List;

public class ProdutoCliente {

    private int codigoProduto;
    private int situacaoProduto;
    private Boolean produtoEstimavel;
    private Boolean fonteAlternativa;
    private Integer consumoAFaturarDoCicloAnt;
    private List<CategoriaConsumo> categoriaConsumo=new ArrayList<>();
    private List<Excecao> excecao=new ArrayList<>();
    private double servicoAmbiental;

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public int getSituacaoProduto() {
        return situacaoProduto;
    }

    public void setSituacaoProduto(int situacaoProduto) {
        this.situacaoProduto = situacaoProduto;
    }

    public Boolean getProdutoEstimavel() {
        return produtoEstimavel;
    }

    public void setProdutoEstimavel(Boolean produtoEstimavel) {
        this.produtoEstimavel = produtoEstimavel;
    }

    public Boolean getFonteAlternativa() {
        return fonteAlternativa;
    }

    public void setFonteAlternativa(Boolean fonteAlternativa) {
        this.fonteAlternativa = fonteAlternativa;
    }

    public Integer getConsumoAFaturarDoCicloAnt() {
        return consumoAFaturarDoCicloAnt;
    }

    public void setConsumoAFaturarDoCicloAnt(Integer consumoAFaturarDoCicloAnt) {
        this.consumoAFaturarDoCicloAnt = consumoAFaturarDoCicloAnt;
    }

    public List<CategoriaConsumo> getCategoriaConsumo() {
        return categoriaConsumo;
    }

    public void setCategoriaConsumo(List<CategoriaConsumo> categoriaConsumo) {
        this.categoriaConsumo = categoriaConsumo;
    }

    public List<Excecao> getExcecao() {
        return excecao;
    }

    public void setExcecao(List<Excecao> excecao) {
        this.excecao = excecao;
    }


    public double getServicoAmbiental() {
        return servicoAmbiental;
    }

    public void setServicoAmbiental(double servicoAmbiental) {
        this.servicoAmbiental = servicoAmbiental;
    }
}
