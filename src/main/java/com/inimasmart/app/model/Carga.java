package com.inimasmart.app.model;
import com.inimasmart.app.model.dadoscarga.*;
import com.inimasmart.app.model.vo.*;
import java.util.ArrayList;
import java.util.List;

public class Carga {

        private int codigoUnidade;
        private Integer codigoCidade;
        private int grupo;
        private int idLeiturista;
        private int idMedicao;
        private int seqSepRota;
        private Boolean validarXMLalgoritmoHash;

        private DadosValidacaoAPI dadosValidacaoAPI;
        private DadosUnidade dadosUnidade;
        private DadosLeitura dadosLeitura;
        private int idGrupoReceita;
        private List<RubricaProdutoCategoria> rubricaProdutoCategoria = new ArrayList<RubricaProdutoCategoria>() ;
        private List<Empresa> empresa = new ArrayList<Empresa>();
        private List<CriticaMedicaoOcorrenciaConsumo> criticaMedicaoOcorrenciaConsumo = new ArrayList<>();
        private List<CriticaMedicaoVariacaoConsumo> criticaMedicaoVariacaoConsumo= new ArrayList<>();
        private List<CriticaMedicaoPorTotalFatura> criticaMedicaoPorTotalFatura= new ArrayList<>();
        private List<ClassificacaoLeitura> classificacaoLeitura= new ArrayList<>();
        private List<FonteAbastecimento> fonteAbastecimento= new ArrayList<>();
        private List<Categoria> categoria= new ArrayList<>();
        private List<ObservacaoLeitura> observacaoLeitura= new ArrayList<>();
        private List<Logradouro> logradouro= new ArrayList<>();
        private List<Bairro> bairro= new ArrayList<>();
        private List<PrevencaoAcidente> prevencaoAcidente= new ArrayList<>();
        private List<OpcaoEntregaAvisoDebito> opcaoEntregaAvisoDebito= new ArrayList<>();
        private List<MensagemAvisoDebitoImpresso> mensagemAvisoDebitoImpresso= new ArrayList<>();
        private List<MensagemNotificacaoCorteImpresso> mensagemNotificacaoCorteImpresso= new ArrayList<>();
        private List<Cliente> cliente= new ArrayList<>();
        private List<AlarmeTelemetria> alarmeTelemetria= new ArrayList<>();
        private List<SituacaoCavalete> situacaoCavalete= new ArrayList<>();
        private List<ConsultaServico> consultaServico= new ArrayList<>();
        private List<ProdutoVO> produtos= new ArrayList<>();
        private ProRataVO prorata;
        private List<ItemDecreto> decretos= new ArrayList<>();
        private List<ItemDecreto> decretosValorFixo= new ArrayList<>();
        private ParametrosFaturamentoVO parametrosFaturamento;
        private List<LigacaoVO> ligacoes= new ArrayList<>();
        private List<FaturaExcecaoVO> faturaExcecoes= new ArrayList<>();
        private List<FatDadosMedCategVO> fatDadosMedCateg= new ArrayList<>();
        private PagamentoAntecipadoVO pagamentoanualantecipado;
        private List<VendasIncorporarPendentesVO> vendasIncorporarPendentes= new ArrayList<>();
        private List<VendaDetalheParcelaVO> vendasDetalheParcela= new ArrayList<>();
        private List<VendaDetalheParcelaImpostoVO> vendaDetalheParcelaImpostos= new ArrayList<>();
        private List<MedicaoDetalheVO> medicaoDetalhes= new ArrayList<>();
        private List<ImpostoVO> impostos= new ArrayList<>();


        public int getCodigoUnidade() {
            return codigoUnidade;
        }

        public void setCodigoUnidade(int codigoUnidade) {
            this.codigoUnidade = codigoUnidade;
        }

        public Integer getCodigoCidade() {
            return codigoCidade;
        }

        public void setCodigoCidade(Integer codigoCidade) {
            this.codigoCidade = codigoCidade;
        }

        public int getGrupo() {
            return grupo;
        }

        public void setGrupo(int grupo) {
            this.grupo = grupo;
        }

        public int getIdLeiturista() {
            return idLeiturista;
        }

        public void setIdLeiturista(int idLeiturista) {
            this.idLeiturista = idLeiturista;
        }

        public Boolean getValidarXMLalgoritmoHash() {
            return validarXMLalgoritmoHash;
        }

        public void setValidarXMLalgoritmoHash(Boolean validarXMLalgoritmoHash) {
            this.validarXMLalgoritmoHash = validarXMLalgoritmoHash;
        }

