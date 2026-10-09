/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula6;

/**
 *
 * @author fernando.jardim
 */
public class Evento {
    private String nome;
    private String local;
    private int lotacao;
    
    public void setNome(String nome){
        if (nome != null && !nome.trim().isEmpty()){
            this.nome = nome;
        }
    }
    public void setLocal(String local){
        if (local != null && !local.trim().isEmpty()){
            this.local = local;
        }
    }
    public void setLotacao(int lotacao){
         if (lotacao > 0){
            this.lotacao = lotacao;
         }
    }
     public String getNome(){
        return nome;
    }
      public String getLocal(){
        return local;
    }
      public int getLotacao(){
        return lotacao;
      }
      public void exibirDados(){
          System.out.println("Nome: " + nome);
           System.out.println("Local: " + local);
            System.out.println("Lotacao: " + lotacao);
                  
      }
}
