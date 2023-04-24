package com.inimasmart.app.model.dadoscarga;

import com.inimasmart.app.model.vo.ClassificacaoFiscalImpostoVO;

import java.math.BigDecimal;

public class RubricaProdutoCategoria {

    private String codigoRubrica;
    private String descricaoRubrica;
    private BigDecimal aliqISS;
    private BigDecimal aliqICMS;
    private BigDecimal aliqPis;
    private BigDecimal aliqCofins;
    private BigDecimal aliqINSS;

    private ClassificacaoFiscalImpostoVO classificacaoFiscalImposto;


    public String getCodigoRubrica() {
        return codigoRubrica;
    }

    public void setCodigoRubrica(String codigoRubrica) {
        this.codigoRubrica = codigoRubrica;
    }

    public String getDescricaoRubrica() {
        return descricaoRubrica;
    }

    public void setDescricaoRubrica(String descricaoRubrica) {
        this.descricaoRubrica = descricaoRubrica;
    }

    public BigDecimal getAliqISS() {
        return aliqISS;
    }

    public void setAliqISS(BigDecimal aliqISS) {
        this.aliqISS = aliqISS;
    }

    public BigDecimal getAliqICMS() {
        return aliqICMS;
    }

    public void setAliqICMS(BigDecimal aliqICMS) {
        this.aliqICMS = aliqICMS;
    }

    public BigDecimal getAliqPis() {
        return aliqPis;
    }

    public void setAliqPis(BigDecimal aliqPis) {
        this.aliqPis = aliqPis;
    }

    public BigDecimal getAliqCofins() {
        return aliqCofins;
    }

    public void setAliqCofins(BigDecimal aliqCofins) {
        this.aliqCofins = aliqCofins;
    }

    public BigDecimal getAliqINSS() {
        return aliqINSS;
    }

    public void setAliqINSS(BigDecimal aliqINSS) {
        this.aliqINSS = aliqINSS;
    }

    public ClassificacaoFiscalImpostoVO getClassificacaoFiscalImposto() {
        return classificacaoFiscalImposto;
    }

    public void setClassificacaoFiscalImposto(ClassificacaoFiscalImpostoVO classificacaoFiscalImposto) {
        this.classificacaoFiscalImposto = classificacaoFiscalImposto;
    }
}
