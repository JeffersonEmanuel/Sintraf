package br.com.jjv.sintraf.dao;

import br.com.jjv.sintraf.persistencia.EntityManagerProducer;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Vanderlan Gomes
 * @param <T>
 */
public abstract class AbstractDAO<T> {

    private EntityManager entityManager;
    private Class<T> entity;
    private EntityManagerProducer entityManagerProducer;
    
    public AbstractDAO(Class<T> entityClass) {
        this.entity = entityClass;
        entityManagerProducer = new EntityManagerProducer();
        entityManager = entityManagerProducer.create();
    }

    public void create(T entity) {
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
    }

    public void update(T entity) {
        entityManager.refresh(entity);
        entityManager.getTransaction().commit();
    }

    public void delete(T entity) {
        entityManager.remove(entity);
        entityManager.getTransaction().commit();
    }

    public T findById(Long id) {
        return entityManager.find(entity, id);
    }

    public List<T> findAll() {

        CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entity));
        return getEntityManager().createQuery(cq).getResultList();
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public Class<T> getEntity() {
        return entity;
    }

    public void setEntity(Class<T> entity) {
        this.entity = entity;
    }
    
   public T findByLoginl(String user, String password) {
        //Criador de consultas baseadas em Criteria
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        //Query Criteria
        CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(entity);
        
        Root<T> login = criteriaQuery.from(entity);
        TypedQuery<T> typedQuery = getEntityManager().createQuery(criteriaQuery);
        
        criteriaQuery.where(criteriaBuilder.equal(login.get("login"), user));
        criteriaQuery.where(criteriaBuilder.equal(login.get("password"), password));
        
      
        return typedQuery.getSingleResult();
    }
    
}
