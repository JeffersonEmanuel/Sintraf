package br.com.jjv.sintraf.services;

import br.com.jjv.sintraf.dao.UsuarioDAO;
import br.com.jjv.sintraf.entidades.Usuario;
import br.com.jjv.sintraf.exceptions.SintrafException;
import br.com.jjv.sintraf.persistencia.Transactional;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

/**
 *
 * @author Vanderlan Gomes
 */
public class UsuarioService implements Serializable{
    
    @Inject
    private UsuarioDAO usuarioDAO;
    
    @Transactional
    public void create(Usuario administrator) throws SintrafException {
        if(administrator.getLogin() == null || administrator.getLogin().trim().equals("")){
            throw new SintrafException("O login do usuário é obrigatório");
        }
        
        this.usuarioDAO.create(administrator);
    }
    @Transactional
    public void update(Usuario user){
        
        usuarioDAO.update(user);
    }
    @Transactional
    public void delete(Usuario user){
        
        usuarioDAO.delete(user);
    
    }
    
    @Transactional
    public List<Usuario> findAll() {
        
        return  usuarioDAO.findAll();
    }
    
    @Produces
    @RequestScoped
    private UsuarioDAO createDAO(){
        
        return new UsuarioDAO();
    }
}