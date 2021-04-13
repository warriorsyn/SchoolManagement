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
public class Matricula {

    private long codigo;

    private byte mesMatricula;

    private short anoMatricula;

    public Matricula() {
    }

    public Matricula(long codigo, byte mesMatricula, short anoMatricula) {
        this.codigo = codigo;
        this.mesMatricula = mesMatricula;
        this.anoMatricula = anoMatricula;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public byte getMesMatricula() {
        return mesMatricula;
    }

    public void setMesMatricula(byte mesMatricula) {
        this.mesMatricula = mesMatricula;
    }

    public short getAnoMatricula() {
        return anoMatricula;
    }

    public void setAnoMatricula(short anoMatricula) {
        this.anoMatricula = anoMatricula;
    }
}

