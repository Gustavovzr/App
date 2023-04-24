package com.inimasmart.app.model.dadoscarga;

import java.util.ArrayList;
import java.util.List;

public class ReavisoDebitoPendente {

    private Integer layoutNotificacao;
    private int faturaDebitoPendente;
    private String dataVencimentoDebitoPendente;
    private String dataPrevistaCorte;
    private String referenciaDebitoPendente;
    private String codigoBarras;
    private String codigoBarras1;
    private String codigoBarras2;
    private Boolean imprimirMsgOutrosDebitos;
    private List<FaturaReaviso> faturaReaviso=new ArrayList<>();
    private String dataEntregaPrevista;
    private Boolean emitirNaSimultanea;
    private Boolean impCodBarras;
    private int diasVencimento;
    private int numMaxFaturas;
    private int numDiasCorte;

    public Integer getLayoutNotificacao() {
        return layoutNotificacao;
    }

    public void setLayoutNotificacao(Integer layoutNotificacao) {
        this.layoutNotificacao = layoutNotificacao;
    }

    public int getFaturaDebitoPendente() {
        return faturaDebitoPendente;
    }

    public void setFaturaDebitoPendente(int faturaDebitoPendente) {
        this.faturaDebitoPendente = faturaDebitoPendente;
    }

    public String getDataVencimentoDebitoPendente() {
        return dataVencimentoDebitoPendente;
    }

    public void setDataVencimentoDebitoPendente(String dataVencimentoDebitoPendente) {
        this.dataVencimentoDebitoPendente = dataVencimentoDebitoPendente;
    }

    public String getDataPrevistaCorte() {
        return dataPrevistaCorte;
    }

    public void setDataPrevistaCorte(String dataPrevistaCorte) {
        this.dataPrevistaCorte = dataPrevistaCorte;
    }

    public String getReferenciaDebitoPendente() {
        return referenciaDebitoPendente;
    }

    public void setReferenciaDebitoPendente(String referenciaDebitoPendente) {
        this.referenciaDebitoPendente = referenciaDebitoPendente;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Boolean getImprimirMsgOutrosDebitos() {
        return imprimirMsgOutrosDebitos;
    }

    public void setImprimirMsgOutrosDebitos(Boolean imprimirMsgOutrosDebitos) {
        this.imprimirMsgOutrosDebitos = imprimirMsgOutrosDebitos;
    }

    public List<FaturaReaviso> getFaturaReaviso() {
        return faturaReaviso;
    }

    public void setFaturaReaviso(List<FaturaReaviso> faturaReaviso) {
        this.faturaReaviso = faturaReaviso;
    }

    public String getCodigoBarras2() {
        return codigoBarras2;
    }

    public void setCodigoBarras2(String codigoBarras2) {
        this.codigoBarras2 = codigoBarras2;
    }

    public String getCodigoBarras1() {
        return codigoBarras1;
    }

    public void setCodigoBarras1(String codigoBarras1) {
        this.codigoBarras1 = codigoBarras1;
    }

    public String getDataEntregaPrevista() {
        return dataEntregaPrevista;
    }

    public void setDataEntregaPrevista(String dataEntregaPrevista) {
        this.dataEntregaPrevista = dataEntregaPrevista;
    }

    public Boolean getEmitirNaSimultanea() {
        return emitirNaSimultanea;
    }

    public void setEmitirNaSimultanea(Boolean emitirNaSimultanea) {
        this.emitirNaSimultanea = emitirNaSimultanea;
    }

    public Boolean getImpCodBarras() {
        return impCodBarras;
    }

    public void setImpCodBarras(Boolean impCodBarras) {
        this.impCodBarras = impCodBarras;
    }

    public int getDiasVencimento() {
        return diasVencimento;
    }

    public void setDiasVencimento(int diasVencimento) {
        this.diasVencimento = diasVencimento;
    }

    public int getNumMaxFaturas() {
        return numMaxFaturas;
    }

    public void setNumMaxFaturas(int numMaxFaturas) {
        this.numMaxFaturas = numMaxFaturas;
    }

    public int getNumDiasCorte() {
        return numDiasCorte;
    }

    public void setNumDiasCorte(int numDiasCorte) {
        this.numDiasCorte = numDiasCorte;
    }
}
