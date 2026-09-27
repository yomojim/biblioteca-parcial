package com.biblioteca;

public class Libro {
    protected String titulo;
    protected String autor;
    protected int numEjemplares;
    protected int numEjemplaresPrestados;

    // Constructor por defecto
    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.numEjemplares = 0;
        this.numEjemplaresPrestados = 0;
    }

    // Constructor con parámetros
    public Libro(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
        this.numEjemplaresPrestados = numEjemplaresPrestados;
    }

    // Métodos Get y Set
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public int getNumEjemplares() { return numEjemplares; }
    public void setNumEjemplares(int numEjemplares) { this.numEjemplares = numEjemplares; }

    public int getNumEjemplaresPrestados() { return numEjemplaresPrestados; }
    public void setNumEjemplaresPrestados(int numEjemplaresPrestados) { this.numEjemplaresPrestados = numEjemplaresPrestados; }

    // Método préstamo
    public boolean prestamo() {
        if (numEjemplares > numEjemplaresPrestados) {
            numEjemplaresPrestados++;
            return true;
        }
        return false;
    }

    // Método devolución
    public boolean devolucion() {
        if (numEjemplaresPrestados > 0) {
            numEjemplaresPrestados--;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + 
               ", Stock total: " + numEjemplares + 
               ", Prestados: " + numEjemplaresPrestados;
    }
}