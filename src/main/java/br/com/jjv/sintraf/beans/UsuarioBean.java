package br.com.jjv.sintraf.beans;

import br.com.jjv.sintraf.entidades.Usuario;
import br.com.jjv.sintraf.jsf.JsfUtil;
import br.com.jjv.sintraf.services.UsuarioService;
import java.io.Serializable;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Vanderlan Gomes
 */
@ManagedBean(name = "usuarioBean")
@RequestScoped
public class UsuarioBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private UsuarioService usuarioService;

    //A list to storage the data come from database
    private List<Usuario> usuarios;
    private Usuario usuario;
    private String senhaTemporaria;
    private String novaSenha;

    public UsuarioBean() {

        usuarioService = new UsuarioService();
        usuario = new Usuario();

    }

    public void create() {

        if (usuarioService.validate(usuario)) {
            usuario = new Usuario();
        }

    }

    public String update() throws NoSuchAlgorithmException {

        System.err.println("ANTIGA " + senhaTemporaria + " NOVA: " + gerarMD5(novaSenha));
        if (senhaCorresponde()) {
            
            usuario.setSenha(novaSenha);
            usuarioService.update(usuario);

            return "lista_usuarios";
        } else {

            JsfUtil.addErrorMessage("A senha digitada não corresponde a senha atual");

            return null;
        }

    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }


    public void preparaEdicao() {

        usuario = usuarioService.findById(usuario.getIdUsuario());
        senhaTemporaria = usuario.getSenha();
        usuario.setSenha("");

    }

    public void delete(long id) throws InterruptedException {

        System.err.println("ANTIGA " + senhaTemporaria + " NOVA: " + usuario.getSenha());
        if (senhaCorresponde()) {

            usuario = usuarioService.findById(id);
            usuarioService.delete(usuario);
            usuario = new Usuario();
            Thread.sleep(2000);
            JsfUtil.redirect("lista_usuarios.jsf");

        } else {
            JsfUtil.addErrorMessage("A senha digitada não corresponde a senha atual");

        }

    }

    public boolean senhaCorresponde() {

        return usuario.getSenha().equals(senhaTemporaria);
    }

    public String getSenhaTemporaria() {
        return senhaTemporaria;
    }

    public void setSenhaTemporaria(String senhaTemporaria) {
        this.senhaTemporaria = senhaTemporaria;
    }

    public String getNovaSenha() {
        return novaSenha;
    }

    public void setNovaSenha(String novaSenha) {
        this.novaSenha = novaSenha;
    }
    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the usuarios
     */
    public List<Usuario> getUsuarios() {
        usuarios = usuarioService.findAll();
        return usuarios;
    }

    public static String gerarMD5(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");

        BigInteger hash = new BigInteger(1, md.digest(password.getBytes()));

        return String.format("%32x", hash);
    }

}
