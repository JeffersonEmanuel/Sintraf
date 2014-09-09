package br.com.jjv.sintraf.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Vanderlan Gomes
 */
public class EntityManagerProducer {

    private static final EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("SINTRAF-PU");

    public EntityManagerProducer() {

    }

    public static EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }
}
