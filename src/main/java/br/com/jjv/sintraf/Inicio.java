
package br.com.jjv.sintraf;

import br.com.jjv.sintraf.entidades.Usuario;
import br.com.jjv.sintraf.persistencia.EntityManagerProducer;
import javax.persistence.EntityManager;

/**
 *
 * @author vanderlan
 */
public class Inicio {
    
    public static void main(String[] args) {
      
        EntityManagerProducer em = new EntityManagerProducer();
        
        EntityManager en = em.create();
        
        Usuario user = new Usuario();
        user.setLogin("Vanderlan");
        user.setSenha("123");
        user.setNome("Vanderlan Gomes");
        
        
        en.getTransaction().begin();
        en.persist(user);
        en.getTransaction().commit();
        en.close();
    }

}
