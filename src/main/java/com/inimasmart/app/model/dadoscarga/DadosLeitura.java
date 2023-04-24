package com.inimasmart.app.model.dadoscarga;

import com.inimasmart.app.model.vo.GenericoVO;
import com.inimasmart.app.model.vo.TipoEntregaParamVO;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class DadosLeitura {

    private String referencia;
    private int roteiro;
    private Boolean ligacoesRemanescentesDescParcial;
    private Boolean transmitirDescargaPorFTP;
    private DadosLoginFTP dadosLoginFTP;

    private String dataLeitura;

    private String dataPrevistaProximaLeitura;
    private boolean impressaoSimultanea;
    private Boolean utilizarTipoUnidadeMensuracao;
    private Boolean aplicarRegraConsumoEstimado;
    private boolean aplicarRegraCalculo30Dias;
    private boolean cobrarLigacaoCortada;
    private boolean cobrarServicoLigCortada;
    private boolean debitoConsumidor;

    private Boolean cobrarLigacaoCortadaSemConsumoMedidoApurado;
    private Boolean cobrarResiduoCorteProximoCiclo;
    private int codigoIDLeituraPadrao;
    private int codigoIDLeituraHMNaoConfere;


    private Integer codigoIDLeituraEstimada;
    private BigInteger consumoMinimoParaLigacaoNova;
    private BigInteger consumoMinimoParaLigacaoNovaEsgoto;
    private int minimoDiasParaLigacaoNova;
    private int minimoDiasParaLigacaoNovaEsgoto;
    private Integer nrMaxDiasParaLigacaoNova;
    private Integer nrMaxDiasParaLigacaoNovaEsgoto;
    private Boolean cobrarConsNaoFatProxCicloAgua;
    private Boolean cobrarConsNaoFatProxCicloEsgoto;
    private boolean cobrarMediaLeituraAtualIgualAnterior;
    private Boolean cobrarMediaLeituraAtualMenorAnterior;
    private Boolean cobrarMediaLeituraAtualMenorAnteriorCortada;
    private boolean imprimirReaviso;
    private boolean imprimirFaturaValorZero;
    private boolean imprimirInfoFaturaParaDebitoAutomatico;
    private int layoutCodigoBarras;
    private String identificacaoFebrabanEmpresa1;
    private DefinicaoEmpresaCampoLivre definicaoEmpresaCampoLivre;
    private boolean aplicarCreditoPorEmpresa;
    private int regraCalculoFaturamento;
    private int criterioCalculoDiasConsumo;
    private int layoutImpressao;
    private String descricaoTotalColuna1;
    private String descricaoTotalColuna2;
    private boolean limitarQuantidadeDigitosLeitura;
    private boolean permitirRefazerLeitura;
    private int codigoIDCriticaReterConta;
    private Integer codigoIDCriticaRetForcada;
    private List<GenericoVO> tipofaturamento =new ArrayList<>();
    private List<GenericoVO> tipoligacao =new ArrayList<>();
    private List<GenericoVO> cobrancafase =new ArrayList<>();
    private List<GenericoVO> situacaoLigacao =new ArrayList<>();
    private List<TipoEntregaParamVO> tipoEntrega = new ArrayList<>();
    private List<MensagemReaviso> mensagemReaviso =new ArrayList<>();
    private List<MensagemAvisoRetencao> mensagemAvisoRetencao=new ArrayList<>();
    private List<MensagemComunicadoDebito> mensagemComunicadoDebito=new ArrayList<>();
    private List<MensagemDeclaracaoAnual> mensagemDeclaracaoAnual=new ArrayList<>();
    private List<MensagemAvisoRetencaoVazamento> mensagemAvisoRetencaoVazamento=new ArrayList<>();
    private boolean imprimirDiasConsumo;
    private boolean imprimirDiasFaturado;
    private boolean imprimirConsumoFaturado;
    private boolean imprimirConsumoFaturadoPorProduto;
    private boolean imprimirNumeroLacreMedidor;
    private String descricaoVolumeFaturado;
    private BigDecimal fatorTolerancia;
    private BigDecimal percToleranciaHM;
    private Boolean imprimirRelatorioLeituras;
    private Integer intervaloImpressaoRelatorioLeituras;
    private Integer diasConsumoLimite;
    private Boolean gpsHabilitado;
    private Boolean leituraPorTelemetria;
    private Boolean imprimirDetalheRubricaAgrupada;
    private Integer qtdeMaxPorPaginaRubricaAnalitico;
    private Boolean obrigatorioConfirmarEntregaAvisoDebito;
    private Boolean agruparRecursoHidrico;
    private Integer codigoObservacaoCortadoSemLeitura;
    private Boolean obrigarLeituraEmLigacaoCortada;
    private String tituloFaturaMensal;
    private String tituloReavisoDebito;
    private String tituloNotificacaoCorte;
    private String tituloMensagemCanhotoCEDAE;
    private String mensagemTributosOlhoNoImposto;
    private Boolean imprimirReavisoNoAvisoRetencao;
    private Integer tempoColetaCoordenadasLeitura;
    private Integer tempoEnvioMedicao;
    private Integer qtdMedicaoEnvio;

    public List<TipoEntregaParamVO> getTipoEntrega() {
        return tipoEntrega;
    }

    public void setTipoEntrega(List<TipoEntregaParamVO> tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getRoteiro() {
        return roteiro;
    }

    public void setRoteiro(int roteiro) {
        this.roteiro = roteiro;
    }

    public Boolean getLigacoesRemanescentesDescParcial() {
        return ligacoesRemanescentesDescParcial;
    }

    public void setLigacoesRemanescentesDescParcial(Boolean ligacoesRemanescentesDescParcial) {
        this.ligacoesRemanescentesDescParcial = ligacoesRemanescentesDescParcial;
    }

    public Boolean getTransmitirDescargaPorFTP() {
        return transmitirDescargaPorFTP;
    }

    public void setTransmitirDescargaPorFTP(Boolean transmitirDescargaPorFTP) {
        this.transmitirDescargaPorFTP = transmitirDescargaPorFTP;
    }

    public DadosLoginFTP getDadosLoginFTP() {
        return dadosLoginFTP;
    }

    public void setDadosLoginFTP(DadosLoginFTP dadosLoginFTP) {
        this.dadosLoginFTP = dadosLoginFTP;
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

    public boolean isImpressaoSimultanea() {
        return impressaoSimultanea;
    }

    public void setImpressaoSimultanea(boolean impressaoSimultanea) {
        this.impressaoSimultanea = impressaoSimultanea;
    }

    public Boolean getUtilizarTipoUnidadeMensuracao() {
        return utilizarTipoUnidadeMensuracao;
    }

    public void setUtilizarTipoUnidadeMensuracao(Boolean utilizarTipoUnidadeMensuracao) {
        this.utilizarTipoUnidadeMensuracao = utilizarTipoUnidadeMensuracao;
    }

    public Boolean getAplicarRegraConsumoEstimado() {
        return aplicarRegraConsumoEstimado;
    }

    public void setAplicarRegraConsumoEstimado(Boolean aplicarRegraConsumoEstimado) {
        this.aplicarRegraConsumoEstimado = aplicarRegraConsumoEstimado;
    }

    public boolean isAplicarRegraCalculo30Dias() {
        return aplicarRegraCalculo30Dias;
    }

    public void setAplicarRegraCalculo30Dias(boolean aplicarRegraCalculo30Dias) {
        this.aplicarRegraCalculo30Dias = aplicarRegraCalculo30Dias;
    }

    public boolean isCobrarLigacaoCortada() {
        return cobrarLigacaoCortada;
    }

    public void setCobrarLigacaoCortada(boolean cobrarLigacaoCortada) {
        this.cobrarLigacaoCortada = cobrarLigacaoCortada;
    }

    public Boolean getCobrarLigacaoCortadaSemConsumoMedidoApurado() {
        return cobrarLigacaoCortadaSemConsumoMedidoApurado;
    }

    public void setCobrarLigacaoCortadaSemConsumoMedidoApurado(Boolean cobrarLigacaoCortadaSemConsumoMedidoApurado) {
        this.cobrarLigacaoCortadaSemConsumoMedidoApurado = cobrarLigacaoCortadaSemConsumoMedidoApurado;
    }

    public Boolean getCobrarResiduoCorteProximoCiclo() {
        return cobrarResiduoCorteProximoCiclo;
    }

    public void setCobrarResiduoCorteProximoCiclo(Boolean cobrarResiduoCorteProximoCiclo) {
        this.cobrarResiduoCorteProximoCiclo = cobrarResiduoCorteProximoCiclo;
    }

    public int getCodigoIDLeituraPadrao() {
        return codigoIDLeituraPadrao;
    }

    public void setCodigoIDLeituraPadrao(int codigoIDLeituraPadrao) {
        this.codigoIDLeituraPadrao = codigoIDLeituraPadrao;
    }

    public int getCodigoIDLeituraHMNaoConfere() {
        return codigoIDLeituraHMNaoConfere;
    }

    public void setCodigoIDLeituraHMNaoConfere(int codigoIDLeituraHMNaoConfere) {
        this.codigoIDLeituraHMNaoConfere = codigoIDLeituraHMNaoConfere;
    }

    public Integer getCodigoIDLeituraEstimada() {
        return codigoIDLeituraEstimada;
    }

    public void setCodigoIDLeituraEstimada(Integer codigoIDLeituraEstimada) {
        this.codigoIDLeituraEstimada = codigoIDLeituraEstimada;
    }

    public BigInteger getConsumoMinimoParaLigacaoNova() {
        return consumoMinimoParaLigacaoNova;
    }

    public void setConsumoMinimoParaLigacaoNova(BigInteger consumoMinimoParaLigacaoNova) {
        this.consumoMinimoParaLigacaoNova = consumoMinimoParaLigacaoNova;
    }

    public BigInteger getConsumoMinimoParaLigacaoNovaEsgoto() {
        return consumoMinimoParaLigacaoNovaEsgoto;
    }

    public void setConsumoMinimoParaLigacaoNovaEsgoto(BigInteger consumoMinimoParaLigacaoNovaEsgoto) {
        this.consumoMinimoParaLigacaoNovaEsgoto = consumoMinimoParaLigacaoNovaEsgoto;
    }

    public int getMinimoDiasParaLigacaoNova() {
        return minimoDiasParaLigacaoNova;
    }

    public void setMinimoDiasParaLigacaoNova(int minimoDiasParaLigacaoNova) {
        this.minimoDiasParaLigacaoNova = minimoDiasParaLigacaoNova;
    }

    public int getMinimoDiasParaLigacaoNovaEsgoto() {
        return minimoDiasParaLigacaoNovaEsgoto;
    }

    public void setMinimoDiasParaLigacaoNovaEsgoto(int minimoDiasParaLigacaoNovaEsgoto) {
        this.minimoDiasParaLigacaoNovaEsgoto = minimoDiasParaLigacaoNovaEsgoto;
    }

    public Integer getNrMaxDiasParaLigacaoNova() {
        return nrMaxDiasParaLigacaoNova;
    }

    public void setNrMaxDiasParaLigacaoNova(Integer nrMaxDiasParaLigacaoNova) {
        this.nrMaxDiasParaLigacaoNova = nrMaxDiasParaLigacaoNova;
    }

    public Integer getNrMaxDiasParaLigacaoNovaEsgoto() {
        return nrMaxDiasParaLigacaoNovaEsgoto;
    }

    public void setNrMaxDiasParaLigacaoNovaEsgoto(Integer nrMaxDiasParaLigacaoNovaEsgoto) {
        this.nrMaxDiasParaLigacaoNovaEsgoto = nrMaxDiasParaLigacaoNovaEsgoto;
    }

    public Boolean getCobrarConsNaoFatProxCicloAgua() {
        return cobrarConsNaoFatProxCicloAgua;
    }

    public void setCobrarConsNaoFatProxCicloAgua(Boolean cobrarConsNaoFatProxCicloAgua) {
        this.cobrarConsNaoFatProxCicloAgua = cobrarConsNaoFatProxCicloAgua;
    }

    public Boolean getCobrarConsNaoFatProxCicloEsgoto() {
        return cobrarConsNaoFatProxCicloEsgoto;
    }

    public void setCobrarConsNaoFatProxCicloEsgoto(Boolean cobrarConsNaoFatProxCicloEsgoto) {
        this.cobrarConsNaoFatProxCicloEsgoto = cobrarConsNaoFatProxCicloEsgoto;
    }

    public boolean isCobrarMediaLeituraAtualIgualAnterior() {
        return cobrarMediaLeituraAtualIgualAnterior;
    }

    public void setCobrarMediaLeituraAtualIgualAnterior(boolean cobrarMediaLeituraAtualIgualAnterior) {
        this.cobrarMediaLeituraAtualIgualAnterior = cobrarMediaLeituraAtualIgualAnterior;
    }

    public Boolean getCobrarMediaLeituraAtualMenorAnterior() {
        return cobrarMediaLeituraAtualMenorAnterior;
    }

    public void setCobrarMediaLeituraAtualMenorAnterior(Boolean cobrarMediaLeituraAtualMenorAnterior) {
        this.cobrarMediaLeituraAtualMenorAnterior = cobrarMediaLeituraAtualMenorAnterior;
    }

    public Boolean getCobrarMediaLeituraAtualMenorAnteriorCortada() {
        return cobrarMediaLeituraAtualMenorAnteriorCortada;
    }

    public void setCobrarMediaLeituraAtualMenorAnteriorCortada(Boolean cobrarMediaLeituraAtualMenorAnteriorCortada) {
        this.cobrarMediaLeituraAtualMenorAnteriorCortada = cobrarMediaLeituraAtualMenorAnteriorCortada;
    }

    public boolean isImprimirReaviso() {
        return imprimirReaviso;
    }

    public void setImprimirReaviso(boolean imprimirReaviso) {
        this.imprimirReaviso = imprimirReaviso;
    }

    public boolean isImprimirFaturaValorZero() {
        return imprimirFaturaValorZero;
    }

    public void setImprimirFaturaValorZero(boolean imprimirFaturaValorZero) {
        this.imprimirFaturaValorZero = imprimirFaturaValorZero;
    }

    public boolean isImprimirInfoFaturaParaDebitoAutomatico() {
        return imprimirInfoFaturaParaDebitoAutomatico;
    }

    public void setImprimirInfoFaturaParaDebitoAutomatico(boolean imprimirInfoFaturaParaDebitoAutomatico) {
        this.imprimirInfoFaturaParaDebitoAutomatico = imprimirInfoFaturaParaDebitoAutomatico;
    }

    public int getLayoutCodigoBarras() {
        return layoutCodigoBarras;
    }

    public void setLayoutCodigoBarras(int layoutCodigoBarras) {
        this.layoutCodigoBarras = layoutCodigoBarras;
    }

    public String getIdentificacaoFebrabanEmpresa1() {
        return identificacaoFebrabanEmpresa1;
    }

    public void setIdentificacaoFebrabanEmpresa1(String identificacaoFebrabanEmpresa1) {
        this.identificacaoFebrabanEmpresa1 = identificacaoFebrabanEmpresa1;
    }

    public DefinicaoEmpresaCampoLivre getDefinicaoEmpresaCampoLivre() {
        return definicaoEmpresaCampoLivre;
    }

    public void setDefinicaoEmpresaCampoLivre(DefinicaoEmpresaCampoLivre definicaoEmpresaCampoLivre) {
        this.definicaoEmpresaCampoLivre = definicaoEmpresaCampoLivre;
    }

    public boolean isAplicarCreditoPorEmpresa() {
        return aplicarCreditoPorEmpresa;
    }

    public void setAplicarCreditoPorEmpresa(boolean aplicarCreditoPorEmpresa) {
        this.aplicarCreditoPorEmpresa = aplicarCreditoPorEmpresa;
    }

    public int getRegraCalculoFaturamento() {
        return regraCalculoFaturamento;
    }

    public void setRegraCalculoFaturamento(int regraCalculoFaturamento) {
        this.regraCalculoFaturamento = regraCalculoFaturamento;
    }

    public int getCriterioCalculoDiasConsumo() {
        return criterioCalculoDiasConsumo;
    }

    public void setCriterioCalculoDiasConsumo(int criterioCalculoDiasConsumo) {
        this.criterioCalculoDiasConsumo = criterioCalculoDiasConsumo;
    }

    public int getLayoutImpressao() {
        return layoutImpressao;
    }

    public void setLayoutImpressao(int layoutImpressao) {
        this.layoutImpressao = layoutImpressao;
    }

    public String getDescricaoTotalColuna1() {
        return descricaoTotalColuna1;
    }

    public void setDescricaoTotalColuna1(String descricaoTotalColuna1) {
        this.descricaoTotalColuna1 = descricaoTotalColuna1;
    }

    public String getDescricaoTotalColuna2() {
        return descricaoTotalColuna2;
    }

    public void setDescricaoTotalColuna2(String descricaoTotalColuna2) {
        this.descricaoTotalColuna2 = descricaoTotalColuna2;
    }

    public boolean isLimitarQuantidadeDigitosLeitura() {
        return limitarQuantidadeDigitosLeitura;
    }

    public void setLimitarQuantidadeDigitosLeitura(boolean limitarQuantidadeDigitosLeitura) {
        this.limitarQuantidadeDigitosLeitura = limitarQuantidadeDigitosLeitura;
    }

    public boolean isPermitirRefazerLeitura() {
        return permitirRefazerLeitura;
    }

    public void setPermitirRefazerLeitura(boolean permitirRefazerLeitura) {
        this.permitirRefazerLeitura = permitirRefazerLeitura;
    }

    public int getCodigoIDCriticaReterConta() {
        return codigoIDCriticaReterConta;
    }

    public void setCodigoIDCriticaReterConta(int codigoIDCriticaReterConta) {
        this.codigoIDCriticaReterConta = codigoIDCriticaReterConta;
    }

    public Integer getCodigoIDCriticaRetForcada() {
        return codigoIDCriticaRetForcada;
    }

    public void setCodigoIDCriticaRetForcada(Integer codigoIDCriticaRetForcada) {
        this.codigoIDCriticaRetForcada = codigoIDCriticaRetForcada;
    }

    public List<MensagemReaviso> getMensagemReaviso() {
        return mensagemReaviso;
    }

    public void setMensagemReaviso(List<MensagemReaviso> mensagemReaviso) {
        this.mensagemReaviso = mensagemReaviso;
    }

    public List<MensagemAvisoRetencao> getMensagemAvisoRetencao() {
        return mensagemAvisoRetencao;
    }

    public List<MensagemComunicadoDebito> getMensagemComunicadoDebito() {
        return mensagemComunicadoDebito;
    }

    public void setMensagemAvisoRetencao(List<MensagemAvisoRetencao> mensagemAvisoRetencao) {
        this.mensagemAvisoRetencao = mensagemAvisoRetencao;
    }

    public void setMensagemComunicadoDebito(List<MensagemComunicadoDebito> mensagemComunicadoDebito) {
        this.mensagemComunicadoDebito = mensagemComunicadoDebito;
    }

    public List<MensagemDeclaracaoAnual> getMensagemDeclaracaoAnual() {
        return mensagemDeclaracaoAnual;
    }

    public void setMensagemDeclaracaoAnual(List<MensagemDeclaracaoAnual> mensagemDeclaracaoAnual) {
        this.mensagemDeclaracaoAnual = mensagemDeclaracaoAnual;
    }

    public List<MensagemAvisoRetencaoVazamento> getMensagemAvisoRetencaoVazamento() {
        return mensagemAvisoRetencaoVazamento;
    }

    public void setMensagemAvisoRetencaoVazamento(List<MensagemAvisoRetencaoVazamento> mensagemAvisoRetencaoVazamento) {
        this.mensagemAvisoRetencaoVazamento = mensagemAvisoRetencaoVazamento;
    }

    public boolean isImprimirDiasConsumo() {
        return imprimirDiasConsumo;
    }

    public void setImprimirDiasConsumo(boolean imprimirDiasConsumo) {
        this.imprimirDiasConsumo = imprimirDiasConsumo;
    }

    public boolean isImprimirDiasFaturado() {
        return imprimirDiasFaturado;
    }

    public void setImprimirDiasFaturado(boolean imprimirDiasFaturado) {
        this.imprimirDiasFaturado = imprimirDiasFaturado;
    }

    public boolean isImprimirConsumoFaturado() {
        return imprimirConsumoFaturado;
    }

    public void setImprimirConsumoFaturado(boolean imprimirConsumoFaturado) {
        this.imprimirConsumoFaturado = imprimirConsumoFaturado;
    }

    public boolean isImprimirConsumoFaturadoPorProduto() {
        return imprimirConsumoFaturadoPorProduto;
    }

    public void setImprimirConsumoFaturadoPorProduto(boolean imprimirConsumoFaturadoPorProduto) {
        this.imprimirConsumoFaturadoPorProduto = imprimirConsumoFaturadoPorProduto;
    }

    public boolean isImprimirNumeroLacreMedidor() {
        return imprimirNumeroLacreMedidor;
    }

    public void setImprimirNumeroLacreMedidor(boolean imprimirNumeroLacreMedidor) {
        this.imprimirNumeroLacreMedidor = imprimirNumeroLacreMedidor;
    }

    public String getDescricaoVolumeFaturado() {
        return descricaoVolumeFaturado;
    }

    public void setDescricaoVolumeFaturado(String descricaoVolumeFaturado) {
        this.descricaoVolumeFaturado = descricaoVolumeFaturado;
    }

    public BigDecimal getFatorTolerancia() {
        return fatorTolerancia;
    }

    public void setFatorTolerancia(BigDecimal fatorTolerancia) {
        this.fatorTolerancia = fatorTolerancia;
    }

    public BigDecimal getPercToleranciaHM() {
        return percToleranciaHM;
    }

    public void setPercToleranciaHM(BigDecimal percToleranciaHM) {
        this.percToleranciaHM = percToleranciaHM;
    }

    public Boolean getImprimirRelatorioLeituras() {
        return imprimirRelatorioLeituras;
    }

    public void setImprimirRelatorioLeituras(Boolean imprimirRelatorioLeituras) {
        this.imprimirRelatorioLeituras = imprimirRelatorioLeituras;
    }

    public Integer getIntervaloImpressaoRelatorioLeituras() {
        return intervaloImpressaoRelatorioLeituras;
    }

    public void setIntervaloImpressaoRelatorioLeituras(Integer intervaloImpressaoRelatorioLeituras) {
        this.intervaloImpressaoRelatorioLeituras = intervaloImpressaoRelatorioLeituras;
    }

    public Integer getDiasConsumoLimite() {
        return diasConsumoLimite;
    }

    public void setDiasConsumoLimite(Integer diasConsumoLimite) {
        this.diasConsumoLimite = diasConsumoLimite;
    }

    public Boolean getGpsHabilitado() {
        return gpsHabilitado;
    }

    public void setGpsHabilitado(Boolean gpsHabilitado) {
        this.gpsHabilitado = gpsHabilitado;
    }

    public Boolean getLeituraPorTelemetria() {
        return leituraPorTelemetria;
    }

    public void setLeituraPorTelemetria(Boolean leituraPorTelemetria) {
        this.leituraPorTelemetria = leituraPorTelemetria;
    }

    public Boolean getImprimirDetalheRubricaAgrupada() {
        return imprimirDetalheRubricaAgrupada;
    }

    public void setImprimirDetalheRubricaAgrupada(Boolean imprimirDetalheRubricaAgrupada) {
        this.imprimirDetalheRubricaAgrupada = imprimirDetalheRubricaAgrupada;
    }

    public Integer getQtdeMaxPorPaginaRubricaAnalitico() {
        return qtdeMaxPorPaginaRubricaAnalitico;
    }

    public void setQtdeMaxPorPaginaRubricaAnalitico(Integer qtdeMaxPorPaginaRubricaAnalitico) {
        this.qtdeMaxPorPaginaRubricaAnalitico = qtdeMaxPorPaginaRubricaAnalitico;
    }

    public Boolean getObrigatorioConfirmarEntregaAvisoDebito() {
        return obrigatorioConfirmarEntregaAvisoDebito;
    }

    public void setObrigatorioConfirmarEntregaAvisoDebito(Boolean obrigatorioConfirmarEntregaAvisoDebito) {
        this.obrigatorioConfirmarEntregaAvisoDebito = obrigatorioConfirmarEntregaAvisoDebito;
    }

    public Boolean getAgruparRecursoHidrico() {
        return agruparRecursoHidrico;
    }

    public void setAgruparRecursoHidrico(Boolean agruparRecursoHidrico) {
        this.agruparRecursoHidrico = agruparRecursoHidrico;
    }

    public Integer getCodigoObservacaoCortadoSemLeitura() {
        return codigoObservacaoCortadoSemLeitura;
    }

    public void setCodigoObservacaoCortadoSemLeitura(Integer codigoObservacaoCortadoSemLeitura) {
        this.codigoObservacaoCortadoSemLeitura = codigoObservacaoCortadoSemLeitura;
    }

    public Boolean getObrigarLeituraEmLigacaoCortada() {
        return obrigarLeituraEmLigacaoCortada;
    }

    public void setObrigarLeituraEmLigacaoCortada(Boolean obrigarLeituraEmLigacaoCortada) {
        this.obrigarLeituraEmLigacaoCortada = obrigarLeituraEmLigacaoCortada;
    }

    public String getTituloFaturaMensal() {
        return tituloFaturaMensal;
    }

    public void setTituloFaturaMensal(String tituloFaturaMensal) {
        this.tituloFaturaMensal = tituloFaturaMensal;
    }

    public String getTituloReavisoDebito() {
        return tituloReavisoDebito;
    }

    public void setTituloReavisoDebito(String tituloReavisoDebito) {
        this.tituloReavisoDebito = tituloReavisoDebito;
    }

    public String getTituloNotificacaoCorte() {
        return tituloNotificacaoCorte;
    }

    public void setTituloNotificacaoCorte(String tituloNotificacaoCorte) {
        this.tituloNotificacaoCorte = tituloNotificacaoCorte;
    }

    public String getTituloMensagemCanhotoCEDAE() {
        return tituloMensagemCanhotoCEDAE;
    }

    public void setTituloMensagemCanhotoCEDAE(String tituloMensagemCanhotoCEDAE) {
        this.tituloMensagemCanhotoCEDAE = tituloMensagemCanhotoCEDAE;
    }

    public String getMensagemTributosOlhoNoImposto() {
        return mensagemTributosOlhoNoImposto;
    }

    public void setMensagemTributosOlhoNoImposto(String mensagemTributosOlhoNoImposto) {
        this.mensagemTributosOlhoNoImposto = mensagemTributosOlhoNoImposto;
    }

    public Boolean getImprimirReavisoNoAvisoRetencao() {
        return imprimirReavisoNoAvisoRetencao;
    }

    public void setImprimirReavisoNoAvisoRetencao(Boolean imprimirReavisoNoAvisoRetencao) {
        this.imprimirReavisoNoAvisoRetencao = imprimirReavisoNoAvisoRetencao;
    }

    public List<GenericoVO> getTipofaturamento() {
        return tipofaturamento;
    }

    public void setTipofaturamento(List<GenericoVO> tipofaturamento) {
        this.tipofaturamento = tipofaturamento;
    }

    public List<GenericoVO> getTipoligacao() {
        return tipoligacao;
    }

    public void setTipoligacao(List<GenericoVO> tipoligacao) {
        this.tipoligacao = tipoligacao;
    }

    public List<GenericoVO> getCobrancafase() {
        return cobrancafase;
    }

    public void setCobrancafase(List<GenericoVO> cobrancafase) {
        this.cobrancafase = cobrancafase;
    }

    public List<GenericoVO> getSituacaoLigacao() {
        return situacaoLigacao;
    }

    public void setSituacaoLigacao(List<GenericoVO> situacaoLigacao) {
        this.situacaoLigacao = situacaoLigacao;
    }

    public int getTempoColetaCoordenadasLeitura() {
        return tempoColetaCoordenadasLeitura;
    }

    public void setTempoColetaCoordenadasLeitura(int tempoColetaCoordenadasLeitura) {
        this.tempoColetaCoordenadasLeitura = tempoColetaCoordenadasLeitura;
    }

    public int getTempoEnvioMedicao() {
        return tempoEnvioMedicao;
    }

    public void setTempoEnvioMedicao(int tempoEnvioMedicao) {
        this.tempoEnvioMedicao = tempoEnvioMedicao;
    }

    public int getQtdMedicaoEnvio() {
        return qtdMedicaoEnvio;
    }

    public void setQtdMedicaoEnvio(int qtdMedicaoEnvio) {
        this.qtdMedicaoEnvio = qtdMedicaoEnvio;
    }

    public boolean isCobrarServicoLigCortada() {
        return cobrarServicoLigCortada;
    }

    public void setCobrarServicoLigCortada(boolean cobrarServicoLigCortada) {
        this.cobrarServicoLigCortada = cobrarServicoLigCortada;
    }

    public boolean isDebitoConsumidor() {
        return debitoConsumidor;
    }

    public void setDebitoConsumidor(boolean debitoConsumidor) {
        this.debitoConsumidor = debitoConsumidor;
    }

}
