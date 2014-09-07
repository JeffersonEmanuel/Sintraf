/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jjv.sintraf.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author jefferson
 */
@Entity
@Table(name = "socio")
public class Socio implements Serializable {

    @Id
    @Column(name = "id_sc_matricula")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long matricula;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "sc_data_filiacao", nullable = false)
    private Date dataDeFiliacao;

    @Size(max = 60)
    @Column(name = "sc_nome", length = 60, nullable = true)
    private String nome;

    @Size(max = 60)
    @Column(name = "sc_foto", length = 60, nullable = true)
    private String foto;

    @Size(max = 80)
    @Column(name = "sc_endereco", length = 80, nullable = true)
    private String endereco;

    @Size(max = 80)
    @Column(name = "sc_bairro", length = 80, nullable = true)
    private String bairro;

    @Size(max = 40)
    @Column(name = "sc_cidade", length = 40, nullable = true)
    private String cidade;

    @Size(max = 2)
    @Column(name = "sc_cidade_uf", length = 2, nullable = true)
    private String cidadeUF;

    @Column(name = "sc_data_nascimento", nullable = true)
    @Temporal(TemporalType.DATE)
    private Date dataDeNascimento;

    @Size(max = 40)
    @Column(name = "sc_naturalidade", length = 40, nullable = true)
    private String naturalidade;

    @Size(max = 2)
    @Column(name = "sc_naturalidade_uf", length = 2, nullable = true)
    private String naturalidadeUF;

    @Size(max = 60)
    @Column(name = "sc_nome_pai", length = 60, nullable = true)
    private String nomeDoPai;

    @Size(max = 60)
    @Column(name = "sc_nome_mae", length = 60, nullable = true)
    private String nomeDaMae;

    @Size(max = 14)
    @Column(name = "sc_cpf", length = 14, nullable = true, unique = true)
    private String cpf;

    @Size(max = 15, min = 6)
    @Column(name = "sc_rg", length = 15, nullable = true)
    private String rg;

    @Size(max = 10)
    @Column(name = "sc_rg_orgao_emissor", length = 10, nullable = true)
    private String rgOrgaoEmissor;

    @Size(max = 2)
    @Column(name = "sc_rg_uf", length = 2, nullable = true)
    private String rgUF;

    @Column(name = "sc_cateira_profissional", nullable = true)
    private int carteiraProfissional;

    @Column(name = "sc_carteira_profissional_serie", nullable = true)
    private int carteiraProfissionalSerie;

    @Size(max = 2)
    @Column(name = "sc_carteira_profissional_uf", length = 2, nullable = true)
    private String carteiraProficionalUF;

    @Size(max = 20)
    @Column(name = "sc_profissao", length = 20, nullable = true)
    private String profissao;

    @Size(max = 15)
    @Column(name = "sc_titulo_eleitoral", length = 15, nullable = true)
    private String tituloEleitoral;

    @Size(max = 5)
    @Column(name = "sc_titulo_eleitoral_zona", length = 5, nullable = true)
    private int tituloEleitoralZona;

    @Size(max = 5)
    @Column(name = "sc_titulo_eleitoral_sessao", length = 5, nullable = true)
    private int tituloEleitoralSessao;

    @Size(max = 15)
    @Column(name = "sc_estado_civil", length = 15, nullable = true)
    private String estadoCivil;

    @Size(max = 60)
    @Column(name = "sc_nome_conjugue", length = 60, nullable = true)
    private String nomeConjugue;

    @Column(name = "sc_trabalho_proprio", nullable = true)
    private boolean trabalhoProprio;

    @Size(max = 15)
    @Column(name = "sc_regime_trabalho", length = 15, nullable = true)
    private String regimeDeTrabalho;
    
    @Column(name = "sc_lical_trabalho_atual")
    private String localDeTrabalho;
    
    @Size(max = 25)
    @Column(name = "sc_apelido", length = 25, nullable = true)
    private String apelido;
    
    @Column(name = "sc_alfabetizado")
    private boolean alfabetizado;

    @Column(name = "sc_ quantidade_filhos", nullable = true)
    private int quantidadeDeFilhos;
    
    @Column(name = "sc_quantidade_filhos_estudando",nullable = true)
    private int quantidadeDeFilhosEstudando;
    
    @Column(name = "sc_dependentes", nullable = true)
    private int dependentes;
    
    @Size(max = 255)
    @Column(name = "sc_observacoes", length = 255, nullable = true)
    private String observacoes;

    
    public String getRgUF() {
        return rgUF;
    }

    public void setRgUF(String rgUF) {
        this.rgUF = rgUF;
    }

    public String getLocalDeTrabalho() {
        return localDeTrabalho;
    }

    public void setLocalDeTrabalho(String localDeTrabalho) {
        this.localDeTrabalho = localDeTrabalho;
    }

    public Socio() {
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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCarteiraProficionalUF() {
        return carteiraProficionalUF;
    }

    public void setCarteiraProficionalUF(String carteiraProficionalUF) {
        this.carteiraProficionalUF = carteiraProficionalUF;
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

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public int getCarteiraProfissional() {
        return carteiraProfissional;
    }

    public void setCarteiraProfissional(int carteiraProfissional) {
        this.carteiraProfissional = carteiraProfissional;
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

    public int getCarteiraProfissionalSerie() {
        return carteiraProfissionalSerie;
    }

    public void setCarteiraProfissionalSerie(int carteiraProfissionalSerie) {
        this.carteiraProfissionalSerie = carteiraProfissionalSerie;
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

    public String getCidadeUF() {
        return cidadeUF;
    }

    public void setCidadeUF(String cidadeUF) {
        this.cidadeUF = cidadeUF;
    }

    public String getNaturalidadeUF() {
        return naturalidadeUF;
    }

    public void setNaturalidadeUF(String naturalidadeUF) {
        this.naturalidadeUF = naturalidadeUF;
    }

}
