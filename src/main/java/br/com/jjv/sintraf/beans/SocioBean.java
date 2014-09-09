package br.com.jjv.sintraf.beans;

import br.com.jjv.sintraf.entidades.Socio;
import br.com.jjv.sintraf.entidades.LocalDeTrabalho;
import br.com.jjv.sintraf.enumerats.Estados;
import br.com.jjv.sintraf.services.SocioService;
import com.google.common.collect.Lists;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author jefferson
 */
@ManagedBean
@RequestScoped
public class SocioBean implements Serializable{

    private Socio socio;
    private List<Estados> estados;
    private List<LocalDeTrabalho> imovel;
    private SocioService service;
    
    public SocioBean() {
        service = new SocioService();
        socio = new Socio();
        this.estados = Arrays.asList(Estados.values());
    }

    public List<Estados> getEstados() {
        return estados;
    }

    public void setEstados(List<Estados> estados) {
        this.estados = estados;
    }
    
    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }
    
    public void salvar () {
        service.create(socio);
    }

}
