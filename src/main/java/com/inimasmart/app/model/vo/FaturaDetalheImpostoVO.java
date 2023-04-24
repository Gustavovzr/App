package com.inimasmart.app.model.vo;

public class FaturaDetalheImpostoVO {

    private Integer id = 0;
    private Integer idRubrica = 0;
    private Double valor = 0d;
    private Double valorUfir = 0d;

    public Double getValorUfir() {
        return valorUfir;
    }

    public void setValorUfir(Double valorUfir) {
        this.valorUfir = valorUfir;
    }

    public int getIdVendaDetalheParcela() {
        return idVendaDetalheParcela;
    }

    public void setIdVendaDetalheParcela(int idVendaDetalheParcela) {
        this.idVendaDetalheParcela = idVendaDetalheParcela;
    }

    private String rubrica;
    private int  idVendaDetalheParcela;

    /**
     * Creates a new instance of FaturaDetalheImpostoVO
     */
    public FaturaDetalheImpostoVO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdRubrica() {
        return idRubrica;
    }

    public void setIdRubrica(Integer idRubrica) {
        this.idRubrica = idRubrica;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getRubrica() {
        return rubrica;
    }

    public void setRubrica(String rubrica) {
        this.rubrica = rubrica;
    }
}
