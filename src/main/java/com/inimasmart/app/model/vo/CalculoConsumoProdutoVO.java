package com.inimasmart.app.model.vo;

import java.util.ArrayList;
import java.util.List;

public class CalculoConsumoProdutoVO {

    private int idLigacao = 0;
    private int idProduto = 0;
    private String tipoProduto = "";
    private Double volFatOri = 0d;
    private Double volFatConsOri = 0d;
    private int idExcecaoFat = 0;
    private Double volFatCons = 0d;
    private Double volFat = 0d;
    private Double mediaConsFat = 0d;
    private Double mediaConsFatDividido2 = 0d;
    private Double mediaConsFatOriginal = 0d;
    private Double volFatSomaFilhos = 0d;
    private Double volMedSomaFilhos = 0d;
    private double credAteVolMin = 0;
    private double credAcimaVolMin = 0;
    private double creditoUtilizado = 0;
    private boolean isentoConsolidacao = true;
    private boolean cortado = true;
    private boolean novo = false;
    private boolean produtoNovo = false;
    private int idTipoCalculo = 0;
    private String bloqueiaDesconsiderarMedia = "";
    private boolean estimavel;
    private boolean cobrarConsumoNaoFaturadoProximoCiclo;
    private double volConsumoMinimo;
    private int nrDiasConsumo;
    private Double volumeRemanescente;
    private List<CalculoConsumoProdutoCategoriaVO> colCalculoConsumoProdutoCategoria = new ArrayList<CalculoConsumoProdutoCategoriaVO>();
    private int idMedicaoDetalheProduto = 0;
    private boolean existeVolumeRemanescente;
    private int nrDiasConsumoMax = 0;
    //Nunca utilizar para persistencia em banco, dados temporarios
    private double credAteVolMinOri = 0;
    private double credAcimaVolMinOri = 0;

    public void addCalculoConsumoProdutoCategoria(CalculoConsumoProdutoCategoriaVO i_volumePorCategoria) {
        getColCalculoConsumoProdutoCategoria().add(i_volumePorCategoria);
    }

    public List<CalculoConsumoProdutoCategoriaVO> getCalculoConsumoProdutoCategoria() {
        return getColCalculoConsumoProdutoCategoria();
    }

    public void setCalculoConsumoProdutoCategoria(List<CalculoConsumoProdutoCategoriaVO> i_volumePorCategoriaVOs) {
        setColCalculoConsumoProdutoCategoria(i_volumePorCategoriaVOs);
    }

    public int getIdMedicaoDetalheProduto() {
        return idMedicaoDetalheProduto;
    }

    public void setIdMedicaoDetalheProduto(int idMedicaoDetalheProduto) {
        this.idMedicaoDetalheProduto = idMedicaoDetalheProduto;
    }

    public int getIdLigacao() {
        return idLigacao;
    }

