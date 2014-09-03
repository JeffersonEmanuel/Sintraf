package br.com.jjv.sintraf.services;

import br.com.jjv.sintraf.dao.UsuarioDAO;
import br.com.jjv.sintraf.entidades.Usuario;
import br.com.jjv.sintraf.exceptions.SintrafException;
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

    public void create(Usuario administrator) throws SintrafException {
        if (administrator.getLogin() == null || administrator.getLogin().trim().equals("")) {
            throw new SintrafException("O login do usuário é obrigatório");
        }

        this.usuarioDAO.create(administrator);
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

    private UsuarioDAO createDAO() {

        return new UsuarioDAO();
    }
}
