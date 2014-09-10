/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jjv.sintraf.dao;

import br.com.jjv.sintraf.entidades.Associado;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jefferson
 */
public class SocioDAO extends AbstractDAO<Associado> {

    public SocioDAO() {
        super(Associado.class);
    }

}
