package com.inimasmart.app.model.dadoscarga;

import java.util.ArrayList;
import java.util.List;

public class FonteAbastecimento {

    private int codigoFonteAbastecimento;
    private String nome;
    private String referencia;
    private List<ObservacaoAnaliseAgua> observacaoAnaliseAgua=new ArrayList<>();
    private List<AnaliseAgua> analiseAgua=new ArrayList<>();

    public int getCodigoFonteAbastecimento() {
        return codigoFonteAbastecimento;
    }

    public void setCodigoFonteAbastecimento(int codigoFonteAbastecimento) {
        this.codigoFonteAbastecimento = codigoFonteAbastecimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public List<ObservacaoAnaliseAgua> getObservacaoAnaliseAgua() {
        return observacaoAnaliseAgua;
    }

    public void setObservacaoAnaliseAgua(List<ObservacaoAnaliseAgua> observacaoAnaliseAgua) {
        this.observacaoAnaliseAgua = observacaoAnaliseAgua;
    }

    public List<AnaliseAgua> getAnaliseAgua() {
        return analiseAgua;
    }

    public void setAnaliseAgua(List<AnaliseAgua> analiseAgua) {
        this.analiseAgua = analiseAgua;
    }
}
