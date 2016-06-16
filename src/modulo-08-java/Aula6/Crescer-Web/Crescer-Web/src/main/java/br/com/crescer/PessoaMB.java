/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.crescer;

import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author FERNANDO
 */

@ManagedBean
@ViewScoped
public class PessoaMB extends Pessoa implements Serializable{

    public final ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
    
    public void addicionaPessoa(){
        pessoas.add(new Pessoa(this.nome, this.idade, this.sexo));
    }

    public ArrayList<Pessoa> getPessoas() {
        return this.pessoas;
    }
    
}
