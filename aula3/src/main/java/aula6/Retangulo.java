/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula6;

/**
 *
 * @author fernando.jardim
 */
public class Retangulo {
    private double altura;
     private double largura;
     
     public void setAltura(double altura){
         if (altura > 0){
             this.altura = altura;
         }
     }
     public void setLargura(double largura){
         if (largura > 0){
             this.largura = largura;
         }
     }
     public double calcularArea(){
         return largura + altura;
     }
     public double calcularPerimetro(){
         return 2 * (largura + altura);
     }
     public void exibir(){
         System.out.println("Altura: " + altura);
         System.out.println("Largura: " + largura);
         System.out.println("Area: " + calcularArea());
         System.out.println("Perimetro: " + calcularPerimetro());
         
         
     }
     
}
