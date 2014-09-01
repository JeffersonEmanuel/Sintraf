/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jjv.sintraf.beans;


import br.com.jjv.sintraf.entidades.Associado;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.event.FlowEvent;

/**
 *
 * @author jefferson
 */

@Named(value = "associadoBean")
@RequestScoped
public class AssociadoBean {
    
    private Associado associado;

    public AssociadoBean() {
    }

    
    public Associado getAssociado() {
        return associado;
    }

    public void setAssociado(Associado associado) {
        this.associado = associado;
    }
    
    
}
