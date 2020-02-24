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
public class Artista {
    private int codigo;
    private String nome;
    private String nacionalidade;
    private int codigoTecnica;
    
    public Artista(){}
    public Artista(int codigo, String nome, String nacionalidade, int codigoTecnica){
        this.codigo=codigo;
        this.nome=nome;
        this.nacionalidade=nacionalidade;
        this.codigoTecnica=codigoTecnica;
    }
    
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNacionalidade(){
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade){
        this.nacionalidade=nacionalidade;
    }
    public int getCodigoTecnica(){
        return this.codigoTecnica;
    }
    public void setCodigoTecnica(int codigoTecnica){
        this.codigoTecnica=codigoTecnica;
    }
    
}
