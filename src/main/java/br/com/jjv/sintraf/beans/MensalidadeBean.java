package br.com.jjv.sintraf.beans;

import br.com.jjv.sintraf.entidades.Mensalidade;
import br.com.jjv.sintraf.jsf.JsfUtil;
import br.com.jjv.sintraf.services.MensalidadeService;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Vanderlan Gomes
 */
@ManagedBean
@RequestScoped
public class MensalidadeBean {

    private Mensalidade mensalidade;
    private List<Mensalidade> mensalidades;
    private MensalidadeService service;
    private String pesquisa;

    public MensalidadeBean() {

        mensalidade = new Mensalidade();
        service = new MensalidadeService();
        mensalidades = service.findAll();

    }

    public Mensalidade getMensalidade() {
        return mensalidade;
    }

    public List<Mensalidade> getMensalidades() {
        return mensalidades;
    }

    public List<Mensalidade> getMensalidadesSelecionadas() {
        return mensalidades;
    }

    public void buscaMensalidade() {
        try {

            mensalidade = service.findById(mensalidade.getIdMensaldade());

        } catch (Exception e) {

            JsfUtil.addSuccessMessage("Erro ao buscar mensalidade");
        }

    }

    public MensalidadeService getService() {
        return service;
    }

    public void setService(MensalidadeService service) {
        this.service = service;
    }

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    public void setMensalidade(Mensalidade mensalidade) {
        this.mensalidade = mensalidade;
    }

    public String receberMensalidade() {

        try {
            service.receber(mensalidade.getIdMensaldade());
            mensalidade.setMenSituacao("pag");
            JsfUtil.addSuccessMessage("Mensalidade recebida com sucesso");

        } catch (Exception e) {

            JsfUtil.addErrorMessage("Erro realizar o pagamento da mensalidade");
        }
        
        return "consutar_mensalidades";
    }

}
