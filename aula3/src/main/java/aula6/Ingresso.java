/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula6;

/**
 *
 * @author fernando.jardim
 */
public class Ingresso {
    private String codigo;
    private double preco;
    private Evento evento;
    private boolean vendido;
    
    public Ingresso(){
        this.vendido = false;
    }
    public void setCodigo(String codigo){
        if (codigo != null && !codigo.trim().isEmpty()){
            this.codigo = codigo;
        }
    }
    public void setPreco(double preco){
         if (preco > 0){
             this.preco = preco;
         }
    }
    public void setEvento(Evento preco){
        if(evento != null){
             this.evento = evento;
        }
    }
    public String getCodigo(){
        return codigo;
    }
    public double getPreco(){
        return preco;
    }
    public boolean isVendido(){
        return vendido;
    }
    public void vender(){
        if(evento != null){
            this.vendido = true;
        }
    }
    public void exibirResumo(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Preco: " + preco);
        System.out.println("Vendido: " + (vendido ? "Sim" : "Nao"));
        if (evento != null){
           System.out.println("Evento: " + this.evento.getNome());
        }
        
    }
}
