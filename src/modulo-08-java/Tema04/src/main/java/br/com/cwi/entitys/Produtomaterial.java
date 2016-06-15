/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.entitys;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author fernando.leandro
 */
@Entity
@Table(name = "PRODUTOMATERIAL")
@NamedQueries({
    @NamedQuery(name = "Produtomaterial.findAll", query = "SELECT p FROM Produtomaterial p"),
    @NamedQuery(name = "Produtomaterial.findByIdprodutomaterial", query = "SELECT p FROM Produtomaterial p WHERE p.idprodutomaterial = :idprodutomaterial"),
    @NamedQuery(name = "Produtomaterial.findByQuantidade", query = "SELECT p FROM Produtomaterial p WHERE p.quantidade = :quantidade")})
public class Produtomaterial implements Serializable {

    @Id
    @Basic(optional = false)
    @Column(name = "IDPRODUTOMATERIAL")
    private long idprodutomaterial;
    
    @Column(name = "QUANTIDADE")
    private BigDecimal quantidade;
    
    @JoinColumn(name = "IDMATERIAL", referencedColumnName = "IDMATERIAL")
    @ManyToOne(optional = false)
    private Material idmaterial;
    
    @JoinColumn(name = "IDPRODUTO", referencedColumnName = "IDPRODUTO")
    @ManyToOne(optional = false)
    private Produto idproduto;

    public Produtomaterial() {
    }

    public Produtomaterial(long idprodutomaterial) {
        this.idprodutomaterial = idprodutomaterial;
    }

    public long getIdprodutomaterial() {
        return idprodutomaterial;
    }

    public void setIdprodutomaterial(long idprodutomaterial) {
        this.idprodutomaterial = idprodutomaterial;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public Material getIdmaterial() {
        return idmaterial;
    }

    public void setIdmaterial(Material idmaterial) {
        this.idmaterial = idmaterial;
    }

    public Produto getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(Produto idproduto) {
        this.idproduto = idproduto;
    }   
}
