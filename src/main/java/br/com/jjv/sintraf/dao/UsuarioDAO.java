package br.com.jjv.sintraf.dao;

import br.com.jjv.sintraf.entidades.Usuario;
import br.com.jjv.sintraf.jsf.JsfUtil;
import java.io.Serializable;
import java.util.List;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Vanderlan Gomes
 */
public class UsuarioDAO extends AbstractDAO<Usuario> implements Serializable {


    public UsuarioDAO() {
        
        super(Usuario.class);
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

    @Override
    public void create(Usuario usuario) {

        try {

            getEntityManager().getTransaction().begin();
            getEntityManager().persist(usuario);
            getEntityManager().getTransaction().commit();

            JsfUtil.addSuccessMessage("Usuário " + usuario.getLogin() + " cadastrado com sucesso!");

        } catch (Exception e) {

            JsfUtil.addErrorMessage("Erro ao cadastrar usuário. Verifique os campos e tente novamente");
        }

    }

    @Override
    public void update(Usuario usuario) {
        try {

            getEntityManager().getTransaction().begin();
            getEntityManager().merge(usuario);
            getEntityManager().getTransaction().commit();

            JsfUtil.addSuccessMessage("Informações alteradas e salvas!");

        } catch (Exception e) {

            JsfUtil.addErrorMessage(e.getMessage());
        }
    }

    @Override
    @SuppressWarnings("empty-statement")
    public void delete(Usuario usuario) {

        try {
            getEntityManager().getTransaction().begin();
            getEntityManager().remove(usuario);
            getEntityManager().getTransaction().commit();

           JsfUtil.addSuccessMessage("Usuário removido com sucesso!");;

        } catch (Exception e) {

            JsfUtil.addErrorMessage(e.getMessage());
        }
    }
    public List<Usuario> findByUser(Usuario user) {
        //Criador de consultas baseadas em Criteria
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        //Query Criteria

        CriteriaQuery<Usuario> criteriaQuery = criteriaBuilder.createQuery(Usuario.class);
        Root<Usuario> usu = criteriaQuery.from(Usuario.class);

        criteriaQuery.where(criteriaBuilder.equal(usu.get("login"), user.getLogin()));
        criteriaQuery.where(criteriaBuilder.equal(usu.get("nome"), user.getNome()));

        TypedQuery<Usuario> typedQuery = getEntityManager().createQuery(criteriaQuery);

        return typedQuery.getResultList();
    }

    public List<Usuario> autenticacao(Usuario user) {
        //Criador de consultas baseadas em Criteria
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        //Query Criteria

        CriteriaQuery<Usuario> criteriaQuery = criteriaBuilder.createQuery(Usuario.class);
        Root<Usuario> usu = criteriaQuery.from(Usuario.class);

        criteriaQuery.where(criteriaBuilder.equal(usu.get("login"), user.getLogin()));
        criteriaQuery.where(criteriaBuilder.equal(usu.get("senha"), user.getSenha()));

        TypedQuery<Usuario> typedQuery = getEntityManager().createQuery(criteriaQuery);

        return typedQuery.getResultList();
    }
}
