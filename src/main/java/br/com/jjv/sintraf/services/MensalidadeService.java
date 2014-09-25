package br.com.jjv.sintraf.services;

import br.com.jjv.sintraf.dao.MensalidadeDAO;
import br.com.jjv.sintraf.entidades.Associado;
import br.com.jjv.sintraf.entidades.Mensalidade;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Vanderlan Gomes
 */
public class MensalidadeService implements Serializable {

    private MensalidadeDAO usuarioDAO;

    public MensalidadeService() {
        usuarioDAO = new MensalidadeDAO();
    }

    public void create(Mensalidade administrator) {
        usuarioDAO.create(administrator);
    }

    public void update(Mensalidade user) {

        usuarioDAO.update(user);
    }

    public void delete(Mensalidade user) {

        usuarioDAO.delete(user);

    }

    public List<Mensalidade> findAll() {

        return usuarioDAO.findAll();
    }
    public void gerarMensalidades(Associado associado){
        
        Date dataAtual = new Date();
        System.err.println(Calendar.YEAR);
        System.err.println(Calendar.MONTH);
        System.err.println(Calendar.DAY_OF_MONTH);
//        while(dataAtual.get){
//            
//        }
//        Date dataVencimento = new Date(year, month, date);
        
    }
    public Mensalidade findById(long id) {  

        return usuarioDAO.findById(id);
    }
}
