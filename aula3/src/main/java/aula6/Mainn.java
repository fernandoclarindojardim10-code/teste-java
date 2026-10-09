/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula6;

/**
 *
 * @author fernando.jardim
 */
public class Mainn {
    public static void main(String[] args) {
        Termostato t = new Termostato();
        
        t.setTemperatura(22);
        System.out.println("Temperatura inicial: " + t.getTemperatura());
        
        t.setTemperatura(15);
        t.setTemperatura(31);
        System.out.println("Temperatura esperada 22: " + t.getTemperatura());
        
        t.ligar();
        t.aumentar();
        t.aumentar();
        System.out.println("Temperatura apos ligar e aumentar 2x: " + t.getTemperatura());
        
        for (int i = 0; i <10;i++){
        t.aumentar();
        }
        System.out.println("Teste limite superior (eperado 30): " + t.getTemperatura());
            
            t.desligar();
            t.aumentar();
            t.exibirEstado();
        }
    }       
    

