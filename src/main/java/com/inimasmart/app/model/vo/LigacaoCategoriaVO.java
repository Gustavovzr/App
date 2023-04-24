package com.inimasmart.app.model.vo;

public class LigacaoCategoriaVO {

    private int idCategoria;
    private int idSubCategoria;
    private int qtdEconomia;
    private int percentualFat;
    private String categoria;
    private String subCategoria;
    private int idUnidadeMensuracao;
    private String unidadeMensuracao;
    private double valorUnidade;
    private int volumeEstimado;
    private int pesoFaturado;
    private double baseCalc;
    private String corLinha;
    private boolean categoriaPrincipal;
    private double taxaDeServico;
    private double aluguelHidrometro;
    private double valorConsumoZero;
    private double servicoAmbiental;

    /**
     * Creates a new instance of CategoriaVO
     */
    public LigacaoCategoriaVO() {
        idCategoria = 0;
        idSubCategoria = 0;
        subCategoria = "";
        qtdEconomia = 0;
        unidadeMensuracao = "";
        valorUnidade = 0;
        volumeEstimado = 0;
        pesoFaturado = 0;
        baseCalc = 0.0;
    }

    public LigacaoCategoriaVO(int i_idCategoria,
                              int i_idSubCategoria,
                              String i_subCategoria,
                              int i_qtdEconomia,
                              int i_percentualFat) {

        idCategoria = i_idCategoria;
        idSubCategoria = i_idSubCategoria;
        subCategoria = i_subCategoria;
        qtdEconomia = i_qtdEconomia;
        percentualFat = i_percentualFat;
    }

    public LigacaoCategoriaVO(int i_idCategoria,
                              int i_idSubCategoria,
                              String i_subCategoria,
                              int i_qtdEconomia,
                              int i_percentualFat,
                              int i_idUnidadeMensuracao,
                              String i_unidadeMensuracao,
                              double i_valorUnidade,
                              int i_volumeEstimado,
                              int i_pesoFaturado,
                              double i_baseCalc) {

        idCategoria = i_idCategoria;
        idSubCategoria = i_idSubCategoria;
        subCategoria = i_subCategoria;
        qtdEconomia = i_qtdEconomia;
        idUnidadeMensuracao = i_idUnidadeMensuracao;
        unidadeMensuracao = i_unidadeMensuracao;
        percentualFat = i_percentualFat;
        valorUnidade = i_valorUnidade;
        volumeEstimado = i_volumeEstimado;
        pesoFaturado = i_pesoFaturado;
        baseCalc = i_baseCalc;
    }

    public LigacaoCategoriaVO(int i_idCategoria,
                              int i_idSubCategoria,
                              String i_subCategoria,
                              int i_qtdEconomia,
                              int i_percentualFat,
                              String i_unidadeMensuracao,
                              double i_valorUnidade,
                              int i_volumeEstimado,
                              int i_pesoFaturado,
                              double i_baseCalc) {

        idCategoria = i_idCategoria;
        idSubCategoria = i_idSubCategoria;
        subCategoria = i_subCategoria;
        qtdEconomia = i_qtdEconomia;
        unidadeMensuracao = i_unidadeMensuracao;
        percentualFat = i_percentualFat;
        valorUnidade = i_valorUnidade;
        volumeEstimado = i_volumeEstimado;
        pesoFaturado = i_pesoFaturado;
        baseCalc = i_baseCalc;
    }

    public LigacaoCategoriaVO(int i_idCategoria,
                              int i_idSubCategoria,
                              String i_subCategoria,
                              int i_qtdEconomia,
                              int i_percentualFat,
                              String i_unidadeMensuracao,
                              double i_valorUnidade,
                              int i_volumeEstimado,
                              int i_pesoFaturado,
                              double i_baseCalc,
                              double i_taxaServico,
                              double i_aluguelHidrometro,
                              double i_consumoZero,
                              double i_servicoAmbiental) {

        idCategoria = i_idCategoria;
        idSubCategoria = i_idSubCategoria;
        subCategoria = i_subCategoria;
        qtdEconomia = i_qtdEconomia;
        unidadeMensuracao = i_unidadeMensuracao;
        percentualFat = i_percentualFat;
        valorUnidade = i_valorUnidade;
        volumeEstimado = i_volumeEstimado;
        pesoFaturado = i_pesoFaturado;
        baseCalc = i_baseCalc;
        taxaDeServico = i_taxaServico;
        aluguelHidrometro = i_aluguelHidrometro;
        valorConsumoZero = i_consumoZero;
        servicoAmbiental = i_servicoAmbiental;
    }

    public boolean isCategoriaPrincipal() {
        return categoriaPrincipal;
    }

    public void setCategoriaPrincipal(boolean categoriaPrincipal) {
        this.categoriaPrincipal = categoriaPrincipal;
    }

    public String getCorLinha() {
        return corLinha;
    }

    public void setCorLinha(String corLinha) {
        this.corLinha = corLinha;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSubCategoria() {
        return subCategoria;
    }

    public void setSubCategoria(String subCategoria) {
        this.subCategoria = subCategoria;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int i_dado) {
        idCategoria = i_dado;
    }

    public int getIdSubcategoria() {
        return idSubCategoria;
    }

    public void setIdSubCategoria(int i_dado) {
        idSubCategoria = i_dado;
    }

    public int getQtdEconomia() {
        return qtdEconomia;
    }

    public void setQtdEconomia(int i_dado) {
        qtdEconomia = i_dado;
    }

    public int getPercentualFat() {
        return percentualFat;
    }

    public void setPercentualFat(int percentualFat) {
        this.percentualFat = percentualFat;
    }

    public int getPesoFaturado() {
        return pesoFaturado;
    }

    public void setPesoFaturado(int pesoFaturado) {
        this.pesoFaturado = pesoFaturado;
    }

    public double getValorUnidade() {
        return valorUnidade;
    }

    public void setValorUnidade(double valorUnidade) {
        this.valorUnidade = valorUnidade;
    }

    public int getVolumeEstimado() {
        return volumeEstimado;
    }

    public void setVolumeEstimado(int volumeEstimado) {
        this.volumeEstimado = volumeEstimado;
    }

    public String getUnidadeMensuracao() {
        return unidadeMensuracao;
    }

    public void setUnidadeMensuracao(String unidadeMensuracao) {
        this.unidadeMensuracao = unidadeMensuracao;
    }

    public int getIdUnidadeMensuracao() {
        return idUnidadeMensuracao;
    }

    public void setIdUnidadeMensuracao(int idUnidadeMensuracao) {
        this.idUnidadeMensuracao = idUnidadeMensuracao;
    }

    public double getBaseCalc() {
        return baseCalc;
    }

    public void setBaseCalc(double baseCalc) {
        this.baseCalc = baseCalc;
    }

    public double getTaxaDeServico() {
        return taxaDeServico;
    }

    public void setTaxaDeServico(double taxaDeServico) {
        this.taxaDeServico = taxaDeServico;
    }

    public double getAluguelHidrometro() {
        return aluguelHidrometro;
    }

    public void setAluguelHidrometro(double aluguelHidrometro) {
        this.aluguelHidrometro = aluguelHidrometro;
    }

    public double getValorConsumoZero() {
        return valorConsumoZero;
    }

    public void setValorConsumoZero(double valorConsumoZero) {
        this.valorConsumoZero = valorConsumoZero;
    }

    public double getServicoAmbiental() {
        return servicoAmbiental;
    }

    public void setServicoAmbiental(double servicoAmbiental) {
        this.servicoAmbiental = servicoAmbiental;
    }
}
