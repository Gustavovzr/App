package com.inimasmart.app.model.vo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FaturaVO implements Comparable<FaturaVO> {

    private int entregaCliente;
    private int  id = 0;
    private int  idFaturaOrigem;
    private int  idLigacao = 0;
    private int  idTipoLigacao = 0;
    private int  idLigacaoEntrega = 0;
    private int  idLigacaoConsolidadora = 0;
    private int  idPeriodo = 0;
    private int  idPeriodoImpressao = 0;
    private String dataVencimento = "";
    private String dataEntrega = "";
    private String dataPagto = "";
    private String codBar = "";
    private String codBar1  = "";
    private String codBar2  = "";
    private boolean recalculo = false;
    private boolean calculoPaa = false;

    private int idPeriodoPagamentoAntecipado = 0;
    //@XmlElement(name = "colFaturaDetalheVO")
    private List<FaturaDetalheVO> colFaturaDetalheVO = new ArrayList<FaturaDetalheVO>(){
        @Override
        public boolean add(FaturaDetalheVO faturaDetalheVO) {
            return super.add(faturaDetalheVO);
        }
    };
    // @XmlElement(name = "colFaturaExcecaoVO")
    private List<FaturaExcecaoVO> colFaturaExcecaoVO = new ArrayList<FaturaExcecaoVO>();
    private int  idCidade = 0;
    private double  valor = 0d;
    private double  valorImposto = 0d;
    private int  idFaturaSituacao = 0;
    private int  idTipoCobranca = 0;
    private int  idGrupo = 0;
    private int  idGrupoEntrega = 0;
    private int  idTipoTransacao = 0;
    private String tipoTransacao = "";
    private int  idUsuarioCancto = 0;
    private int  nrEconCons = 0;
    private boolean enviado = false;
    private boolean enviadoCancelamento = false;
    private int  idTaxaFinanciamento = 0;
    private boolean houvePagamento = false;
    private int  ordemGrupoEntrega = 0;
    private int  ordemGrupoLeitura = 0;
    private String mensagensPrevencao = "";
    private String periodo = "";
    private int  idConsolidacaoArrecadacao = 0;
    private String faturaEmitida = "N";
    //@XmlElement(name = "colCategorias")
    private List<FatDadosMedCategVO> colCategorias   = new ArrayList<FatDadosMedCategVO>();
    private int  idTipoParcelamentoAcordo = 0;
    private int  idFaturaBaixa = 0;
    // private VendaVO vendaCreditoVO = null;
    private String nome = "";
    private String cpf = "";
    private String cnpj = "";
    private String calculoConsumoSimultanea = "";
    private String tipoLeitura = "";
    private String anacritefetuada = "S";
    private String emissao = "";
    private String situacao = "";
    private String alteracao = "";
    //@XmlElement(name = "faturaDebitos")
    private List<FaturaDebitosVO> faturaDebitos = new ArrayList<FaturaDebitosVO>();
    private String faturaImportada = "N";
    private String enviaColetor = "N";
    private List<Integer> colCoeficienteReducao;
    private String dataPagamentoProvisorio = null;
    private int  idClassConsumo = 0;
    private int  idFaturaRecalculada = 0;
    private boolean utilizar = false;
    private boolean pertenceConsolidacaoArrecadacao = false;
    private double  valorTCL = 0d;
    private double  coeficientePAA = 0d;

    private int  nrDiasConsumo = 0;
    private int  idTipoFaturamento;
    private int  idProcessoCorte = 0;
    private String msg = "";
    private double  valorTotalImpostoAproximado =0d;
    private double  baseCalculoTotalImpostoAproximado=0d;
    private double  percentualTotalImpostoAproximado=0d;
    private boolean calculadoRecursosHidricos = false;
    private boolean impostoInformativoCalculado = false;
    private int  idCategoriaPrincipal = 0;
    private int  idSubCategoriaPrincipal = 0;
    private int  idClienteInquilino;
    private int  idContratoNegociacao;
    private int  seqPeriodoInicioContratoNegociacao;
    private String faturaSituacao;
    private boolean encargoAdiantado;
    private int  idOrgaoPublico;
    private double  valorDebitos;
    private int  leituraAtual;
    private int  volMedido;
    private String dataLeitura;
    private int  volFat;
    private int  idTipoEntrega;
    private String emailDestinatario = "";
    private String email = "";
    private String assuntoEmail = "";
    private String corpoEmail = "";
    private String cidade = "";
    private boolean calculadoTaxaRegulacao = false;
    private String periodoImportacaoOrigem;
    private String pagamentoParcialRajada;
    private String importadaSistemaTerceiros = "N";
    private String dataMovimento;
    private int  idCobrancaFase = 0;
    private boolean calculoConsolidacaoConsEfet = false;
    private String rcs;
    private int idRubrica;
    private String rubrica;
    private int diaInicioCobranca;
    private int diaFimCobranca;
    private int idTipoPeriodo;
    private double percentual;
    private String tipoTaxaAtraso;
    private int idTipoTaxaAtraso;
    private int idIndiceReajuste;
    private int idAtrasoEncargo;
    private int idRubricaOrigem;
    private String rubricaOrigem;
    private String dataPagamento;
    private String timbre;
    private Map<Integer, FaturaVO> faturaAtrasoPeriodoAnterior =new HashMap<>();
    private boolean faturaImpressa;
    private boolean enderecoAlternativo;
    private boolean separacao;

    private int idMedicaoDetalhe;



    private FatDadosMedicaoDetVO dadosMedicaoDet = new FatDadosMedicaoDetVO();
    private ColetorDetalheVO coletorDetalhe;

    private Integer idParctoOrigem;
    private String dataEmissaoOrigem;
    private boolean cadastroAtual;
    private String msgDeclaracaoQuitacaoAnual = "";
    private Integer idLigacaoProcessoCorte = 0;

    public boolean isSeparacao() {
        return separacao;
    }

    public void setSeparacao(boolean separacao) {
        this.separacao = separacao;
    }

    public int getIdRubrica() {
        return idRubrica;
    }

    public void setIdRubrica(int idRubrica) {
        this.idRubrica = idRubrica;
    }

    public String getRubrica() {
        return rubrica;
    }

    public void setRubrica(String rubrica) {
        this.rubrica = rubrica;
    }

    public int getDiaInicioCobranca() {
        return diaInicioCobranca;
    }

    public void setDiaInicioCobranca(int diaInicioCobranca) {
        this.diaInicioCobranca = diaInicioCobranca;
    }

    public int getDiaFimCobranca() {
        return diaFimCobranca;
    }

    public void setDiaFimCobranca(int diaFimCobranca) {
        this.diaFimCobranca = diaFimCobranca;
    }

    public int getIdTipoPeriodo() {
        return idTipoPeriodo;
    }

    public void setIdTipoPeriodo(int idTipoPeriodo) {
        this.idTipoPeriodo = idTipoPeriodo;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    public String getTipoTaxaAtraso() {
        return tipoTaxaAtraso;
    }

    public void setTipoTaxaAtraso(String tipoTaxaAtraso) {
        this.tipoTaxaAtraso = tipoTaxaAtraso;
    }

    public int getIdTipoTaxaAtraso() {
        return idTipoTaxaAtraso;
    }

    public void setIdTipoTaxaAtraso(int idTipoTaxaAtraso) {
        this.idTipoTaxaAtraso = idTipoTaxaAtraso;
    }

    public int getIdIndiceReajuste() {
        return idIndiceReajuste;
    }

    public void setIdIndiceReajuste(int idIndiceReajuste) {
        this.idIndiceReajuste = idIndiceReajuste;
    }

    public int getIdAtrasoEncargo() {
        return idAtrasoEncargo;
    }

    public void setIdAtrasoEncargo(int idAtrasoEncargo) {
        this.idAtrasoEncargo = idAtrasoEncargo;
    }

    public int getIdRubricaOrigem() {
        return idRubricaOrigem;
    }

    public void setIdRubricaOrigem(int idRubricaOrigem) {
        this.idRubricaOrigem = idRubricaOrigem;
    }

    public String getRubricaOrigem() {
        return rubricaOrigem;
    }

    public void setRubricaOrigem(String rubricaOrigem) {
        this.rubricaOrigem = rubricaOrigem;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public void setColFaturaDetalheVO(List<FaturaDetalheVO> colFaturaDetalheVO) {
        this.colFaturaDetalheVO = colFaturaDetalheVO;
    }

    public int  getIdTipoLigacao() {
        return idTipoLigacao;
    }

    public void setIdTipoLigacao(int  idTipoLigacao) {
        this.idTipoLigacao = idTipoLigacao;
    }

    public int  getIdCobrancaFase() {
        return idCobrancaFase;
    }

    public void setIdCobrancaFase(int  idCobrancaFase) {
        this.idCobrancaFase = idCobrancaFase;
    }

    public String getPagamentoParcialRajada() {
        return pagamentoParcialRajada;
    }

    public void setPagamentoParcialRajada(String pagamentoParcialRajada) {
        this.pagamentoParcialRajada = pagamentoParcialRajada;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getDataLeitura() {
        return dataLeitura;
    }

    public void setDataLeitura(String dataLeitura) {
        this.dataLeitura = dataLeitura;
    }

    public boolean isEncargoAdiantado() {
        return encargoAdiantado;
    }

    public void setEncargoAdiantado(boolean encargoAdiantado) {
        this.encargoAdiantado = encargoAdiantado;
    }

    public String getFaturaSituacao() {
        return faturaSituacao;
    }

    public void setFaturaSituacao(String faturaSituacao) {
        this.faturaSituacao = faturaSituacao;
    }

    public int  getIdCategoriaPrincipal() {
        return idCategoriaPrincipal;
    }

    public void setIdCategoriaPrincipal(int  idCategoriaPrincipal) {
        this.idCategoriaPrincipal = idCategoriaPrincipal;
    }

    public int  getIdClienteInquilino() {
        return idClienteInquilino;
    }

    public void setIdClienteInquilino(int  idClienteInquilino) {
        this.idClienteInquilino = idClienteInquilino;
    }

    public int  getIdContratoNegociacao() {
        return idContratoNegociacao;
    }

    public void setIdContratoNegociacao(int  idContratoNegociacao) {
        this.idContratoNegociacao = idContratoNegociacao;
    }

    public int  getIdFaturaOrigem() {
        return idFaturaOrigem;
    }

    public void setIdFaturaOrigem(int  idFaturaOrigem) {
        this.idFaturaOrigem = idFaturaOrigem;
    }

    public int  getIdOrgaoPublico() {
        return idOrgaoPublico;
    }

    public void setIdOrgaoPublico(int  idOrgaoPublico) {
        this.idOrgaoPublico = idOrgaoPublico;
    }

    public int  getIdSubCategoriaPrincipal() {
        return idSubCategoriaPrincipal;
    }

    public void setIdSubCategoriaPrincipal(int  idSubCategoriaPrincipal) {
        this.idSubCategoriaPrincipal = idSubCategoriaPrincipal;
    }

    public int  getLeituraAtual() {
        return leituraAtual;
    }

    public void setLeituraAtual(int  leituraAtual) {
        this.leituraAtual = leituraAtual;
    }

    public int  getSeqPeriodoInicioContratoNegociacao() {
        return seqPeriodoInicioContratoNegociacao;
    }

    public void setSeqPeriodoInicioContratoNegociacao(int  seqPeriodoInicioContratoNegociacao) {
        this.seqPeriodoInicioContratoNegociacao = seqPeriodoInicioContratoNegociacao;
    }

    public double  getValorDebitos() {
        return valorDebitos;
    }

    public void setValorDebitos(double  valorDebitos) {
        this.valorDebitos = valorDebitos;
    }

    public int  getVolFat() {
        return volFat;
    }

    public void setVolFat(int  volFat) {
        this.volFat = volFat;
    }

    public int  getVolMedido() {
        return volMedido;
    }

    public void setVolMedido(int  volMedido) {
        this.volMedido = volMedido;
    }

    public List<FaturaDetalheVO> getColFaturaDetalheVO() {
        return colFaturaDetalheVO;
    }

    public int  getId() {
        return id;
    }

    public void setId(int  id) {
        this.id = id;
    }

    public void alterarDados() throws Exception {
    }

    public String getAlteracao() {
        return alteracao;
    }

    public void setAlteracao(String alteracao) {
        this.alteracao = alteracao;
    }

    public String getAnacritefetuada() {
        return anacritefetuada;
    }

    public void setAnacritefetuada(String anacritefetuada) {
        this.anacritefetuada = anacritefetuada;
    }

    public double  getBaseCalculoTotalImpostoAproximado() {
        return baseCalculoTotalImpostoAproximado;
    }

    public void setBaseCalculoTotalImpostoAproximado(double  baseCalculoTotalImpostoAproximado) {
        this.baseCalculoTotalImpostoAproximado = baseCalculoTotalImpostoAproximado;
    }

    public boolean isCalculadoRecursosHidricos() {
        return calculadoRecursosHidricos;
    }

    public void setCalculadoRecursosHidricos(boolean calculadoRecursosHidricos) {
        this.calculadoRecursosHidricos = calculadoRecursosHidricos;
    }

    public String getCalculoConsumoSimultanea() {
        return calculoConsumoSimultanea;
    }

    public void setCalculoConsumoSimultanea(String calculoConsumoSimultanea) {
        this.calculoConsumoSimultanea = calculoConsumoSimultanea;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<FatDadosMedCategVO> getColCategorias() {
        return colCategorias;
    }

    public void setColCategorias(List<FatDadosMedCategVO> colCategorias) {

        this.colCategorias = colCategorias;
    }

    public List<Integer> getColCoeficienteReducao() {
        return colCoeficienteReducao;
    }

    public void setColCoeficienteReducao(List<Integer> colCoeficienteReducao) {
        this.colCoeficienteReducao = colCoeficienteReducao;
    }

    public List<FaturaExcecaoVO> getColFaturaExcecaoVO() {
        return colFaturaExcecaoVO;
    }

    public void setColFaturaExcecaoVO(List<FaturaExcecaoVO> colFaturaExcecaoVO) {
        this.colFaturaExcecaoVO = colFaturaExcecaoVO;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getDataPagamentoProvisorio() {
        return dataPagamentoProvisorio;
    }

    public void setDataPagamentoProvisorio(String dataPagamentoProvisorio) {
        this.dataPagamentoProvisorio = dataPagamentoProvisorio;
    }

    public String getDataPagto() {
        return dataPagto;
    }

    public void setDataPagto(String dataPagto) {
        this.dataPagto = dataPagto;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmissao() {
        return emissao;
    }

    public void setEmissao(String emissao) {
        this.emissao = emissao;
    }

    public String getEnviaColetor() {
        return enviaColetor;
    }

    public void setEnviaColetor(String enviaColetor) {
        this.enviaColetor = enviaColetor;
    }

    public boolean isEnviado() {
        return enviado;
    }

    public void setEnviado(boolean enviado) {
        this.enviado = enviado;
    }

    public boolean isEnviadoCancelamento() {
        return enviadoCancelamento;
    }

    public void setEnviadoCancelamento(boolean enviadoCancelamento) {
        this.enviadoCancelamento = enviadoCancelamento;
    }

    public List<FaturaDebitosVO> getFaturaDebitos() {
        return faturaDebitos;
    }

    public void setFaturaDebitos(List<FaturaDebitosVO> faturaDebitos) {
        this.faturaDebitos = faturaDebitos;
    }

    public String getFaturaEmitida() {
        return faturaEmitida;
    }

    public void setFaturaEmitida(String faturaEmitida) {
        this.faturaEmitida = faturaEmitida;
    }

    public String getFaturaImportada() {
        return faturaImportada;
    }

    public void setFaturaImportada(String faturaImportada) {
        this.faturaImportada = faturaImportada;
    }

    public boolean isHouvePagamento() {
        return houvePagamento;
    }

    public void setHouvePagamento(boolean houvePagamento) {
        this.houvePagamento = houvePagamento;
    }

    public int  getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int  idCidade) {
        this.idCidade = idCidade;
    }

    public int  getIdClassConsumo() {
        return idClassConsumo;
    }

    public void setIdClassConsumo(int  idClassConsumo) {
        this.idClassConsumo = idClassConsumo;
    }

    public int  getIdConsolidacaoArrecadacao() {
        return idConsolidacaoArrecadacao;
    }

    public void setIdConsolidacaoArrecadacao(int  idConsolidacaoArrecadacao) {
        this.idConsolidacaoArrecadacao = idConsolidacaoArrecadacao;
    }

    public int  getIdFaturaBaixa() {
        return idFaturaBaixa;
    }

    public void setIdFaturaBaixa(int  idFaturaBaixa) {
        this.idFaturaBaixa = idFaturaBaixa;
    }


    public int  getIdFaturaRecalculada() {
        return idFaturaRecalculada;
    }

    public void setIdFaturaRecalculada(int  idFaturaRecalculada) {
        this.idFaturaRecalculada = idFaturaRecalculada;
    }

    public int  getIdFaturaSituacao() {
        return idFaturaSituacao;
    }

    public void setIdFaturaSituacao(int  idFaturaSituacao) {
        this.idFaturaSituacao = idFaturaSituacao;
    }

    public int  getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int  idGrupo) {
        this.idGrupo = idGrupo;
    }

    public int  getIdGrupoEntrega() {
        return idGrupoEntrega;
    }

    public void setIdGrupoEntrega(int  idGrupoEntrega) {
        this.idGrupoEntrega = idGrupoEntrega;
    }

    public int  getIdLigacao() {
        return idLigacao;
    }

    public void setIdLigacao(int  idLigacao) {
        this.idLigacao = idLigacao;
    }

    public int  getIdLigacaoConsolidadora() {
        return idLigacaoConsolidadora;
    }

    public void setIdLigacaoConsolidadora(int  idLigacaoConsolidadora) {
        this.idLigacaoConsolidadora = idLigacaoConsolidadora;
    }

    public int  getIdLigacaoEntrega() {
        return idLigacaoEntrega;
    }

    public void setIdLigacaoEntrega(int  idLigacaoEntrega) {
        this.idLigacaoEntrega = idLigacaoEntrega;
    }

    public int  getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(int  idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public int  getIdPeriodoImpressao() {
        return idPeriodoImpressao;
    }

    public void setIdPeriodoImpressao(int  idPeriodoImpressao) {
        this.idPeriodoImpressao = idPeriodoImpressao;
    }

    public int  getIdProcessoCorte() {
        return idProcessoCorte;
    }

    public void setIdProcessoCorte(int  idProcessoCorte) {
        this.idProcessoCorte = idProcessoCorte;
    }

    public int  getIdTaxaFinanciamento() {
        return idTaxaFinanciamento;
    }

    public void setIdTaxaFinanciamento(int  idTaxaFinanciamento) {
        this.idTaxaFinanciamento = idTaxaFinanciamento;
    }

    public int  getIdTipoCobranca() {
        return idTipoCobranca;
    }

    public void setIdTipoCobranca(int  idTipoCobranca) {
        this.idTipoCobranca = idTipoCobranca;
    }

    public int  getIdTipoEntrega() {
        return idTipoEntrega;
    }

    public void setIdTipoEntrega(int  idTipoEntrega) {
        this.idTipoEntrega = idTipoEntrega;
    }

    public int  getIdTipoFaturamento() {
        return idTipoFaturamento;
    }

    public void setIdTipoFaturamento(int  idTipoFaturamento) {
        this.idTipoFaturamento = idTipoFaturamento;
    }

    public int  getIdTipoParcelamentoAcordo() {
        return idTipoParcelamentoAcordo;
    }

    public void setIdTipoParcelamentoAcordo(int  idTipoParcelamentoAcordo) {
        this.idTipoParcelamentoAcordo = idTipoParcelamentoAcordo;
    }

    public int  getIdTipoTransacao() {
        return idTipoTransacao;
    }

    public void setIdTipoTransacao(int  idTipoTransacao) {
        this.idTipoTransacao = idTipoTransacao;
    }

    public int  getIdUsuarioCancto() {
        return idUsuarioCancto;
    }

    public void setIdUsuarioCancto(int  idUsuarioCancto) {
        this.idUsuarioCancto = idUsuarioCancto;
    }

    public boolean isImpostoInformativoCalculado() {
        return impostoInformativoCalculado;
    }

    public void setImpostoInformativoCalculado(boolean impostoInformativoCalculado) {
        this.impostoInformativoCalculado = impostoInformativoCalculado;
    }

    public String getMensagensPrevencao() {
        return mensagensPrevencao;
    }

    public void setMensagensPrevencao(String mensagensPrevencao) {
        this.mensagensPrevencao = mensagensPrevencao;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int  getNrDiasConsumo() {
        return nrDiasConsumo;
    }

    public void setNrDiasConsumo(int  nrDiasConsumo) {
        this.nrDiasConsumo = nrDiasConsumo;
    }

    public int  getNrEconCons() {
        return nrEconCons;
    }

    public void setNrEconCons(int  nrEconCons) {
        this.nrEconCons = nrEconCons;
    }

    public int  getOrdemGrupoEntrega() {
        return ordemGrupoEntrega;
    }

    public void setOrdemGrupoEntrega(int  ordemGrupoEntrega) {
        this.ordemGrupoEntrega = ordemGrupoEntrega;
    }

    public int  getOrdemGrupoLeitura() {
        return ordemGrupoLeitura;
    }

    public void setOrdemGrupoLeitura(int  ordemGrupoLeitura) {
        this.ordemGrupoLeitura = ordemGrupoLeitura;
    }

    public double  getPercentualTotalImpostoAproximado() {
        return percentualTotalImpostoAproximado;
    }

    public void setPercentualTotalImpostoAproximado(double  percentualTotalImpostoAproximado) {
        this.percentualTotalImpostoAproximado = percentualTotalImpostoAproximado;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public boolean isPertenceConsolidacaoArrecadacao() {
        return pertenceConsolidacaoArrecadacao;
    }

    public void setPertenceConsolidacaoArrecadacao(boolean pertenceConsolidacaoArrecadacao) {
        this.pertenceConsolidacaoArrecadacao = pertenceConsolidacaoArrecadacao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getTipoLeitura() {
        return tipoLeitura;
    }

    public void setTipoLeitura(String tipoLeitura) {
        this.tipoLeitura = tipoLeitura;
    }

    public String getTipoTransacao() {
        return tipoTransacao;
    }

    public void setTipoTransacao(String tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }

    public boolean isUtilizar() {
        return utilizar;
    }

    public void setUtilizar(boolean utilizar) {
        this.utilizar = utilizar;
    }

    public double  getValor() {
        return valor;
    }

    public void setValor(double  valor) {
        this.valor = valor;
    }

    public double  getValorImposto() {
        return valorImposto;
    }

    public void setValorImposto(double  valorImposto) {
        this.valorImposto = valorImposto;
    }

    public double  getValorTCL() {
        return valorTCL;
    }

    public void setValorTCL(double  valorTCL) {
        this.valorTCL = valorTCL;
    }

    public double  getValorTotalImpostoAproximado() {
        return valorTotalImpostoAproximado;
    }

    public void setValorTotalImpostoAproximado(double  valorTotalImpostoAproximado) {
        this.valorTotalImpostoAproximado = valorTotalImpostoAproximado;
    }

//    public VendaVO getVendaCreditoVO() {
//        return vendaCreditoVO;
//    }

//    public void setVendaCreditoVO(VendaVO vendaCreditoVO) {
//        this.vendaCreditoVO = vendaCreditoVO;
//    }

    public String getAssuntoEmail() {
        return assuntoEmail;
    }

    public void setAssuntoEmail(String assuntoEmail) {
        this.assuntoEmail = assuntoEmail;
    }

    public String getCorpoEmail() {
        return corpoEmail;
    }

    public void setCorpoEmail(String corpoEmail) {
        this.corpoEmail = corpoEmail;
    }

    public String getEmailDestinatario() {
        return emailDestinatario;
    }

    public void setEmailDestinatario(String emailDestinatario) {
        this.emailDestinatario = emailDestinatario;
    }

    public boolean isCalculadoTaxaRegulacao() {
        return calculadoTaxaRegulacao;
    }

    public void setCalculadoTaxaRegulacao(boolean calculadoTaxaRegulacao) {
        this.calculadoTaxaRegulacao = calculadoTaxaRegulacao;
    }

    public String getImportadaSistemaTerceiros() {
        return importadaSistemaTerceiros;
    }

    public void setImportadaSistemaTerceiros(String importadaSistemaTerceiros) {
        this.importadaSistemaTerceiros = importadaSistemaTerceiros == null ? "N" : importadaSistemaTerceiros;
    }

    public String getDataMovimento() {
        return dataMovimento;
    }

    public void setDataMovimento(String dataMovimento) {
        this.dataMovimento = dataMovimento;
    }

    public String getPeriodoImportacaoOrigem() {
        return periodoImportacaoOrigem;
    }

    public void setPeriodoImportacaoOrigem(String periodoImportacaoOrigem) {
        this.periodoImportacaoOrigem = periodoImportacaoOrigem;
    }

    public boolean isCalculoConsolidacaoConsEfet() {
        return calculoConsolidacaoConsEfet;
    }

    public void setCalculoConsolidacaoConsEfet(boolean calculoConsolidacaoConsEfet) {
        this.calculoConsolidacaoConsEfet = calculoConsolidacaoConsEfet;
    }

    public String getRcs() {
        return rcs;
    }

    public void setRcs(String rcs) {
        this.rcs = rcs;
    }





    public int  hashCode() {
        int  hash = 3;
        hash = 59 * hash + this.getId();
        hash = 59 * hash + this.getIdLigacao();
        return hash;
    }


    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FaturaVO other = (FaturaVO) obj;
        if (this.getId() != other.getId()) {
            return false;
        }
        return this.getIdLigacao() == other.getIdLigacao();
    }


    @Override
    public int compareTo(FaturaVO o) {
        return this.getId()-o.getId();
    }

//   public List<VendaVO> getColVendaVO() {
//        return colVendaVO;
//    }
//
//    public void setColVendaVO(List<VendaVO> colVendaVO) {
//        this.colVendaVO = colVendaVO;
//    }


    public int getIdPeriodoPagamentoAntecipado() {
        return idPeriodoPagamentoAntecipado;
    }

    public void setIdPeriodoPagamentoAntecipado(int idPeriodoPagamentoAntecipado) {
        this.idPeriodoPagamentoAntecipado = idPeriodoPagamentoAntecipado;
    }

    public boolean isPagamentoAntecipado() {
        return getIdPeriodoPagamentoAntecipado()>0;
    }

    public String getTimbre() {
        return timbre;
    }

    public void setTimbre(String timbre) {
        this.timbre = timbre;
    }

    public String getCodBar() {
        return codBar;
    }

    public void setCodBar(String codBar) {
        this.codBar = codBar;
    }

    public String getCodBar1() {
        return codBar1;
    }

    public void setCodBar1(String codBar1) {
        this.codBar1 = codBar1;
    }

    public String getCodBar2() {
        return codBar2;
    }

    public void setCodBar2(String codBar2) {
        this.codBar2 = codBar2;
    }

    public int getEntregaCliente() {
        return entregaCliente;
    }

    public void setEntregaCliente(int entregaCliente) {
        this.entregaCliente = entregaCliente;
    }

    public boolean isFaturaImpressa() {
        return faturaImpressa;
    }

    public void setFaturaImpressa(boolean faturaImpressa) {
        this.faturaImpressa = faturaImpressa;
    }

    public boolean isEnderecoAlternativo() {
        return enderecoAlternativo;
    }

    public void setEnderecoAlternativo(boolean enderecoAlternativo) {
        this.enderecoAlternativo = enderecoAlternativo;
    }

    public Map<Integer, FaturaVO> getFaturaAtrasoPeriodoAnterior() {
        return faturaAtrasoPeriodoAnterior;
    }

    public void setFaturaAtrasoPeriodoAnterior(Map<Integer, FaturaVO> faturaAtrasoPeriodoAnterior) {
        this.faturaAtrasoPeriodoAnterior = faturaAtrasoPeriodoAnterior;
    }

    public FatDadosMedicaoDetVO getDadosMedicaoDetVO() {
        return getDadosMedicaoDet();
    }

    public void setDadosMedicaoDetVO(FatDadosMedicaoDetVO dadosMedicaoDetVO) {
        this.setDadosMedicaoDet(dadosMedicaoDetVO);
    }

    public ColetorDetalheVO getLeituraVO() {
        return getLeitura();
    }

    public void setLeituraVO(ColetorDetalheVO coletorDetalheVO) {
        this.setLeitura(coletorDetalheVO);
    }

    public boolean isRecalculo() {
        return recalculo;
    }

    public void setRecalculo(boolean recalculo) {
        this.recalculo = recalculo;
    }

    public Integer getIdParctoOrigem() {
        return idParctoOrigem;
    }

    public void setIdParctoOrigem(Integer idParctoOrigem) {
        this.idParctoOrigem = idParctoOrigem;
    }

    public String getDataEmissaoOrigem() {
        return dataEmissaoOrigem;
    }

    public void setDataEmissaoOrigem(String dataEmissaoOrigem) {
        this.dataEmissaoOrigem = dataEmissaoOrigem;
    }

    public boolean isCadastroAtual() {
        return cadastroAtual;
    }
    public void setCadastroAtual(boolean b)
    {
        this.cadastroAtual = b;
    }

    public double getCoeficientePAA() {
        return coeficientePAA;
    }

    public void setCoeficientePAA(double coeficientePAA) {
        this.coeficientePAA = coeficientePAA;
    }

    public FatDadosMedicaoDetVO getDadosMedicaoDet() {
        return dadosMedicaoDet;
    }

    public void setDadosMedicaoDet(FatDadosMedicaoDetVO dadosMedicaoDet) {
        this.dadosMedicaoDet = dadosMedicaoDet;
    }

    public ColetorDetalheVO getLeitura() {
        return coletorDetalhe;
    }

    public void setLeitura(ColetorDetalheVO coletorDetalhe) {
        this.coletorDetalhe = coletorDetalhe;
    }

    public int getIdMedicaoDetalhe() {
        return idMedicaoDetalhe;
    }

    public void setIdMedicaoDetalhe(int idMedicaoDetalhe) {
        this.idMedicaoDetalhe = idMedicaoDetalhe;
    }

    public String getMsgDeclaracaoQuitacaoAnual() {
        return msgDeclaracaoQuitacaoAnual;
    }

    public void setMsgDeclaracaoQuitacaoAnual(String msgDeclaracaoQuitacaoAnual) {
        this.msgDeclaracaoQuitacaoAnual = msgDeclaracaoQuitacaoAnual;
    }

    public boolean isCalculoPaa() {
        return calculoPaa;
    }

    public void setCalculoPaa(boolean calculoPaa) {
        this.calculoPaa = calculoPaa;
    }

    public ColetorDetalheVO getColetorDetalhe() {
        return coletorDetalhe;
    }

    public void setColetorDetalhe(ColetorDetalheVO coletorDetalhe) {
        this.coletorDetalhe = coletorDetalhe;
    }

    public Integer getIdLigacaoProcessoCorte() {
        return idLigacaoProcessoCorte;
    }

    public void setIdLigacaoProcessoCorte(Integer idLigacaoProcessoCorte) {
        this.idLigacaoProcessoCorte = idLigacaoProcessoCorte;
    }
}
