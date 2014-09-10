/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jjv.sintraf.services;

import br.com.jjv.sintraf.dao.SocioDAO;
import br.com.jjv.sintraf.entidades.Associado;
import br.com.jjv.sintraf.entidades.Usuario;
import br.com.jjv.sintraf.services.interfaces.ServiceIF;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author jefferson
 */
public class SocioService implements Serializable, ServiceIF<Associado> {
    
    private SocioDAO socioDAO;
    
    public SocioService (){
        socioDAO = new SocioDAO();
    }
    
    @Override
     public void create(Associado socio) {
        socioDAO.create(socio);
    }

    @Override
    public void update(Associado socio) {
        socioDAO.update(socio);
    }

    @Override
    public void delete(Associado socio) {
        socioDAO.delete(socio);

    }

    @Override
    public List<Associado> findAll() {
        return socioDAO.findAll();
    }

    
}
