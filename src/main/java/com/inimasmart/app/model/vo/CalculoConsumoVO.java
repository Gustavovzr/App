package com.inimasmart.app.model.vo;

import java.util.ArrayList;
import java.util.List;

public class CalculoConsumoVO {

    private int idLigacao = 0;
    private Double consMedido = 0d;
    private Double consMedidoPreRepasse = 0d;
    private Double consMedidoIndividualOri = 0d;
    private Double consMedidoIndividual = 0d;
    private Double consMedidoIndividualPreRepasse = 0d;

    private int consMedidoIndividualOriPreRepasse = 0;
    private int idExcecaoMedido = 0;


    private int nrPonteiros = 0;
    private int leitMedidorRet = 0;
    private int leitMedidorNovo = 0;
    private int idPeriodoTrocaMedidor = 0;
    private int nrEconomias = 0;
    private int idCritFat = 0;
    private int volResidual = 0;
    private int volResidualPreRepasse = 0;
    private int volResidualUtilizado = 0;
    private int volResidualUtilizadoPreRepasse = 0;
    private boolean medidorTrocado = false;
    private boolean confirmarLeitura = false;
    private int idCriticaMedicao = 0;
    private int idCriticaMedicaoPreRepasse = 0;
    private double creditoAteVolMin = 0;
    private double creditoAteVolMinPreRepasse = 0;
    private double creditoAcimaVolMin = 0;
    private double creditoAcimaVolMinPreRepasse = 0;
    private double creditoAteVolMinCicloAnt = 0;
    private double creditoAcimaVolMinCicloAnt = 0;
    private int volResidualCicloAnt = 0;
    private int volResidualUtilizadoCicloAnt = 0;
    private int volResidualUtilizadoCicloAntPreRepasse = 0;
    private double mediaConsMedido = 0d;
    private double mediaConsMedidoPreRepasse = 0d;
    private boolean critFatFixo = false;
    private int nrDiasConsLigNova = 0;
    private int idProdutoMediaFat = 0;
    private int idLigacaoConsolidadora = 0;
    private boolean consolidadora = false;
    private boolean ligacaoNovaNaoCobrada = false;
    private String siglaCriticaMedicao = "";
    private List<FaturaExcecaoVO> calculoConsumoExcecao = new ArrayList<FaturaExcecaoVO>();
    private List<CalculoConsumoProdutoVO> calculoConsumoProduto = new ArrayList<CalculoConsumoProdutoVO>();
    private int idTipoFaturamento = 0;
    private int idTipoFaturamentoCons = 0;
    private int binTipoFaturamento = 0;
    private int binTipoFaturamentoCons = 0;
    private int binTipoFaturamentoConsLigacao = 0;
    private int idCidade = 0;
    private String dataInstalacaoAgua = "";
    private String dataInstalacaoEsgoto = "";
    private int nrDiasConsLigacaoAgua;
    private int nrDiasConsLigacaoEsgoto;
    private int idTipoCalculoProdMediaFat = 0;
    private String criticaRepasseSimultanea = "";
    private boolean limiteInferior = false;

    public int getIdLigacao() {
        return idLigacao;
    }

    public void setIdLigacao(int idLigacao) {
        this.idLigacao = idLigacao;
    }

    public Double getConsMedido() {
        return consMedido;
    }

    public void setConsMedido(Double consMedido) {
        this.consMedido = consMedido;
    }

    public Double getConsMedidoPreRepasse() {
        return consMedidoPreRepasse;
    }

    public void setConsMedidoPreRepasse(Double consMedidoPreRepasse) {
        this.consMedidoPreRepasse = consMedidoPreRepasse;
    }

    public Double getConsMedidoIndividualOri() {
        return consMedidoIndividualOri;
    }

    public void setConsMedidoIndividualOri(Double consMedidoIndividualOri) {
        this.consMedidoIndividualOri = consMedidoIndividualOri;
    }

    public Double getConsMedidoIndividual() {
        return consMedidoIndividual;
    }

    public void setConsMedidoIndividual(Double consMedidoIndividual) {
        this.consMedidoIndividual = consMedidoIndividual;
    }

    public Double getConsMedidoIndividualPreRepasse() {
        return consMedidoIndividualPreRepasse;
    }

