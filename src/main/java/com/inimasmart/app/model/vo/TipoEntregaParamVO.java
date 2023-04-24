package com.inimasmart.app.model.vo;

public class TipoEntregaParamVO {

    private int id;
    private String tipoentrega = "";
    private String imprimefaturaapp = "";
    private String imprimeavisodebitoapp= "";
    private String enviafaturaemail= "";
    private String entregaalternativa= "";


    public TipoEntregaParamVO() {

    }

    public TipoEntregaParamVO(int id, String tipoentrega, String imprimefaturaapp, String imprimeavisodebitoapp, String enviafaturaemail, String entregaalternativa) {
        this.id = id;
        this.tipoentrega = tipoentrega;
        this.imprimefaturaapp = imprimefaturaapp;
        this.imprimeavisodebitoapp = imprimeavisodebitoapp;
        this.enviafaturaemail = enviafaturaemail;
        this.entregaalternativa = entregaalternativa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoentrega() {
        return tipoentrega;
    }

    public void setTipoentrega(String tipoentrega) {
        this.tipoentrega = tipoentrega;
    }

    public boolean getImprimefaturaapp() {
        return "S".equals(imprimefaturaapp);
    }

    public void setImprimefaturaapp(String imprimefaturaapp) {
        this.imprimefaturaapp = imprimefaturaapp;
    }

    public boolean getImprimeavisodebitoapp() {
        return "S".equals(imprimeavisodebitoapp);
    }

    public void setImprimeavisodebitoapp(String imprimeavisodebitoapp) {
        this.imprimeavisodebitoapp = imprimeavisodebitoapp;
    }

    public boolean getEnviafaturaemail() {
        return "S".equals(enviafaturaemail);
    }

    public void setEnviafaturaemail(String enviafaturaemail) {
        this.enviafaturaemail = enviafaturaemail;
    }

    public boolean getEntregaalternativa() {
        return "S".equals(entregaalternativa);
    }

    public void setEntregaalternativa(String entregaalternativa) {
        this.entregaalternativa = entregaalternativa;
    }

}
