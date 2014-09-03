
package br.com.jjv.sintraf.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author vanderlan
 */
public class EntityManagerProducer {

    private static EntityManagerFactory entityManagerFactory;

    public EntityManagerProducer() {
        entityManagerFactory = Persistence.createEntityManagerFactory("SINTRAF-PU");
    }

    public EntityManager create() {
        return entityManagerFactory.createEntityManager();
    }
    
    /* This method close the EntityManager when is requested */
    public void close(EntityManager entityManager) {
        entityManager.close();
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

    public static void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
        EntityManagerProducer.entityManagerFactory = entityManagerFactory;
    }
}
