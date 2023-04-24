package com.inimasmart.app.model.dadoscarga;

import java.util.ArrayList;
import java.util.List;

public class Produto {

    private int codigoProduto;
    private String descricao;
    private boolean aplicarMedicaoConsumo;
    private int tipoProduto;
    private List<Tarifa> tarifa=new ArrayList<>();


    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isAplicarMedicaoConsumo() {
        return aplicarMedicaoConsumo;
    }

    public void setAplicarMedicaoConsumo(boolean aplicarMedicaoConsumo) {
        this.aplicarMedicaoConsumo = aplicarMedicaoConsumo;
    }

    public int getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(int tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public List<Tarifa> getTarifa() {
        return tarifa;
    }

    public void setTarifa(List<Tarifa> tarifa) {
        this.tarifa = tarifa;
    }
}
