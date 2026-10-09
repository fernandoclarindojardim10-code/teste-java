/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionario;

/**
 *
 * @author fernando.jardim
 */
public class Func {
    private String nome;
    private double salario;
    
    public void setNome(String nome){
        if (nome != null && !nome.trim().isEmpty()){
            this.nome = nome;
        } else {
            System.out.println("Nome invalido! ");
        }
    }
        public void setSalario(double salario){
        if (salario > 0){
            this.salario = salario;
        } else {
            System.out.println("Salario invalido! ");
        }
    }
        public String getNome(){
            return nome;
        }
        public double getSalario(){
            return salario;
        }
        public void exibirFicha(){
            System.out.println("Nome: " + nome);
            System.out.println("Salario: $" + salario);
        }
    }
    

