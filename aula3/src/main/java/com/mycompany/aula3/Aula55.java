/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula3;

/**
 *
 * @author fernando.jardim
 */
public class Aula55 {

    public static void main(String[] args) {
        Contabancaria conta = new Contabancaria();
        conta.depositar(1000);
        conta.sacar(20);
        conta.getSaldo();
        
        System.out.println("O saldo e: " + conta.getSaldo());
        Aluno a = new Aluno();
a.setNota(9);
System.out.println("A nota e: " + a.getNota());
    }
}
