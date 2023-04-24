package com.inimasmart.app.model.dadoscarga;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private int codigoEmpresa;
    private String descricaoEmpresa;
    private int codigoColunaImpressao;
    private List<Produto> produto=new ArrayList<>();
    private CalculoRecursosHidricos calculoRecursosHidricos;
    private TaxaRegulacao taxaRegulacao;
    private String nome;
    private String cnpj;
    private String endereco;
    private String telefone;
    private String plantao;



    public int getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(int codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public String getDescricaoEmpresa() {
        return descricaoEmpresa;
    }

    public void setDescricaoEmpresa(String descricaoEmpresa) {
        this.descricaoEmpresa = descricaoEmpresa;
    }

    public int getCodigoColunaImpressao() {
        return codigoColunaImpressao;
    }

    public void setCodigoColunaImpressao(int codigoColunaImpressao) {
        this.codigoColunaImpressao = codigoColunaImpressao;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }

    public CalculoRecursosHidricos getCalculoRecursosHidricos() {
        return calculoRecursosHidricos;
    }

    public void setCalculoRecursosHidricos(CalculoRecursosHidricos calculoRecursosHidricos) {
        this.calculoRecursosHidricos = calculoRecursosHidricos;
    }

    public TaxaRegulacao getTaxaRegulacao() {
        return taxaRegulacao;
    }

    public void setTaxaRegulacao(TaxaRegulacao taxaRegulacao) {
        this.taxaRegulacao = taxaRegulacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getPlantao() {
        return plantao;
    }

    public void setPlantao(String plantao) {
        this.plantao = plantao;
    }
}
