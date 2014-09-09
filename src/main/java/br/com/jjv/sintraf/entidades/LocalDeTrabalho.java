    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jjv.sintraf.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author jefferson
 */
@Entity
@Table(name = "local_trabalho")
public class LocalDeTrabalho implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lt_id", nullable = false)
    private Long ID;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sc_id")
    private Socio socioID;

    @Size(max = 45)
    @Column(name = "lt_nome", length = 45, nullable = true)
    private String nome;

    @Size(max = 45)
    @Column(name = "lt_nome_proprietario", length = 45, nullable = true)
    private String nomeProprietario;

    @Size(max = 14)
    @Column(name = "lt_cpf_proprietario", length = 14, nullable = true)
    private String cpfProprietario;

    @Size(max = 45)
    @Column(name = "lt_numero_registro_imovel", length = 45, nullable = true)
    private String numeroDeRegistro;

    @Column(name = "lt_tamanho_imovel", nullable = true, precision = 2)
    private BigDecimal tamanhoDoImovel;

    @Column(name = "lt_tamanho_area_trabalho", nullable = true, scale = 10)
    private BigDecimal tamanhoDaAreaTrabalhada;

    @Size(max = 20)
    @Column(name = "lt_categoria_trabalho", length = 20, nullable = true, precision = 2, scale = 10)
    private String categoriaDeTrabalho;

    @Column(name = "lt_data_inicio", nullable = true)
    @Temporal(TemporalType.DATE)
    private Date dataInicio;

    @Column(name = "lt_data_fim", nullable = true)
    @Temporal(TemporalType.DATE)
    private Date dataFim;

    @Size(max = 40)
    @Column(name = "lt_cidade", length = 40, nullable = true)
    private String cidade;

    @Size(max = 2)
    @Column(name = "lt_cidade_uf", length = 2, nullable = true)
    private String cidadeUF;

    public LocalDeTrabalho() {
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Socio getSocioID() {
        return socioID;
    }

    public void setSocioID(Socio socioID) {
        this.socioID = socioID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public String getCpfProprietario() {
        return cpfProprietario;
    }

    public void setCpfProprietario(String cpfProprietario) {
        this.cpfProprietario = cpfProprietario;
    }

    public String getNumeroDeRegistro() {
        return numeroDeRegistro;
    }

    public void setNumeroDeRegistro(String numeroDeRegistro) {
        this.numeroDeRegistro = numeroDeRegistro;
    }

    public BigDecimal getTamanhoDoImovel() {
        return tamanhoDoImovel;
    }

    public void setTamanhoDoImovel(BigDecimal tamanhoDoImovel) {
        this.tamanhoDoImovel = tamanhoDoImovel;
    }

    public BigDecimal getTamanhoDaAreaTrabalhada() {
        return tamanhoDaAreaTrabalhada;
    }

    public void setTamanhoDaAreaTrabalhada(BigDecimal tamanhoDaAreaTrabalhada) {
        this.tamanhoDaAreaTrabalhada = tamanhoDaAreaTrabalhada;
    }

    public String getCategoriaDeTrabalho() {
        return categoriaDeTrabalho;
    }

    public void setCategoriaDeTrabalho(String categoriaDeTrabalho) {
        this.categoriaDeTrabalho = categoriaDeTrabalho;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidadeUF() {
        return cidadeUF;
    }

    public void setCidadeUF(String cidadeUF) {
        this.cidadeUF = cidadeUF;
    }

    


}
