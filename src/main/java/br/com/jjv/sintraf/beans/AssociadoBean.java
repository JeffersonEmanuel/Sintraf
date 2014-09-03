package br.com.jjv.sintraf.beans;


import br.com.jjv.sintraf.entidades.Associado;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author jefferson
 */

@ManagedBean
@RequestScoped
public class AssociadoBean {
    
    private Associado associado;

    public AssociadoBean() {
        
        associado = new Associado();
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
