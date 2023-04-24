package com.inimasmart.app.model.dadoscarga;

import com.inimasmart.app.model.vo.FaturaVO;
import com.inimasmart.app.model.vo.PesquisaMedicaoCargaVO;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private int codigo;
    private String digito;
    private String digitoVerificadorOrigem;
    private String nome;
    private String documentoCliente;
    private String hidrometro;
    private BigInteger numeroPonteiroHD;
    private int codigoLogradouro;
    private int codigoBairro;
    private String numero;
    private String complemento;
    private String cep;
    private int inscricaoImoboliariaGrupo;
    private int inscricaoImoboliariaSetor;
    private int inscricaoImoboliariaRota;
    private int inscricaoImoboliariaQuadra;
    private int inscricaoImoboliariaLocal;
    private int inscricaoImoboliariaCavalete;
    private int inscricaoImoboliariaLote;
    private String roteirizacao;
    private String rota;
    private String dataLeituraAnterior;
    private int leituraAnterior;
    private int consumoResidual;
    private Integer leituraCorte;
    private List<ConsumoAnterior> consumoAnterior = new ArrayList<>();
    private int media;
    private BigDecimal consumoMedioFaturado;
    private BigDecimal consumoEstimado;
    private List<PesquisaMedicaoCargaVO> pesquisasMedicao;
    private Integer idSituacaoLigacao;

    private BigDecimal creditoAcumulado;
    private BigDecimal creditoPAA;

    private DebitoConta debitoConta;
    private FaturaVO fatura;
    private ReavisoDebitoPendente reavisoDebitoPendente;
    private List<ReferenciaPendente> referenciaPendente = new ArrayList<ReferenciaPendente>();
    private String mensagemDebitosAnterioresImpresso;
    private String mensagemDebitosAnteriores;
    private List<ProdutoCliente> produtoCliente = new ArrayList<>();
    private String dataLigacao;
    private String dataLigacaoEsgoto;
    private String dataTrocaMedidor;
    private boolean ligacaoNova;
    private Boolean ligacaoNovaEsgoto;
    private boolean ligacaoCortada;
    private boolean ligacaoEstimada;
    private boolean ligacaoIsenta;
    //Consolidacao de Arrecadacao
    private Boolean ligacaoConsolidadaArrecadacao;

    //Consolidacao de Faturamento ou de Consumo
    private Boolean ligacaoConsolidada;
    private Integer codigoDistrito;
    private Boolean ligacaoConsolidadora;


    public Boolean getLigacaoConsolidada() {
        return ligacaoConsolidada;
    }

    public void setLigacaoConsolidada(Boolean ligacaoConsolidada) {
        this.ligacaoConsolidada = ligacaoConsolidada;
    }

    public String getTipoConsolidacao() {
        return tipoConsolidacao;
    }

    public void setTipoConsolidacao(String tipoConsolidacao) {
        this.tipoConsolidacao = tipoConsolidacao;
    }

    public Integer getIdLigacaoConsolidadora() {
        return idLigacaoConsolidadora;
    }

    public void setIdLigacaoConsolidadora(Integer idLigacaoConsolidadora) {
        this.idLigacaoConsolidadora = idLigacaoConsolidadora;
    }

    private String tipoConsolidacao;
    private Integer idLigacaoConsolidadora;


    private Boolean ligacaoAutoLeitura;
    private List<Servico> servico = new ArrayList<>();
    private String dataVencimento;
    private boolean enderecoAlternativo;
    private boolean avisoExecucaoCorteLight;
    private Integer idLigacaoProcessoCorteLight;
    private int codigoFonteAbastecimento;
    private List<MensagemPrevencaoAcidente> mensagemPrevencaoAcidente = new ArrayList<>();
    private List<MensagemFatura> mensagemFatura = new ArrayList<>();
    private List<MensagemPendenciaFatura> mensagemPendenciaFatura = new ArrayList<>();
    private Boolean reterConta;
    private String reterContaMsg;
    private Boolean imprimeCodBarras;
    private String mensagemAlternativaCodBarras;
    private String categoriaImpressao;
    private String numeroLacreMedidor;
    private Boolean projetarConsumo;
    private String descrSituacaoCavalete;
    private String msgCampanhaInformativa;
    private List<DetalheRubricaAgrupadaImpressao> detalheRubricaAgrupadaImpressao = new ArrayList<>();
    private List<DadosSubCategoriaAtual> dadosSubCategoriaAtual = new ArrayList<>();
    private Boolean trocaHidrometro;
    private Integer codigoTipoFaturamento;
    private Boolean imovelDesabitado;
    private List<FaturaEntregaAlternativa> faturaEntregaAlternativa = new ArrayList<>();
    private int idMedicaoDetalhe;
    private Integer sequencia;

    public List<PesquisaMedicaoCargaVO> getPesquisasMedicao() {
        return pesquisasMedicao;
    }

    public void setPesquisasMedicao(List<PesquisaMedicaoCargaVO> pesquisas) {
        this.pesquisasMedicao = pesquisas;
    }

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

    public int getCodigoLogradouro() {
        return codigoLogradouro;
    }

    public void setCodigoLogradouro(int codigoLogradouro) {
        this.codigoLogradouro = codigoLogradouro;
    }

    public int getCodigoBairro() {
        return codigoBairro;
    }

    public void setCodigoBairro(int codigoBairro) {
        this.codigoBairro = codigoBairro;
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

    public String getDataLeituraAnterior() {
        return dataLeituraAnterior;
    }

    public void setDataLeituraAnterior(String dataLeituraAnterior) {
        this.dataLeituraAnterior = dataLeituraAnterior;
    }

    public int getLeituraAnterior() {
        return leituraAnterior;
    }

    public void setLeituraAnterior(int leituraAnterior) {
        this.leituraAnterior = leituraAnterior;
    }

    public int getConsumoResidual() {
        return consumoResidual;
    }

    public void setConsumoResidual(int consumoResidual) {
        this.consumoResidual = consumoResidual;
    }

    public Integer getLeituraCorte() {
        return leituraCorte;
    }

    public void setLeituraCorte(Integer leituraCorte) {
        this.leituraCorte = leituraCorte;
    }

    public List<ConsumoAnterior> getConsumoAnterior() {
        return consumoAnterior;
    }

    public void setConsumoAnterior(List<ConsumoAnterior> consumoAnterior) {
        this.consumoAnterior = consumoAnterior;
    }

    public int getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }

    public BigDecimal getConsumoMedioFaturado() {
        return consumoMedioFaturado;
    }

    public void setConsumoMedioFaturado(BigDecimal consumoMedioFaturado) {
        this.consumoMedioFaturado = consumoMedioFaturado;
    }

    public BigDecimal getConsumoEstimado() {
        return consumoEstimado;
    }

    public void setConsumoEstimado(BigDecimal consumoEstimado) {
        this.consumoEstimado = consumoEstimado;
    }

    public BigDecimal getCreditoAcumulado() {
        return creditoAcumulado;
    }

    public void setCreditoAcumulado(BigDecimal creditoAcumulado) {
        this.creditoAcumulado = creditoAcumulado;
    }

    public DebitoConta getDebitoConta() {
        return debitoConta;
    }

    public void setDebitoConta(DebitoConta debitoConta) {
        this.debitoConta = debitoConta;
    }

    public FaturaVO getFatura() {
        return fatura;
    }

    public void setFatura(FaturaVO fatura) {
        this.fatura = fatura;
    }

    public ReavisoDebitoPendente getReavisoDebitoPendente() {
        return reavisoDebitoPendente;
    }

    public void setReavisoDebitoPendente(ReavisoDebitoPendente reavisoDebitoPendente) {
        this.reavisoDebitoPendente = reavisoDebitoPendente;
    }

    public List<ReferenciaPendente> getReferenciaPendente() {
        return referenciaPendente;
    }

    public void setReferenciaPendente(List<ReferenciaPendente> referenciaPendente) {
        this.referenciaPendente = referenciaPendente;
    }

    public String getMensagemDebitosAnterioresImpresso() {
        return mensagemDebitosAnterioresImpresso;
    }

    public void setMensagemDebitosAnterioresImpresso(String mensagemDebitosAnterioresImpresso) {
        this.mensagemDebitosAnterioresImpresso = mensagemDebitosAnterioresImpresso;
    }

    public String getMensagemDebitosAnteriores() {
        return mensagemDebitosAnteriores;
    }

    public void setMensagemDebitosAnteriores(String mensagemDebitosAnteriores) {
        this.mensagemDebitosAnteriores = mensagemDebitosAnteriores;
    }

    public List<ProdutoCliente> getProdutoCliente() {
        return produtoCliente;
    }

    public void setProdutoCliente(List<ProdutoCliente> produtoCliente) {
        this.produtoCliente = produtoCliente;
    }

    public String getDataLigacao() {
        return dataLigacao;
    }

    public void setDataLigacao(String dataLigacao) {
        this.dataLigacao = dataLigacao;
    }

    public String getDataLigacaoEsgoto() {
        return dataLigacaoEsgoto;
    }

    public void setDataLigacaoEsgoto(String dataLigacaoEsgoto) {
        this.dataLigacaoEsgoto = dataLigacaoEsgoto;
    }

    public String getDataTrocaMedidor() {
        return dataTrocaMedidor;
    }

    public void setDataTrocaMedidor(String dataTrocaMedidor) {
        this.dataTrocaMedidor = dataTrocaMedidor;
    }

    public boolean isLigacaoNova() {
        return ligacaoNova;
    }

    public void setLigacaoNova(boolean ligacaoNova) {
        this.ligacaoNova = ligacaoNova;
    }

    public Boolean getLigacaoNovaEsgoto() {
        return ligacaoNovaEsgoto;
    }

    public void setLigacaoNovaEsgoto(Boolean ligacaoNovaEsgoto) {
        this.ligacaoNovaEsgoto = ligacaoNovaEsgoto;
    }

    public boolean isLigacaoCortada() {
        return ligacaoCortada;
    }

    public void setLigacaoCortada(boolean ligacaoCortada) {
        this.ligacaoCortada = ligacaoCortada;
    }

    public boolean isLigacaoEstimada() {
        return ligacaoEstimada;
    }

    public void setLigacaoEstimada(boolean ligacaoEstimada) {
        this.ligacaoEstimada = ligacaoEstimada;
    }

    public boolean isLigacaoIsenta() {
        return ligacaoIsenta;
    }

    public void setLigacaoIsenta(boolean ligacaoIsenta) {
        this.ligacaoIsenta = ligacaoIsenta;
    }


    public Boolean getLigacaoAutoLeitura() {
        return ligacaoAutoLeitura;
    }

    public void setLigacaoAutoLeitura(Boolean ligacaoAutoLeitura) {
        this.ligacaoAutoLeitura = ligacaoAutoLeitura;
    }

    public List<Servico> getServico() {
        return servico;
    }

    public void setServico(List<Servico> servico) {
        this.servico = servico;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public boolean isEnderecoAlternativo() {
        return enderecoAlternativo;
    }

    public void setEnderecoAlternativo(boolean enderecoAlternativo) {
        this.enderecoAlternativo = enderecoAlternativo;
    }

    public boolean isAvisoExecucaoCorteLight() {
        return avisoExecucaoCorteLight;
    }

    public void setAvisoExecucaoCorteLight(boolean avisoExecucaoCorteLight) {
        this.avisoExecucaoCorteLight = avisoExecucaoCorteLight;
    }

    public Integer getIdLigacaoProcessoCorteLight() {
        return idLigacaoProcessoCorteLight;
    }

    public void setIdLigacaoProcessoCorteLight(Integer idLigacaoProcessoCorteLight) {
        this.idLigacaoProcessoCorteLight = idLigacaoProcessoCorteLight;
    }

    public int getCodigoFonteAbastecimento() {
        return codigoFonteAbastecimento;
    }

    public void setCodigoFonteAbastecimento(int codigoFonteAbastecimento) {
        this.codigoFonteAbastecimento = codigoFonteAbastecimento;
    }

    public List<MensagemPrevencaoAcidente> getMensagemPrevencaoAcidente() {
        return mensagemPrevencaoAcidente;
    }

    public void setMensagemPrevencaoAcidente(List<MensagemPrevencaoAcidente> mensagemPrevencaoAcidente) {
        this.mensagemPrevencaoAcidente = mensagemPrevencaoAcidente;
    }

    public List<MensagemFatura> getMensagemFatura() {
        return mensagemFatura;
    }

    public void setMensagemFatura(List<MensagemFatura> mensagemFatura) {
        this.mensagemFatura = mensagemFatura;
    }

    public List<MensagemPendenciaFatura> getMensagemPendenciaFatura() {
        return mensagemPendenciaFatura;
    }

    public void setMensagemPendenciaFatura(List<MensagemPendenciaFatura> mensagemPendenciaFatura) {
        this.mensagemPendenciaFatura = mensagemPendenciaFatura;
    }

    public Boolean getReterConta() {
        return reterConta;
    }

    public void setReterConta(Boolean reterConta) {
        this.reterConta = reterConta;
    }

    public String getReterContaMsg() {
        return reterContaMsg;
    }

    public void setReterContaMsg(String reterContaMsg) {
        this.reterContaMsg = reterContaMsg;
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

    public String getCategoriaImpressao() {
        return categoriaImpressao;
    }

    public void setCategoriaImpressao(String categoriaImpressao) {
        this.categoriaImpressao = categoriaImpressao;
    }

    public String getNumeroLacreMedidor() {
        return numeroLacreMedidor;
    }

    public void setNumeroLacreMedidor(String numeroLacreMedidor) {
        this.numeroLacreMedidor = numeroLacreMedidor;
    }

    public Boolean getProjetarConsumo() {
        return projetarConsumo;
    }

    public void setProjetarConsumo(Boolean projetarConsumo) {
        this.projetarConsumo = projetarConsumo;
    }

    public String getDescrSituacaoCavalete() {
        return descrSituacaoCavalete;
    }

    public void setDescrSituacaoCavalete(String descrSituacaoCavalete) {
        this.descrSituacaoCavalete = descrSituacaoCavalete;
    }

    public String getMsgCampanhaInformativa() {
        return msgCampanhaInformativa;
    }

    public void setMsgCampanhaInformativa(String msgCampanhaInformativa) {
        this.msgCampanhaInformativa = msgCampanhaInformativa;
    }

    public List<DetalheRubricaAgrupadaImpressao> getDetalheRubricaAgrupadaImpressao() {
        return detalheRubricaAgrupadaImpressao;
    }

    public void setDetalheRubricaAgrupadaImpressao(List<DetalheRubricaAgrupadaImpressao> detalheRubricaAgrupadaImpressao) {
        this.detalheRubricaAgrupadaImpressao = detalheRubricaAgrupadaImpressao;
    }

    public List<DadosSubCategoriaAtual> getDadosSubCategoriaAtual() {
        return dadosSubCategoriaAtual;
    }

    public void setDadosSubCategoriaAtual(List<DadosSubCategoriaAtual> dadosSubCategoriaAtual) {
        this.dadosSubCategoriaAtual = dadosSubCategoriaAtual;
    }

    public Boolean getTrocaHidrometro() {
        return trocaHidrometro;
    }

    public void setTrocaHidrometro(Boolean trocaHidrometro) {
        this.trocaHidrometro = trocaHidrometro;
    }

    public Integer getCodigoTipoFaturamento() {
        return codigoTipoFaturamento;
    }

    public void setCodigoTipoFaturamento(Integer codigoTipoFaturamento) {
        this.codigoTipoFaturamento = codigoTipoFaturamento;
    }

    public Boolean getImovelDesabitado() {
        return imovelDesabitado;
    }

    public void setImovelDesabitado(Boolean imovelDesabitado) {
        this.imovelDesabitado = imovelDesabitado;
    }

    public List<FaturaEntregaAlternativa> getFaturaEntregaAlternativa() {
        return faturaEntregaAlternativa;
    }

    public void setFaturaEntregaAlternativa(List<FaturaEntregaAlternativa> faturaEntregaAlternativa) {
        this.faturaEntregaAlternativa = faturaEntregaAlternativa;
    }

    public BigDecimal getCreditoPAA() {
        return creditoPAA;
    }

    public void setCreditoPAA(BigDecimal creditoPAA) {
        this.creditoPAA = creditoPAA;
    }


    public Integer getIdSituacaoLigacao() {
        return idSituacaoLigacao;
    }

    public void setIdSituacaoLigacao(Integer idSituacaoLigacao) {
        this.idSituacaoLigacao = idSituacaoLigacao;
    }

    public int getIdMedicaoDetalhe() {
        return idMedicaoDetalhe;
    }

    public void setIdMedicaoDetalhe(int idMedicaoDetalhe) {
        this.idMedicaoDetalhe = idMedicaoDetalhe;
    }

    public Integer getSequencia() {
        return sequencia;
    }

    public void setSequencia(Integer sequencia) {
        this.sequencia = sequencia;
    }

    public Boolean getLigacaoConsolidadaArrecadacao() {
        return ligacaoConsolidadaArrecadacao;
    }

    public void setLigacaoConsolidadaArrecadacao(Boolean ligacaoConsolidadaArrecadacao) {
        this.ligacaoConsolidadaArrecadacao = ligacaoConsolidadaArrecadacao;
    }

    public int getInscricaoImoboliariaLote() {
        return inscricaoImoboliariaLote;
    }

    public void setInscricaoImoboliariaLote(int inscricaoImoboliariaLote) {
        this.inscricaoImoboliariaLote = inscricaoImoboliariaLote;
    }

    public Integer getCodigoDistrito() {
        return codigoDistrito;
    }

    public void setCodigoDistrito(Integer codigoDistrito) {
        this.codigoDistrito = codigoDistrito;
    }

    public Boolean getLigacaoConsolidadora() {
        return ligacaoConsolidadora;
    }

    public void setLigacaoConsolidadora(Boolean ligacaoConsolidadora) {
        this.ligacaoConsolidadora = ligacaoConsolidadora;
    }
}
