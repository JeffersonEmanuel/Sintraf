package br.com.jjv.sintraf.entidades;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author Vanderlan Gomes
 */
@XStreamAlias("sistema")
public class Sistema implements Serializable{

    private BigDecimal valorMensalidade;

    public BigDecimal getValorMensalidade() {
        return valorMensalidade;
    }

    public void setValorMensalidade(BigDecimal valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }
    
}
