/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petshop;

/**
 *
 * @author aluno.den
 */
public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("bigu");
        cliente1.setIdade(2);
        cliente1.setRaca("rotwiller");
        cliente1.setPorte("Grande");
        cliente1.setAlimentacao("pedigree");
        
        Cliente cliente2 = new Cliente();
        cliente2.setNome("arthemis");
        cliente2.setIdade(1);
        cliente2.setRaca("Gato Tigre");
        cliente2.setPorte("Medio");
        cliente2.setAlimentacao("pedigree");
        
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Idade: " + cliente1.getIdade());
        System.out.println("Raca: " + cliente1.getRaca());
        System.out.println("Porte: " + cliente1.getPorte());
        System.out.println("Alimentação: " + cliente1.getAlimentacao());
        
        System.out.println("\n");
        System.out.println("Nome: " + cliente2.getNome());
        System.out.println("Idade: " + cliente2.getIdade());
        System.out.println("Raca: " + cliente2.getRaca());
        System.out.println("Porte: " + cliente2.getPorte());
        System.out.println("Alimentação: " + cliente2.getAlimentacao());
    }
    
}
