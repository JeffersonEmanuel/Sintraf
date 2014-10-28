package br.com.jjv.sintraf.dao;

import br.com.jjv.sintraf.entidades.Associado;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;

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
                createNativeQuery("SELECT sc_nome FROM associado WHERE sc_nome LIKE '%"+query+"%' ORDER BY sc_nome ASC");

        List<String> results = queryComplete.getResultList();

        return results;
    }
}
