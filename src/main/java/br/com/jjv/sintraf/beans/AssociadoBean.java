package br.com.jjv.sintraf.beans;

import br.com.jjv.sintraf.entidades.Associado;
import br.com.jjv.sintraf.enumerats.Estados;
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
public class AssociadoBean implements Serializable{

    private Associado associado;
    private List<Estados> estados;
    
    public AssociadoBean() {
        associado = new Associado();
        this.estados = Arrays.asList(Estados.values());
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

}
