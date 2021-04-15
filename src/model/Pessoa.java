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
public class Pessoa {
      
    private String nome;
    
    private String idade;
    
    private String rg;
    
    private String sexo;
    
    private String cpf;
    
    public Pessoa() {
       
    }

    public Pessoa(String nome, String idade, String rg, String sexo, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.rg = rg;
        this.sexo = sexo;
        this.cpf = cpf;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setIdade(String idade) {
        this.idade = idade;
    }
    
    public String getIdade() {
        return this.idade;
    }
    
    public void setRg(String rg) {
        this.rg = rg;
    }
    
    public String getRg() {
        return this.rg;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public String getSexo() {
        return this.sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}



