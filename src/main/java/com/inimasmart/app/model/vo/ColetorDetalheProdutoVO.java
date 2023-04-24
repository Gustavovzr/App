package com.inimasmart.app.model.vo;

import java.util.ArrayList;
import java.util.List;

public class ColetorDetalheProdutoVO {


    public int codigoProduto = 0;
    public int situacaoProduto = 0;
    public double valorCalculadoProduto = 0.0;
    public double valorServicoProduto = 0.0;
    public double valorCreditoProduto = 0.0;
    public double valorArsaeProduto = 0.0;
    public double valorCreditoRemanescenteProduto = 0.0;
    public double valorTotalProduto = 0.0;
    public double volFat = 0;
    public int idTipoCalculoFaturado = 0;
    public int volumeRemanescente = 0;
    public List<ColetorDetalheProdutoCategoriaVO> colCategoria = new ArrayList<ColetorDetalheProdutoCategoriaVO>();
    public List<ColetorDetalheProdutoExcecaoVO> colExcecao = new ArrayList<ColetorDetalheProdutoExcecaoVO>();
    public double valorImpostoProduto = 0.0;
}
