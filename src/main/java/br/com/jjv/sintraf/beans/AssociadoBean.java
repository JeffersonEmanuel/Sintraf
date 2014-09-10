package br.com.jjv.sintraf.beans;

import br.com.jjv.sintraf.entidades.Associado;
import br.com.jjv.sintraf.entidades.LocalDeTrabalho;
import br.com.jjv.sintraf.enumerats.Estados;
import br.com.jjv.sintraf.services.SocioService;
import com.google.common.collect.Lists;
import java.awt.event.ActionEvent;
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
@ManagedBean(name = "associadoBean")
@RequestScoped
public class AssociadoBean implements Serializable{

    private Associado associado;
    private List<Estados> estados;
    private List<LocalDeTrabalho> locaisDeTrabalho;
    private SocioService service;
    
    public AssociadoBean() {
        service = new SocioService();
        associado = new Associado();
        this.estados = Arrays.asList(Estados.values());
        associado.setDataDeFiliacao(new Date());
    }

    public List<Estados> getEstados() {
        return estados;
    }

    public void setEstados(List<Estados> estados) {
        this.estados = estados;
    }
    
    public Associado getAssociado() {
        return associado;
    }

    public void setAssociado(Associado associado) {
        this.associado = associado;
    }
    
    public void salvar () {
        service.create(this.associado);
    }

    public List<LocalDeTrabalho> getLocaisDeTrabalho() {
        return locaisDeTrabalho;
    }

    public void setLocaisDeTrabalho(List<LocalDeTrabalho> locaisDeTrabalho) {
        this.locaisDeTrabalho = locaisDeTrabalho;
    }

    public SocioService getService() {
        return service;
    }

    public void setService(SocioService service) {
        this.service = service;
    }
    

}
