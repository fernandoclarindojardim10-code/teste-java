/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula3;

/**
 *
 * @author fernando.jardim
 */
public class Aluno {
    private String nome;
    private double nota;
    
    public void setNota(double nota){
        if (nota >= 0 && nota <=10){
            this.nota = nota;
        }
    }
  public double getNota() {
return nota;
}
}  

