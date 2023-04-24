package com.inimasmart.app.model.vo;

import java.util.ArrayList;
import java.util.List;

public class ColetorDetalheVO {

    private int id = 0;
    private int idColetor = 0;
    private int idCidade = 0;
    private int idGrupo = 0;
    private int idLeituraDetalhe = 0;
    private int idLeiturista = 0;
    private int seqSepRota = 0;
    private int nrAlteracaoCadastral = 0;
    private int nrColetor = 0;
    private String dataHoraRetorno = "";
    private String dataHoraAbertura = "";
    private String dataHoraFechamento = "";
    private UsuarioVO usuarioLogado;
    private String tipoLeitura = "";
    private String dataHoraLeitura = "";
    private String dataHoraUltimaLeitura = "";
    private int idLigacao = 0;
    private boolean corteLight = false;
    private boolean fiscCorte = false;
    private int tipoCorte = 0;
    private int rotaLeit = 0;
    private int quadraLeit = 0;
    private int seqLeitura = 0;
    private int subUnidLeitura = 0;
    private int idCodLeituraAnterior = 0;
    private int idCodLeituraPreRepasse = 0;
    private int leituraAnterior = 0;
    private int leituraAtual = 0;
    private int leituraReal = 0;
    private int leituraAtualRepasse =0 ;
    private int leituraAtualPreRepasse = 0;
    private int mediaConsumo = 0;
    private int mediaConsumoPreRepasse = 0;
    private int idOcorLeitura1 = -1;
    private int idOcorLeitura2 = -1;
    private int idOcorLeitura3 = -1;
    private int idOcorLeituraPreRepasse1 = 0;
    private int idOcorLeituraPreRepasse2 = 0;
    private int idOcorLeituraPreRepasse3 = 0;
    private int nrDebitos = 0;
    private double valTotDebitos = 0;
    private String logradouro = "";
    private int nrImovel = 0;
    private String complemento = "";
    private String nomeCliente = "";
    private int idDistrito = 0;
    private boolean ligacaoNova = false;
    private boolean leituraEfetuada = false;
    private boolean leituraEfetuadaPreRepasse = false;
    private String mensagensPrevencao = "";
    private int idMedidor = 0;
    private String medidor = "";
    private int idTipoEntrega = 0;
    private String categoria = "";
    private int maxIdCategoria = 0;
    private int qtdCategorias = 0;
    private int idLeituristaRepasse = 0;
    private int idCliente = 0;
    private int idTipoLigacao = 0;
    private int nrTentativas = 0;
    private boolean corteLightEfetuado = false;
    private int idLigacaoProcessoCorteLight = 0;
    private int idMotivoNaoExecCorteLight = 0;
    private boolean validado = false;
    private boolean manterDadosPreRepasse = false;
    private int idCobrancaFase = 0;
    private int idPeriodo = 0;
    private LigacaoCorteVO ligacaoCorte = null;
    private ReligacaoVO religacao = null;
    private int idTipoMacroMedidor = 0;
    private int idLigacaoMacroMedidor = 0;
    private CalculoConsumoVO calculoConsumo = new CalculoConsumoVO();
    private ColetorDetalheAlteracaoVO coletorDetalheAlteracao = null;
    private int volMedido = 0;
    private int volMedidoOri = 0;
    private int volMedidoConsolidado = 0;
    private int idCriticaMedicao = 0;
    private int idCodLeitura = 0;
    private int volFat = 0;
    private int volFatOri = 0;
    private int volFatCons = 0;
    private String anaCritEfetuada = "";
    private FaturaVO fatura ;
    private List<ColetorDetalheCategoriaVO> colColetorDetalheCategoria = new ArrayList<ColetorDetalheCategoriaVO>();
    private List<ColetorDetalheEmpresaVO> empresaCliente = new ArrayList<ColetorDetalheEmpresaVO>();
    private Double volumeEstimado = 0d;
    private Double volConsMinimo = 0d;
    private Double volConsMinimoFat = 0d;
    private String liglogradouro = "";
    private String ligtitulo = "";
    private String ligtipo = "";
    private String lignumero = "";
    private String ligbairro = "";
    private String ligcomplemento = "";
    private String ligcep = "";
    private String grupodesc = "";
    private int seq = 0;
    private int seqAnterior = 0;
    private boolean ligacaoAutoLeitura = false;
    private boolean reterConta = false;
    private int nrEconomiaCons;
    private int leituraHM = -1;
    private boolean coletarCoordenadaGPS = false;
    private String latitudeGPS = "";
    private String longitudeGPS = "";
    private double volumeReduzido = 0;
    private int nrDiasConsumo = 0;
    private String msgRetencaoForcada = "";
    private String dataInstalacaoAgua = "";
    private String dataInstalacaoEsgoto = "";
    private List<ColetorDetalheCoeficienteVO> colColetorDetalheCoeficiente = new ArrayList<ColetorDetalheCoeficienteVO>();
    private int idFonteAlternativa;
    private boolean fonteAlternativaAplicarMinimo;
    private double percentualEsgoto;
    private boolean imovelDesabitado;
    private int codigoAlarme = 0;
    private String hd = "";
    private List<ImagemVO> listFoto = new ArrayList<ImagemVO>();
    private String situacaoCavaleteNova = "";
    private boolean avisoDebitoEmitido = false;
    private int idEntregaAvisoDebito = 0;
    private int idMensagemNotificacao = 0;
    private int idLeituristaPreRepasse = 0;
    private String dataRepasse = "";
    private String horaRepasse = "";
    private String endereco = "";
    private String nome = "";
    private String ligacao = "";
    private String msgPrevencaoColetor = "";
    private boolean avisoDebitoImpressoCorretamente = false;
    private int rota;
    private Boolean enviadoColetor;
    private Boolean retornadoColetor;
    private Boolean calculoConsumoRealizado;
    private List<ColetorDetalheFaturaEntregaAlternativaVO> faturasEntregaAlternativa = new ArrayList<ColetorDetalheFaturaEntregaAlternativaVO>();
    private boolean impressoReaviso = false;
    private double valorServicoAmbiental = 0.0;
    private List<ColetorDetalheServicoDescargaVO> servicosDescarga = new ArrayList<ColetorDetalheServicoDescargaVO>();
    private List<PesquisaMedicaoCargaVO> pesquisasMedicao = new ArrayList<PesquisaMedicaoCargaVO>();

