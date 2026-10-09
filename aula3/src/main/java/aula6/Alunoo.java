/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula6;

/**
 *
 * @author fernando.jardim
 */
public class Alunoo {
    private String nome;
    private String matricula;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getnome(){
        return nome;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public String getmatricula(){
        return matricula;
    }
    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
    }
}
