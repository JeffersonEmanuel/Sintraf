package br.com.jjv.sintraf.beans;

import br.com.jjv.sintraf.entidades.Associado;
import br.com.jjv.sintraf.entidades.LocalDeTrabalho;
import br.com.jjv.sintraf.enumerats.Estados;
import br.com.jjv.sintraf.services.AssociadoService;
import br.com.jjv.sintraf.sistema.ConstantesSistema;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.view.facelets.FaceletException;
import javax.imageio.stream.FileImageOutputStream;
import javax.servlet.http.Part;
import org.apache.commons.io.IOUtils;
import org.primefaces.event.CaptureEvent;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author jefferson
 */
@ManagedBean(name = "associadoBean")
@ViewScoped
public class AssociadoBean implements Serializable {

    private Associado associado;
    private List<Estados> estados;
    private List<LocalDeTrabalho> locaisDeTrabalho;
    private AssociadoService service;
    private List<Associado> associados;

    public AssociadoBean() {

    }

    @PostConstruct
    public void init() {
        service = new AssociadoService();
        associado = new Associado();
        this.estados = Arrays.asList(Estados.values());
        associados = service.findAll();
        pegarMatricula();
    }

    public List<Estados> getEstados() {
        return estados;
    }

    public Associado getAssociado() {
        return associado;
    }

    public void setAssociado(Associado associado) {
        this.associado = associado;
    }

    public String salvar() {
        service.create(this.associado);
        associado = new Associado();
        System.out.println("OK Salvar");
        return "lista_associados.jsf";
    }

    public List<String> autocomplete(String query) {
        return service.autocomplete(query);
    }

    public void pegarMatricula() {
        associado.setMatricula(service.getNumMatricula());
    }

    public List<LocalDeTrabalho> getLocaisDeTrabalho() {
        return locaisDeTrabalho;
    }

    public void setLocaisDeTrabalho(List<LocalDeTrabalho> locaisDeTrabalho) {
        this.locaisDeTrabalho = locaisDeTrabalho;
    }

    public AssociadoService getService() {
        return service;
    }

    public void setService(AssociadoService service) {
        this.service = service;
    }

    public Date getData() {
        return new Date();
    }

    public List<Associado> getAssociados() {
        return associados;
    }

    public void buscarAssociado() {
        associado = service.findById(associado.getMatricula());
    }

    private String endereco;

    public void selecionarImagem(FileUploadEvent upF) throws IOException {
        UploadedFile arq = upF.getFile();
        InputStream is = new BufferedInputStream(arq.getInputstream());
        this.associado.setFoto(IOUtils.toByteArray(is));
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void teste() throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("novo_associado.jsf");

    }

    private Part foto;

    public Part getFoto() {
        return foto;
    }

    public void setFoto(Part foto) {
        this.foto = foto;
    }

}
