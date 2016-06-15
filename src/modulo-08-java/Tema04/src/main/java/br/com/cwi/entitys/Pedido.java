/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.entitys;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author fernando.leandro
 */
@Entity
@Table(name = "PEDIDO")
@NamedQueries({
    @NamedQuery(name = "Pedido.findAll", query = "SELECT p FROM Pedido p"),
    @NamedQuery(name = "Pedido.findByIdpedido", query = "SELECT p FROM Pedido p WHERE p.idpedido = :idpedido"),
    @NamedQuery(name = "Pedido.findByDatapedido", query = "SELECT p FROM Pedido p WHERE p.datapedido = :datapedido"),
    @NamedQuery(name = "Pedido.findByDataentrega", query = "SELECT p FROM Pedido p WHERE p.dataentrega = :dataentrega"),
    @NamedQuery(name = "Pedido.findByValorpedido", query = "SELECT p FROM Pedido p WHERE p.valorpedido = :valorpedido"),
    @NamedQuery(name = "Pedido.findBySituacao", query = "SELECT p FROM Pedido p WHERE p.situacao = :situacao")})
public class Pedido implements Serializable {

    @Id
    @Basic(optional = false)
    @Column(name = "IDPEDIDO")
    private long idpedido;
    
    @Basic(optional = false)
    @Column(name = "DATAPEDIDO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datapedido;
    
    @Column(name = "DATAENTREGA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataentrega;
    
    @Basic(optional = false)
    @Column(name = "VALORPEDIDO")
    private BigDecimal valorpedido;
    
    @Basic(optional = false)
    @Column(name = "SITUACAO")
    private Character situacao;
    
    @JoinColumn(name = "IDCLIENTE", referencedColumnName = "IDCLIENTE")
    @ManyToOne(optional = false)
    private Cliente idcliente;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idpedido")
    private List<Pedidoitem> pedidoitemList;

    public Pedido() {
    }

    public Pedido(long idpedido) {
        this.idpedido = idpedido;
    }

    public Pedido(long idpedido, Date datapedido, BigDecimal valorpedido, Character situacao) {
        this.idpedido = idpedido;
        this.datapedido = datapedido;
        this.valorpedido = valorpedido;
        this.situacao = situacao;
    }

    public long getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(long idpedido) {
        this.idpedido = idpedido;
    }

    public Date getDatapedido() {
        return datapedido;
    }

    public void setDatapedido(Date datapedido) {
        this.datapedido = datapedido;
    }

    public Date getDataentrega() {
        return dataentrega;
    }

    public void setDataentrega(Date dataentrega) {
        this.dataentrega = dataentrega;
    }

    public BigDecimal getValorpedido() {
        return valorpedido;
    }

    public void setValorpedido(BigDecimal valorpedido) {
        this.valorpedido = valorpedido;
    }

    public Character getSituacao() {
        return situacao;
    }

    public void setSituacao(Character situacao) {
        this.situacao = situacao;
    }

    public Cliente getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Cliente idcliente) {
        this.idcliente = idcliente;
    }

    public List<Pedidoitem> getPedidoitemList() {
        return pedidoitemList;
    }

    public void setPedidoitemList(List<Pedidoitem> pedidoitemList) {
        this.pedidoitemList = pedidoitemList;
    }
}
