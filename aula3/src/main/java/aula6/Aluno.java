/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula6;

/**
 *
 * @author fernando.jardim
 */
public class Aluno {
    private String nome;
    private double nota;
    
    public void setNome (String nome){
    if (nome != null && !nome.trim().isEmpty()){
            this.nome = nome;
    }
    }
    public void setNota(double nota){
        if (nota >= 0 && nota <= 10){
            this.nota = nota;
        }
    }
    public String getNome(){
            return nome;
        }
    public double getNota(){
    return nota;
}
    public void exibirBoletim(){
         System.out.println("Nome: " + nome);
         System.out.println("Nota: " + nota);
     }   
}

