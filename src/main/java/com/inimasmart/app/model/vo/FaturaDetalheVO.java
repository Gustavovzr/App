package com.inimasmart.app.model.vo;

import java.util.ArrayList;
import java.util.List;

public class FaturaDetalheVO {

    private int id = 0;
    private int parcela = 0;
    private int nrParcelas = 1;
    private int idRubrica = 0;
    private int idTipoExcecao = 0;
    private int idCategoria = 0;
    private int idClassificacaoFiscalRubrica = 0;
    private double valor = 0.0d;
    private double volFatIndividual = 0;
    private List<FaturaDetalheImpostoVO> colFaturaDetalheImpostoVO = new ArrayList<FaturaDetalheImpostoVO>();
    private int idProduto = 0;
    private int idVendaDetalheParcela = 0;
    private double valorImposto = 0.0d;
    private double valorTotal = 0.0d;
    private double valorTotalConsiderarFatura = 0.0d;
    private int idExcecao = 0;
    private int idExcecaoAplicacao = 0;
    private int idLigacaoExcecao = 0;
    private boolean parcelamento = false;
    private int idPeriodoRef = -1;
    private String periodoRef = "";
    private int mes = 0;
    private int ano = 0;
    private boolean exibirFatura = true;
    private boolean considerarTotalFatura = true;
    private int idGrupoExibe = 0;
    private String rubrica = "";
    private String rubricaResumida = "";
    private int idGrupoRubrica = 0;
    private int idGrupoReceita = -1;
    private String produto = "";
    private String poderConcedente = "";
    private String referencia = "";
    private int idLigacaoSeguro;
    private String codRubrica = "";
    private double aliquotaISS = 0.00d;
    private double aliquotaICMS = 0.00d;
    private double aliquotaPis = 0.00d;
    private double aliquotaCofins = 0.00d;
    private double aliquotaINSS = 0.00d;
    private double baseCalculoISS = 0.00d;
    private double baseCalculoICMS = 0.00d;
    private double baseCalculoPis = 0.00d;
    private double baseCalculoCofins = 0.00d;
    private double baseCalculoINSS = 0.00d;
    private double baseCalculoGeral = 0.00d;
    private double valorISS = 0.0000d;
    private double valorICMS = 0.0000d;
    private double valorPis = 0.0000d;
    private double valorCofins = 0.0000d;
    private double valorINSS = 0.0000d;
    private double valorGeral = 0.0000d;
    private double valorUfir = 0.0000d;
    private boolean analitico = false;
    private boolean aplicaTaxaAgenersa = false;
    private String maximoRubricasFaturaTxt = "";
    private String debitoCredito = "";
    private int idClassificacaoVenda = 0;
    private int idRubricaAntecipacao;
    private int idTipoParcelamentoAcordo;
    private boolean rubricaAntecipacao;
    private int idPeriodoFat;

    public boolean isRubricaAntecipacao() {
        return rubricaAntecipacao;
    }

    public void setRubricaAntecipacao(boolean rubricaAntecipacao) {
        this.rubricaAntecipacao = rubricaAntecipacao;
    }

    public int getIdRubricaAntecipacao() {
        return idRubricaAntecipacao;
    }

    public void setIdRubricaAntecipacao(int idRubricaAntecipacao) {
        this.idRubricaAntecipacao = idRubricaAntecipacao;
    }

    public int getIdClassificacaoVenda() {
        return idClassificacaoVenda;
    }

    public void setIdClassificacaoVenda(int idClassificacaoVenda) {
        this.idClassificacaoVenda = idClassificacaoVenda;
    }

/*
    public FaturaDetalheVO(){
        System.out.println("novo detalhe de fatura");
    }
*/

    public boolean isAnalitico() {
        return analitico;
    }

    public void setAnalitico(boolean analitico) {
        this.analitico = analitico;
    }

    public String getMaximoRubricasFaturaTxt() {
        return maximoRubricasFaturaTxt;
    }

    public void setMaximoRubricasFaturaTxt(String maximoRubricasFaturaTxt) {
        this.maximoRubricasFaturaTxt = maximoRubricasFaturaTxt;
    }

    public boolean isAplicaTaxaAgenersa() {
        return aplicaTaxaAgenersa;
    }

    public void setAplicaTaxaAgenersa(boolean aplicaTaxaAgenersa) {
        this.aplicaTaxaAgenersa = aplicaTaxaAgenersa;
    }

