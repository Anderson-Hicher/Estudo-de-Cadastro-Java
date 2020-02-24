/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrodeobraseartistas;

/**
 *
 * @author aluno
 */
public class Obra {
    private int codigo;
    private String titulo;
    private String dataAquisicao;
    private String dimencoes;
    private int codigoArtista;
    
    public Obra(){}
    public Obra(int codigo, String titulo, String dataAquisicao, String dimencoes, int codigoArtista){
        this.codigo=codigo;
        this.titulo=titulo;
        this.dataAquisicao=dataAquisicao;
        this.dimencoes=dimencoes;
        this.codigoArtista=codigoArtista;
    }
        
    public int getCodigo(){
        return this.codigo;
    }
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public String getDataAquisicao(){
        return this.dataAquisicao;
    }
    public void setDataAquisicao(String dataAquisicao){
        this.dataAquisicao=dataAquisicao;
    }
    public String getDimencoes(){
        return this.dimencoes;
    }
    public void setDimencoes(String dimencoes){
        this.dimencoes=dimencoes;
    }
    public int getCodigoArtista(){
        return this.codigoArtista;
    }
    public void setCodigoArtista(int codigoArtista){
        this.codigoArtista=codigoArtista;
    }
}
