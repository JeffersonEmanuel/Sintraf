package br.com.jjv.sintraf.jsf;

/**
 *
 * @author Vanderlan Gomes
 */
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

}
