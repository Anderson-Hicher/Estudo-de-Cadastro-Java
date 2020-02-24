/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrodeobraseartistas;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author aluno
 */
public class Escultura extends Obra{
    private String material;
    
    
    public Escultura(int codigo, String titulo, String dataAquisicao, String dimencoes, String material, int codigoArtista){
        super(codigo, titulo, dataAquisicao, dimencoes, codigoArtista);
        this.material=material;
    }
    public void cadastrarEscultura(Escultura escultura) throws IOException{
        FileWriter file= new FileWriter("Esculturas.txt",false);
        PrintWriter writer= new PrintWriter(file);
        
        writer.println(escultura.getCodigo()+";"+escultura.getTitulo()+";"+escultura.getDataAquisicao()+";"+escultura.getDimencoes()+";"+escultura.getMaterial()+";"+escultura.getCodigoArtista());
        
        file.close();
    }
    
    public String getMaterial(){
        return this.material;
    }
    public void setMaterial(String material){
        this.material=material;
    }
}
