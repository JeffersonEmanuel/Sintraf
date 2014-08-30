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
    private UsuarioService administratorService;
    
    //Only used for get data from database without filter or rule to be applied
    @Inject
    private UsuarioDAO administratorDAO;
    
    //A list to storage the data come from database
    private List<Usuario> administrators;
    private Usuario administrator;

    public UsuarioBean() {
        
    }
    
    @PostConstruct
    public void init(){
        this.clean();
    }
    
    private void clean() {
        this.administrator = new Usuario();
    }

    public void create() {
        try {
            this.administratorService.create(administrator);
            JsfUtil.addSuccessMessage("Administrador cadastrado com sucesso!");
        } catch (SintrafException e) {
            JsfUtil.addSuccessMessage(e.getMessage());
        }
    }

    /**
     * @return the administrator
     */
    public Usuario getUsuario() {
        return administrator;
    }

    /**
     * @param administrator the administrator to set
     */
    public void setUsuario(Usuario administrator) {
        this.administrator = administrator;
    }

    /**
     * @return the administrators
     */
    public List<Usuario> getUsuarios() {
        administrators = administratorDAO.findAll();
        return administrators;
    }
}
