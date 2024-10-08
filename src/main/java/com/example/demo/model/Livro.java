
package com.example.demo.model;

// Esta classe representa um livro
public class Livro {
    // Atributos do livro
    private Long id;
    private String titulo;
    private String autor;
    private String isbn;

    // Construtor da classe Livro
    public Livro(Long id, String titulo, String autor, String isbn) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    // Métodos Getters e Setters são usados para acessar e modificar os atributos privados da classe

    // Método para obter o ID do livro
    public Long getId() {
        return id;
    }

    // Método para definir o ID do livro
    public void setId(Long id) {
        this.id = id;
    }

    // Método para obter o título do livro
    public String getTitulo() {
        return titulo;
    }

    // Método para definir o título do livro
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Método para obter o autor do livro
    public String getAutor() {
        return autor;
    }

    // Método para definir o autor do livro
    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Método para obter o ISBN do livro
    public String getIsbn() {
        return isbn;
    }

    // Método para definir o ISBN do livro
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
