/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jjv.sintraf.services;

import br.com.jjv.sintraf.dao.AssociadoDAO;
import br.com.jjv.sintraf.entidades.Associado;
import br.com.jjv.sintraf.entidades.Usuario;
import br.com.jjv.sintraf.services.interfaces.ServiceIF;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author jefferson
 */
public class AssociadoService implements Serializable, ServiceIF<Associado> {
    
    private AssociadoDAO socioDAO;
    
    public AssociadoService (){
        socioDAO = new AssociadoDAO();
    }
    
    @Override
     public void create(Associado associado) {
        socioDAO.create(associado);
    }

    @Override
    public void update(Associado associado) {
        socioDAO.update(associado);
    }

    @Override
    public void delete(Associado associado) {
        socioDAO.delete(associado);

    }

    @Override
    public List<Associado> findAll() {
        return socioDAO.findAll();
    }

    
}