    public boolean isRecalculo() {
        return recalculo;
    }

    public void setRecalculo(boolean recalculo) {
        this.recalculo = recalculo;
    }

    boolean recalculo  = false;

    public UsuarioVO getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(UsuarioVO usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }

    public String getLigacao() {
        return ligacao;
    }

    public void setLigacao(String ligacao) {
        this.ligacao = ligacao;
    }

    public String getMsgPrevencaoColetor() {
        return msgPrevencaoColetor;
    }

    public void setMsgPrevencaoColetor(String msgPrevencaoColetor) {
        this.msgPrevencaoColetor = msgPrevencaoColetor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMaxIdCategoria() {
        return maxIdCategoria;
    }

    public void setMaxIdCategoria(int maxIdCategoria) {
        this.maxIdCategoria = maxIdCategoria;
    }

    public int getQtdCategorias() {
        return qtdCategorias;
    }

    public void setQtdCategorias(int qtdCategorias) {
        this.qtdCategorias = qtdCategorias;
    }

    public List<ColetorDetalheCategoriaVO> getColColetorDetalheCategoria() {
        return colColetorDetalheCategoria;
    }

    public void setColColetorDetalheCategoria(List<ColetorDetalheCategoriaVO> colColetorDetalheCategoria) {
        this.colColetorDetalheCategoria = colColetorDetalheCategoria;
    }

    public Double getVolumeEstimado() {
        return volumeEstimado;
    }

    public void setVolumeEstimado(Double volumeEstimado) {
        this.volumeEstimado = volumeEstimado;
    }

    public Double getVolConsMinimoFat() {
        return volConsMinimoFat;
    }

    public void setVolConsMinimoFat(Double volConsMinimoFat) {
        this.volConsMinimoFat = volConsMinimoFat;
    }

    public boolean isLigacaoAutoLeitura() {
        return ligacaoAutoLeitura;
    }

    public void setLigacaoAutoLeitura(boolean ligacaoAutoLeitura) {
        this.ligacaoAutoLeitura = ligacaoAutoLeitura;
    }

    public int getLeituraHM() {
        return leituraHM;
    }

    public void setLeituraHM(int leituraHM) {
        this.leituraHM = leituraHM;
    }

    public double getVolumeReduzido() {
        return volumeReduzido;
    }

    public void setVolumeReduzido(double volumeReduzido) {
        this.volumeReduzido = volumeReduzido;
    }

    public String getMsgRetencaoForcada() {
        return msgRetencaoForcada;
    }

    public void setMsgRetencaoForcada(String msgRetencaoForcada) {
        this.msgRetencaoForcada = msgRetencaoForcada;
    }

    public String getDataInstalacaoEsgoto() {
        return dataInstalacaoEsgoto;
    }

    public void setDataInstalacaoEsgoto(String dataInstalacaoEsgoto) {
        this.dataInstalacaoEsgoto = dataInstalacaoEsgoto;
    }

    public List<ColetorDetalheCoeficienteVO> getColColetorDetalheCoeficiente() {
        return colColetorDetalheCoeficiente;
    }

    public void setColColetorDetalheCoeficiente(List<ColetorDetalheCoeficienteVO> colColetorDetalheCoeficiente) {
        this.colColetorDetalheCoeficiente = colColetorDetalheCoeficiente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isAvisoDebitoImpressoCorretamente() {
        return avisoDebitoImpressoCorretamente;
    }

    public void setAvisoDebitoImpressoCorretamente(boolean avisoDebitoImpressoCorretamente) {
        this.avisoDebitoImpressoCorretamente = avisoDebitoImpressoCorretamente;
    }

    public List<ColetorDetalheFaturaEntregaAlternativaVO> getFaturasEntregaAlternativa() {
        return faturasEntregaAlternativa;
    }

    public void setFaturasEntregaAlternativa(List<ColetorDetalheFaturaEntregaAlternativaVO> faturasEntregaAlternativa) {
        this.faturasEntregaAlternativa = faturasEntregaAlternativa;
    }

    public String getHoraRepasse() {
        return horaRepasse;
    }

    public void setHoraRepasse(String horaRepasse) {
        this.horaRepasse = horaRepasse;
    }

    public boolean isAvisoDebitoEmitido() {
        return avisoDebitoEmitido;
    }

    public void setAvisoDebitoEmitido(boolean avisoDebitoEmitido) {
        this.avisoDebitoEmitido = avisoDebitoEmitido;
    }

    public List<ImagemVO> getListFoto() {
        return listFoto;
    }

    public void setListFoto(List<ImagemVO> listFoto) {
        this.listFoto = listFoto;
    }

    public void addLeituraCategoria(ColetorDetalheCategoriaVO i_coletorDetalheCategoria) {
        getColColetorDetalheCategoria().add(i_coletorDetalheCategoria);
    }

    public List<ColetorDetalheCategoriaVO> getLeituraCategoria() {
        return getColColetorDetalheCategoria();
    }

    public void setLeituraCategoria(List<ColetorDetalheCategoriaVO> i_coletorDetalheCategoriaVOs) {
        setColColetorDetalheCategoria(i_coletorDetalheCategoriaVOs);
    }

    public String getAnaCritEfetuada() {
        return anaCritEfetuada;
    }

    public void setAnaCritEfetuada(String anaCritEfetuada) {
        this.anaCritEfetuada = anaCritEfetuada;
    }

    public CalculoConsumoVO getCalculoConsumoVO() {
        return getCalculoConsumo();
    }

    public void setCalculoConsumoVO(CalculoConsumoVO calculoConsumoVO) {
        this.setCalculoConsumo(calculoConsumoVO);
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ColetorDetalheAlteracaoVO getLeituraAlteracao() {
        return coletorDetalheAlteracao;
    }

    public void setLeituraAlteracao(ColetorDetalheAlteracaoVO coletorDetalheAlteracao) {
        this.coletorDetalheAlteracao = coletorDetalheAlteracao;
    }

    public FaturaVO getColetorDetalheFatura() {
        return getFatura();
    }

    public void setColetorDetalheFatura(FaturaVO coletorDetalheFatura) {
        this.setFatura(coletorDetalheFatura);
    }


    public FaturaVO getLeituraFatura() {
        return getFatura();
    }

    public void setLeituraFatura(FaturaVO coletorDetalheFatura) {
        this.setFatura(coletorDetalheFatura);
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public boolean isCorteLight() {
        return corteLight;
    }

    public void setCorteLight(boolean corteLight) {
        this.corteLight = corteLight;
    }

    public boolean isCorteLightEfetuado() {
        return corteLightEfetuado;
    }

    public void setCorteLightEfetuado(boolean corteLightEfetuado) {
        this.corteLightEfetuado = corteLightEfetuado;
    }

    public int getIdLigacaoProcessoCorteLight() {
        return idLigacaoProcessoCorteLight;
    }

    public void setIdLigacaoProcessoCorteLight(int idLigacaoProcessoCorteLight) {
        this.idLigacaoProcessoCorteLight = idLigacaoProcessoCorteLight;
    }

    public String getDataHoraLeitura() {
        return dataHoraLeitura;
    }

    public void setDataHoraLeitura(String dataHoraLeitura) {
        this.dataHoraLeitura = dataHoraLeitura;
    }

    public String getDataHoraUltimaLeitura() {
        return dataHoraUltimaLeitura;
    }

    public void setDataHoraUltimaLeitura(String dataHoraUltimaLeitura) {
        this.dataHoraUltimaLeitura = dataHoraUltimaLeitura;
    }

    public List<ColetorDetalheEmpresaVO> getEmpresaCliente() {
        return empresaCliente;
    }

    public void setEmpresaCliente(List<ColetorDetalheEmpresaVO> empresaCliente) {
        this.empresaCliente = empresaCliente;
    }

    public boolean isFiscCorte() {
        return fiscCorte;
    }

    public void setFiscCorte(boolean fiscCorte) {
        this.fiscCorte = fiscCorte;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdCobrancaFase() {
        return idCobrancaFase;
    }

    public void setIdCobrancaFase(int idCobrancaFase) {
        this.idCobrancaFase = idCobrancaFase;
    }

    public int getIdCodLeitura() {
        return idCodLeitura;
    }

    public void setIdCodLeitura(int idCodLeitura) {
        this.idCodLeitura = idCodLeitura;
    }

    public int getIdCodLeituraAnterior() {
        return idCodLeituraAnterior;
    }

    public void setIdCodLeituraAnterior(int idCodLeituraAnterior) {
        this.idCodLeituraAnterior = idCodLeituraAnterior;
    }

    public int getIdCodLeituraPreRepasse() {
        return idCodLeituraPreRepasse;
    }

    public void setIdCodLeituraPreRepasse(int idCodLeituraPreRepasse) {
        this.idCodLeituraPreRepasse = idCodLeituraPreRepasse;
    }


    public int getIdCriticaMedicao() {
        return idCriticaMedicao;
    }

    public void setIdCriticaMedicao(int idCriticaMedicao) {
        this.idCriticaMedicao = idCriticaMedicao;
    }

    public int getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(int idDistrito) {
        this.idDistrito = idDistrito;
    }

    public int getIdLeituristaRepasse() {
        return idLeituristaRepasse;
    }

    public void setIdLeituristaRepasse(int idLeituristaRepasse) {
        this.idLeituristaRepasse = idLeituristaRepasse;
    }

    public int getIdLigacao() {
        return idLigacao;
    }

    public void setIdLigacao(int idLigacao) {
        this.idLigacao = idLigacao;
    }

    public int getIdLigacaoMacroMedidor() {
        return idLigacaoMacroMedidor;
    }

    public void setIdLigacaoMacroMedidor(int idLigacaoMacroMedidor) {
        this.idLigacaoMacroMedidor = idLigacaoMacroMedidor;
    }

    public int getIdMedidor() {
        return idMedidor;
    }

    public void setIdMedidor(int idMedidor) {
        this.idMedidor = idMedidor;
    }

    public int getIdMotivoNaoExecCorteLight() {
        return idMotivoNaoExecCorteLight;
    }

    public void setIdMotivoNaoExecCorteLight(int idMotivoNaoExecCorteLight) {
        this.idMotivoNaoExecCorteLight = idMotivoNaoExecCorteLight;
    }

    public int getIdOcorLeitura1() {
        return idOcorLeitura1;
    }

    public void setIdOcorLeitura1(int idOcorLeitura1) {
        this.idOcorLeitura1 = idOcorLeitura1;
    }

    public int getIdOcorLeitura2() {
        return idOcorLeitura2;
    }

    public void setIdOcorLeitura2(int idOcorLeitura2) {
        this.idOcorLeitura2 = idOcorLeitura2;
    }

    public int getIdOcorLeitura3() {
        return idOcorLeitura3;
    }

    public void setIdOcorLeitura3(int idOcorLeitura3) {
        this.idOcorLeitura3 = idOcorLeitura3;
    }

    public int getIdOcorLeituraPreRepasse1() {
        return idOcorLeituraPreRepasse1;
    }

    public void setIdOcorLeituraPreRepasse1(int idOcorLeituraPreRepasse1) {
        this.idOcorLeituraPreRepasse1 = idOcorLeituraPreRepasse1;
    }

    public int getIdOcorLeituraPreRepasse2() {
        return idOcorLeituraPreRepasse2;
    }

    public void setIdOcorLeituraPreRepasse2(int idOcorLeituraPreRepasse2) {
        this.idOcorLeituraPreRepasse2 = idOcorLeituraPreRepasse2;
    }

    public int getIdOcorLeituraPreRepasse3() {
        return idOcorLeituraPreRepasse3;
    }

    public void setIdOcorLeituraPreRepasse3(int idOcorLeituraPreRepasse3) {
        this.idOcorLeituraPreRepasse3 = idOcorLeituraPreRepasse3;
    }

    public int getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(int idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public int getIdTipoEntrega() {
        return idTipoEntrega;
    }

    public void setIdTipoEntrega(int idTipoEntrega) {
        this.idTipoEntrega = idTipoEntrega;
    }

    public int getIdTipoLigacao() {
        return idTipoLigacao;
    }

    public void setIdTipoLigacao(int idTipoLigacao) {
        this.idTipoLigacao = idTipoLigacao;
    }

    public int getIdTipoMacroMedidor() {
        return idTipoMacroMedidor;
    }

    public void setIdTipoMacroMedidor(int idTipoMacroMedidor) {
        this.idTipoMacroMedidor = idTipoMacroMedidor;
    }

    public int getLeituraAnterior() {
        return leituraAnterior;
    }

    public void setLeituraAnterior(int leituraAnterior) {
        this.leituraAnterior = leituraAnterior;
    }

    public int getLeituraAtual() {
        return leituraAtual;
    }

    public void setLeituraAtual(int leituraAtual) {
        this.leituraAtual = leituraAtual;
    }

    public int getLeituraAtualPreRepasse() {
        return leituraAtualPreRepasse;
    }

    public void setLeituraAtualPreRepasse(int leituraAtualPreRepasse) {
        this.leituraAtualPreRepasse = leituraAtualPreRepasse;
    }

    public boolean isLeituraEfetuada() {
        return leituraEfetuada;
    }

    public void setLeituraEfetuada(boolean leituraEfetuada) {
        this.leituraEfetuada = leituraEfetuada;
    }

    public boolean isLeituraEfetuadaPreRepasse() {
        return leituraEfetuadaPreRepasse;
    }

    public void setLeituraEfetuadaPreRepasse(boolean leituraEfetuadaPreRepasse) {
        this.leituraEfetuadaPreRepasse = leituraEfetuadaPreRepasse;
    }

    public int getLeituraReal() {
        return leituraReal;
    }

    public void setLeituraReal(int leituraReal) {
        this.leituraReal = leituraReal;
    }

    public LigacaoCorteVO getLigacaoCorte() {
        return ligacaoCorte;
    }

    public void setLigacaoCorte(LigacaoCorteVO ligacaoCorte) {
        this.ligacaoCorte = ligacaoCorte;
    }

    public boolean isLigacaoNova() {
        return ligacaoNova;
    }

    public void setLigacaoNova(boolean ligacaoNova) {
        this.ligacaoNova = ligacaoNova;
    }

    public String getLigbairro() {
        return ligbairro;
    }

    public void setLigbairro(String ligbairro) {
        this.ligbairro = ligbairro;
    }

    public String getLigcep() {
        return ligcep;
    }

    public void setLigcep(String ligcep) {
        this.ligcep = ligcep;
    }

    public String getGrupodesc() {
        return grupodesc;
    }

    public void setGrupodesc(String grupodesc) {
        this.grupodesc = grupodesc;
    }

    public String getLigcomplemento() {
        return ligcomplemento;
    }

    public void setLigcomplemento(String ligcomplemento) {
        this.ligcomplemento = ligcomplemento;
    }

    public String getLiglogradouro() {
        return liglogradouro;
    }

    public void setLiglogradouro(String liglogradouro) {
        this.liglogradouro = liglogradouro;
    }

    public String getLignumero() {
        return lignumero;
    }

    public void setLignumero(String lignumero) {
        this.lignumero = lignumero;
    }

    public String getLigtipo() {
        return ligtipo;
    }

    public void setLigtipo(String ligtipo) {
        this.ligtipo = ligtipo;
    }

    public String getLigtitulo() {
        return ligtitulo;
    }

    public void setLigtitulo(String ligtitulo) {
        this.ligtitulo = ligtitulo;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public boolean isManterDadosPreRepasse() {
        return manterDadosPreRepasse;
    }

    public void setManterDadosPreRepasse(boolean manterDadosPreRepasse) {
        this.manterDadosPreRepasse = manterDadosPreRepasse;
    }

    public int getMediaConsumo() {
        return mediaConsumo;
    }


    public void setMediaConsumo(int mediaConsumo) {
        this.mediaConsumo = mediaConsumo;
    }

    public int getMediaConsumoPreRepasse() {
        return mediaConsumoPreRepasse;
    }

    public void setMediaConsumoPreRepasse(int mediaConsumoPreRepasse) {
        this.mediaConsumoPreRepasse = mediaConsumoPreRepasse;
    }

    public String getMedidor() {
        return medidor;
    }

    public void setMedidor(String medidor) {
        this.medidor = medidor;
    }

    public String getMensagensPrevencao() {
        return mensagensPrevencao;
    }

    public void setMensagensPrevencao(String mensagensPrevencao) {
        this.mensagensPrevencao = mensagensPrevencao;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNrDebitos() {
        return nrDebitos;
    }

    public void setNrDebitos(int nrDebitos) {
        this.nrDebitos = nrDebitos;
    }

    public int getNrEconomiaCons() {
        return nrEconomiaCons;
    }

    public void setNrEconomiaCons(int nrEconomiaCons) {
        this.nrEconomiaCons = nrEconomiaCons;
    }

    public int getNrImovel() {
        return nrImovel;
    }

    public void setNrImovel(int nrImovel) {
        this.nrImovel = nrImovel;
    }

    public int getNrTentativas() {
        return nrTentativas;
    }

    public void setNrTentativas(int nrTentativas) {
        this.nrTentativas = nrTentativas;
    }

    public int getQuadraLeit() {
        return quadraLeit;
    }

    public void setQuadraLeit(int quadraLeit) {
        this.quadraLeit = quadraLeit;
    }

    public ReligacaoVO getReligacaoVO() {
        return getReligacao();
    }

    public void setReligacaoVO(ReligacaoVO religacaoVO) {
        this.setReligacao(religacaoVO);
    }

    public boolean isReterConta() {
        return reterConta;
    }

    public void setReterConta(boolean reterConta) {
        this.reterConta = reterConta;
    }

    public int getRotaLeit() {
        return rotaLeit;
    }

    public void setRotaLeit(int rotaLeit) {
        this.rotaLeit = rotaLeit;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public int getSeqAnterior() {
        return seqAnterior;
    }

    public void setSeqAnterior(int seqAnterior) {
        this.seqAnterior = seqAnterior;
    }

    public int getSeqLeitura() {
        return seqLeitura;
    }

    public void setSeqLeitura(int seqLeitura) {
        this.seqLeitura = seqLeitura;
    }

    public int getSubUnidLeitura() {
        return subUnidLeitura;
    }

    public void setSubUnidLeitura(int subUnidLeitura) {
        this.subUnidLeitura = subUnidLeitura;
    }

    public int getTipoCorte() {
        return tipoCorte;
    }

    public void setTipoCorte(int tipoCorte) {
        this.tipoCorte = tipoCorte;
    }

    public double getValTotDebitos() {
        return valTotDebitos;
    }

    public void setValTotDebitos(double valTotDebitos) {
        this.valTotDebitos = valTotDebitos;
    }

    public boolean isValidado() {
        return validado;
    }

    public void setValidado(boolean validado) {
        this.validado = validado;
    }

    public Double getVolConsMinimo() {
        return volConsMinimo;
    }

    public void setVolConsMinimo(Double volConsMinimo) {
        this.volConsMinimo = volConsMinimo;
    }

    public double getVolFat() {
        return volFat;
    }

    public void setVolFat(int volFat) {
        this.volFat = volFat;
    }

    public double getVolFatCons() {
        return volFatCons;
    }

    public void setVolFatCons(int volFatCons) {
        this.volFatCons = volFatCons;
    }

    public double getVolFatOri() {
        return volFatOri;
    }

    public void setVolFatOri(int volFatOri) {
        this.volFatOri = volFatOri;
    }

    public int getVolMedido() {
        return volMedido;
    }

    public void setVolMedido(int volMedido) {
        this.volMedido = volMedido;
    }

    public int getVolMedidoConsolidado() {
        return volMedidoConsolidado;
    }

    public void setVolMedidoConsolidado(int volMedidoConsolidado) {
        this.volMedidoConsolidado = volMedidoConsolidado;
    }

    public int getVolMedidoOri() {
        return volMedidoOri;
    }

    public void setVolMedidoOri(int volMedidoOri) {
        this.volMedidoOri = volMedidoOri;
    }

    public int getNrDiasConsumo() {
        return nrDiasConsumo;
    }

    public void setNrDiasConsumo(int nrDiasConsumo) {
        this.nrDiasConsumo = nrDiasConsumo;
    }

    public String getDataInstalacaoAgua() {
        return dataInstalacaoAgua;
    }

    public void setDataInstalacaoAgua(String dataInstalacaoAgua) {
        this.dataInstalacaoAgua = dataInstalacaoAgua;
    }

    /**
     * @return the coletarCoordenadaGPS
     */
    public boolean isColetarCoordenadaGPS() {
        return coletarCoordenadaGPS;
    }

    /**
     * @param coletarCoordenadaGPS the coletarCoordenadaGPS to set
     */
    public void setColetarCoordenadaGPS(boolean coletarCoordenadaGPS) {
        this.coletarCoordenadaGPS = coletarCoordenadaGPS;
    }

    /**
     * @return the latitudeGPS
     */
    public String getLatitudeGPS() {
        return latitudeGPS;
    }

    /**
     * @param latitudeGPS the latitudeGPS to set
     */
    public void setLatitudeGPS(String latitudeGPS) {
        this.latitudeGPS = latitudeGPS;
    }

    /**
     * @return the longitudeGPS
     */
    public String getLongitudeGPS() {
        return longitudeGPS;
    }

    /**
     * @param longitudeGPS the longitudeGPS to set
     */
    public void setLongitudeGPS(String longitudeGPS) {
        this.longitudeGPS = longitudeGPS;
    }

    public int getCodigoAlarme() {
        return codigoAlarme;
    }

    public void setCodigoAlarme(int codigoAlarme) {
        this.codigoAlarme = codigoAlarme;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public String getSituacaoCavaleteNova() {
        return situacaoCavaleteNova;
    }

    public void setSituacaoCavaleteNova(String situacaoCavaleteNova) {
        this.situacaoCavaleteNova = situacaoCavaleteNova;
    }

    public int getIdLeituristaPreRepasse() {
        return idLeituristaPreRepasse;
    }

    public void setIdLeituristaPreRepasse(int idLeituristaPreRepasse) {
        this.idLeituristaPreRepasse = idLeituristaPreRepasse;
    }

    public String getDataRepasse() {
        return dataRepasse;
    }

    public void setDataRepasse(String dataRepasse) {
        this.dataRepasse = dataRepasse;
    }

    public boolean isFonteAlternativaAplicarMinimo() {
        return fonteAlternativaAplicarMinimo;
    }

    public void setFonteAlternativaAplicarMinimo(boolean fonteAlternativaAplicarMinimo) {
        this.fonteAlternativaAplicarMinimo = fonteAlternativaAplicarMinimo;
    }

    public int getIdFonteAlternativa() {
        return idFonteAlternativa;
    }

    public void setIdFonteAlternativa(int idFonteAlternativa) {
        this.idFonteAlternativa = idFonteAlternativa;
    }

    public double getPercentualEsgoto() {
        return percentualEsgoto;
    }

    public void setPercentualEsgoto(double percentualEsgoto) {
        this.percentualEsgoto = percentualEsgoto;
    }

    public boolean isImovelDesabitado() {
        return imovelDesabitado;
    }

    public void setImovelDesabitado(boolean imovelDesabitado) {
        this.imovelDesabitado = imovelDesabitado;
    }

    public int getIdEntregaAvisoDebito() {
        return idEntregaAvisoDebito;
    }

    public void setIdEntregaAvisoDebito(int idEntregaAvisoDebito) {
        this.idEntregaAvisoDebito = idEntregaAvisoDebito;
    }

    public int getIdMensagemNotificacao() {
        return idMensagemNotificacao;
    }

    public void setIdMensagemNotificacao(int idMensagemNotificacao) {
        this.idMensagemNotificacao = idMensagemNotificacao;
    }

    public Boolean getCalculoConsumoRealizado() {
        return calculoConsumoRealizado;
    }

    public void setCalculoConsumoRealizado(Boolean calculoConsumoRealizado) {
        this.calculoConsumoRealizado = calculoConsumoRealizado;
    }

    public Boolean getEnviadoColetor() {
        return enviadoColetor;
    }

    public void setEnviadoColetor(Boolean enviadoColetor) {
        this.enviadoColetor = enviadoColetor;
    }

    public Boolean getRetornadoColetor() {
        return retornadoColetor;
    }

    public void setRetornadoColetor(Boolean retornadoColetor) {
        this.retornadoColetor = retornadoColetor;
    }

    public int getRota() {
        return rota;
    }

    public void setRota(int rota) {
        this.rota = rota;
    }

    public boolean isImpressoReaviso() {
        return impressoReaviso;
    }

    public void setImpressoReaviso(boolean impressoReaviso) {
        this.impressoReaviso = impressoReaviso;
    }

    public double getValorServicoAmbiental() {
        return valorServicoAmbiental;
    }

    public int getIdColetor() {
        return idColetor;
    }

    public void setIdColetor(int idColetor) {
        this.idColetor = idColetor;
    }

    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }

    public String getTipoLeitura() {
        return tipoLeitura;
    }

    public void setTipoLeitura(String tipoLeitura) {
        this.tipoLeitura = tipoLeitura;
    }

    public ReligacaoVO getReligacao() {
        return religacao;
    }

    public void setReligacao(ReligacaoVO religacao) {
        this.religacao = religacao;
    }

    public CalculoConsumoVO getCalculoConsumo() {
        return calculoConsumo;
    }

    public void setCalculoConsumo(CalculoConsumoVO calculoConsumo) {
        this.calculoConsumo = calculoConsumo;
    }

    public FaturaVO getFatura() {
        return fatura;
    }

    public void setFatura(FaturaVO fatura) {
        this.fatura = fatura;
    }

    public void setValorServicoAmbiental(double valorServicoAmbiental) {
        this.valorServicoAmbiental = valorServicoAmbiental;
    }

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }

    public int getIdLeituraDetalhe() {
        return idLeituraDetalhe;
    }

    public void setIdLeituraDetalhe(int idLeituraDetalhe) {
        this.idLeituraDetalhe = idLeituraDetalhe;
    }

    public int getIdLeiturista() {
        return idLeiturista;
    }

    public void setIdLeiturista(int idLeiturista) {
        this.idLeiturista = idLeiturista;
    }

    public int getSeqSepRota() {
        return seqSepRota;
    }

    public void setSeqSepRota(int seqSepRota) {
        this.seqSepRota = seqSepRota;
    }

    public int getNrAlteracaoCadastral() {
        return nrAlteracaoCadastral;
    }

    public void setNrAlteracaoCadastral(int nrAlteracaoCadastral) {
        this.nrAlteracaoCadastral = nrAlteracaoCadastral;
    }

    public int getNrColetor() {
        return nrColetor;
    }

    public void setNrColetor(int nrColetor) {
        this.nrColetor = nrColetor;
    }

    public String getDataHoraRetorno() {
        return dataHoraRetorno;
    }

    public void setDataHoraRetorno(String dataHoraRetorno) {
        this.dataHoraRetorno = dataHoraRetorno;
    }

    public String getDataHoraAbertura() {
        return dataHoraAbertura;
    }

    public void setDataHoraAbertura(String dataHoraAbertura) {
        this.dataHoraAbertura = dataHoraAbertura;
    }

    public String getDataHoraFechamento() {
        return dataHoraFechamento;
    }

    public void setDataHoraFechamento(String dataHoraFechamento) {
        this.dataHoraFechamento = dataHoraFechamento;
    }

    public List<ColetorDetalheServicoDescargaVO> getServicosDescarga() {
        return servicosDescarga;
    }

    public void setServicosDescarga(List<ColetorDetalheServicoDescargaVO> servicosDescarga) {
        this.servicosDescarga = servicosDescarga;
    }

    public List<PesquisaMedicaoCargaVO> getPesquisasMedicao() {
        return pesquisasMedicao;
    }

    public void setPesquisasMedicao(List<PesquisaMedicaoCargaVO> pesquisasMedicao) {
        this.pesquisasMedicao = pesquisasMedicao;
    }

    public int getLeituraAtualRepasse() {
        return leituraAtualRepasse;
    }

    public void setLeituraAtualRepasse(int leituraAtualRepasse) {
        this.leituraAtualRepasse = leituraAtualRepasse;
    }
}
