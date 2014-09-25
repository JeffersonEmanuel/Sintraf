package br.com.jjv.sintraf.beans;

import br.com.jjv.sintraf.entidades.Sistema;
import br.com.jjv.sintraf.exceptions.SintrafException;
import br.com.jjv.sintraf.jsf.JsfUtil;
import br.com.jjv.sintraf.sistema.ConstantesSistema;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.Dom4JDriver;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.BufferedWriter;

/**
 *
 * @author Vanderlan Gomes
 */
@ManagedBean
@RequestScoped
public class MensalidadeBean {

    private Sistema sistema;
    private String xml;

    public MensalidadeBean() {
        sistema = new Sistema();
        lerXML(new File(ConstantesSistema.CAMINHO_ARQUIVO_CONFIGURACOES));
    }

    public void salvarConfiguracoes() throws SintrafException, IOException {

        try {

            XStream xstream = new XStream();
             xstream.alias("sistema", Sistema.class);
            xml = xstream.toXML(sistema);

            File arquivo = new File(ConstantesSistema.CAMINHO_ARQUIVO_CONFIGURACOES);
            FileWriter fw = new FileWriter(arquivo);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(xml);
            bw.flush();
            bw.close();
            JsfUtil.addSuccessMessage("Configurações salvas com sucesso");
        } catch (Exception e) {

            JsfUtil.addErrorMessage("Não foi possível salvar as configurações");
        }

    }

    private void lerXML(File arquivoXML) {
        try {
            XStream xStream = new XStream(new Dom4JDriver());
            xStream.alias("sistema", Sistema.class);
            xStream.processAnnotations(Sistema.class);

            BufferedReader input = new BufferedReader(new FileReader(arquivoXML));

            sistema = (Sistema) xStream.fromXML(input);

            input.close();

            System.out.println("Valor da mensalidade: " + sistema.getValorMensalidade());
        } catch (IOException ex) {
        }
    }
    
    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }

}
