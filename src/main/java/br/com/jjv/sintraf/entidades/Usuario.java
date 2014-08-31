package br.com.jjv.sintraf.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author vanderlan
 */
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {
    
    @Id
    @Column(name = "id_usuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;
    
    @Size(max = 60)
    @NotNull
    @Column(name = "us_nome", length = 60, nullable = false)
    private String nome;
    
    @Size(max = 15)
    @NotNull
    @Column(name = "us_login", length = 15, nullable = false)
    private String login;
    
    @Size(max = 10)
    @NotNull
    @Column(name = "us_senha", length = 10, nullable = false)
    private String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }
    
}
