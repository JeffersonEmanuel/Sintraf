
package br.com.jjv.sintraf.login;

import javax.ejb.Remote;

/**
 *
 * @author vanderlan
 */
@Remote
public interface AuthenticacaoRemota {
    
    /**
     * Método de autenticação remota
     * @param login
     * @param senha
     * @return logado
     */
    public boolean autenticacao(String login, String senha);
    
    
}
