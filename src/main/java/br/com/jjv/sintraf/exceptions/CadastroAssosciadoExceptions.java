/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jjv.sintraf.exceptions;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author jefferson
 */
public class CadastroAssosciadoExceptions {
 
    
     private String mensagem;
 
    public String getMensagem() {
        return mensagem;
    }
 
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
     
    public void dataFiliacao() {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Erro no cadastro",  "Falta adicionar a data de"
                + "Filiação: " + mensagem) );
    }
}
