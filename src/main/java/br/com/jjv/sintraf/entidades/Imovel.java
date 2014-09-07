    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jjv.sintraf.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author jefferson
 */
public class Imovel implements Serializable {

    @Id
    private Long ID;

    private String nome;
    private String nomeProprietario;
    private String numeroDeRegistro;
    private double tamanhoDoImovel;
    private double tamanhoDaAreaTrabalhada;
    private String cpfProprietario;
    private String categoriaDeTrabalho;
    private Date dataInicio;
    private Date dataFim;
    private Socio associadoTrabalhador;
    private String municipio;
    private String uf;

    public Imovel() {
    }
    
    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroDeRegistro() {
        return numeroDeRegistro;
    }

    public void setNumeroDeRegistro(String numeroDeRegistro) {
        this.numeroDeRegistro = numeroDeRegistro;
    }

    public double getTamanhoDoImovel() {
        return tamanhoDoImovel;
    }

    public void setTamanhoDoImovel(double tamanhoDoImovel) {
        this.tamanhoDoImovel = tamanhoDoImovel;
    }

    public double getTamanhoDaAreaTrabalhada() {
        return tamanhoDaAreaTrabalhada;
    }

    public void setTamanhoDaAreaTrabalhada(double tamanhoDaAreaTrabalhada) {
        this.tamanhoDaAreaTrabalhada = tamanhoDaAreaTrabalhada;
    }

    public String getCpfProprietario() {
        return cpfProprietario;
    }

    public void setCpfProprietario(String cpfProprietario) {
        this.cpfProprietario = cpfProprietario;
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

    public Socio getAssociadoTrabalhador() {
        return associadoTrabalhador;
    }

    public void setAssociadoTrabalhador(Socio associadoTrabalhador) {
        this.associadoTrabalhador = associadoTrabalhador;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }
 
}
