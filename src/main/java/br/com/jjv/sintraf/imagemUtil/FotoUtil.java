/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jjv.sintraf.imagemUtil;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.imageio.ImageIO;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

/**
 *
 * @author jefferson
 */
public class FotoUtil implements Serializable {

    private static final long serialVersionUID = -7538592532189320120L;

    public static final String endereco =  File.separator + "home"
                + File.separator + "jefferson" + File.separator + "Área de Trabalho"
                + File.separator + "Imagens" + File.separator + "Sintraf" + File.separator;

    public static StreamedContent recuperarFotoDisco(String id) throws FileNotFoundException {
        try {
            return new DefaultStreamedContent(new FileInputStream(new File(endereco + id + ".png")), "image/png");
        } catch (IOException e) {
            e.printStackTrace();

            return new DefaultStreamedContent(new FileInputStream(new File(endereco + "base.png")), "image/png");
        }
    }
}
