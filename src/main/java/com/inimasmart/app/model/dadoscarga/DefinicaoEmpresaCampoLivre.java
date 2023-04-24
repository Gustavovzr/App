package com.inimasmart.app.model.dadoscarga;

import java.util.ArrayList;
import java.util.List;

public class DefinicaoEmpresaCampoLivre {

    private String identificacaoFebrabanEmpresa2;
    private List<EmpresaCampoLivre> empresaCampoLivre=new ArrayList<>();

    public String getIdentificacaoFebrabanEmpresa2() {
        return identificacaoFebrabanEmpresa2;
    }

    public void setIdentificacaoFebrabanEmpresa2(String identificacaoFebrabanEmpresa2) {
        this.identificacaoFebrabanEmpresa2 = identificacaoFebrabanEmpresa2;
    }

    public List<EmpresaCampoLivre> getEmpresaCampoLivre() {
        return empresaCampoLivre;
    }

    public void setEmpresaCampoLivre(List<EmpresaCampoLivre> empresaCampoLivre) {
        this.empresaCampoLivre = empresaCampoLivre;
    }

}
