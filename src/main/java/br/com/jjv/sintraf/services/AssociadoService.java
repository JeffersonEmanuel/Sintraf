package br.com.jjv.sintraf.services;

import br.com.jjv.sintraf.dao.AssociadoDAO;
import br.com.jjv.sintraf.entidades.Associado;
import br.com.jjv.sintraf.entidades.Mensalidade;
import br.com.jjv.sintraf.services.interfaces.ServiceIF;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author jefferson
 */
public class AssociadoService implements Serializable, ServiceIF<Associado> {

    private AssociadoDAO associadoDAO;

    public AssociadoService() {
        associadoDAO = new AssociadoDAO();
    }

    @Override
    public void create(Associado associado) {
        associadoDAO.create(associado);
    }

    @Override
    public void update(Associado associado) {
        associadoDAO.update(associado);
    }

    @Override
    public void delete(Associado associado) {
        associadoDAO.delete(associado);

    }

    @Override
    public List<Associado> findAll() {
        return associadoDAO.findAll();
    }

    public List<String> autocomplete(String nome){
        
        return associadoDAO.autocomplete(nome);
        
    }
    public Long getNumMatricula() {

        if (associadoDAO.getNumMatricula() == null) {
            return 1L;
        } else {
            return associadoDAO.getNumMatricula() + 1;
        }
    }

    public Associado findById(long id) {
        
        return  associadoDAO.findById(id);
    
    }

    public Associado carregaAssociado(String nome) {

        return associadoDAO.carregaAssociado(nome);
    
    }

}
