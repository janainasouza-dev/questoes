/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcoes.entidades.biblioteca;

/**
 *
 * @author jana
 */
public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponivel;
    
    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponivel = true;
    }
    
    // Getters e Setters
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public String getIsbn() { return isbn; }
    public boolean isDisponivel() { return disponivel; }
    public void setDisponivel(boolean disponivel) { this.disponivel = disponivel; }
    
    @Override
    public String toString() {
        return titulo + " - " + autor + (disponivel ? " [DISPONÍVEL]" : " [INDISPONÍVEL]");
    }
}

