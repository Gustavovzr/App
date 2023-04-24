package com.inimasmart.app.model.vo;

import java.util.ArrayList;
import java.util.List;

public class PesquisaMedicaoCargaVO {

    private int idMedicaoDetalhe = 0;
    private int idPesquisaMedicao = 0;
    private String perguntaMedicao = "";
    private String respostaUnica = "";
    private List<RespostaMedicaoCargaVO> respostasMedicao = new ArrayList<>();
    private int tipoCampoRespostaMedicao =0;
    private boolean fotoObrigatoria = false;
    private String fotoUrl = "";
    private int idLigacao = 0;

    public boolean isFotoObrigatoria() {
        return fotoObrigatoria;
    }

    public void setFotoObrigatoria(boolean fotoObrigatoria) {
        this.fotoObrigatoria = fotoObrigatoria;
    }

    public String getFotoUrl() {
        return fotoUrl;
    }

    public void setFotoUrl(String fotoUrl) {
        this.fotoUrl = fotoUrl;
    }

    public int getIdMedicaoDetalhe() {
        return idMedicaoDetalhe;
    }

    public void setIdMedicaoDetalhe(int idMedicao) {
        this.idMedicaoDetalhe = idMedicao;
    }

    public int getIdPesquisaMedicao() {
        return idPesquisaMedicao;
    }

    public void setIdPesquisaMedicao(int idPesquisaMedicao) {
        this.idPesquisaMedicao = idPesquisaMedicao;
    }

    public String getPerguntaMedicao() {
        return perguntaMedicao;
    }

    public void setPerguntaMedicao(String perguntaMedicao) {
        this.perguntaMedicao = perguntaMedicao;
    }

    public String getRespostaUnica() {
        return respostaUnica;
    }

    public void setRespostaUnica(String respostaUnica) {
        this.respostaUnica = respostaUnica;
    }

    public List<RespostaMedicaoCargaVO> getRespostasMedicao() {
        return respostasMedicao;
    }

    public void setRespostasMedicao(List<RespostaMedicaoCargaVO> respostasMedicao) {
        this.respostasMedicao = respostasMedicao;
    }

    public int getTipoCampoRespostaMedicao() {
        return tipoCampoRespostaMedicao;
    }

    public void setTipoCampoRespostaMedicao(int tipoCampoRespostaMedicao) {
        this.tipoCampoRespostaMedicao = tipoCampoRespostaMedicao;
    }

    public int getIdLigacao() {
        return idLigacao;
    }

    public void setIdLigacao(int idLigacao) {
        this.idLigacao = idLigacao;
    }
}