    public int getIdVendaDetalheParcela() {
        return idVendaDetalheParcela;
    }


    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FaturaDetalheVO other = (FaturaDetalheVO) obj;
        if (this.getIdRubrica() != other.getIdRubrica()) {
            return false;
        }
        if (this.getIdProduto() != other.getIdProduto()) {
            return false;
        }
        if (this.getIdPeriodoRef() != other.getIdPeriodoRef()) {
            return false;
        }
        if (this.getIdGrupoRubrica() != other.getIdGrupoRubrica()) {
            return false;
        }
        return this.getIdGrupoReceita() == other.getIdGrupoReceita();
    }

    public FaturaDetalheVO(){}


    public FaturaDetalheVO(FaturaDetalheVO that) { // utilizado para agrupar detalhes em faturas com um unico id
        this.setIdRubrica(that.getIdRubrica());
        this.setValor(0);
        this.setValorImposto(0);
        this.getColFaturaDetalheImpostoVO().addAll(that.getColFaturaDetalheImpostoVO());
    }

    public void aggregate(FaturaDetalheVO that) {
        this.setValor(this.getValor() + that.getValor());
        this.setValorImposto(this.getValorImposto() + that.getValorImposto());
    }

    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.getIdRubrica();
        hash = 89 * hash + this.getIdProduto();
        hash = 89 * hash + this.getIdPeriodoRef();
        hash = 89 * hash + this.getIdGrupoRubrica();
        hash = 89 * hash + this.getIdGrupoReceita();
        return hash;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParcela() {
        return parcela;
    }

    public void setParcela(int parcela) {
        this.parcela = parcela;
    }

    public int getNrParcelas() {
        return nrParcelas;
    }

    public void setNrParcelas(int nrParcelas) {
        this.nrParcelas = nrParcelas;
    }

    public int getIdRubrica() {
        return idRubrica;
    }

    public void setIdRubrica(int idRubrica) {
        this.idRubrica = idRubrica;
    }

    public int getIdTipoExcecao() {
        return idTipoExcecao;
    }

    public void setIdTipoExcecao(int idTipoExcecao) {
        this.idTipoExcecao = idTipoExcecao;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdClassificacaoFiscalRubrica() {
        return idClassificacaoFiscalRubrica;
    }

    public void setIdClassificacaoFiscalRubrica(int idClassificacaoFiscalRubrica) {
        this.idClassificacaoFiscalRubrica = idClassificacaoFiscalRubrica;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getVolFatIndividual() {
        return volFatIndividual;
    }

    public void setVolFatIndividual(double volFatIndividual) {
        this.volFatIndividual = volFatIndividual;
    }

    public List<FaturaDetalheImpostoVO> getColFaturaDetalheImpostoVO() {
        return colFaturaDetalheImpostoVO;
    }

    public void setColFaturaDetalheImpostoVO(List<FaturaDetalheImpostoVO> colFaturaDetalheImpostoVO) {
        this.colFaturaDetalheImpostoVO = colFaturaDetalheImpostoVO;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public void setIdVendaDetalheParcela(int idVendaDetalheParcela) {
        this.idVendaDetalheParcela = idVendaDetalheParcela;
    }

    public double getValorImposto() {
        return valorImposto;
    }

    public void setValorImposto(double valorImposto) {
        this.valorImposto = valorImposto;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorTotalConsiderarFatura() {
        return valorTotalConsiderarFatura;
    }

    public void setValorTotalConsiderarFatura(double valorTotalConsiderarFatura) {
        this.valorTotalConsiderarFatura = valorTotalConsiderarFatura;
    }

    public int getIdExcecao() {
        return idExcecao;
    }

    public void setIdExcecao(int idExcecao) {
        this.idExcecao = idExcecao;
    }

    public int getIdExcecaoAplicacao() {
        return idExcecaoAplicacao;
    }

    public void setIdExcecaoAplicacao(int idExcecaoAplicacao) {
        this.idExcecaoAplicacao = idExcecaoAplicacao;
    }

    public int getIdLigacaoExcecao() {
        return idLigacaoExcecao;
    }

    public void setIdLigacaoExcecao(int idLigacaoExcecao) {
        this.idLigacaoExcecao = idLigacaoExcecao;
    }

    public boolean isParcelamento() {
        return parcelamento;
    }

    public void setParcelamento(boolean parcelamento) {
        this.parcelamento = parcelamento;
    }

    public int getIdPeriodoRef() {
        return idPeriodoRef;
    }

    public void setIdPeriodoRef(int idPeriodoRef) {
        this.idPeriodoRef = idPeriodoRef;
    }

    public String getPeriodoRef() {
        return periodoRef;
    }

    public void setPeriodoRef(String periodoRef) {
        this.periodoRef = periodoRef;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isExibirFatura() {
        return exibirFatura;
    }

    public void setExibirFatura(boolean exibirFatura) {
        this.exibirFatura = exibirFatura;
    }

    public boolean isConsiderarTotalFatura() {
        return considerarTotalFatura;
    }

    public void setConsiderarTotalFatura(boolean considerarTotalFatura) {
        this.considerarTotalFatura = considerarTotalFatura;
    }

    public int getIdGrupoExibe() {
        return idGrupoExibe;
    }

    public void setIdGrupoExibe(int idGrupoExibe) {
        this.idGrupoExibe = idGrupoExibe;
    }
    public String getDebitoCredito() {
        return debitoCredito;
    }

    public void setDebitoCredito(String debitoCredito) {
        this.debitoCredito = debitoCredito;
    }

    public String getRubrica() {
        return rubrica;
    }

    public void setRubrica(String rubrica) {
        this.rubrica = rubrica;
    }

    public String getRubricaResumida() {
        return rubricaResumida;
    }

    public void setRubricaResumida(String rubricaResumida) {
        this.rubricaResumida = rubricaResumida;
    }

    public int getIdGrupoRubrica() {
        return idGrupoRubrica;
    }

    public void setIdGrupoRubrica(int idGrupoRubrica) {
        this.idGrupoRubrica = idGrupoRubrica;
    }

    public int getIdGrupoReceita() {
        return idGrupoReceita;
    }

    public void setIdGrupoReceita(int idGrupoReceita) {
        this.idGrupoReceita = idGrupoReceita;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getPoderConcedente() {
        return poderConcedente;
    }

    public void setPoderConcedente(String poderConcedente) {
        this.poderConcedente = poderConcedente;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }



    public int getIdLigacaoSeguro() {
        return idLigacaoSeguro;
    }

    public void setIdLigacaoSeguro(int idLigacaoSeguro) {
        this.idLigacaoSeguro = idLigacaoSeguro;
    }

    public String getCodRubrica() {
        return codRubrica;
    }

    public void setCodRubrica(String codRubrica) {
        this.codRubrica = codRubrica;
    }

    public double getAliquotaISS() {
        return aliquotaISS;
    }

    public void setAliquotaISS(double aliquotaISS) {
        this.aliquotaISS = aliquotaISS;
    }

    public double getAliquotaICMS() {
        return aliquotaICMS;
    }

    public void setAliquotaICMS(double aliquotaICMS) {
        this.aliquotaICMS = aliquotaICMS;
    }

    public double getAliquotaPis() {
        return aliquotaPis;
    }

    public void setAliquotaPis(double aliquotaPis) {
        this.aliquotaPis = aliquotaPis;
    }

    public double getAliquotaCofins() {
        return aliquotaCofins;
    }

    public void setAliquotaCofins(double aliquotaCofins) {
        this.aliquotaCofins = aliquotaCofins;
    }

    public double getAliquotaINSS() {
        return aliquotaINSS;
    }

    public void setAliquotaINSS(double aliquotaINSS) {
        this.aliquotaINSS = aliquotaINSS;
    }

    public double getBaseCalculoISS() {
        return baseCalculoISS;
    }

    public void setBaseCalculoISS(double baseCalculoISS) {
        this.baseCalculoISS = baseCalculoISS;
    }

    public double getBaseCalculoICMS() {
        return baseCalculoICMS;
    }

    public void setBaseCalculoICMS(double baseCalculoICMS) {
        this.baseCalculoICMS = baseCalculoICMS;
    }

    public double getBaseCalculoPis() {
        return baseCalculoPis;
    }

    public void setBaseCalculoPis(double baseCalculoPis) {
        this.baseCalculoPis = baseCalculoPis;
    }

    public double getBaseCalculoCofins() {
        return baseCalculoCofins;
    }

    public void setBaseCalculoCofins(double baseCalculoCofins) {
        this.baseCalculoCofins = baseCalculoCofins;
    }

    public double getBaseCalculoINSS() {
        return baseCalculoINSS;
    }

    public void setBaseCalculoINSS(double baseCalculoINSS) {
        this.baseCalculoINSS = baseCalculoINSS;
    }

    public double getBaseCalculoGeral() {
        return baseCalculoGeral;
    }

    public void setBaseCalculoGeral(double baseCalculoGeral) {
        this.baseCalculoGeral = baseCalculoGeral;
    }

    public double getValorISS() {
        return valorISS;
    }

    public void setValorISS(double valorISS) {
        this.valorISS = valorISS;
    }

    public double getValorICMS() {
        return valorICMS;
    }

    public void setValorICMS(double valorICMS) {
        this.valorICMS = valorICMS;
    }

    public double getValorPis() {
        return valorPis;
    }

    public void setValorPis(double valorPis) {
        this.valorPis = valorPis;
    }

    public double getValorCofins() {
        return valorCofins;
    }

    public void setValorCofins(double valorCofins) {
        this.valorCofins = valorCofins;
    }

    public double getValorINSS() {
        return valorINSS;
    }

    public void setValorINSS(double valorINSS) {
        this.valorINSS = valorINSS;
    }

    public double getValorGeral() {
        return valorGeral;
    }

    public void setValorGeral(double valorGeral) {
        this.valorGeral = valorGeral;
    }

    public FaturaDetalheVO clone() throws CloneNotSupportedException {
        return (FaturaDetalheVO) super.clone();
    }

    public double getValorUfir() {
        return valorUfir;
    }

    public int getIdTipoParcelamentoAcordo() {
        return idTipoParcelamentoAcordo;
    }

    public void setIdTipoParcelamentoAcordo(int idTipoParcelamentoAcordo) {
        this.idTipoParcelamentoAcordo = idTipoParcelamentoAcordo;
    }

    public void setValorUfir(double valorUfir) {
        this.valorUfir = valorUfir;
    }

    public int getIdPeriodoFat() {
        return idPeriodoFat;
    }

    public void setIdPeriodoFat(int idPeriodoFat) {
        this.idPeriodoFat = idPeriodoFat;
    }
}
