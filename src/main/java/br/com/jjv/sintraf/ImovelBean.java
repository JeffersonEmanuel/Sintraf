/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jjv.sintraf;

import br.com.jjv.sintraf.entidades.Associado;
import br.com.jjv.sintraf.entidades.Imovel;
import br.com.jjv.sintraf.enumerats.Estados;
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
public class ImovelBean {

    public ImovelBean() {
        imovel = new Imovel();
        this.estados = Arrays.asList(Estados.values());
    }
    private List<Estados> estados;
    private Imovel imovel;

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public List<Estados> getEstados() {
        return estados;
    }

    public void setEstados(List<Estados> estados) {
        this.estados = estados;
    }

    public Date getData () {
        return new Date();
    }
    
    
}
