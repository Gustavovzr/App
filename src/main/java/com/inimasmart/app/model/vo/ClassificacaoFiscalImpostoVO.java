package com.inimasmart.app.model.vo;

public class ClassificacaoFiscalImpostoVO {

    private Integer idImposto;
    private double percentual;
    private int idRubricaImposto;
    private String rubricaImposto;


    public ClassificacaoFiscalImpostoVO() {
    }

    public ClassificacaoFiscalImpostoVO(Integer idImposto, double percentual, int idRubricaImposto) {
        this.idImposto = idImposto;
        this.percentual = percentual;
        this.idRubricaImposto = idRubricaImposto;
    }

    public Integer getIdImposto() {
        return idImposto;
    }

    public void setIdImposto(Integer idImposto) {
        this.idImposto = idImposto;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    public int getIdRubricaImposto() {
        return idRubricaImposto;
    }

    public void setIdRubricaImposto(int idRubricaImposto) {
        this.idRubricaImposto = idRubricaImposto;
    }

    public String getRubricaImposto() {
        return rubricaImposto;
    }

    public void setRubricaImposto(String rubricaImposto) {
        this.rubricaImposto = rubricaImposto;
    }
}
