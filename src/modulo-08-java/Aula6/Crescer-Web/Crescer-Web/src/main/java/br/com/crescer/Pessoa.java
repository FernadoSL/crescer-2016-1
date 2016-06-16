/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.crescer;

/**
 *
 * @author FERNANDO
 */

public class Pessoa {
    
    protected String nome;
    protected int idade;
    protected Sexo sexo;

    public Pessoa(){
        
    }
    
    public Pessoa(String nome, int idade, Sexo sexo){
        this.idade = idade;
        this.nome = nome;
        this.sexo = sexo;
    }
    
    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
