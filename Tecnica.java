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
public class Tecnica {
    private int codigo;
    private String descricao;
    
    
    public Tecnica(){}
    
    public Tecnica(int codigo, String descricao){
        this.codigo=codigo;
        this.descricao=descricao;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    public void setDescricao(String descricao){
        this.descricao=descricao;
    }
}