        public DadosValidacaoAPI getDadosAPIvalidacao() {
            return dadosValidacaoAPI;
        }

        public void setDadosAPIvalidacao(DadosValidacaoAPI dadosAPIvalidacao) {
            this.dadosValidacaoAPI = dadosAPIvalidacao;
        }

        public DadosUnidade getDadosUnidade() {
            return dadosUnidade;
        }

        public void setDadosUnidade(DadosUnidade dadosUnidade) {
            this.dadosUnidade = dadosUnidade;
        }

        public DadosLeitura getDadosLeitura() {
            return dadosLeitura;
        }

        public void setDadosLeitura(DadosLeitura dadosLeitura) {
            this.dadosLeitura = dadosLeitura;
        }

        public List<RubricaProdutoCategoria> getRubricaProdutoCategoria() {
            return rubricaProdutoCategoria;
        }

        public void setRubricaProdutoCategoria(List<RubricaProdutoCategoria> rubricaProdutoCategoria) {
            this.rubricaProdutoCategoria = rubricaProdutoCategoria;
        }

        public List<Empresa> getEmpresa() {
            return empresa;
        }

        public void setEmpresa(List<Empresa> empresa) {
            this.empresa = empresa;
        }

        public List<CriticaMedicaoOcorrenciaConsumo> getCriticaMedicaoOcorrenciaConsumo() {
            return criticaMedicaoOcorrenciaConsumo;
        }

        public void setCriticaMedicaoOcorrenciaConsumo(List<CriticaMedicaoOcorrenciaConsumo> criticaMedicaoOcorrenciaConsumo) {
            this.criticaMedicaoOcorrenciaConsumo = criticaMedicaoOcorrenciaConsumo;
        }

        public List<CriticaMedicaoVariacaoConsumo> getCriticaMedicaoVariacaoConsumo() {
            return criticaMedicaoVariacaoConsumo;
        }

        public void setCriticaMedicaoVariacaoConsumo(List<CriticaMedicaoVariacaoConsumo> criticaMedicaoVariacaoConsumo) {
            this.criticaMedicaoVariacaoConsumo = criticaMedicaoVariacaoConsumo;
        }

        public List<CriticaMedicaoPorTotalFatura> getCriticaMedicaoPorTotalFatura() {
            return criticaMedicaoPorTotalFatura;
        }

        public void setCriticaMedicaoPorTotalFatura(List<CriticaMedicaoPorTotalFatura> criticaMedicaoPorTotalFatura) {
            this.criticaMedicaoPorTotalFatura = criticaMedicaoPorTotalFatura;
        }

        public List<ClassificacaoLeitura> getClassificacaoLeitura() {
            return classificacaoLeitura;
        }

        public void setClassificacaoLeitura(List<ClassificacaoLeitura> classificacaoLeitura) {
            this.classificacaoLeitura = classificacaoLeitura;
        }

        public List<FonteAbastecimento> getFonteAbastecimento() {
            return fonteAbastecimento;
        }

        public void setFonteAbastecimento(List<FonteAbastecimento> fonteAbastecimento) {
            this.fonteAbastecimento = fonteAbastecimento;
        }

        public List<Categoria> getCategoria() {
            return categoria;
        }

        public void setCategoria(List<Categoria> categoria) {
            this.categoria = categoria;
        }

        public List<ObservacaoLeitura> getObservacaoLeitura() {
            return observacaoLeitura;
        }

        public void setObservacaoLeitura(List<ObservacaoLeitura> observacaoLeitura) {
            this.observacaoLeitura = observacaoLeitura;
        }

        public List<Logradouro> getLogradouro() {
            return logradouro;
        }

        public void setLogradouro(List<Logradouro> logradouro) {
            this.logradouro = logradouro;
        }

        public List<Bairro> getBairro() {
            return bairro;
        }

        public void setBairro(List<Bairro> bairro) {
            this.bairro = bairro;
        }

        public List<PrevencaoAcidente> getPrevencaoAcidente() {
            return prevencaoAcidente;
        }

        public void setPrevencaoAcidente(List<PrevencaoAcidente> prevencaoAcidente) {
            this.prevencaoAcidente = prevencaoAcidente;
        }

        public List<OpcaoEntregaAvisoDebito> getOpcaoEntregaAvisoDebito() {
            return opcaoEntregaAvisoDebito;
        }

