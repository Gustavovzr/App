package com.inimasmart.app.model.vo;

import java.util.List;

public class FatDadosMedicaoDetVO {

    private int id = 0;
    private int idLigacao = 0;
    private int idLigacaoConsolidadora = 0;
    private List<FatDadosMedProdutoVO> colFatDadosMedProdutoVO = null;
    private List<FatDadosMedCategVO> colFatDadosMedCategVO = null;
    private List<FatDadosMedExcecaoVO> colFatDadosMedExcecaoVO = null;
    private Double volMedido = 0d;
    private String leituraEfetuada = "S";
    private String ligacaoCortada = "N";
    private int mediaConsumo = 0;
    private String aplicarCoeficienteReducaoCriterioFat = "N";
    private int idTipoMacroMedidor = 0;
    private int idLigacaoMacroMedidor = 0;
    private boolean consolidadora = false;

    public boolean isConsolidadora() {
        return consolidadora;
    }

    public void setConsolidadora(boolean consolidadora) {
        this.consolidadora = consolidadora;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdLigacao() {
        return idLigacao;
    }

    public void setIdLigacao(int idLigacao) {
        this.idLigacao = idLigacao;
    }

    public int getIdLigacaoConsolidadora() {
        return idLigacaoConsolidadora;
    }

    public void setIdLigacaoConsolidadora(int idLigacaoConsolidadora) {
        this.idLigacaoConsolidadora = idLigacaoConsolidadora;
    }

    public List<FatDadosMedProdutoVO> getColFatDadosMedProdutoVO() {
        return colFatDadosMedProdutoVO;
    }

    public void setColFatDadosMedProdutoVO(List<FatDadosMedProdutoVO> colFatDadosMedProdutoVO) {
        this.colFatDadosMedProdutoVO = colFatDadosMedProdutoVO;
    }

    public List<FatDadosMedCategVO> getColFatDadosMedCategVO() {
        return colFatDadosMedCategVO;
    }

    public void setColFatDadosMedCategVO(List<FatDadosMedCategVO> colFatDadosMedCategVO) {
        this.colFatDadosMedCategVO = colFatDadosMedCategVO;
    }

    public List<FatDadosMedExcecaoVO> getColFatDadosMedExcecaoVO() {
        return colFatDadosMedExcecaoVO;
    }

    public void setColFatDadosMedExcecaoVO(List<FatDadosMedExcecaoVO> colFatDadosMedExcecaoVO) {
        this.colFatDadosMedExcecaoVO = colFatDadosMedExcecaoVO;
    }

    public Double getVolMedido() {
        return volMedido;
    }

    public void setVolMedido(Double volMedido) {
        this.volMedido = volMedido;
    }

    public String getLeituraEfetuada() {
        return leituraEfetuada;
    }

    public void setLeituraEfetuada(String leituraEfetuada) {
        this.leituraEfetuada = leituraEfetuada;
    }

    public String getLigacaoCortada() {
        return ligacaoCortada;
    }

    public void setLigacaoCortada(String ligacaoCortada) {
        this.ligacaoCortada = ligacaoCortada;
    }

    public int getMediaConsumo() {
        return mediaConsumo;
    }

    public void setMediaConsumo(int mediaConsumo) {
        this.mediaConsumo = mediaConsumo;
    }

    public String getAplicarCoeficienteReducaoCriterioFat() {
        return aplicarCoeficienteReducaoCriterioFat;
    }

    public void setAplicarCoeficienteReducaoCriterioFat(String aplicarCoeficienteReducaoCriterioFat) {
        this.aplicarCoeficienteReducaoCriterioFat = aplicarCoeficienteReducaoCriterioFat;
    }

    public int getIdTipoMacroMedidor() {
        return idTipoMacroMedidor;
    }

    public void setIdTipoMacroMedidor(int idTipoMacroMedidor) {
        this.idTipoMacroMedidor = idTipoMacroMedidor;
    }

    public int getIdLigacaoMacroMedidor() {
        return idLigacaoMacroMedidor;
    }

    public void setIdLigacaoMacroMedidor(int idLigacaoMacroMedidor) {
        this.idLigacaoMacroMedidor = idLigacaoMacroMedidor;
    }
}
