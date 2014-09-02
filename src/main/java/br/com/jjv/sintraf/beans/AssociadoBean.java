/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jjv.sintraf.beans;


import br.com.jjv.sintraf.entidades.Associado;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.event.FlowEvent;

/**
 *
 * @author jefferson
 */

@ManagedBean
@RequestScoped
public class AssociadoBean {
    
    private Associado associado = new Associado();

    public AssociadoBean() {
    }

    
    public Associado getAssociado() {
        return associado;
    }

    public void setAssociado(Associado associado) {
        this.associado = associado;
    }
    
    
    private String nome = "wefsdjvs-podjsvd";

    public String getNome() {
        return nome;
    }
    
}