    public void setConsMedidoIndividualPreRepasse(Double consMedidoIndividualPreRepasse) {
        this.consMedidoIndividualPreRepasse = consMedidoIndividualPreRepasse;
    }

    public int getConsMedidoIndividualOriPreRepasse() {
        return consMedidoIndividualOriPreRepasse;
    }

    public void setConsMedidoIndividualOriPreRepasse(int consMedidoIndividualOriPreRepasse) {
        this.consMedidoIndividualOriPreRepasse = consMedidoIndividualOriPreRepasse;
    }

    public int getIdExcecaoMedido() {
        return idExcecaoMedido;
    }

    public void setIdExcecaoMedido(int idExcecaoMedido) {
        this.idExcecaoMedido = idExcecaoMedido;
    }

    public int getNrPonteiros() {
        return nrPonteiros;
    }

    public void setNrPonteiros(int nrPonteiros) {
        this.nrPonteiros = nrPonteiros;
    }

    public int getLeitMedidorRet() {
        return leitMedidorRet;
    }

    public void setLeitMedidorRet(int leitMedidorRet) {
        this.leitMedidorRet = leitMedidorRet;
    }

    public int getLeitMedidorNovo() {
        return leitMedidorNovo;
    }

    public void setLeitMedidorNovo(int leitMedidorNovo) {
        this.leitMedidorNovo = leitMedidorNovo;
    }

    public int getIdPeriodoTrocaMedidor() {
        return idPeriodoTrocaMedidor;
    }

    public void setIdPeriodoTrocaMedidor(int idPeriodoTrocaMedidor) {
        this.idPeriodoTrocaMedidor = idPeriodoTrocaMedidor;
    }

    public int getNrEconomias() {
        return nrEconomias;
    }

    public void setNrEconomias(int nrEconomias) {
        this.nrEconomias = nrEconomias;
    }

    public int getIdCritFat() {
        return idCritFat;
    }

    public void setIdCritFat(int idCritFat) {
        this.idCritFat = idCritFat;
    }

    public int getVolResidual() {
        return volResidual;
    }

    public void setVolResidual(int volResidual) {
        this.volResidual = volResidual;
    }

    public int getVolResidualPreRepasse() {
        return volResidualPreRepasse;
    }

    public void setVolResidualPreRepasse(int volResidualPreRepasse) {
        this.volResidualPreRepasse = volResidualPreRepasse;
    }

    public int getVolResidualUtilizado() {
        return volResidualUtilizado;
    }

    public void setVolResidualUtilizado(int volResidualUtilizado) {
        this.volResidualUtilizado = volResidualUtilizado;
    }

    public int getVolResidualUtilizadoPreRepasse() {
        return volResidualUtilizadoPreRepasse;
    }

    public void setVolResidualUtilizadoPreRepasse(int volResidualUtilizadoPreRepasse) {
        this.volResidualUtilizadoPreRepasse = volResidualUtilizadoPreRepasse;
    }

    public boolean isMedidorTrocado() {
        return medidorTrocado;
    }

    public void setMedidorTrocado(boolean medidorTrocado) {
        this.medidorTrocado = medidorTrocado;
    }

    public boolean isConfirmarLeitura() {
        return confirmarLeitura;
    }

    public void setConfirmarLeitura(boolean confirmarLeitura) {
        this.confirmarLeitura = confirmarLeitura;
    }

    public int getIdCriticaMedicao() {
        return idCriticaMedicao;
    }

    public void setIdCriticaMedicao(int idCriticaMedicao) {
        this.idCriticaMedicao = idCriticaMedicao;
    }

    public int getIdCriticaMedicaoPreRepasse() {
        return idCriticaMedicaoPreRepasse;
    }

    public void setIdCriticaMedicaoPreRepasse(int idCriticaMedicaoPreRepasse) {
        this.idCriticaMedicaoPreRepasse = idCriticaMedicaoPreRepasse;
    }

    public double getCreditoAteVolMin() {
        return creditoAteVolMin;
    }

    public void setCreditoAteVolMin(double creditoAteVolMin) {
        this.creditoAteVolMin = creditoAteVolMin;
    }

    public double getCreditoAteVolMinPreRepasse() {
        return creditoAteVolMinPreRepasse;
    }

