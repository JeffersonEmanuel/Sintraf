package br.com.jjv.sintraf.dao;

import br.com.jjv.sintraf.entidades.Mensalidade;
import br.com.jjv.sintraf.jsf.JsfUtil;
import javax.persistence.Query;

/**
 *
 * @author Vanderlan Gomes
 */
public class MensalidadeDAO extends AbstractDAO<Mensalidade> {

    public MensalidadeDAO() {
        super(Mensalidade.class);
    }

    public void receber(Long mensalidade) {

        try {

            getEntityManager().getTransaction().begin();
            Query q = getEntityManager().createNativeQuery("UPDATE mensalidade SET men_situacao = 'pag' WHERE id_mensalidade = " + mensalidade);
            q.executeUpdate();
            getEntityManager().getTransaction().commit();

//            JsfUtil.addSuccessMessage("Mensalidade recebida com sucesso!");
            
        }catch(Exception e){
            
            JsfUtil.addErrorMessage("Ocorreu um erro durante o recebimento da mensalidade. "+e.getMessage());
            
        }

    }

}
