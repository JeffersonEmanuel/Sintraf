package br.com.jjv.sintraf.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Vanderlan Gomes
 */
@Entity
@Table(name = "mensalidade")
public class Mensalidade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mensalidade")
    private Long idMensaldade;
    
    @Column(name = "men_valor" ,nullable = false, scale = 2, precision = 10)
    private BigDecimal menValor;
    
    @Column(name ="men_situacao" , columnDefinition = "VARCHAR(3) NOT NULL DEFAULT 'abt' ")
    private String menSituacao;
    
    @Temporal(value = TemporalType.DATE)
    @Column(name ="men_vencimento" ,nullable = false)
    private Date menVencimento;
    
    @ManyToOne
    @JoinColumn(name = "associado_id", nullable = false)
    private Associado associado;
    
    
    public Mensalidade() {
    
    }

    public Long getIdMensaldade() {
        return idMensaldade;
    }

    public void setIdMensaldade(Long idMensaldade) {
        this.idMensaldade = idMensaldade;
    }

    public BigDecimal getMenValor() {
        return menValor;
    }

    public void setMenValor(BigDecimal menValor) {
        this.menValor = menValor;
    }

    public String getMenSituacao() {
        return menSituacao;
    }

    public void setMenSituacao(String menSituacao) {
        this.menSituacao = menSituacao;
    }

    public Date getMenVencimento() {
        return menVencimento;
    }

    public void setMenVencimento(Date menVencimento) {
        this.menVencimento = menVencimento;
    }

    public Associado getAssociado() {
        return associado;
    }

    public void setAssociado(Associado associado) {
        this.associado = associado;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.idMensaldade);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Mensalidade other = (Mensalidade) obj;
        if (!Objects.equals(this.idMensaldade, other.idMensaldade)) {
            return false;
        }
        return true;
    }

    
    
}
