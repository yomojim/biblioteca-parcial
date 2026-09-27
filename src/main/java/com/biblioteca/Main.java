package com.biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Objeto libro1 utilizando el constructor con parámetros
        try (Scanner scanner = new Scanner(System.in)) {
            // 1. Objeto libro1 utilizando el constructor con parámetros
            Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 5, 2);
            System.out.println("--- Objeto 1 ---");
            System.out.println(libro1);
            
            // 2. Objeto libro2 usando el constructor por defecto y lectura por consola
            Libro libro2 = new Libro();
            System.out.println("\n--- Ingrese datos para libro2 ---");
            System.out.print("Título: ");
            libro2.setTitulo(scanner.nextLine());
            System.out.print("Autor: ");
            libro2.setAutor(scanner.nextLine());
            System.out.print("Número de ejemplares: ");
            libro2.setNumEjemplares(scanner.nextInt());
            System.out.print("Ejemplares prestados: ");
            libro2.setNumEjemplaresPrestados(scanner.nextInt());
            scanner.nextLine(); // Limpiar buffer
            System.out.println("Datos de libro2: " + libro2);
            
            // 3. Objeto libroTextoUNIAC con todos sus atributos
            LibroTextoUNIAC libroUni = new LibroTextoUNIAC("Estructuras de Datos", "Joyanes", 10, 4, "Ingeniería II", "Ingeniería y Tecnologías");
            System.out.println("\n--- Objeto LibroTextoUNIAC ---");
            System.out.println(libroUni);
            
            // 4. Objeto novela indicando su tipo
            Novela novela1 = new Novela("El Hobbit", "J.R.R. Tolkien", 4, 1, "ciencia ficción");
            System.out.println("\n--- Objeto Novela ---");
            System.out.println(novela1);
            
            // Probar métodos de préstamo y devolución
            System.out.println("\n--- Pruebas de Préstamo y Devolución (Libro 1) ---");
            System.out.println("Estado inicial prestados: " + libro1.getNumEjemplaresPrestados());
            
            boolean exitoPrestamo = libro1.prestamo();
            System.out.println("¿Préstamo exitoso? " + exitoPrestamo);
            System.out.println("Prestados actuales: " + libro1.getNumEjemplaresPrestados());
            
            boolean exitoDevolucion = libro1.devolucion();
            System.out.println("¿Devolución exitosa? " + exitoDevolucion);
            System.out.println("Prestados tras devolución: " + libro1.getNumEjemplaresPrestados());
        }
    }
}