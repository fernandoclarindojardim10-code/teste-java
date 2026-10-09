/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fernando.jardim
 */
public class Main {
    public static void main(String[] args) {
        Produto p = new Produto();
        p.setPreco(19.90);
        p.setEstoque(8);
        
        p.setPreco(-10);
        p.setEstoque(-3);
        
        
        p.exibirDados();
    }
}
