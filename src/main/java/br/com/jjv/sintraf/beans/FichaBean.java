package br.com.jjv.sintraf.beans;

import br.com.jjv.sintraf.persistencia.EntityManagerProducer;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author vanderlan
 */
@ManagedBean(name = "fichaBean")
@RequestScoped
public class FichaBean {

    private String busca;
    private EntityManager entityManager;
    
    public FichaBean() {
        entityManager = EntityManagerProducer.getEntityManager();
    
    }
    
    public List<String> complete(String pesquisa) {
      
      Query query =   entityManager.createNativeQuery("SELECT us_nome FROM usuario WHERE "
              + "us_nome LIKE '%"+pesquisa+"%'");
      return query.getResultList();
    }

    public String getbusca() {
        return busca;
    }

    public void setBusca(String busca) {
        this.busca = busca;
    }
    
}
