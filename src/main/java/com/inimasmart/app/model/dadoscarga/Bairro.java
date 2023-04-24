package com.inimasmart.app.model.dadoscarga;

public class Bairro {

    protected int codigoBairro;
    protected String descricao;
    protected String cidade;

    /**
     * Gets the value of the codigoBairro property.
     */
    public int getCodigoBairro() {
        return codigoBairro;
    }

    /**
     * Sets the value of the codigoBairro property.
     */
    public void setCodigoBairro(int value) {
        this.codigoBairro = value;
    }

    public boolean isSetCodigoBairro() {
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
     * Gets the value of the cidade property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * Sets the value of the cidade property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCidade(String value) {
        this.cidade = value;
    }

    public boolean isSetCidade() {
        return (this.cidade != null);
    }
}
