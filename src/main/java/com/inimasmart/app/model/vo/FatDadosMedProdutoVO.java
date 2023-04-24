package com.inimasmart.app.model.vo;

import java.util.List;

public class FatDadosMedProdutoVO {

    private int idProduto = 0;
    private String produto = "";
    private int idRubrica = 0;
    private String rubrica = "";
    private String tipoProduto = "";
    private Double volFat = 0d;
    private Double volFatCons = 0d;
    private Double mediaFat = 0d;
    private int idGrupoReceita = -1;
    private int idLigacao = 0;

    /**
     * Creates a new instance of FatDadosMedProdutoVO
     */
    public FatDadosMedProdutoVO() {
    }


    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FatDadosMedProdutoVO other = (FatDadosMedProdutoVO) obj;
        return this.getIdProduto() == other.getIdProduto();
    }


    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.getIdProduto();
        return hash;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getIdRubrica() {
        return idRubrica;
    }

    public void setIdRubrica(int idRubrica) {
        this.idRubrica = idRubrica;
    }

    public String getRubrica() {
        return rubrica;
    }

    public void setRubrica(String rubrica) {
        this.rubrica = rubrica;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public Double getVolFat() {
        return volFat;
    }

    public void setVolFat(Double volFat) {
        this.volFat = volFat;
    }

    public Double getVolFatCons() {
        return volFatCons;
    }

    public void setVolFatCons(Double volFatCons) {
        this.volFatCons = volFatCons;
    }

    public Double getMediaFat() {
        return mediaFat;
    }

    public void setMediaFat(Double mediaFat) {
        this.mediaFat = mediaFat;
    }

    public int getIdGrupoReceita() {
        return idGrupoReceita;
    }

    public void setIdGrupoReceita(int idGrupoReceita) {
        this.idGrupoReceita = idGrupoReceita;
    }

    public int getIdLigacao() {
        return idLigacao;
    }

    public void setIdLigacao(int idLigacao) {
        this.idLigacao = idLigacao;
    }
}
