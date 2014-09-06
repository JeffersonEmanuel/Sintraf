package br.com.jjv.sintraf.dao;

import br.com.jjv.sintraf.entidades.Usuario;
import br.com.jjv.sintraf.jsf.JsfUtil;
import br.com.jjv.sintraf.persistencia.EntityManagerProducer;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Vanderlan Gomes
 */
public class UsuarioDAO implements Serializable {

    private EntityManager entityManager;
    private EntityManagerProducer em;

    public UsuarioDAO() {
        inicializarEntityManagerCreator();
        entityManager = em.create();
    }

    private void inicializarEntityManagerCreator() {
        em = new EntityManagerProducer();
    }

    public boolean validate(Usuario usuario) {

        if (findByUser(usuario).isEmpty()) {
            create(usuario);
            return true;
        } else {

            for (Usuario u : findByUser(usuario)) {
                System.err.println(u.getLogin());
            }

            JsfUtil.addErrorMessage("Já Existe um usuário com o mesmo nome e/ou Login");
            return false;
        }

    }

    public void create(Usuario usuario) {

        try {

            entityManager.getTransaction().begin();
            entityManager.persist(usuario);
            entityManager.getTransaction().commit();

            JsfUtil.addSuccessMessage("Usuário " + usuario.getLogin() + " cadastrado com sucesso!");

        } catch (Exception e) {

            JsfUtil.addErrorMessage("Erro ao cadastrar usuário. Verifique os campos e tente novamente");
        }

    }

    public void update(Usuario usuario) {
           try {

            entityManager.getTransaction().begin();
            entityManager.merge(usuario);
            entityManager.getTransaction().commit();

            JsfUtil.addSuccessMessage("Informações alteradas e salvas!");

        } catch (Exception e) {

            JsfUtil.addErrorMessage(e.getMessage());
        }
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

    public List<Usuario> findByUser(Usuario user) {
        //Criador de consultas baseadas em Criteria
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        //Query Criteria

        CriteriaQuery<Usuario> criteriaQuery = criteriaBuilder.createQuery(Usuario.class);
        Root<Usuario> usu = criteriaQuery.from(Usuario.class);

        criteriaQuery.where(criteriaBuilder.equal(usu.get("login"), user.getLogin()));
        criteriaQuery.where(criteriaBuilder.equal(usu.get("nome"), user.getNome()));

        TypedQuery<Usuario> typedQuery = entityManager.createQuery(criteriaQuery);

        return typedQuery.getResultList();
    }

    public List<Usuario> autenticacao(Usuario user) {
        //Criador de consultas baseadas em Criteria
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        //Query Criteria

        CriteriaQuery<Usuario> criteriaQuery = criteriaBuilder.createQuery(Usuario.class);
        Root<Usuario> usu = criteriaQuery.from(Usuario.class);

        criteriaQuery.where(criteriaBuilder.equal(usu.get("login"), user.getLogin()));
        criteriaQuery.where(criteriaBuilder.equal(usu.get("senha"), user.getSenha()));

        TypedQuery<Usuario> typedQuery = entityManager.createQuery(criteriaQuery);

        return typedQuery.getResultList();
    }

    public Usuario findById(Long id) {

        return entityManager.find(Usuario.class, id);

    }
}
