/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula3;

/**
 *
 * @author fernando.jardim
 */
public class Contabancaria {
    private String titular;
    private double saldo;
    
    public void depositar(double valor){
        
        saldo = saldo + valor;
        
      
    }
    public double getSaldo(){
        return saldo;
    }
            public void sacar(double valor){
                saldo = saldo - valor;
            }
            public void setTitular(String titular){
                if (titular != null && !titular.isBlank()){
                    this.titular = titular;
                }
            }
}

