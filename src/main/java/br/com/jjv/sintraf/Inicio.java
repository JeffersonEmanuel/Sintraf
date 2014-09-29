
package br.com.jjv.sintraf;

import br.com.jjv.sintraf.entidades.Associado;
import br.com.jjv.sintraf.services.AssociadoService;
import br.com.jjv.sintraf.services.MensalidadeService;

/**
 *
 * @author vanderlan
 */
public class Inicio {
    
    public static void main(String[] args) {

        MensalidadeService service = new MensalidadeService();
        AssociadoService s = new AssociadoService();
        
        Associado ac = s.findById(1L);
        
        service.gerarMensalidades(ac);
        
        
    }

}
