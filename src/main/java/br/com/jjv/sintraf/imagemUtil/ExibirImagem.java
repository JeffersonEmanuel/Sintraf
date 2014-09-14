/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jjv.sintraf.imagemUtil;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

/**
 *
 * @author jefferson
 */
public class ExibirImagem {
    
    
    
    public StreamedContent carregaImagem(String endereco) {

            System.out.println("------------------------->" + endereco);
            StreamedContent imagem = null;

            try {
                // arquivo onde está a imagem a ser exibida
                final File arquivoImagem = new File(endereco);
                
                // Pega o arquivo acima "arquivoImagem" e converte em entradas de bytes
                final FileInputStream fileInputStream = new FileInputStream(arquivoImagem);
                
                // interface para o fluxo de entrada dos bytes do arquivo "ler os bytes"
                final InputStream is = new BufferedInputStream(fileInputStream);
                
                // implementação 
                imagem = new DefaultStreamedContent(is);
                System.out.println("Imagem OK!!");
            } catch (FileNotFoundException e) {
                System.out.println("Erro ao importar a imagem " + endereco);
            }
        return imagem;
    }

    
}
