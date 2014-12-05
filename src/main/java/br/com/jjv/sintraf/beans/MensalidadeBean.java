package br.com.jjv.sintraf.beans;

import br.com.jjv.sintraf.entidades.Mensalidade;
import br.com.jjv.sintraf.services.MensalidadeService;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Vanderlan Gomes
 */
@ManagedBean
@RequestScoped
public class MensalidadeBean {

    
    private Mensalidade mensalidade;
    private List<Mensalidade> mensalidades;
    private MensalidadeService service;
    private String pesquisa;
    private Long idMensalidade;
    
    public MensalidadeBean() {
  
        mensalidade = new Mensalidade();
        service = new MensalidadeService();
        mensalidades = service.findAll();
        
    }

    public Mensalidade getMensalidade() {
        return mensalidade;
    }

    public List<Mensalidade> getMensalidades() {
        return mensalidades;
    }
    
    public List<Mensalidade> getMensalidadesSelecionadas() {
        return mensalidades;
    }
    
     public void buscaMensalidade() {
        
         mensalidade = service.findById(idMensalidade);
         
    }

    public MensalidadeService getService() {
        return service;
    }

    public void setService(MensalidadeService service) {
        this.service = service;
    }

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    public void setMensalidade(Mensalidade mensalidade) {
        this.mensalidade = mensalidade;
    }

    public Long getIdMensalidade() {
        return idMensalidade;
    }

    public void setIdMensalidade(Long idMensalidade) {
        this.idMensalidade = idMensalidade;
    }
    
    public void receberMensalidade(){
        
        mensalidade.setMenSituacao("pag");
        
        service.update(mensalidade);
    }
    
}
