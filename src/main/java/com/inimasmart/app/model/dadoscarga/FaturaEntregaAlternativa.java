package com.inimasmart.app.model.dadoscarga;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FaturaEntregaAlternativa {

    private int codigo;
    private String digito;
    private String digitoVerificadorOrigem;
    private String nome;
    private String documentoCliente;
    private String hidrometro;
    private BigInteger numeroPonteiroHD;
    private String descricaoLogradouro;
    private String descricaoBairro;
    private String cidade;
    private String numero;
    private String complemento;
    private String cep;
    private int inscricaoImoboliariaGrupo;
    private int inscricaoImoboliariaSetor;
    private int inscricaoImoboliariaRota;
    private int inscricaoImoboliariaQuadra;
    private int inscricaoImoboliariaLocal;
    private int inscricaoImoboliariaCavalete;
    private String roteirizacao;
    private String rota;
    private String dataEmissaoFatura;
    private String dataLeituraAnterior;
    private String dataLeitura;
    private String dataPrevistaProximaLeitura;
    private int diasConsumoReal;
    private int diasConsumoFaturado;
    private String numeroLacreMedidor;
    private int leituraAnterior;
    private String leituraAtual;
    private int consumoResidual;
    private List<ConsumoAnterior> consumoAnterior=new ArrayList<>();
    private String mensagemDebitosAnterioresImpresso;
    private int media;
    private int consumoMedido;
    private BigDecimal consumoFaturadoProd1;
    private BigDecimal consumoFaturadoProd2;
    private String descricaoConsumoFaturadoProd1;
    private String descricaoConsumoFaturadoProd2;
    private String descricaoImpressaCodLeitura;
    private Integer fatura;
    private String periodoReferencia;
    private BigDecimal valorTotalFatura;
    private BigDecimal valorTotalImpostoAprox;
    private BigDecimal baseCalcTotalImpostoAprox;
    private BigDecimal percentualTotalImpostoAprox;
    private ReavisoDebitoPendente reavisoDebitoPendente;
    private Integer codigoMensagemAvisoDebitoImpresso;
    private Integer codigoMensagemNotificacaoCorteImpresso;
    private String dataVencimento;
    private Boolean imprimeCodBarras;
    private String mensagemAlternativaCodBarras;
    private String codigoBarras;
    private DebitoConta debitoConta;
    private String categoriaImpressao;
    private int codigoFonteAbastecimento;
    private String tipoFaturamentoImpresso;
    private String descricaoProdutosLigado;
    private List<MensagemFatura> mensagemFatura=new ArrayList<>();
    private List<MensagemAlertaConsumo> mensagemAlertaConsumo=new ArrayList<>();
    private List<ColunaImpressaoEntregaAlternativa> colunaImpressaoEntregaAlternativa=new ArrayList<>();




    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDigito() {
        return digito;
    }

    public void setDigito(String digito) {
        this.digito = digito;
    }

    public String getDigitoVerificadorOrigem() {
        return digitoVerificadorOrigem;
    }

    public void setDigitoVerificadorOrigem(String digitoVerificadorOrigem) {
        this.digitoVerificadorOrigem = digitoVerificadorOrigem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumentoCliente() {
        return documentoCliente;
    }

    public void setDocumentoCliente(String documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    public String getHidrometro() {
        return hidrometro;
    }

    public void setHidrometro(String hidrometro) {
        this.hidrometro = hidrometro;
    }

    public BigInteger getNumeroPonteiroHD() {
        return numeroPonteiroHD;
    }

    public void setNumeroPonteiroHD(BigInteger numeroPonteiroHD) {
        this.numeroPonteiroHD = numeroPonteiroHD;
    }

    public String getDescricaoLogradouro() {
        return descricaoLogradouro;
    }

    public void setDescricaoLogradouro(String descricaoLogradouro) {
        this.descricaoLogradouro = descricaoLogradouro;
    }

    public String getDescricaoBairro() {
        return descricaoBairro;
    }

    public void setDescricaoBairro(String descricaoBairro) {
        this.descricaoBairro = descricaoBairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getInscricaoImoboliariaGrupo() {
        return inscricaoImoboliariaGrupo;
    }

    public void setInscricaoImoboliariaGrupo(int inscricaoImoboliariaGrupo) {
        this.inscricaoImoboliariaGrupo = inscricaoImoboliariaGrupo;
    }

    public int getInscricaoImoboliariaSetor() {
        return inscricaoImoboliariaSetor;
    }

    public void setInscricaoImoboliariaSetor(int inscricaoImoboliariaSetor) {
        this.inscricaoImoboliariaSetor = inscricaoImoboliariaSetor;
    }

    public int getInscricaoImoboliariaRota() {
        return inscricaoImoboliariaRota;
    }

    public void setInscricaoImoboliariaRota(int inscricaoImoboliariaRota) {
        this.inscricaoImoboliariaRota = inscricaoImoboliariaRota;
    }

    public int getInscricaoImoboliariaQuadra() {
        return inscricaoImoboliariaQuadra;
    }

    public void setInscricaoImoboliariaQuadra(int inscricaoImoboliariaQuadra) {
        this.inscricaoImoboliariaQuadra = inscricaoImoboliariaQuadra;
    }

    public int getInscricaoImoboliariaLocal() {
        return inscricaoImoboliariaLocal;
    }

    public void setInscricaoImoboliariaLocal(int inscricaoImoboliariaLocal) {
        this.inscricaoImoboliariaLocal = inscricaoImoboliariaLocal;
    }

    public int getInscricaoImoboliariaCavalete() {
        return inscricaoImoboliariaCavalete;
    }

    public void setInscricaoImoboliariaCavalete(int inscricaoImoboliariaCavalete) {
        this.inscricaoImoboliariaCavalete = inscricaoImoboliariaCavalete;
    }

    public String getRoteirizacao() {
        return roteirizacao;
    }

    public void setRoteirizacao(String roteirizacao) {
        this.roteirizacao = roteirizacao;
    }

    public String getRota() {
        return rota;
    }

    public void setRota(String rota) {
        this.rota = rota;
    }

    public String getDataEmissaoFatura() {
        return dataEmissaoFatura;
    }

    public void setDataEmissaoFatura(String dataEmissaoFatura) {
        this.dataEmissaoFatura = dataEmissaoFatura;
    }

    public String getDataLeituraAnterior() {
        return dataLeituraAnterior;
    }

    public void setDataLeituraAnterior(String dataLeituraAnterior) {
        this.dataLeituraAnterior = dataLeituraAnterior;
    }

    public String getDataLeitura() {
        return dataLeitura;
    }

    public void setDataLeitura(String dataLeitura) {
        this.dataLeitura = dataLeitura;
    }

    public String getDataPrevistaProximaLeitura() {
        return dataPrevistaProximaLeitura;
    }

    public void setDataPrevistaProximaLeitura(String dataPrevistaProximaLeitura) {
        this.dataPrevistaProximaLeitura = dataPrevistaProximaLeitura;
    }

    public int getDiasConsumoReal() {
        return diasConsumoReal;
    }

    public void setDiasConsumoReal(int diasConsumoReal) {
        this.diasConsumoReal = diasConsumoReal;
    }

    public int getDiasConsumoFaturado() {
        return diasConsumoFaturado;
    }

    public void setDiasConsumoFaturado(int diasConsumoFaturado) {
        this.diasConsumoFaturado = diasConsumoFaturado;
    }

    public String getNumeroLacreMedidor() {
        return numeroLacreMedidor;
    }

    public void setNumeroLacreMedidor(String numeroLacreMedidor) {
        this.numeroLacreMedidor = numeroLacreMedidor;
    }

    public int getLeituraAnterior() {
        return leituraAnterior;
    }

    public void setLeituraAnterior(int leituraAnterior) {
        this.leituraAnterior = leituraAnterior;
    }

    public String getLeituraAtual() {
        return leituraAtual;
    }

    public void setLeituraAtual(String leituraAtual) {
        this.leituraAtual = leituraAtual;
    }

    public int getConsumoResidual() {
        return consumoResidual;
    }

    public void setConsumoResidual(int consumoResidual) {
        this.consumoResidual = consumoResidual;
    }

    public List<ConsumoAnterior> getConsumoAnterior() {
        return consumoAnterior;
    }

    public void setConsumoAnterior(List<ConsumoAnterior> consumoAnterior) {
        this.consumoAnterior = consumoAnterior;
    }

    public String getMensagemDebitosAnterioresImpresso() {
        return mensagemDebitosAnterioresImpresso;
    }

    public void setMensagemDebitosAnterioresImpresso(String mensagemDebitosAnterioresImpresso) {
        this.mensagemDebitosAnterioresImpresso = mensagemDebitosAnterioresImpresso;
    }

    public int getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }

    public int getConsumoMedido() {
        return consumoMedido;
    }

    public void setConsumoMedido(int consumoMedido) {
        this.consumoMedido = consumoMedido;
    }

    public BigDecimal getConsumoFaturadoProd1() {
        return consumoFaturadoProd1;
    }

    public void setConsumoFaturadoProd1(BigDecimal consumoFaturadoProd1) {
        this.consumoFaturadoProd1 = consumoFaturadoProd1;
    }

    public BigDecimal getConsumoFaturadoProd2() {
        return consumoFaturadoProd2;
    }

    public void setConsumoFaturadoProd2(BigDecimal consumoFaturadoProd2) {
        this.consumoFaturadoProd2 = consumoFaturadoProd2;
    }

    public String getDescricaoConsumoFaturadoProd1() {
        return descricaoConsumoFaturadoProd1;
    }

    public void setDescricaoConsumoFaturadoProd1(String descricaoConsumoFaturadoProd1) {
        this.descricaoConsumoFaturadoProd1 = descricaoConsumoFaturadoProd1;
    }

    public String getDescricaoConsumoFaturadoProd2() {
        return descricaoConsumoFaturadoProd2;
    }

    public void setDescricaoConsumoFaturadoProd2(String descricaoConsumoFaturadoProd2) {
        this.descricaoConsumoFaturadoProd2 = descricaoConsumoFaturadoProd2;
    }

    public String getDescricaoImpressaCodLeitura() {
        return descricaoImpressaCodLeitura;
    }

    public void setDescricaoImpressaCodLeitura(String descricaoImpressaCodLeitura) {
        this.descricaoImpressaCodLeitura = descricaoImpressaCodLeitura;
    }

    public Integer getFatura() {
        return fatura;
    }

    public void setFatura(Integer fatura) {
        this.fatura = fatura;
    }

    public String getPeriodoReferencia() {
        return periodoReferencia;
    }

    public void setPeriodoReferencia(String periodoReferencia) {
        this.periodoReferencia = periodoReferencia;
    }

    public BigDecimal getValorTotalFatura() {
        return valorTotalFatura;
    }

    public void setValorTotalFatura(BigDecimal valorTotalFatura) {
        this.valorTotalFatura = valorTotalFatura;
    }

    public BigDecimal getValorTotalImpostoAprox() {
        return valorTotalImpostoAprox;
    }

    public void setValorTotalImpostoAprox(BigDecimal valorTotalImpostoAprox) {
        this.valorTotalImpostoAprox = valorTotalImpostoAprox;
    }

    public BigDecimal getBaseCalcTotalImpostoAprox() {
        return baseCalcTotalImpostoAprox;
    }

    public void setBaseCalcTotalImpostoAprox(BigDecimal baseCalcTotalImpostoAprox) {
        this.baseCalcTotalImpostoAprox = baseCalcTotalImpostoAprox;
    }

    public BigDecimal getPercentualTotalImpostoAprox() {
        return percentualTotalImpostoAprox;
    }

    public void setPercentualTotalImpostoAprox(BigDecimal percentualTotalImpostoAprox) {
        this.percentualTotalImpostoAprox = percentualTotalImpostoAprox;
    }

    public ReavisoDebitoPendente getReavisoDebitoPendente() {
        return reavisoDebitoPendente;
    }

    public void setReavisoDebitoPendente(ReavisoDebitoPendente reavisoDebitoPendente) {
        this.reavisoDebitoPendente = reavisoDebitoPendente;
    }

    public Integer getCodigoMensagemAvisoDebitoImpresso() {
        return codigoMensagemAvisoDebitoImpresso;
    }

    public void setCodigoMensagemAvisoDebitoImpresso(Integer codigoMensagemAvisoDebitoImpresso) {
        this.codigoMensagemAvisoDebitoImpresso = codigoMensagemAvisoDebitoImpresso;
    }

    public Integer getCodigoMensagemNotificacaoCorteImpresso() {
        return codigoMensagemNotificacaoCorteImpresso;
    }

    public void setCodigoMensagemNotificacaoCorteImpresso(Integer codigoMensagemNotificacaoCorteImpresso) {
        this.codigoMensagemNotificacaoCorteImpresso = codigoMensagemNotificacaoCorteImpresso;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Boolean getImprimeCodBarras() {
        return imprimeCodBarras;
    }

    public void setImprimeCodBarras(Boolean imprimeCodBarras) {
        this.imprimeCodBarras = imprimeCodBarras;
    }

    public String getMensagemAlternativaCodBarras() {
        return mensagemAlternativaCodBarras;
    }

    public void setMensagemAlternativaCodBarras(String mensagemAlternativaCodBarras) {
        this.mensagemAlternativaCodBarras = mensagemAlternativaCodBarras;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public DebitoConta getDebitoConta() {
        return debitoConta;
    }

    public void setDebitoConta(DebitoConta debitoConta) {
        this.debitoConta = debitoConta;
    }

    public String getCategoriaImpressao() {
        return categoriaImpressao;
    }

    public void setCategoriaImpressao(String categoriaImpressao) {
        this.categoriaImpressao = categoriaImpressao;
    }

    public int getCodigoFonteAbastecimento() {
        return codigoFonteAbastecimento;
    }

    public void setCodigoFonteAbastecimento(int codigoFonteAbastecimento) {
        this.codigoFonteAbastecimento = codigoFonteAbastecimento;
    }

    public String getTipoFaturamentoImpresso() {
        return tipoFaturamentoImpresso;
    }

    public void setTipoFaturamentoImpresso(String tipoFaturamentoImpresso) {
        this.tipoFaturamentoImpresso = tipoFaturamentoImpresso;
    }

    public String getDescricaoProdutosLigado() {
        return descricaoProdutosLigado;
    }

    public void setDescricaoProdutosLigado(String descricaoProdutosLigado) {
        this.descricaoProdutosLigado = descricaoProdutosLigado;
    }

    public List<MensagemFatura> getMensagemFatura() {
        return mensagemFatura;
    }

    public void setMensagemFatura(List<MensagemFatura> mensagemFatura) {
        this.mensagemFatura = mensagemFatura;
    }

    public List<MensagemAlertaConsumo> getMensagemAlertaConsumo() {
        return mensagemAlertaConsumo;
    }

    public void setMensagemAlertaConsumo(List<MensagemAlertaConsumo> mensagemAlertaConsumo) {
        this.mensagemAlertaConsumo = mensagemAlertaConsumo;
    }

    public List<ColunaImpressaoEntregaAlternativa> getColunaImpressaoEntregaAlternativa() {
        return colunaImpressaoEntregaAlternativa;
    }

    public void setColunaImpressaoEntregaAlternativa(List<ColunaImpressaoEntregaAlternativa> colunaImpressaoEntregaAlternativa) {
        this.colunaImpressaoEntregaAlternativa = colunaImpressaoEntregaAlternativa;
    }
}
