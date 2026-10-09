/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula6;

import java.util.ArrayList;

/**
 *
 * @author fernando.jardim
 */
public class Turma {
    private String codigo;
    private String disciplina;
    private ArrayList<Alunoo> alunos = new ArrayList<Alunoo>();
    
    public void setCodigo( String codigo){
        this.codigo = codigo;
    }
    public String getcodigo(){
        return codigo;
    }
    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }
    public String getdisciplina(){
        return disciplina;
    }
    public void adicionarAluno(Alunoo aluno){
        alunos.add(aluno);
    }
    public void listarAlunos(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Matricula: " + disciplina);
        
        for (int i = 0; i < alunos.size(); i++){
            alunos.get(i).exibirDados();
        }
    }
}
