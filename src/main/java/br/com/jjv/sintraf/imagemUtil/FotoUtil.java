
package br.com.jjv.sintraf.imagemUtil;

import br.com.jjv.sintraf.sistema.ConstantesSistema;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

/**
 *
 * @author jefferson
 */
public class FotoUtil implements Serializable {

    private static final long serialVersionUID = -7538592532189320120L;


    public static StreamedContent recuperarFotoDisco(String id) throws FileNotFoundException {
        try {
            return new DefaultStreamedContent(new FileInputStream(new File(ConstantesSistema.CAMINHO_IMAGEM+  id + ".png")), "image/png");
        } catch (IOException e) {
            e.printStackTrace();

            return new DefaultStreamedContent(new FileInputStream(new File(ConstantesSistema.CAMINHO_IMAGEM + "base.png")), "image/png");
        }
    }
}
