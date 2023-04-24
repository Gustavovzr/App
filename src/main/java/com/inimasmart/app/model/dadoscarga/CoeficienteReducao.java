package com.inimasmart.app.model.dadoscarga;

import java.util.ArrayList;
import java.util.List;

public class CoeficienteReducao {

    private List<FaixaCoeficienteReducao> faixaCoeficienteReducao= new ArrayList<>();

    public List<FaixaCoeficienteReducao> getFaixaCoeficienteReducao() {
        return faixaCoeficienteReducao;
    }

    public void setFaixaCoeficienteReducao(List<FaixaCoeficienteReducao> faixaCoeficienteReducao) {
        this.faixaCoeficienteReducao = faixaCoeficienteReducao;
    }
}
