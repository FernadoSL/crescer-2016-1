/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.SEQUENCE;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author fernando.leandro
 */
@Entity
@Table(name = "PESSOA")
public class Pessoa implements Serializable{

    public Pessoa() {
    }
    
    @Id // Identifica a PK
    @GeneratedValue(strategy = SEQUENCE, generator = "SEQ_PESSOA")
    @SequenceGenerator(name = "SEQ_PESSOA", sequenceName = "SEQ_PESSOA")
    @Basic(optional = false)
    @Column(name = "ID_PESSOA")
    private Long idPessoa;

    @Basic(optional = false)
    @Column(name = "NM_PESSOA")
    private String nmPessoa;

    public Long getIdPessoa() {
        return idPessoa;
    }

    public String getNmPessoa() {
        return nmPessoa;
    }

    public void setIdPessoa(Long idPessoa) {
        this.idPessoa = idPessoa;
    }

    public void setNmPessoa(String nmPessoa) {
        this.nmPessoa = nmPessoa;
    }
    
    

}
