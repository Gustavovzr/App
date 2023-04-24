package com.inimasmart.app.model.dadoscarga;

import java.util.ArrayList;
import java.util.List;

public class ClassificacaoLeitura {

    private int codigoIDLeitura;
    private String descricaoDispositivo;
    private String descricaoImpressa;
    private int criterioFaturamento;
    private Boolean aceitarLeitura;
    private Boolean reterConta;
    private Boolean imprimirAvisoImpedimentoLeitura;
    private Boolean emitirAvisoRetencao;
    private Boolean aplicarCoeficienteReducao;
    private Boolean alteracaoCategoria;
    private Boolean alteracaoNrEconomias;
    private Boolean ocorrenciaVazamento;
    private Integer codigoIDCriticaMandatorio;
    private List<MensagemAvisoRetencao> mensagemAvisoRetencao= new ArrayList<>();
    private List<MensagemAutoLeitura> mensagemAutoLeitura = new ArrayList<>();
    private Boolean padrao;
    private Boolean estimada;

    public int getCodigoIDLeitura() {
        return codigoIDLeitura;
    }

    public void setCodigoIDLeitura(int codigoIDLeitura) {
        this.codigoIDLeitura = codigoIDLeitura;
    }

    public String getDescricaoDispositivo() {
        return descricaoDispositivo;
    }

    public void setDescricaoDispositivo(String descricaoDispositivo) {
        this.descricaoDispositivo = descricaoDispositivo;
    }

    public String getDescricaoImpressa() {
        return descricaoImpressa;
    }

    public void setDescricaoImpressa(String descricaoImpressa) {
        this.descricaoImpressa = descricaoImpressa;
    }

    public int getCriterioFaturamento() {
        return criterioFaturamento;
    }

    public void setCriterioFaturamento(int criterioFaturamento) {
        this.criterioFaturamento = criterioFaturamento;
    }

    public Boolean getAceitarLeitura() {
        return aceitarLeitura;
    }

    public void setAceitarLeitura(Boolean aceitarLeitura) {
        this.aceitarLeitura = aceitarLeitura;
    }

    public Boolean getReterConta() {
        return reterConta;
    }

    public void setReterConta(Boolean reterConta) {
        this.reterConta = reterConta;
    }

    public Boolean getImprimirAvisoImpedimentoLeitura() {
        return imprimirAvisoImpedimentoLeitura;
    }

    public void setImprimirAvisoImpedimentoLeitura(Boolean imprimirAvisoImpedimentoLeitura) {
        this.imprimirAvisoImpedimentoLeitura = imprimirAvisoImpedimentoLeitura;
    }

    public Boolean getEmitirAvisoRetencao() {
        return emitirAvisoRetencao;
    }

    public void setEmitirAvisoRetencao(Boolean emitirAvisoRetencao) {
        this.emitirAvisoRetencao = emitirAvisoRetencao;
    }

    public Boolean getAplicarCoeficienteReducao() {
        return aplicarCoeficienteReducao;
    }

    public void setAplicarCoeficienteReducao(Boolean aplicarCoeficienteReducao) {
        this.aplicarCoeficienteReducao = aplicarCoeficienteReducao;
    }

    public Boolean getAlteracaoCategoria() {
        return alteracaoCategoria;
    }

    public void setAlteracaoCategoria(Boolean alteracaoCategoria) {
        this.alteracaoCategoria = alteracaoCategoria;
    }

    public Boolean getAlteracaoNrEconomias() {
        return alteracaoNrEconomias;
    }

    public void setAlteracaoNrEconomias(Boolean alteracaoNrEconomias) {
        this.alteracaoNrEconomias = alteracaoNrEconomias;
    }

    public Boolean getOcorrenciaVazamento() {
        return ocorrenciaVazamento;
    }

    public void setOcorrenciaVazamento(Boolean ocorrenciaVazamento) {
        this.ocorrenciaVazamento = ocorrenciaVazamento;
    }

    public Integer getCodigoIDCriticaMandatorio() {
        return codigoIDCriticaMandatorio;
    }

    public void setCodigoIDCriticaMandatorio(Integer codigoIDCriticaMandatorio) {
        this.codigoIDCriticaMandatorio = codigoIDCriticaMandatorio;
    }

    public List<MensagemAvisoRetencao> getMensagemAvisoRetencao() {
        return mensagemAvisoRetencao;
    }

    public void setMensagemAvisoRetencao(List<MensagemAvisoRetencao> mensagemAvisoRetencao) {
        this.mensagemAvisoRetencao = mensagemAvisoRetencao;
    }

    public List<MensagemAutoLeitura> getMensagemAutoLeitura() {
        return mensagemAutoLeitura;
    }

    public void setMensagemAutoLeitura(List<MensagemAutoLeitura> mensagemAutoLeitura) {
        this.mensagemAutoLeitura = mensagemAutoLeitura;
    }

    public Boolean getPadrao() {
        return padrao;
    }

    public void setPadrao(Boolean padrao) {
        this.padrao = padrao;
    }

    public Boolean getEstimada() {
        return estimada;
    }

    public void setEstimada(Boolean estimada) {
        this.estimada = estimada;
    }
}
