/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jjv.sintraf.beans;

import br.com.jjv.sintraf.entidades.LocalDeTrabalho;
import br.com.jjv.sintraf.enumerats.Estados;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author jefferson
 */
@ManagedBean(name = "localDeTrabalhoBean")
@RequestScoped
public class LocalDeTrabalhoBean implements Serializable {

    public LocalDeTrabalhoBean() {
        localDeTrabalho = new LocalDeTrabalho();
        this.estados = Arrays.asList(Estados.values());
    }
    private List<Estados> estados;
    private LocalDeTrabalho localDeTrabalho;

    public LocalDeTrabalho getLocalDeTrabalho() {
        return localDeTrabalho;
    }

    public void setLocalDeTrabalho(LocalDeTrabalho localDeTrabalho) {
        this.localDeTrabalho = localDeTrabalho;
    }

    public List<Estados> getEstados() {
        return estados;
    }

    public void setEstados(List<Estados> estados) {
        this.estados = estados;
    }

    public Date getDiaData() {
        return new Date();
    }

}
