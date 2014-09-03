package br.com.jjv.sintraf.services;

import br.com.jjv.sintraf.dao.UsuarioDAO;
import br.com.jjv.sintraf.entidades.Usuario;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Vanderlan Gomes
 */
public class UsuarioService implements Serializable {

    private UsuarioDAO usuarioDAO;

    public UsuarioService() {
        usuarioDAO = new UsuarioDAO();
    }

    public void create(Usuario administrator) {
        usuarioDAO.create(administrator);
    }

    public void update(Usuario user) {

        usuarioDAO.update(user);
    }

    public void delete(Usuario user) {

        usuarioDAO.delete(user);

    }

    public List<Usuario> findAll() {

        return usuarioDAO.findAll();
    }

    public boolean validate(Usuario usuario) {
        
        return usuarioDAO.validate(usuario);
        
    }
}
