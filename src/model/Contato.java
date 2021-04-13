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
public class Contato {
    private String email;
    
    private String linkedin;
    
    private String celular;

    public Contato() {
        
    }
    
    public Contato(String email, String linkedin, String celular) {
        this.email = email;
        this.linkedin = linkedin;
        this.celular = celular;
    }
}
