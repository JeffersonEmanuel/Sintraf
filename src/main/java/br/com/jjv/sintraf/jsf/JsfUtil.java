package br.com.jjv.sintraf.jsf;

/**
 *
 * @author Vanderlan Gomes
 */
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class JsfUtil {

    public static void addSuccessMessage(String message) {
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO,
                        message, message));
    }

    public static void addErrorMessage(String message) {
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_ERROR,
                        message, message));
    }

    public static void redirect(String locate) {
        
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect(locate);
        } catch (IOException ex) {
            Logger.getLogger(JsfUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
