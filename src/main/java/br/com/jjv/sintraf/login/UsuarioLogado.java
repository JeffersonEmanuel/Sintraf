package br.com.jjv.sintraf.login;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author vanderlan
 */
@SessionScoped
@Named(value = "usuarioLogado")
public class UsuarioLogado implements Serializable{
    
    private UsuarioLogado usuario;

    public UsuarioLogado getUsuario() {
        return usuario;
    }
  
}