    public void setIdLigacao(int idLigacao) {
        this.idLigacao = idLigacao;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public Double getVolFatOri() {
        return volFatOri;
    }

    public void setVolFatOri(Double volFatOri) {
        this.volFatOri = volFatOri;
    }

    public Double getVolFatConsOri() {
        return volFatConsOri;
    }

    public void setVolFatConsOri(Double volFatConsOri) {
        this.volFatConsOri = volFatConsOri;
    }

    public int getIdExcecaoFat() {
        return idExcecaoFat;
    }

    public void setIdExcecaoFat(int idExcecaoFat) {
        this.idExcecaoFat = idExcecaoFat;
    }

    public Double getVolFatCons() {
        return volFatCons;
    }

    public void setVolFatCons(Double volFatCons) {
        this.volFatCons = volFatCons;
    }

    public Double getVolFat() {
        return volFat;
    }

    public void setVolFat(Double volFat) {
        this.volFat = volFat;
    }

    public Double getMediaConsFat() {
        return mediaConsFat;
    }

    public void setMediaConsFat(Double mediaConsFat) {
        this.mediaConsFat = mediaConsFat;
    }

    public Double getMediaConsFatDividido2() {
        return mediaConsFatDividido2;
    }

    public void setMediaConsFatDividido2(Double mediaConsFatDividido2) {
        this.mediaConsFatDividido2 = mediaConsFatDividido2;
    }

    public Double getMediaConsFatOriginal() {
        return mediaConsFatOriginal;
    }

    public void setMediaConsFatOriginal(Double mediaConsFatOriginal) {
        this.mediaConsFatOriginal = mediaConsFatOriginal;
    }

    public Double getVolFatSomaFilhos() {
        return volFatSomaFilhos;
    }

    public void setVolFatSomaFilhos(Double volFatSomaFilhos) {
        this.volFatSomaFilhos = volFatSomaFilhos;
    }

    public Double getVolMedSomaFilhos() {
        return volMedSomaFilhos;
    }

    public void setVolMedSomaFilhos(Double volMedSomaFilhos) {
        this.volMedSomaFilhos = volMedSomaFilhos;
    }

    public double getCredAteVolMin() {
        return credAteVolMin;
    }

    public void setCredAteVolMin(double credAteVolMin) {
        this.credAteVolMin = credAteVolMin;
    }

    public double getCredAcimaVolMin() {
        return credAcimaVolMin;
    }

    public void setCredAcimaVolMin(double credAcimaVolMin) {
        this.credAcimaVolMin = credAcimaVolMin;
    }

    public double getCreditoUtilizado() {
        return creditoUtilizado;
    }

    public void setCreditoUtilizado(double creditoUtilizado) {
        this.creditoUtilizado = creditoUtilizado;
    }

    public boolean isIsentoConsolidacao() {
        return isentoConsolidacao;
    }

    public void setIsentoConsolidacao(boolean isentoConsolidacao) {
        this.isentoConsolidacao = isentoConsolidacao;
    }

    public boolean isCortado() {
        return cortado;
    }

    public void setCortado(boolean cortado) {
        this.cortado = cortado;
    }

    public boolean isNovo() {
        return novo;
    }

    public void setNovo(boolean novo) {
        this.novo = novo;
    }

    public boolean isProdutoNovo() {
        return produtoNovo;
    }

    public void setProdutoNovo(boolean produtoNovo) {
        this.produtoNovo = produtoNovo;
    }

    public int getIdTipoCalculo() {
        return idTipoCalculo;
    }

    public void setIdTipoCalculo(int idTipoCalculo) {
        this.idTipoCalculo = idTipoCalculo;
    }

    public String getBloqueiaDesconsiderarMedia() {
        return bloqueiaDesconsiderarMedia;
    }

    public void setBloqueiaDesconsiderarMedia(String bloqueiaDesconsiderarMedia) {
        this.bloqueiaDesconsiderarMedia = bloqueiaDesconsiderarMedia;
    }

    public boolean isEstimavel() {
        return estimavel;
    }

    public void setEstimavel(boolean estimavel) {
        this.estimavel = estimavel;
    }

    public boolean isCobrarConsumoNaoFaturadoProximoCiclo() {
        return cobrarConsumoNaoFaturadoProximoCiclo;
    }

    public void setCobrarConsumoNaoFaturadoProximoCiclo(boolean cobrarConsumoNaoFaturadoProximoCiclo) {
        this.cobrarConsumoNaoFaturadoProximoCiclo = cobrarConsumoNaoFaturadoProximoCiclo;
    }

    public double getVolConsumoMinimo() {
        return volConsumoMinimo;
    }

    public void setVolConsumoMinimo(double volConsumoMinimo) {
        this.volConsumoMinimo = volConsumoMinimo;
    }

    public int getNrDiasConsumo() {
        return nrDiasConsumo;
    }

    public void setNrDiasConsumo(int nrDiasConsumo) {
        this.nrDiasConsumo = nrDiasConsumo;
    }

    public Double getVolumeRemanescente() {
        return volumeRemanescente;
    }

    public void setVolumeRemanescente(Double volumeRemanescente) {
        this.volumeRemanescente = volumeRemanescente;
    }

    public List<CalculoConsumoProdutoCategoriaVO> getColCalculoConsumoProdutoCategoria() {
        return colCalculoConsumoProdutoCategoria;
    }

    public void setColCalculoConsumoProdutoCategoria(List<CalculoConsumoProdutoCategoriaVO> colCalculoConsumoProdutoCategoria) {
        this.colCalculoConsumoProdutoCategoria = colCalculoConsumoProdutoCategoria;
    }

    public boolean isExisteVolumeRemanescente() {
        return existeVolumeRemanescente;
    }

    public void setExisteVolumeRemanescente(boolean existeVolumeRemanescente) {
        this.existeVolumeRemanescente = existeVolumeRemanescente;
    }

    public int getNrDiasConsumoMax() {
        return nrDiasConsumoMax;
    }

    public void setNrDiasConsumoMax(int nrDiasConsumoMax) {
        this.nrDiasConsumoMax = nrDiasConsumoMax;
    }

    public double getCredAteVolMinOri() {
        return credAteVolMinOri;
    }

    public void setCredAteVolMinOri(double credAteVolMinOri) {
        this.credAteVolMinOri = credAteVolMinOri;
    }

    public double getCredAcimaVolMinOri() {
        return credAcimaVolMinOri;
    }

    public void setCredAcimaVolMinOri(double credAcimaVolMinOri) {
        this.credAcimaVolMinOri = credAcimaVolMinOri;
    }
}
