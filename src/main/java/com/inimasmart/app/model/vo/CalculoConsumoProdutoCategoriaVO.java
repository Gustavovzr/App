package com.inimasmart.app.model.vo;

public class CalculoConsumoProdutoCategoriaVO {

    private int idMedicaoDetalheProduto = 0;
    private int idCategoria = 0;
    private int volumeFaturado = 0;

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdMedicaoDetalheProduto() {
        return idMedicaoDetalheProduto;
    }

    public void setIdMedicaoDetalheProduto(int idMedicaoDetalheProduto) {
        this.idMedicaoDetalheProduto = idMedicaoDetalheProduto;
    }

    public int getVolumeFaturado() {
        return volumeFaturado;
    }

    public void setVolumeFaturado(int volumeFaturado) {
        this.volumeFaturado = volumeFaturado;
    }
}
