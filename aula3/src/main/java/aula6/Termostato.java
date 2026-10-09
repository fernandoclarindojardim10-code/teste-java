/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula6;

/**
 *
 * @author fernando.jardim
 */
public class Termostato {
    private double temperatura;
    private boolean ligado;
    
    public Termostato (){
        this.ligado = false;
        this.temperatura = 22;
    }
    
    public void setTemperatura(double Temperatura){
        if (temperatura >= 16 && temperatura <30){
            this.temperatura = temperatura;
        }
    }
    public double getTemperatura(){
        return temperatura;
    }
    public boolean isLigado(){
        return ligado;
    }
    public void ligar(){
        this.ligado = true;
    }
    public void desligar(){
        this.ligado = false;
    }
    public void aumentar(){
        if (ligado &&(temperatura + 1.0 <=30.0)){
            temperatura += 1.0;
        }
    }
    public void diminuir (){
        if (ligado && (temperatura - 1.0 >= 16.0)){
            temperatura -= 1.0;
        }
    }
    public void exibirEstado(){
        System.out.println("Estado do termostato: ");
        System.out.println("Ligado: " + ligado);
        System.out.println("Temperatura: " + temperatura + "°C");
    }
}
