/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jjv.sintraf.imagemUtil;

import java.io.File;
import java.io.IOException;
import javax.faces.FacesException;
import javax.imageio.stream.FileImageOutputStream;
import org.primefaces.event.CaptureEvent;

/**
 *
 * @author jefferson
 */
public class CapturarImagemCam {
    
     public void capiturarImagemWebCam(CaptureEvent captureEvent, String enderecoComNome) {
        byte[] data = captureEvent.getData();
         
        String arquivo = enderecoComNome + ".png";
         
        FileImageOutputStream imageOutput;
        try {
            imageOutput = new FileImageOutputStream(new File(arquivo));
            imageOutput.write(data, 0, data.length);
            imageOutput.close();
        }
        catch(IOException e) {
            throw new FacesException("Erro ao salvar Imagem.", e);
        }
    }
    
    
}
