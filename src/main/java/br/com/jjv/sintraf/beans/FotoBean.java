/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jjv.sintraf.beans;

import br.com.jjv.sintraf.imagemUtil.FotoUtil;
import java.io.FileNotFoundException;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

/**
 *
 * @author jefferson
 */
@ManagedBean(name = "fotoBean")
@RequestScoped
public class FotoBean implements Serializable{
    
    private static final long serialVersionUID = -2512806101450140965L;

	public StreamedContent getFoto() throws FileNotFoundException {
		String fotoNome = FacesContext.getCurrentInstance().getExternalContext().
                        getRequestParameterMap().get("fotoNome");

		if(FacesContext.getCurrentInstance().getRenderResponse() || fotoNome == null)			
			return new DefaultStreamedContent();
		
		else
			return FotoUtil.recuperarFotoDisco(fotoNome);
	}
}