        public void setOpcaoEntregaAvisoDebito(List<OpcaoEntregaAvisoDebito> opcaoEntregaAvisoDebito) {
            this.opcaoEntregaAvisoDebito = opcaoEntregaAvisoDebito;
        }

        public List<MensagemAvisoDebitoImpresso> getMensagemAvisoDebitoImpresso() {
            return mensagemAvisoDebitoImpresso;
        }

        public void setMensagemAvisoDebitoImpresso(List<MensagemAvisoDebitoImpresso> mensagemAvisoDebitoImpresso) {
            this.mensagemAvisoDebitoImpresso = mensagemAvisoDebitoImpresso;
        }

        public List<MensagemNotificacaoCorteImpresso> getMensagemNotificacaoCorteImpresso() {
            return mensagemNotificacaoCorteImpresso;
        }

        public void setMensagemNotificacaoCorteImpresso(List<MensagemNotificacaoCorteImpresso> mensagemNotificacaoCorteImpresso) {
            this.mensagemNotificacaoCorteImpresso = mensagemNotificacaoCorteImpresso;
        }

        public List<Cliente> getCliente() {
            return cliente;
        }

        public void setCliente(List<Cliente> cliente) {
            this.cliente = cliente;
        }

        public List<AlarmeTelemetria> getAlarmeTelemetria() {
            return alarmeTelemetria;
        }

        public void setAlarmeTelemetria(List<AlarmeTelemetria> alarmeTelemetria) {
            this.alarmeTelemetria = alarmeTelemetria;
        }

        public List<SituacaoCavalete> getSituacaoCavalete() {
            return situacaoCavalete;
        }

        public void setSituacaoCavalete(List<SituacaoCavalete> situacaoCavalete) {
            this.situacaoCavalete = situacaoCavalete;
        }

        public List<ConsultaServico> getConsultaServico() {
            return consultaServico;
        }

        public void setConsultaServico(List<ConsultaServico> consultaServico) {
            this.consultaServico = consultaServico;
        }

        public List<ProdutoVO> getProdutos() {
            return produtos;
        }

        public void setProdutos(List<ProdutoVO> produtos) {
            this.produtos = produtos;
        }

        public ProRataVO getProrata() {
            return prorata;
        }

        public void setProrata(ProRataVO prorata) {
            this.prorata = prorata;
        }

        public List<ItemDecreto> getDecretos() {
            return decretos;
        }

        public void setDecretos(List<ItemDecreto> decretos) {
            this.decretos = decretos;
        }

        public List<ItemDecreto> getDecretosValorFixo() {
            return decretosValorFixo;
        }

        public void setDecretosValorFixo(List<ItemDecreto> decretosValorFixo) {
            this.decretosValorFixo = decretosValorFixo;
        }

        public ParametrosFaturamentoVO getParametrosFaturamento() {
            return parametrosFaturamento;
        }

        public void setParametrosFaturamento(ParametrosFaturamentoVO parametrosFaturamento) {
            this.parametrosFaturamento = parametrosFaturamento;
        }

        public List<LigacaoVO> getLigacoes() {
            return ligacoes;
        }

        public void setLigacoes(List<LigacaoVO> ligacoes) {
            this.ligacoes = ligacoes;
        }

        public int getIdGrupoReceita() {
            return idGrupoReceita;
        }

        public void setIdGrupoReceita(int idGrupoReceita) {
            this.idGrupoReceita = idGrupoReceita;
        }

        public List<FaturaExcecaoVO> getFaturaExcecoes() {
            return faturaExcecoes;
        }

        public void setFaturaExcecoes(List<FaturaExcecaoVO> faturaExcecoes) {
            this.faturaExcecoes = faturaExcecoes;
        }

        public List<FatDadosMedCategVO> getFatDadosMedCateg() {
            return fatDadosMedCateg;
        }

        public void setFatDadosMedCateg(List<FatDadosMedCategVO> fatDadosMedCateg) {
            this.fatDadosMedCateg = fatDadosMedCateg;
        }

        public PagamentoAntecipadoVO getPagamentoanualantecipado() {
            return pagamentoanualantecipado;
        }

        public void setPagamentoanualantecipado(PagamentoAntecipadoVO pagamentoanualantecipado) {
            this.pagamentoanualantecipado = pagamentoanualantecipado;
        }

        public List<VendasIncorporarPendentesVO> getVendasIncorporarPendentes() {
            return vendasIncorporarPendentes;
        }

        public void setVendasIncorporarPendentes(List<VendasIncorporarPendentesVO> vendasIncorporarPendentes) {
            this.vendasIncorporarPendentes = vendasIncorporarPendentes;
        }

