/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.crescer;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/** 
 *
 * @author fernando.leandro
 */
@ManagedBean
@ViewScoped
public class Hello implements Serializable{

    private String helloWorld = "Hello World!";
    
    //@PreDestroy executa antes de terminar a instancia que vai depedender do @____Scoped
    //@PostConstruct executa quando eh requisitado

    public String getHelloWorld() {
        return helloWorld;
    }

    public void setHelloWorld(String helloWorld) {
        this.helloWorld = helloWorld;
    }

}
