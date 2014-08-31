package br.com.jjv.sintraf.dao;

import br.com.jjv.sintraf.entidades.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author Vanderlan Gomes
 */
public class UsuarioDAO implements Serializable{
    
    @Inject
    private EntityManager entityManager;
    
    public UsuarioDAO(){
        
    }

    public void create(Usuario usuario) {
        entityManager.getTransaction().begin();
        entityManager.persist(usuario);
        entityManager.getTransaction().commit();
    }

    public void update(Usuario usuario) {
        entityManager.merge(usuario);
    }
    
    public void delete(Usuario usuario) {
        entityManager.remove(usuario);
    }

    
    public List<Usuario> findAll() {
        return entityManager.createQuery("from Usuario adm").getResultList();
    }

    
    public Usuario findById(Usuario id) {
        return entityManager.find(Usuario.class, id);
    }
    
}
