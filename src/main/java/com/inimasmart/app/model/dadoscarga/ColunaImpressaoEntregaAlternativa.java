package com.inimasmart.app.model.dadoscarga;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ColunaImpressaoEntregaAlternativa {

    private int codigoColunaImpressao;
    private String descrValorTotalColuna;
    private BigDecimal valorTotalColunaImpressao;
    private List<LancamentoEntregaAlternativa> lancamentoEntregaAlternativa= new ArrayList<>();
    private List<EstruturaTarifariaEntregaAlternativa> estruturaTarifariaEntregaAlternativa= new ArrayList<>();




    public int getCodigoColunaImpressao() {
        return codigoColunaImpressao;
    }

    public void setCodigoColunaImpressao(int codigoColunaImpressao) {
        this.codigoColunaImpressao = codigoColunaImpressao;
    }

    public String getDescrValorTotalColuna() {
        return descrValorTotalColuna;
    }

    public void setDescrValorTotalColuna(String descrValorTotalColuna) {
        this.descrValorTotalColuna = descrValorTotalColuna;
    }

    public BigDecimal getValorTotalColunaImpressao() {
        return valorTotalColunaImpressao;
    }

    public void setValorTotalColunaImpressao(BigDecimal valorTotalColunaImpressao) {
        this.valorTotalColunaImpressao = valorTotalColunaImpressao;
    }

    public List<LancamentoEntregaAlternativa> getLancamentoEntregaAlternativa() {
        return lancamentoEntregaAlternativa;
    }

    public void setLancamentoEntregaAlternativa(List<LancamentoEntregaAlternativa> lancamentoEntregaAlternativa) {
        this.lancamentoEntregaAlternativa = lancamentoEntregaAlternativa;
    }

    public List<EstruturaTarifariaEntregaAlternativa> getEstruturaTarifariaEntregaAlternativa() {
        return estruturaTarifariaEntregaAlternativa;
    }

    public void setEstruturaTarifariaEntregaAlternativa(List<EstruturaTarifariaEntregaAlternativa> estruturaTarifariaEntregaAlternativa) {
        this.estruturaTarifariaEntregaAlternativa = estruturaTarifariaEntregaAlternativa;
    }
}
