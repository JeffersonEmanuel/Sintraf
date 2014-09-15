
package br.com.jjv.sintraf;

import br.com.jjv.sintraf.entidades.Associado;
import br.com.jjv.sintraf.persistencia.EntityManagerProducer;
import java.util.Date;
import javax.persistence.EntityManager;

/**
 *
 * @author vanderlan
 */
public class Inicio {
    
    public static void main(String[] args) {
      
        
        EntityManager en = EntityManagerProducer.getEntityManager();
        
        Associado user = new Associado();
        user.setNome("Vanderlan Gomes");
        user.setMatricula(2L);
        user.setDataDeFiliacao(new Date());
        
        en.getTransaction().begin();
        en.persist(user);
        en.getTransaction().commit();
        en.close();
    }

}
