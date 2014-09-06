package br.com.jjv.sintraf.entidades;

import br.com.jjv.sintraf.beans.UsuarioBean;
import java.io.Serializable;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;
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
    @Column(name = "us_nome", length = 60, nullable = false, unique = true)
    private String nome;

    @Size(max = 15)
    @NotNull
    @Column(name = "us_login", length = 15, nullable = false, unique = true)
    private String login;

    @Size(max = 10)
    @NotNull
    @Column(name = "us_senha", length = 32, nullable = false)
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
        try {
            
            this.senha = UsuarioBean.gerarMD5(senha);

        } catch (NoSuchAlgorithmException e) {
             System.out.println("Erro ao criptografar");
            
        }

    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.idUsuario);
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
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.idUsuario, other.idUsuario)) {
            return false;
        }
        return true;
    }

}
