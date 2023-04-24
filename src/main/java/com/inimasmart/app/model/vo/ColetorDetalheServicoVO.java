package com.inimasmart.app.model.vo;

import java.util.ArrayList;
import java.util.List;

public class ColetorDetalheServicoVO {

    public int id = 0;
    public int idLeituraDetalheEmpresa = 0;
    public String descricao = "";
    public int nrParcelas = 0;
    public int parcela = 0;
    public double valor = 0d;
    public double valorImpresso = 0d;
    public String credito = "";
    public String gerarCreditoRemanescente = "";
    public List<ColetorDetalheExcecaoServicoVO> coletorDetalheExcecaoServicoVOs = new ArrayList<ColetorDetalheExcecaoServicoVO>();
    public int codigoInterno = 0;
    public double aliquotaISS = 0.00d;
    public double aliquotaICMS = 0.00d;
    public double aliquotaPis = 0.00d;
    public double aliquotaCofins = 0.00d;
    public double aliquotaINSS = 0.00d;
    public double baseCalculoISS = 0.00d;
    public double baseCalculoICMS = 0.00d;
    public double baseCalculoPis = 0.00d;
    public double baseCalculoCofins = 0.00d;
    public double baseCalculoINSS = 0.00d;
    public double baseCalculoGeral = 0.00d;
    public double valorISS = 0.0000d;
    public double valorICMS = 0.0000d;
    public double valorPis = 0.0000d;
    public double valorCofins = 0.0000d;
    public double valorINSS = 0.0000d;
}
