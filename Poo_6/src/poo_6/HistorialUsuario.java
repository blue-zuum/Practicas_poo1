/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_6;

/**
 *
 * @author PC
 */
public class HistorialUsuario {
    private String[] historial;
    private int contador;

    public HistorialUsuario() {
        historial = new String[10];
        contador = 0;
    }

    public void agregarAlHistorial(String entrada) {
        try {
            if (contador >= historial.length) {
                throw new ArrayIndexOutOfBoundsException("Historial lleno. No se puede agregar más.");
            }
            historial[contador] = entrada;
            contador++;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void mostrarHistorial() {
        try {
            if (contador == 0) {
                throw new Exception("El historial está vacío.");
            }
            System.out.println("Historial:");
            for (int i = 0; i < contador; i++) {
                System.out.println((i + 1) + ". " + historial[i]);
            }
        } catch (Exception e) {
            System.out.println("Error al mostrar historial: " + e.getMessage());
        }
    }

    // Sobrecarga: mostrar solo cierta cantidad de elementos
    public void mostrarHistorial(int cantidad) {
        try {
            if (cantidad > contador) {
                throw new IllegalArgumentException("Cantidad mayor que el tamaño del historial.");
            }
            System.out.println("Mostrando los últimos " + cantidad + " elementos:");
            for (int i = contador - cantidad; i < contador; i++) {
                System.out.println((i + 1) + ". " + historial[i]);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
