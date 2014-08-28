
package br.com.jjv.sintraf.persistencia;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author vanderlan
 */
@ApplicationScoped
public class EntityManagerProducer {

    private EntityManagerFactory entityManagerFactory;

    public EntityManagerProducer() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("SINTRAF-PU");
    }

    /* This method is a EntityManager Producer at each request, by the Annotations bellow.*/
    @Produces
    @RequestScoped
    public EntityManager create() {
        return entityManagerFactory.createEntityManager();
    }
    
    /* This method close the EntityManager when is requested */
    public void close(@Disposes EntityManager entityManager) {
        entityManager.close();
    }
}
