/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca2;

/**
 *
 * @author aluno.den
 */
public class Livro {
    private String titulo;
    private String autor;
    private int isbn;
    private int numeroDePaginas;
    private double valorDeCompras;

    public Livro() {
    }

    public Livro(String titulo, String autor, int isbn, int numeroDePaginas, double valorDeCompras) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numeroDePaginas = numeroDePaginas;
        this.valorDeCompras = valorDeCompras;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public double getValorDeCompras() {
        return valorDeCompras;
    }

    public void setValorDeCompras(double valorDeCompras) {
        this.valorDeCompras = valorDeCompras;
    }
    
    
    
}
