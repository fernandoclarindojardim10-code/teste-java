/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula6;

/**
 *
 * @author fernando.jardim
 */
public class Mainm {
 public static void main(String[] args) {
     Evento evento = new Evento();
     evento.setNome("Mostra de tecnologia");
     evento.setLocal("Auditorio A");
     evento.setLotacao(200);
     
     Ingresso ingresso = new Ingresso();
     ingresso.setCodigo("TEC-001");
     ingresso.setPreco(35);
     
     
     ingresso.setEvento(evento);
     ingresso.vender();
     ingresso.vender();
     
     evento.exibirDados();
     ingresso.exibirResumo();
       System.out.println("Vendido: " + ingresso.isVendido());
         
     
 }    
}
