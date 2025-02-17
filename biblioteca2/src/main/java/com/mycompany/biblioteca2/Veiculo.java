/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca2;

/**
 *
 * @author aluno.den
 */
public class Veiculo {
    private int placa;
    private String cor;
    private String numeroDePassageiros;
    private Int capacidadeDoTanque;
    private int velocidadeMaxima;
    private int consumoMedio;

    public Veiculo() {
    }

    public Veiculo(int placa, String cor, String numeroDePassageiros, Int capacidadeDoTanque, int velocidadeMaxima, int consumoMedio) {
        this.placa = placa;
        this.cor = cor;
        this.numeroDePassageiros = numeroDePassageiros;
        this.capacidadeDoTanque = capacidadeDoTanque;
        this.velocidadeMaxima = velocidadeMaxima;
        this.consumoMedio = consumoMedio;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNumeroDePassageiros() {
        return numeroDePassageiros;
    }

    public void setNumeroDePassageiros(String numeroDePassageiros) {
        this.numeroDePassageiros = numeroDePassageiros;
    }

    public Int getCapacidadeDoTanque() {
        return capacidadeDoTanque;
    }

    public void setCapacidadeDoTanque(Int capacidadeDoTanque) {
        this.capacidadeDoTanque = capacidadeDoTanque;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(int consumoMedio) {
        this.consumoMedio = consumoMedio;
    }
    
    
    
    
}
