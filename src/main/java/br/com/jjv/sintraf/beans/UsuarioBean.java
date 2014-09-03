package br.com.jjv.sintraf.beans;

import br.com.jjv.sintraf.entidades.Usuario;
import br.com.jjv.sintraf.exceptions.SintrafException;
import br.com.jjv.sintraf.jsf.JsfUtil;
import br.com.jjv.sintraf.services.UsuarioService;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * 
 * @author Vanderlan Gomes
 */
@ManagedBean(name = "usuarioBeanTeste")
@RequestScoped
public class UsuarioBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private UsuarioService  usuarioService;
     
    //A list to storage the data come from database
    private List<Usuario> usuarios;
    private Usuario usuario ;

    public UsuarioBean() {
        
        usuarioService = new UsuarioService();
        usuario = new Usuario();
        
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
        usuarios = usuarioService.findAll();
        return usuarios;
    }
//    @Produces
//    @RequestScoped
    public UsuarioService createService(){
        
        return new UsuarioService();
    }
}
