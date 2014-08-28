package br.com.jjv.sintraf.login;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author vanderlan
 */
@Stateless
public class AutenticacaoRemotaBean implements AuthenticacaoRemota {

    @PersistenceContext(unitName = "SINTRAF-PU")
    private EntityManager entityManager;

    @Override
    public boolean autenticacao(String login, String password) {

//        UserBibliosoft user = new UserBibliosoft();
//        user.setPassword(password);
//        user.setRegistration(login);
//
//        UserBibliosoft find = entityManager.find(UserBibliosoft.class, user);
//
//        if (find.getId() != null) {
//            return true;
//        } else {
//            return "admin".equals(login) && "admin".equals(password);
//
//        }
//
//    }
        return "admin".equals(login) && "admin".equals(password);

    }

 
}
