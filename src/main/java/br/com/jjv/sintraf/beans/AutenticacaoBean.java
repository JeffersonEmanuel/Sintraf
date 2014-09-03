
package br.com.jjv.sintraf.beans;

import br.com.jjv.sintraf.dao.UsuarioDAO;
import br.com.jjv.sintraf.entidades.Usuario;
import br.com.jjv.sintraf.jsf.JsfUtil;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Vanderlan Gomes
 */
@ManagedBean(name = "autenticacaoBean")
@RequestScoped
public class AutenticacaoBean {
    
    private UsuarioDAO usuarioDao;
    private Usuario user;
    
    public AutenticacaoBean() {
        
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        usuarioDao = new UsuarioDAO();
        user = new Usuario();
    }
    
    public boolean autenticacao(){
        
        List<Usuario>usuarios = usuarioDao.autenticacao(user);
        
        if(usuarios.isEmpty()){
           
            JsfUtil.addErrorMessage("Usuário inválidos!");
            return false;
        
        }
        else{
            JsfUtil.addSuccessMessage("Usuário e senha OK!");
            user = usuarios.get(0);
            return true;
        }
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
    
}
