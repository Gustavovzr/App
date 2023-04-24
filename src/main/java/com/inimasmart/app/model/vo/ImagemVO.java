package com.inimasmart.app.model.vo;

public class ImagemVO {

    private String enderecoImagem;
    private int idOcorrenciaLeitura;
    private String imagemBase64;

    public int getIdOcorrenciaLeitura() {
        return idOcorrenciaLeitura;
    }

    public void setIdOcorrenciaLeitura(int idOcorrenciaLeitura) {
        this.idOcorrenciaLeitura = idOcorrenciaLeitura;
    }

    public String getEnderecoImagem() {
        return enderecoImagem;
    }

    public void setEnderecoImagem(String enderecoImagem) {
        this.enderecoImagem = enderecoImagem;
    }

    public String getImagemBase64() {
        return imagemBase64;
    }

    public void setImagemBase64(String imagemBase64) {
        this.imagemBase64 = imagemBase64;
    }
}
