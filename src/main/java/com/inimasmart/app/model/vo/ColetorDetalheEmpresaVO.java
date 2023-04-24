package com.inimasmart.app.model.vo;


import java.util.ArrayList;
import java.util.List;

public class ColetorDetalheEmpresaVO {

    public int id = 0;
    public int codigoEmpresa = 0;
    public double valorCalculadoTodosProdutos = 0.0;
    public double valorServicoEmpresa = 0.0;
    public double valorCreditoEmpresa = 0.0;
    public double valorCreditoRemanescenteEmpresa = 0.0;
    public double valorTotalEmpresa = 0.0;
    public double valorArsaeEmpresa = 0.0;
    public List<ColetorDetalheProdutoVO> coletorDetalheProdutoVOs = new ArrayList<ColetorDetalheProdutoVO>();
    public List<ColetorDetalheServicoVO> coletorDetalheServicoVOs = new ArrayList<ColetorDetalheServicoVO>();

}
