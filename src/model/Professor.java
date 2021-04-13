/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author joaov
 */
public class Professor extends Pessoa {
    
    private String matricula;
    private Formacao formacao;
    private List<String> disciplinas;
    
    public Professor() {
        super();
    }

    public Professor(String matricula, Formacao formacao) {
        super();
        this.matricula = matricula;
        this.formacao = formacao;
    }
    
    public Professor(String matricula, Formacao formacao, List<String> disciplinas) {
        super();
        this.matricula = matricula;
        this.formacao = formacao;
        this.disciplinas = disciplinas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Formacao getFormacao() {
        return formacao;
    }

    public void setFormacao(Formacao formacao) {
        this.formacao = formacao;
    }

    public List<String> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<String> disciplinas) {
        this.disciplinas = disciplinas;
    }
}