        public List<VendaDetalheParcelaVO> getVendasDetalheParcela() {
            return vendasDetalheParcela;
        }

        public void setVendasDetalheParcela(List<VendaDetalheParcelaVO> vendasDetalheParcela) {
            this.vendasDetalheParcela = vendasDetalheParcela;
        }

        public List<VendaDetalheParcelaImpostoVO> getVendaDetalheParcelaImpostos() {
            return vendaDetalheParcelaImpostos;
        }

        public void setVendaDetalheParcelaImpostos(List<VendaDetalheParcelaImpostoVO> vendaDetalheParcelaImpostos) {
            this.vendaDetalheParcelaImpostos = vendaDetalheParcelaImpostos;
        }

        public List<MedicaoDetalheVO> getMedicaoDetalhes() {
            return medicaoDetalhes;
        }

        public void setMedicaoDetalhes(List<MedicaoDetalheVO> medicaoDetalhes) {
            this.medicaoDetalhes = medicaoDetalhes;
        }

        public List<ImpostoVO> getImpostos() {
            return impostos;
        }

        public void setImpostos(List<ImpostoVO> impostos) {
            this.impostos = impostos;
        }

        public int getIdMedicao() {
            return idMedicao;
        }

        public void setIdMedicao(int idMedicao) {
            this.idMedicao = idMedicao;
        }

        public int getSeqSepRota() {
            return seqSepRota;
        }

        public void setSeqSepRota(int seqSepRota) {
            this.seqSepRota = seqSepRota;
        }

        @Override
        public String toString() {
            return "Carga{" +
                    "codigoUnidade=" + codigoUnidade +
                    ", codigoCidade=" + codigoCidade +
                    ", grupo=" + grupo +
                    ", idLeiturista=" + idLeiturista +
                    ", idMedicao=" + idMedicao +
                    ", seqSepRota=" + seqSepRota +
                    ", validarXMLalgoritmoHash=" + validarXMLalgoritmoHash +
                    ", dadosAPIvalidacao=" + dadosValidacaoAPI +
                    ", dadosUnidade=" + dadosUnidade +
                    ", dadosLeitura=" + dadosLeitura +
                    ", idGrupoReceita=" + idGrupoReceita +
                    ", rubricaProdutoCategoria=" + rubricaProdutoCategoria +
                    ", empresa=" + empresa +
                    ", criticaMedicaoOcorrenciaConsumo=" + criticaMedicaoOcorrenciaConsumo +
                    ", criticaMedicaoVariacaoConsumo=" + criticaMedicaoVariacaoConsumo +
                    ", criticaMedicaoPorTotalFatura=" + criticaMedicaoPorTotalFatura +
                    ", classificacaoLeitura=" + classificacaoLeitura +
                    ", fonteAbastecimento=" + fonteAbastecimento +
                    ", categoria=" + categoria +
                    ", observacaoLeitura=" + observacaoLeitura +
                    ", logradouro=" + logradouro +
                    ", bairro=" + bairro +
                    ", prevencaoAcidente=" + prevencaoAcidente +
                    ", opcaoEntregaAvisoDebito=" + opcaoEntregaAvisoDebito +
                    ", mensagemAvisoDebitoImpresso=" + mensagemAvisoDebitoImpresso +
                    ", mensagemNotificacaoCorteImpresso=" + mensagemNotificacaoCorteImpresso +
                    ", cliente=" + cliente +
                    ", alarmeTelemetria=" + alarmeTelemetria +
                    ", situacaoCavalete=" + situacaoCavalete +
                    ", consultaServico=" + consultaServico +
                    ", produtos=" + produtos +
                    ", prorata=" + prorata +
                    ", decretos=" + decretos +
                    ", decretosValorFixo=" + decretosValorFixo +
                    ", parametrosFaturamento=" + parametrosFaturamento +
                    ", ligacoes=" + ligacoes +
                    ", faturaExcecoes=" + faturaExcecoes +
                    ", fatDadosMedCateg=" + fatDadosMedCateg +
                    ", pagamentoanualantecipado=" + pagamentoanualantecipado +
                    ", vendasIncorporarPendentes=" + vendasIncorporarPendentes +
                    ", vendasDetalheParcela=" + vendasDetalheParcela +
                    ", vendaDetalheParcelaImpostos=" + vendaDetalheParcelaImpostos +
                    ", medicaoDetalhes=" + medicaoDetalhes +
                    ", impostos=" + impostos +
                    '}';
        }
    }
