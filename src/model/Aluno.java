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
public class Aluno extends Pessoa {
    
    private long id;
    
    private String mesNascimento;
    
    private String interesses;

    public Aluno() {
    }

    public Aluno(long id, String mesNascimento, String interesses) {
        this.id = id;
        this.mesNascimento = mesNascimento;
        this.interesses = interesses;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMesNascimento() {
        return mesNascimento;
    }

    public void setMesNascimento(String mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    public String getInteresses() {
        return interesses;
    }

    public void setInteresses(String interesses) {
        this.interesses = interesses;
    }   
}

