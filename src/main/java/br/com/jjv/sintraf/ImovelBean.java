/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jjv.sintraf;

import br.com.jjv.sintraf.entidades.Socio;
import br.com.jjv.sintraf.entidades.LocalDeTrabalho;
import br.com.jjv.sintraf.enumerats.Estados;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author jefferson
 */
@ManagedBean
@RequestScoped
public class ImovelBean implements Serializable{


    public ImovelBean() {
        imovel = new LocalDeTrabalho();
        this.estados = Arrays.asList(Estados.values());
    }
    private List<Estados> estados;
    private LocalDeTrabalho imovel;

    public LocalDeTrabalho getImovel() {
        return imovel;
    }

    public void setImovel(LocalDeTrabalho imovel) {
        this.imovel = imovel;
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
