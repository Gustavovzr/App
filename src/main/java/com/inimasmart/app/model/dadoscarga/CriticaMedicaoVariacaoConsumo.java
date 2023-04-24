package com.inimasmart.app.model.dadoscarga;

import java.util.ArrayList;
import java.util.List;

public class CriticaMedicaoVariacaoConsumo {

    private int codigoIDCritica;
    private int percVariacaoConsumoMinimo;
    private int percVariacaoConsumoMaximo;
    private boolean confirmarLeitura;
    private boolean reterConta;
    private String mensagemDispositivo;
    private boolean faixaConsumoExcessoVazamento;
    private List<MensagemAvisoRetencao> mensagemAvisoRetencao= new ArrayList<>();
    private List<MensagemAlertaConsumo> mensagemAlertaConsumo= new ArrayList<>();
    private Boolean aplicarLimiteInferior;
    private int consminimo;
    private int consmaximo;
    private boolean variacaoconsumo;
    private boolean normal;
    private Boolean retencaoForcada;


    public int getCodigoIDCritica() {
        return codigoIDCritica;
    }

    public void setCodigoIDCritica(int codigoIDCritica) {
        this.codigoIDCritica = codigoIDCritica;
    }

    public int getPercVariacaoConsumoMinimo() {
        return percVariacaoConsumoMinimo;
    }

    public void setPercVariacaoConsumoMinimo(int percVariacaoConsumoMinimo) {
        this.percVariacaoConsumoMinimo = percVariacaoConsumoMinimo;
    }

    public int getPercVariacaoConsumoMaximo() {
        return percVariacaoConsumoMaximo;
    }

    public void setPercVariacaoConsumoMaximo(int percVariacaoConsumoMaximo) {
        this.percVariacaoConsumoMaximo = percVariacaoConsumoMaximo;
    }

    public boolean isConfirmarLeitura() {
        return confirmarLeitura;
    }

    public void setConfirmarLeitura(boolean confirmarLeitura) {
        this.confirmarLeitura = confirmarLeitura;
    }

    public boolean isReterConta() {
        return reterConta;
    }

    public void setReterConta(boolean reterConta) {
        this.reterConta = reterConta;
    }

    public String getMensagemDispositivo() {
        return mensagemDispositivo;
    }

    public void setMensagemDispositivo(String mensagemDispositivo) {
        this.mensagemDispositivo = mensagemDispositivo;
    }

    public boolean isFaixaConsumoExcessoVazamento() {
        return faixaConsumoExcessoVazamento;
    }

    public void setFaixaConsumoExcessoVazamento(boolean faixaConsumoExcessoVazamento) {
        this.faixaConsumoExcessoVazamento = faixaConsumoExcessoVazamento;
    }

    public List<MensagemAvisoRetencao> getMensagemAvisoRetencao() {
        return mensagemAvisoRetencao;
    }

    public void setMensagemAvisoRetencao(List<MensagemAvisoRetencao> mensagemAvisoRetencao) {
        this.mensagemAvisoRetencao = mensagemAvisoRetencao;
    }

    public List<MensagemAlertaConsumo> getMensagemAlertaConsumo() {
        return mensagemAlertaConsumo;
    }

    public void setMensagemAlertaConsumo(List<MensagemAlertaConsumo> mensagemAlertaConsumo) {
        this.mensagemAlertaConsumo = mensagemAlertaConsumo;
    }

    public Boolean getAplicarLimiteInferior() {
        return aplicarLimiteInferior;
    }

    public void setAplicarLimiteInferior(Boolean aplicarLimiteInferior) {
        this.aplicarLimiteInferior = aplicarLimiteInferior;
    }

    public int getConsminimo() {
        return consminimo;
    }

    public void setConsminimo(int consminimo) {
        this.consminimo = consminimo;
    }

    public int getConsmaximo() {
        return consmaximo;
    }

    public void setConsmaximo(int consmaximo) {
        this.consmaximo = consmaximo;
    }

    public boolean isVariacaoconsumo() {
        return variacaoconsumo;
    }

    public void setVariacaoconsumo(boolean variacaoconsumo) {
        this.variacaoconsumo = variacaoconsumo;
    }

    public boolean isNormal() {
        return normal;
    }

    public void setNormal(boolean normal) {
        this.normal = normal;
    }

    public Boolean getRetencaoForcada() {
        return retencaoForcada;
    }

    public void setRetencaoForcada(Boolean retencaoForcada) {
        this.retencaoForcada = retencaoForcada;
    }
}
