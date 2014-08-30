package br.com.jjv.sintraf.beans;

import br.com.jjv.sintraf.dao.UsuarioDAO;
import br.com.jjv.sintraf.entidades.Usuario;
import br.com.jjv.sintraf.exceptions.SintrafException;
import br.com.jjv.sintraf.jsf.JsfUtil;
import br.com.jjv.sintraf.services.UsuarioService;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

/**
 * Controller to manage the communication between the page and the rest of project
 * 
 * @author Vanderlan Gomes
 */
@Model
public class UsuarioBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private UsuarioService usuarioService;
    
    //Only used for get data from database without filter or rule to be applied
    @Inject
    private UsuarioDAO usuarioDAO;
    
    //A list to storage the data come from database
    private List<Usuario> usuarios;
    private Usuario usuario;

    public UsuarioBean() {
        
    }
    
    @PostConstruct
    public void init(){
        this.clean();
    }
    
    private void clean() {
        this.usuario = new Usuario();
    }

    public void create() {
        try {
            this.usuarioService.create(usuario);
            JsfUtil.addSuccessMessage("Usuário cadastrado com sucesso!");
        } catch (SintrafException e) {
            JsfUtil.addSuccessMessage(e.getMessage());
        }
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the usuarios
     */
    public List<Usuario> getUsuarios() {
        usuarios = usuarioDAO.findAll();
        return usuarios;
    }
}
