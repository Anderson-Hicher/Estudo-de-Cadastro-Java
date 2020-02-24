/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrodeobraseartistas;

import java.io.*;
import java.io.IOException;

/**
 *
 * @author aluno
 */
public class Pintura extends Obra{
    private String tipoTinta;
    
    public Pintura(int codigo, String titulo, String dataAquisicao, String dimencoes, String tipoTinta, int codigoArtista){
        super(codigo, titulo, dataAquisicao, dimencoes, codigoArtista);
        this.tipoTinta=tipoTinta;
    }
    
    public void cadastrarPintura(Pintura pintura) throws IOException{
        FileWriter file= new FileWriter("Pinturas.txt",false);
        PrintWriter writer= new PrintWriter(file);
        
        writer.print(pintura.getCodigo()+";"+pintura.getTitulo()+";"+pintura.getDataAquisicao()+";"+pintura.getDimencoes()+";"+pintura.getTipoTinta()+";"+pintura.getCodigoArtista());
        
        file.close();
    }
    
    public String getTipoTinta(){
        return this.tipoTinta;
    }
    public void setTipoTinta(String tipoTinta){
        this.tipoTinta=tipoTinta;
    }
    
}
