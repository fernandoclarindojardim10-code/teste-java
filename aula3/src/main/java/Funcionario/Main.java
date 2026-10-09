/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionario;

/**
 *
 * @author fernando.jardim
 */
public class Main {
    public static void main(String[] args) {
    Func p = new Func();
    p.setNome("Ana souza");
    p.setSalario(2500);
    
    p.setNome("");
    p.setSalario(-100);
    
    p.exibirFicha();
    }
    
}
