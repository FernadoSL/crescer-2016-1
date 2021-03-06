/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.entitys;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author fernando.leandro
 */
@Entity
@Table(name = "MATERIAL")
@NamedQueries({
    @NamedQuery(name = "Material.findAll", query = "SELECT m FROM Material m"),
    @NamedQuery(name = "Material.findByIdmaterial", query = "SELECT m FROM Material m WHERE m.idmaterial = :idmaterial"),
    @NamedQuery(name = "Material.findByDescricao", query = "SELECT m FROM Material m WHERE m.descricao = :descricao"),
    @NamedQuery(name = "Material.findByPesoliquido", query = "SELECT m FROM Material m WHERE m.pesoliquido = :pesoliquido"),
    @NamedQuery(name = "Material.findByPrecocusto", query = "SELECT m FROM Material m WHERE m.precocusto = :precocusto")})
public class Material implements Serializable {

    @Id
    @Basic(optional = false)
    @Column(name = "IDMATERIAL")
    private long idmaterial;
    
    @Basic(optional = false)
    @Column(name = "DESCRICAO")
    private String descricao;
    
    @Basic(optional = false)
    @Column(name = "PESOLIQUIDO")
    private BigDecimal pesoliquido;
    
    @Basic(optional = false)
    @Column(name = "PRECOCUSTO")
    private BigDecimal precocusto;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idmaterial")
    private List<Produtomaterial> produtomaterialList;

    public Material() {
    }

    public Material(long idmaterial) {
        this.idmaterial = idmaterial;
    }

    public Material(long idmaterial, String descricao, BigDecimal pesoliquido, BigDecimal precocusto) {
        this.idmaterial = idmaterial;
        this.descricao = descricao;
        this.pesoliquido = pesoliquido;
        this.precocusto = precocusto;
    }

    public long getIdmaterial() {
        return idmaterial;
    }

    public void setIdmaterial(long idmaterial) {
        this.idmaterial = idmaterial;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPesoliquido() {
        return pesoliquido;
    }

    public void setPesoliquido(BigDecimal pesoliquido) {
        this.pesoliquido = pesoliquido;
    }

    public BigDecimal getPrecocusto() {
        return precocusto;
    }

    public void setPrecocusto(BigDecimal precocusto) {
        this.precocusto = precocusto;
    }

    public List<Produtomaterial> getProdutomaterialList() {
        return produtomaterialList;
    }

    public void setProdutomaterialList(List<Produtomaterial> produtomaterialList) {
        this.produtomaterialList = produtomaterialList;
    }  
}
