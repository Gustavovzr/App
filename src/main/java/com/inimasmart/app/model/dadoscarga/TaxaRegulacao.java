package com.inimasmart.app.model.dadoscarga;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TaxaRegulacao {

    private int codigo;
    private String rubrica;
    private BigDecimal percentual;
    private BigDecimal aliqISS;
    private BigDecimal aliqICMS;
    private BigDecimal aliqPis;
    private BigDecimal aliqCofins;
    private BigDecimal aliqINSS;
    private List<RubricaIncidencia> rubricaIncidencia=new ArrayList<>();
    private List<CategoriaIsenta> categoriaIsenta=new ArrayList<>();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getRubrica() {
        return rubrica;
    }

    public void setRubrica(String rubrica) {
        this.rubrica = rubrica;
    }

    public BigDecimal getPercentual() {
        return percentual;
    }

    public void setPercentual(BigDecimal percentual) {
        this.percentual = percentual;
    }

    public BigDecimal getAliqISS() {
        return aliqISS;
    }

    public void setAliqISS(BigDecimal aliqISS) {
        this.aliqISS = aliqISS;
    }

    public BigDecimal getAliqICMS() {
        return aliqICMS;
    }

    public void setAliqICMS(BigDecimal aliqICMS) {
        this.aliqICMS = aliqICMS;
    }

    public BigDecimal getAliqPis() {
        return aliqPis;
    }

    public void setAliqPis(BigDecimal aliqPis) {
        this.aliqPis = aliqPis;
    }

    public BigDecimal getAliqCofins() {
        return aliqCofins;
    }

    public void setAliqCofins(BigDecimal aliqCofins) {
        this.aliqCofins = aliqCofins;
    }

    public BigDecimal getAliqINSS() {
        return aliqINSS;
    }

    public void setAliqINSS(BigDecimal aliqINSS) {
        this.aliqINSS = aliqINSS;
    }

    public List<RubricaIncidencia> getRubricaIncidencia() {
        return rubricaIncidencia;
    }

    public void setRubricaIncidencia(List<RubricaIncidencia> rubricaIncidencia) {
        this.rubricaIncidencia = rubricaIncidencia;
    }

    public List<CategoriaIsenta> getCategoriaIsenta() {
        return categoriaIsenta;
    }

    public void setCategoriaIsenta(List<CategoriaIsenta> categoriaIsenta) {
        this.categoriaIsenta = categoriaIsenta;
    }
}
