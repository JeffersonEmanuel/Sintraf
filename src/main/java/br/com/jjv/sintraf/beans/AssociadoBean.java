package br.com.jjv.sintraf.beans;

import br.com.jjv.sintraf.entidades.Associado;
import br.com.jjv.sintraf.entidades.LocalDeTrabalho;
import br.com.jjv.sintraf.enumerats.Estados;
import br.com.jjv.sintraf.services.AssociadoService;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.FacesException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.imageio.stream.FileImageOutputStream;
import javax.servlet.ServletContext;
import org.primefaces.event.CaptureEvent;

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

    public void salvar() {
        service.create(this.associado);
        associado = new Associado();
    }

    public void onCaptureFotoCamera(CaptureEvent captureEvent){
        byte[] foto = captureEvent.getData();
        String newFileName = "/home/jefferson/Área de Trabalho/Imagens/"+ associado.getNome()+ ".png";
         
        FileImageOutputStream imageOutput;
        try {
            imageOutput = new FileImageOutputStream(new File(newFileName));
            imageOutput.write(foto, 0, foto.length);
            imageOutput.close();
        }
        catch(IOException e) {
            throw new FacesException("Error in writing captured image.", e);
        }
    }

    
    public void pegarMatricula () {
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
        return  new Date();
    }

    public List<Associado> getAssociados() {
        return associados;
    }
    
    
    
    
    
}
