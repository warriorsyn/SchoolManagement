/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author joaov
 */
public class Formacao {
    private String nome;
    
    private String Instituicao;
    
    private String anoConslusao;

    public Formacao() {
    }

    public Formacao(String nome, String Instituicao, String anoConslusao) {
        this.nome = nome;
        this.Instituicao = Instituicao;
        this.anoConslusao = anoConslusao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInstituicao() {
        return Instituicao;
    }

    public void setInstituicao(String Instituicao) {
        this.Instituicao = Instituicao;
    }

    public String getAnoConslusao() {
        return anoConslusao;
    }

    public void setAnoConslusao(String anoConslusao) {
        this.anoConslusao = anoConslusao;
    }
}

