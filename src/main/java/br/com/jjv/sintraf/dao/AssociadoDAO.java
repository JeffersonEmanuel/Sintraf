package br.com.jjv.sintraf.dao;

import br.com.jjv.sintraf.entidades.Associado;
import br.com.jjv.sintraf.entidades.Associado;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author jefferson
 */
public class AssociadoDAO extends AbstractDAO<Associado> implements Serializable {

    public AssociadoDAO() {
        super(Associado.class);
    }

    public Long getNumMatricula() {
        Query q = getEntityManager().createNativeQuery("select max(id_sc_matricula) from associado");
        System.out.println((Long) q.getSingleResult());
        return (Long) q.getSingleResult();
    }

    public List<String> autocomplete(String query) {
        Query queryComplete = getEntityManager().
                createNativeQuery("SELECT sc_nome FROM associado WHERE sc_nome LIKE '%" + query + "%' ORDER BY sc_nome ASC");

        List<String> results = queryComplete.getResultList();

        return results;
    }

    public Associado carregaAssociado(String nome) {

        //Criador de consultas baseadas em Criteria
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        //Query Criteria
        Associado associado = new Associado();

        CriteriaQuery<Associado> criteriaQuery = criteriaBuilder.createQuery(Associado.class);
        Root<Associado> usu = criteriaQuery.from(Associado.class);

        criteriaQuery.where(criteriaBuilder.equal(usu.get("nome"), nome));

        TypedQuery<Associado> typedQuery = getEntityManager().createQuery(criteriaQuery);

        associado = typedQuery.getSingleResult();

        return associado;

    }
}
