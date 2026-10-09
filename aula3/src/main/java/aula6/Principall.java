/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula6;

/**
 *
 * @author fernando.jardim
 */
public class Principall {
     public static void main(String[] args) {
         Alunoo a1 = new Alunoo();
         Alunoo a2 = new Alunoo();
         
         a1.setNome("Ana Souza");
         a1.setMatricula("20261001");
         
         a2.setNome("Bruno dias");
         a2.setMatricula("20261002");
         
         Turma poo = new Turma();
         poo.setCodigo("T01");
         poo.setDisciplina("POO");
         
         poo.adicionarAluno(a1);
         poo.adicionarAluno(a2);
         
         poo.listarAlunos();
         
         a1.exibirDados();
     }
}
