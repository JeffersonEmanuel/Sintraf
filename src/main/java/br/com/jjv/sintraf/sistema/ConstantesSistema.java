package br.com.jjv.sintraf.sistema;

import br.com.jjv.sintraf.entidades.Sistema;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.Dom4JDriver;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;

/**
 *
 * @author Vanderlan Gomes
 */
public class ConstantesSistema {

    /**
     * Valor fixo da mensalidade dos associados
     */
    public static final BigDecimal VALOR_MENSALIDADE = pegarValorMensalidade();
    public static final String JANEIRO_2014 = "";
    public static final String CAMINHO_IMAGEM = File.separator + "home"
            + File.separator + "vanderlan" + File.separator + "Área de Trabalho"
            + File.separator + "imagens" + File.separator + "Sintraf" + File.separator;
    public static final String CAMINHO_ARQUIVO_CONFIGURACOES = "/home/vanderlan/definicoes.xml";

    public static BigDecimal pegarValorMensalidade() {

        Sistema sistema = new Sistema();
        
        try {
            XStream xStream = new XStream(new Dom4JDriver());
            xStream.alias("sistema", Sistema.class);
            xStream.processAnnotations(Sistema.class);

            BufferedReader input = new BufferedReader(new FileReader(new File(CAMINHO_ARQUIVO_CONFIGURACOES)));

            sistema = (Sistema) xStream.fromXML(input);

            input.close();

        } catch (IOException ex) {
            
            System.out.println("Não foi possível Ler o arquivo de configurações");
        
        }
        
        return sistema.getValorMensalidade();
    }
}
