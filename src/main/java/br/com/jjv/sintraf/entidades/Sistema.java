package br.com.jjv.sintraf.entidades;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.io.Serializable;

/**
 *
 * @author Vanderlan Gomes
 */
@XStreamAlias("sistema")
public class Sistema implements Serializable{

    private float valorMensalidade;

    public float getValorMensalidade() {
        return valorMensalidade;
    }

    public void setValorMensalidade(float valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }
    
}
