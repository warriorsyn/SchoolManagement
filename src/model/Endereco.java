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
public class Endereco {
    
    private String logradouro;
    
    private String numero;
    
    private String complemento;
    
    private String cep;
    
    private String bairro;
    
    private String cidade;
    
    private String uf;
    
    public Endereco() {
        
    }

    public Endereco(String logradouro, String numero, String complemento, String cep, String bairro, String cidade, String uf) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }
}

