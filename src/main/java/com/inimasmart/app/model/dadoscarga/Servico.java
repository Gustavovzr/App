package com.inimasmart.app.model.dadoscarga;

import com.inimasmart.app.model.vo.ClassificacaoFiscalImpostoVO;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Servico {

    private String descricao;
    private int plano;
    private int parcela;
    private BigDecimal valor;
    private boolean credito;
    private Boolean gerarCreditoRemanescente;
    private int codigoEmpresa;
    private Integer codigoInterno;
    private Boolean lancamentoExcecaoTaxaRegulacao;
    private Boolean aplicaTaxaRegulacaoAGENERSA;
    private BigDecimal aliqISS;
    private BigDecimal aliqICMS;
    private BigDecimal aliqPis;
    private BigDecimal aliqCofins;
    private BigDecimal aliqINSS;
    private List<Excecao> excecao=new ArrayList<>();
    private Integer idClassificacaoVenda;
    private Integer codigoRubrica;
    private int idVendaDetalheParcela = 0;
    private ClassificacaoFiscalImpostoVO classificacaoFiscalImposto;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPlano() {
        return plano;
    }

    public void setPlano(int plano) {
        this.plano = plano;
    }

    public int getParcela() {
        return parcela;
    }

    public void setParcela(int parcela) {
        this.parcela = parcela;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public boolean isCredito() {
        return credito;
    }

    public void setCredito(boolean credito) {
        this.credito = credito;
    }

    public Boolean getGerarCreditoRemanescente() {
        return gerarCreditoRemanescente;
    }

    public void setGerarCreditoRemanescente(Boolean gerarCreditoRemanescente) {
        this.gerarCreditoRemanescente = gerarCreditoRemanescente;
    }

    public int getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(int codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public Integer getCodigoInterno() {
        return codigoInterno;
    }

    public void setCodigoInterno(Integer codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public Integer getCodigoRubrica() {
        return codigoRubrica;
    }

    public void setCodigoRubrica(Integer codigoRubrica) {
        this.codigoRubrica = codigoRubrica;
    }

    public Boolean getLancamentoExcecaoTaxaRegulacao() {
        return lancamentoExcecaoTaxaRegulacao;
    }

    public void setLancamentoExcecaoTaxaRegulacao(Boolean lancamentoExcecaoTaxaRegulacao) {
        this.lancamentoExcecaoTaxaRegulacao = lancamentoExcecaoTaxaRegulacao;
    }

    public Boolean getAplicaTaxaRegulacaoAGENERSA() {
        return aplicaTaxaRegulacaoAGENERSA;
    }

    public void setAplicaTaxaRegulacaoAGENERSA(Boolean aplicaTaxaRegulacaoAGENERSA) {
        this.aplicaTaxaRegulacaoAGENERSA = aplicaTaxaRegulacaoAGENERSA;
    }

    public BigDecimal getAliqISS() {
        return aliqISS;
    }

    public void setAliqISS(BigDecimal aliqISS) {
        this.aliqISS = aliqISS;
    }

    public BigDecimal getAliqICMS() {
        return aliqICMS;
    }

    public void setAliqICMS(BigDecimal aliqICMS) {
        this.aliqICMS = aliqICMS;
    }

    public BigDecimal getAliqPis() {
        return aliqPis;
    }

    public void setAliqPis(BigDecimal aliqPis) {
        this.aliqPis = aliqPis;
    }

    public BigDecimal getAliqCofins() {
        return aliqCofins;
    }

    public void setAliqCofins(BigDecimal aliqCofins) {
        this.aliqCofins = aliqCofins;
    }

    public BigDecimal getAliqINSS() {
        return aliqINSS;
    }

    public void setAliqINSS(BigDecimal aliqINSS) {
        this.aliqINSS = aliqINSS;
    }

    public List<Excecao> getExcecao() {
        return excecao;
    }

    public void setExcecao(List<Excecao> excecao) {
        this.excecao = excecao;
    }

    public ClassificacaoFiscalImpostoVO getClassificacaoFiscalImposto() {
        return classificacaoFiscalImposto;
    }

    public void setClassificacaoFiscalImposto(ClassificacaoFiscalImpostoVO classificacaoFiscalImposto) {
        this.classificacaoFiscalImposto = classificacaoFiscalImposto;
    }

    public Integer getIdClassificacaoVenda() {
        return idClassificacaoVenda;
    }

    public void setIdClassificacaoVenda(Integer idClassificacaoVenda) {
        this.idClassificacaoVenda = idClassificacaoVenda;
    }

    public int getIdVendaDetalheParcela() {
        return idVendaDetalheParcela;
    }

    public void setIdVendaDetalheParcela(int idVendaDetalheParcela) {
        this.idVendaDetalheParcela = idVendaDetalheParcela;
    }
}
