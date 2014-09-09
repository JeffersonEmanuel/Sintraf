/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jjv.sintraf.services.interfaces;

import br.com.jjv.sintraf.entidades.Usuario;
import java.util.List;

/**
 *
 * @author jefferson
 * @param <T>
 */
public interface ServiceIF<T> {
    
     public void create(T t);

    public void update(T t);

    public void delete(T t);

    public List<T> findAll();

    
}
