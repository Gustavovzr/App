package com.inimasmart.app.model.dadoscarga;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Tarifa {

    private BigInteger categoria;
    private String codigoRubrica;
    private CoeficienteReducao coeficienteReducao;
    private List<AplicacaoDesconto> aplicacaoDesconto=new ArrayList<>();
    private List<Faixa> faixa=new ArrayList<>();



    public BigInteger getCategoria() {
        return categoria;
    }

    public void setCategoria(BigInteger categoria) {
        this.categoria = categoria;
    }

    public String getCodigoRubrica() {
        return codigoRubrica;
    }

    public void setCodigoRubrica(String codigoRubrica) {
        this.codigoRubrica = codigoRubrica;
    }

    public CoeficienteReducao getCoeficienteReducao() {
        return coeficienteReducao;
    }

    public void setCoeficienteReducao(CoeficienteReducao coeficienteReducao) {
        this.coeficienteReducao = coeficienteReducao;
    }

    public List<AplicacaoDesconto> getAplicacaoDesconto() {
        return aplicacaoDesconto;
    }

    public void setAplicacaoDesconto(List<AplicacaoDesconto> aplicacaoDesconto) {
        this.aplicacaoDesconto = aplicacaoDesconto;
    }

    public List<Faixa> getFaixa() {
        return faixa;
    }

    public void setFaixa(List<Faixa> faixa) {
        this.faixa = faixa;
    }
}
