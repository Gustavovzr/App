package com.inimasmart.app.model.vo;

import java.io.Serializable;
import java.util.List;

public class TurnoVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private int Id;
    private int IdEquipe;
    private String DtAbertura;
    private String DtEncerramento;
    private int IdAutomovel;
    private String IdSupervisor;
    private int KmInicial;
    private int KmFinal;
    private String NomeSupervisor;
    private String Observacao;
    private int OrigemCriacao;
    private String Pin;
    private List<TurnoColaboradorVO> Colaboradores;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getIdEquipe() {
        return IdEquipe;
    }

    public void setIdEquipe(int idEquipe) {
        IdEquipe = idEquipe;
    }

    public String getDtAbertura() {
        return DtAbertura;
    }

    public void setDtAbertura(String dtAbertura) {
        DtAbertura = dtAbertura;
    }

    public String getDtEncerramento() {
        return DtEncerramento;
    }

    public void setDtEncerramento(String dtEncerramento) {
        DtEncerramento = dtEncerramento;
    }

    public int getIdAutomovel() {
        return IdAutomovel;
    }

    public void setIdAutomovel(int idAutomovel) {
        IdAutomovel = idAutomovel;
    }

    public String getIdSupervisor() {
        return IdSupervisor;
    }

    public void setIdSupervisor(String idSupervisor) {
        IdSupervisor = idSupervisor;
    }

    public int getKmInicial() {
        return KmInicial;
    }

    public void setKmInicial(int kmInicial) {
        KmInicial = kmInicial;
    }

    public int getKmFinal() {
        return KmFinal;
    }

    public void setKmFinal(int kmFinal) {
        KmFinal = kmFinal;
    }

    public String getNomeSupervisor() {
        return NomeSupervisor;
    }

    public void setNomeSupervisor(String nomeSupervisor) {
        NomeSupervisor = nomeSupervisor;
    }

    public String getObservacao() {
        return Observacao;
    }

    public void setObservacao(String observacao) {
        Observacao = observacao;
    }

    public int getOrigemCriacao() {
        return OrigemCriacao;
    }

    public void setOrigemCriacao(int origemCriacao) {
        OrigemCriacao = origemCriacao;
    }

    public String getPin() {
        return Pin;
    }

    public void setPin(String pin) {
        Pin = pin;
    }

    public List<TurnoColaboradorVO> getColaboradores() {
        return Colaboradores;
    }

    public void setColaboradores(List<TurnoColaboradorVO> colaboradores) {
        Colaboradores = colaboradores;
    }

}