    public void setCreditoAteVolMinPreRepasse(double creditoAteVolMinPreRepasse) {
        this.creditoAteVolMinPreRepasse = creditoAteVolMinPreRepasse;
    }

    public double getCreditoAcimaVolMin() {
        return creditoAcimaVolMin;
    }

    public void setCreditoAcimaVolMin(double creditoAcimaVolMin) {
        this.creditoAcimaVolMin = creditoAcimaVolMin;
    }

    public double getCreditoAcimaVolMinPreRepasse() {
        return creditoAcimaVolMinPreRepasse;
    }

    public void setCreditoAcimaVolMinPreRepasse(double creditoAcimaVolMinPreRepasse) {
        this.creditoAcimaVolMinPreRepasse = creditoAcimaVolMinPreRepasse;
    }

    public double getCreditoAteVolMinCicloAnt() {
        return creditoAteVolMinCicloAnt;
    }

    public void setCreditoAteVolMinCicloAnt(double creditoAteVolMinCicloAnt) {
        this.creditoAteVolMinCicloAnt = creditoAteVolMinCicloAnt;
    }

    public double getCreditoAcimaVolMinCicloAnt() {
        return creditoAcimaVolMinCicloAnt;
    }

    public void setCreditoAcimaVolMinCicloAnt(double creditoAcimaVolMinCicloAnt) {
        this.creditoAcimaVolMinCicloAnt = creditoAcimaVolMinCicloAnt;
    }

    public int getVolResidualCicloAnt() {
        return volResidualCicloAnt;
    }

    public void setVolResidualCicloAnt(int volResidualCicloAnt) {
        this.volResidualCicloAnt = volResidualCicloAnt;
    }

    public int getVolResidualUtilizadoCicloAnt() {
        return volResidualUtilizadoCicloAnt;
    }

    public void setVolResidualUtilizadoCicloAnt(int volResidualUtilizadoCicloAnt) {
        this.volResidualUtilizadoCicloAnt = volResidualUtilizadoCicloAnt;
    }

    public int getVolResidualUtilizadoCicloAntPreRepasse() {
        return volResidualUtilizadoCicloAntPreRepasse;
    }

    public void setVolResidualUtilizadoCicloAntPreRepasse(int volResidualUtilizadoCicloAntPreRepasse) {
        this.volResidualUtilizadoCicloAntPreRepasse = volResidualUtilizadoCicloAntPreRepasse;
    }

    public double getMediaConsMedido() {
        return mediaConsMedido;
    }

    public void setMediaConsMedido(double mediaConsMedido) {
        this.mediaConsMedido = mediaConsMedido;
    }

    public double getMediaConsMedidoPreRepasse() {
        return mediaConsMedidoPreRepasse;
    }

    public void setMediaConsMedidoPreRepasse(double mediaConsMedidoPreRepasse) {
        this.mediaConsMedidoPreRepasse = mediaConsMedidoPreRepasse;
    }

    public boolean isCritFatFixo() {
        return critFatFixo;
    }

    public void setCritFatFixo(boolean critFatFixo) {
        this.critFatFixo = critFatFixo;
    }

    public int getNrDiasConsLigNova() {
        return nrDiasConsLigNova;
    }

    public void setNrDiasConsLigNova(int nrDiasConsLigNova) {
        this.nrDiasConsLigNova = nrDiasConsLigNova;
    }

    public int getIdProdutoMediaFat() {
        return idProdutoMediaFat;
    }

    public void setIdProdutoMediaFat(int idProdutoMediaFat) {
        this.idProdutoMediaFat = idProdutoMediaFat;
    }

    public int getIdLigacaoConsolidadora() {
        return idLigacaoConsolidadora;
    }

    public void setIdLigacaoConsolidadora(int idLigacaoConsolidadora) {
        this.idLigacaoConsolidadora = idLigacaoConsolidadora;
    }

    public boolean isConsolidadora() {
        return consolidadora;
    }

    public void setConsolidadora(boolean consolidadora) {
        this.consolidadora = consolidadora;
    }

    public boolean isLigacaoNovaNaoCobrada() {
        return ligacaoNovaNaoCobrada;
    }

    public void setLigacaoNovaNaoCobrada(boolean ligacaoNovaNaoCobrada) {
        this.ligacaoNovaNaoCobrada = ligacaoNovaNaoCobrada;
    }

