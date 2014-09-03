package br.com.jjv.sintraf.dao;

import br.com.jjv.sintraf.entidades.Usuario;
import br.com.jjv.sintraf.persistencia.EntityManagerProducer;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Vanderlan Gomes
 */
public  class UsuarioDAO implements Serializable {

    private EntityManager entityManager;
    private EntityManagerProducer em;

    public UsuarioDAO() {
        inicializarEntityManagerCreator();
        entityManager = em.create();
    }

    private void inicializarEntityManagerCreator() {
        em = new EntityManagerProducer();
    }

    public void create(Usuario usuario) {
        entityManager.getTransaction().begin();
        entityManager.persist(usuario);
        entityManager.getTransaction().commit();
        entityManager.close();

    }

    public void update(Usuario usuario) {
        entityManager.getTransaction().begin();
        entityManager.refresh(usuario);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void delete(Usuario usuario) {
        entityManager.getTransaction().begin();
        entityManager.remove(usuario);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public List<Usuario> findAll() {
        return entityManager.createQuery("from Usuario adm").getResultList();
    }

    public Usuario findById(Usuario id) {
        return entityManager.find(Usuario.class, id);
    }

}
