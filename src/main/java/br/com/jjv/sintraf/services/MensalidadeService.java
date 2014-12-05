package br.com.jjv.sintraf.services;

import br.com.jjv.sintraf.dao.MensalidadeDAO;
import br.com.jjv.sintraf.entidades.Associado;
import br.com.jjv.sintraf.entidades.Mensalidade;
import br.com.jjv.sintraf.sistema.ConstantesSistema;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author Vanderlan Gomes
 */
public class MensalidadeService implements Serializable {

    private MensalidadeDAO mensalidadeDAO;

    public MensalidadeService() {
        mensalidadeDAO = new MensalidadeDAO();
    }

    public void create(Mensalidade administrator) {
        mensalidadeDAO.create(administrator);
    }

    public void update(Mensalidade mensalidade) {

        mensalidadeDAO.update(mensalidade);
    }
    
     public void receber(Long mensalidade) {

        mensalidadeDAO.receber(mensalidade);
    }

    public void delete(Mensalidade mensalidade) {

        mensalidadeDAO.delete(mensalidade);

    }

    public List<Mensalidade> findAll() {

        return mensalidadeDAO.findAll();
    }

    public void gerarMensalidades(Associado associado) {

        Date data = new Date();
        GregorianCalendar dataCal = new GregorianCalendar();
        dataCal.setTime(data);
        
        int mes = dataCal.get(Calendar.MONTH);
        int ano = dataCal.get(Calendar.YEAR);
        int dia = dataCal.get(Calendar.DAY_OF_MONTH);

        while (mes < 11) {
            
            mes++;

            Mensalidade men = new Mensalidade();
            men.setMenValor(ConstantesSistema.VALOR_MENSALIDADE);
            men.setAssociado(associado);
            men.setMenSituacao("abt");
            
            if(dia >= 29 && mes == 2){
                dia = 28;
            }
            if(dia == 31){
                dia = 30;
            }
            
            dataCal.set(ano, mes, dia);
            men.setMenVencimento(dataCal.getTime());
            mensalidadeDAO.create(men);

        }
    }

    public Mensalidade findById(Long id) {

        return mensalidadeDAO.findById(id);
    }

}