    public String getSiglaCriticaMedicao() {
        return siglaCriticaMedicao;
    }

    public void setSiglaCriticaMedicao(String siglaCriticaMedicao) {
        this.siglaCriticaMedicao = siglaCriticaMedicao;
    }

    public List<FaturaExcecaoVO> getCalculoConsumoExcecao() {
        return calculoConsumoExcecao;
    }

    public void setFaturaExcecaoVO(List<FaturaExcecaoVO> FaturaExcecaoVO) {
        this.calculoConsumoExcecao = FaturaExcecaoVO;
    }

    public List<CalculoConsumoProdutoVO> getCalculoConsumoProdutoVO() {
        return calculoConsumoProduto;
    }

    public void setCalculoConsumoProdutoVO(List<CalculoConsumoProdutoVO> calculoConsumoProdutoVO) {
        this.calculoConsumoProduto = calculoConsumoProduto;
    }

    public int getIdTipoFaturamento() {
        return idTipoFaturamento;
    }

    public void setIdTipoFaturamento(int idTipoFaturamento) {
        this.idTipoFaturamento = idTipoFaturamento;
    }

    public int getIdTipoFaturamentoCons() {
        return idTipoFaturamentoCons;
    }

    public void setIdTipoFaturamentoCons(int idTipoFaturamentoCons) {
        this.idTipoFaturamentoCons = idTipoFaturamentoCons;
    }

    public int getBinTipoFaturamento() {
        return binTipoFaturamento;
    }

    public void setBinTipoFaturamento(int binTipoFaturamento) {
        this.binTipoFaturamento = binTipoFaturamento;
    }

    public int getBinTipoFaturamentoCons() {
        return binTipoFaturamentoCons;
    }

    public void setBinTipoFaturamentoCons(int binTipoFaturamentoCons) {
        this.binTipoFaturamentoCons = binTipoFaturamentoCons;
    }

    public int getBinTipoFaturamentoConsLigacao() {
        return binTipoFaturamentoConsLigacao;
    }

    public void setBinTipoFaturamentoConsLigacao(int binTipoFaturamentoConsLigacao) {
        this.binTipoFaturamentoConsLigacao = binTipoFaturamentoConsLigacao;
    }

    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }

    public String getDataInstalacaoAgua() {
        return dataInstalacaoAgua;
    }

    public void setDataInstalacaoAgua(String dataInstalacaoAgua) {
        this.dataInstalacaoAgua = dataInstalacaoAgua;
    }

    public String getDataInstalacaoEsgoto() {
        return dataInstalacaoEsgoto;
    }

    public void setDataInstalacaoEsgoto(String dataInstalacaoEsgoto) {
        this.dataInstalacaoEsgoto = dataInstalacaoEsgoto;
    }

    public int getNrDiasConsLigacaoAgua() {
        return nrDiasConsLigacaoAgua;
    }

    public void setNrDiasConsLigacaoAgua(int nrDiasConsLigacaoAgua) {
        this.nrDiasConsLigacaoAgua = nrDiasConsLigacaoAgua;
    }

    public int getNrDiasConsLigacaoEsgoto() {
        return nrDiasConsLigacaoEsgoto;
    }

    public void setNrDiasConsLigacaoEsgoto(int nrDiasConsLigacaoEsgoto) {
        this.nrDiasConsLigacaoEsgoto = nrDiasConsLigacaoEsgoto;
    }

    public int getIdTipoCalculoProdMediaFat() {
        return idTipoCalculoProdMediaFat;
    }

    public void setIdTipoCalculoProdMediaFat(int idTipoCalculoProdMediaFat) {
        this.idTipoCalculoProdMediaFat = idTipoCalculoProdMediaFat;
    }

    public String getCriticaRepasseSimultanea() {
        return criticaRepasseSimultanea;
    }

    public void setCriticaRepasseSimultanea(String criticaRepasseSimultanea) {
        this.criticaRepasseSimultanea = criticaRepasseSimultanea;
    }

    public boolean isLimiteInferior() {
        return limiteInferior;
    }

    public void setLimiteInferior(boolean limiteInferior) {
        this.limiteInferior = limiteInferior;
    }
}
