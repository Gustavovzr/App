package com.inimasmart.app.model.dadoscarga;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CalculoRecursosHidricos {

    protected int codigo;
    protected String descricao;
    protected String rubrica;
    protected BigDecimal percentual;
    protected BigDecimal aliqISS;
    protected BigDecimal aliqICMS;
    protected BigDecimal aliqPis;
    protected BigDecimal aliqCofins;
    protected BigDecimal aliqINSS;
    protected List<RubricaIncidencia> rubricaIncidencia;
    protected List<CategoriaIsenta> categoriaIsenta;

    /**
     * Gets the value of the codigo property.
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     */
    public void setCodigo(int value) {
        this.codigo = value;
    }

    public boolean isSetCodigo() {
        return true;
    }

    /**
     * Gets the value of the descricao property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Sets the value of the descricao property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    public boolean isSetDescricao() {
        return (this.descricao != null);
    }

    /**
     * Gets the value of the rubrica property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRubrica() {
        return rubrica;
    }

    /**
     * Sets the value of the rubrica property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRubrica(String value) {
        this.rubrica = value;
    }

    public boolean isSetRubrica() {
        return (this.rubrica != null);
    }

    /**
     * Gets the value of the percentual property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getPercentual() {
        return percentual;
    }

    /**
     * Sets the value of the percentual property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setPercentual(BigDecimal value) {
        this.percentual = value;
    }

    public boolean isSetPercentual() {
        return (this.percentual != null);
    }

    /**
     * Gets the value of the aliqISS property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getAliqISS() {
        return aliqISS;
    }

    /**
     * Sets the value of the aliqISS property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setAliqISS(BigDecimal value) {
        this.aliqISS = value;
    }

    public boolean isSetAliqISS() {
        return (this.aliqISS != null);
    }

    /**
     * Gets the value of the aliqICMS property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getAliqICMS() {
        return aliqICMS;
    }

    /**
     * Sets the value of the aliqICMS property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setAliqICMS(BigDecimal value) {
        this.aliqICMS = value;
    }

    public boolean isSetAliqICMS() {
        return (this.aliqICMS != null);
    }

    /**
     * Gets the value of the aliqPis property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getAliqPis() {
        return aliqPis;
    }

    /**
     * Sets the value of the aliqPis property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setAliqPis(BigDecimal value) {
        this.aliqPis = value;
    }

    public boolean isSetAliqPis() {
        return (this.aliqPis != null);
    }

    /**
     * Gets the value of the aliqCofins property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getAliqCofins() {
        return aliqCofins;
    }

    /**
     * Sets the value of the aliqCofins property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setAliqCofins(BigDecimal value) {
        this.aliqCofins = value;
    }

    public boolean isSetAliqCofins() {
        return (this.aliqCofins != null);
    }

    /**
     * Gets the value of the aliqINSS property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getAliqINSS() {
        return aliqINSS;
    }

    /**
     * Sets the value of the aliqINSS property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setAliqINSS(BigDecimal value) {
        this.aliqINSS = value;
    }

    public boolean isSetAliqINSS() {
        return (this.aliqINSS != null);
    }

    /**
     * Gets the value of the rubricaIncidencia property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rubricaIncidencia property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRubricaIncidencia().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RubricaIncidencia }
     */
    public List<RubricaIncidencia> getRubricaIncidencia() {
        if (rubricaIncidencia == null) {
            rubricaIncidencia = new ArrayList<RubricaIncidencia>();
        }
        return this.rubricaIncidencia;
    }

    public boolean isSetRubricaIncidencia() {
        return ((this.rubricaIncidencia != null) && (!this.rubricaIncidencia.isEmpty()));
    }

    public void unsetRubricaIncidencia() {
        this.rubricaIncidencia = null;
    }

    /**
     * Gets the value of the categoriaIsenta property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoriaIsenta property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoriaIsenta().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategoriaIsenta }
     */
    public List<CategoriaIsenta> getCategoriaIsenta() {
        if (categoriaIsenta == null) {
            categoriaIsenta = new ArrayList<CategoriaIsenta>();
        }
        return this.categoriaIsenta;
    }

    public boolean isSetCategoriaIsenta() {
        return ((this.categoriaIsenta != null) && (!this.categoriaIsenta.isEmpty()));
    }

    public void unsetCategoriaIsenta() {
        this.categoriaIsenta = null;
    }
}
