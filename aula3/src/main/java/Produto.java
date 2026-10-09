/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fernando.jardim
 */
public class Produto {
    private double preco;
    private int estoque;
    
    public void setPreco(double preco){
        if (preco > 0){
            this.preco = preco;
        } else {
            System.out.println("Preco invalido! ");
        }
    }
    public void setEstoque(int estoque){
        if (estoque > 0){
            this.estoque = estoque;
        } else {
            System.out.println("Estoque invalido! ");
        }
    }
    public double getPreco(){
        return preco;
    }
    public int getEstoque(){
    return estoque;
}
     public void exibirDados(){
         System.out.println("Preco: $" + preco);
         System.out.println("Estoque: " + estoque);
     }       
    }

