package com.inimasmart.app.model.vo;

import java.util.ArrayList;
import java.util.List;

public class ColetorDetalheAlteracaoVO {

    public int id = 0;
    public int idLigacao = 0;
    public String endNovo = "";
    public String nrMedidorNovo = "";
    public String categoriaNova = "";
    public int nrPonteirosNovo = 0;
    public String observacao = "";
    public String nomeCliente = "";
    public int idSituacaoCavaleteNovo = 0;
    public String msgLivre = "";
    public List<LigacaoCategoriaVO> ligacaoCategoria = new ArrayList<LigacaoCategoriaVO>();
    private String situacaoCavaleteNova = "";

    public ColetorDetalheAlteracaoVO() {
    }

    public List<LigacaoCategoriaVO> getLigacaoCategoria() {
        return ligacaoCategoria;
    }

    public void setLigacaoCategoria(List<LigacaoCategoriaVO> ligacaoCategoria) {
        this.ligacaoCategoria = ligacaoCategoria;
    }

    public String getCategoriaNova() {
        return categoriaNova;
    }

    public void setCategoriaNova(String categoriaNova) {
        this.categoriaNova = categoriaNova;
    }

    public String getEndNovo() {
        return endNovo;
    }

    public void setEndNovo(String endNovo) {
        this.endNovo = endNovo;
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

    public String getNrMedidorNovo() {
        return nrMedidorNovo;
    }

    public void setNrMedidorNovo(String nrMedidorNovo) {
        this.nrMedidorNovo = nrMedidorNovo;
    }

    public int getNrPonteirosNovo() {
        return nrPonteirosNovo;
    }

    public void setNrPonteirosNovo(int nrPonteirosNovo) {
        this.nrPonteirosNovo = nrPonteirosNovo;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getIdSituacaoCavaleteNovo() {
        return idSituacaoCavaleteNovo;
    }

    public void setIdSituacaoCavaleteNovo(int idSituacaoCavaleteNovo) {
        this.idSituacaoCavaleteNovo = idSituacaoCavaleteNovo;
    }

    public String getMsgLivre() {
        return msgLivre;
    }

    public void setMsgLivre(String msgLivre) {
        this.msgLivre = msgLivre;
    }

    public String getSituacaoCavaleteNova() {
        return situacaoCavaleteNova;
    }

    public void setSituacaoCavaleteNova(String situacaoCavaleteNova) {
        this.situacaoCavaleteNova = situacaoCavaleteNova;
    }
}
