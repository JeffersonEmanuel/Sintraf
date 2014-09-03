/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jjv.sintraf.entidades;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author jefferson
 */
@Entity
@Table(name = "associado")
public class Associado {

    @Id
    private Long matricula;
    private String nome;
    private String foto;
    private String cpf;
    private String endereco;
    private String enderecoUF;
    private String naturalidadeUF;
    private String nomeDoPai;
    private String nomeDaMae;
    private String orgaoEmissor;
    private String ufCarteiraProficional;
    private String cidade;
    private String naturalidade;
    private String profissao;
    private String tituloEleitoral;
    private boolean trabalhoProprio;
    private int tituloEleitoralZona;
    private String nomeConjugue;
    private int quantidadeDeFilhos;
    private int dependentes;
    private Date dataDeNascimento;
    private String apelido;
    private String obseervacoes;
    private int carteiraProficional;
    private String bairro;
    private int tituloEleitoralSessao;
    private String estadoCivil;
    private Date dataDeFiliacao;
    private boolean alfabetizado;
    private String rgOrgaoEmissor;
    private int carteiraProficionalSerie;
    private int quantidadeDeFilhosEstudando;
    private String regimeDeTrabalho;
    private String localDeTrabalho;

    public String getLocalDeTrabalho() {
        return localDeTrabalho;
    }

    public void setLocalDeTrabalho(String localDeTrabalho) {
        this.localDeTrabalho = localDeTrabalho;
    }

    public Associado() {
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
//        matricula = Long.MAX_VALUE;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNomeDoPai() {
        return nomeDoPai;
    }

    public void setNomeDoPai(String nomeDoPai) {
        this.nomeDoPai = nomeDoPai;
    }

    public String getNomeDaMae() {
        return nomeDaMae;
    }

    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }

    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }

    public void setOrgaoEmissor(String orgaoEmissor) {
        this.orgaoEmissor = orgaoEmissor;
    }

    public String getUfCarteiraProficional() {
        return ufCarteiraProficional;
    }

    public void setUfCarteiraProficional(String ufCarteiraProficional) {
        this.ufCarteiraProficional = ufCarteiraProficional;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getTituloEleitoral() {
        return tituloEleitoral;
    }

    public void setTituloEleitoral(String tituloEleitoral) {
        this.tituloEleitoral = tituloEleitoral;
    }

    public boolean isTrabalhoProprio() {
        return trabalhoProprio;
    }

    public void setTrabalhoProprio(boolean trabalhoProprio) {
        this.trabalhoProprio = trabalhoProprio;
    }

    public int getTituloEleitoralZona() {
        return tituloEleitoralZona;
    }

    public void setTituloEleitoralZona(int tituloEleitoralZona) {
        this.tituloEleitoralZona = tituloEleitoralZona;
    }

    public String getNomeConjugue() {
        return nomeConjugue;
    }

    public void setNomeConjugue(String nomeConjugue) {
        this.nomeConjugue = nomeConjugue;
    }

    public int getQuantidadeDeFilhos() {
        return quantidadeDeFilhos;
    }

    public void setQuantidadeDeFilhos(int quantidadeDeFilhos) {
        this.quantidadeDeFilhos = quantidadeDeFilhos;
    }

    public int getDependentes() {
        return dependentes;
    }

    public void setDependentes(int dependentes) {
        this.dependentes = dependentes;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getObseervacoes() {
        return obseervacoes;
    }

    public void setObseervacoes(String obseervacoes) {
        this.obseervacoes = obseervacoes;
    }

    public int getCarteiraProficional() {
        return carteiraProficional;
    }

    public void setCarteiraProficional(int carteiraProficional) {
        this.carteiraProficional = carteiraProficional;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getTituloEleitoralSessao() {
        return tituloEleitoralSessao;
    }

    public void setTituloEleitoralSessao(int tituloEleitoralSessao) {
        this.tituloEleitoralSessao = tituloEleitoralSessao;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Date getDataDeFiliacao() {
        return dataDeFiliacao;
    }

    public void setDataDeFiliacao(Date dataDeFiliacao) {
        this.dataDeFiliacao = dataDeFiliacao;
    }

    public boolean isAlfabetizado() {
        return alfabetizado;
    }

    public void setAlfabetizado(boolean alfabetizado) {
        this.alfabetizado = alfabetizado;
    }

    public String getRgOrgaoEmissor() {
        return rgOrgaoEmissor;
    }

    public void setRgOrgaoEmissor(String rgOrgaoEmissor) {
        this.rgOrgaoEmissor = rgOrgaoEmissor;
    }

    public int getCarteiraProficionalSerie() {
        return carteiraProficionalSerie;
    }

    public void setCarteiraProficionalSerie(int carteiraProficionalSerie) {
        this.carteiraProficionalSerie = carteiraProficionalSerie;
    }

    public int getQuantidadeDeFilhosEstudando() {
        return quantidadeDeFilhosEstudando;
    }

    public void setQuantidadeDeFilhosEstudando(int quantidadeDeFilhosEstudando) {
        this.quantidadeDeFilhosEstudando = quantidadeDeFilhosEstudando;
    }

    public String getRegimeDeTrabalho() {
        return regimeDeTrabalho;
    }

    public void setRegimeDeTrabalho(String regimeDeTrabalho) {
        this.regimeDeTrabalho = regimeDeTrabalho;
    }

    public String getEnderecoUF() {
        return enderecoUF;
    }

    public void setEnderecoUF(String enderecoUF) {
        this.enderecoUF = enderecoUF;
    }

    public String getNaturalidadeUF() {
        return naturalidadeUF;
    }

    public void setNaturalidadeUF(String naturalidadeUF) {
        this.naturalidadeUF = naturalidadeUF;
    }

}
