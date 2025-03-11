package com.myBiblioteca.Biblioteca.Model;

public class Livro {

    private int Id;
    private String titulo;
    private String autor;
    private String editora;
    private String tema;

    public Livro(String titulo, String autor, String editora, String tema) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.tema = tema;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

}
