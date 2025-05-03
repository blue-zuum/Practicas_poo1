/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_6;
import java.util.ArrayList;
/**
 *
 * @author PC
 */
public class HistorialUsuario {
    private String nombre;
    private ArrayList<String> historial;

    // Constructor
    public HistorialUsuario(String nombre) {
        this.nombre = nombre;
        this.historial = new ArrayList<>();
    }

    // Método para agregar una entrada al historial
    public void agregarEntrada(String entrada) {
        historial.add(entrada);
        System.out.println("Entrada agregada: " + entrada);
    }

    // Método sobrecargado para agregar múltiples entradas
    public void agregarEntrada(ArrayList<String> entradas) {
        historial.addAll(entradas);
        System.out.println("Entradas agregadas: " + entradas.size());
    }

    // Mostrar historial
    public void mostrarHistorial() {
        System.out.println("Historial de " + nombre + ":");
        if (historial.isEmpty()) {
            System.out.println("No hay entradas en el historial.");
        } else {
            for (String entrada : historial) {
                System.out.println("- " + entrada);
            }
        }
    }

    public static void main(String[] args) {
        HistorialUsuario usuario = new HistorialUsuario("Ana");
        usuario.agregarEntrada("Inicio de sesión");
        usuario.agregarEntrada("Consultó su saldo");

        ArrayList<String> nuevasEntradas = new ArrayList<>();
        nuevasEntradas.add("Realizó un pago");
        nuevasEntradas.add("Cerró sesión");

        usuario.agregarEntrada(nuevasEntradas);
        usuario.mostrarHistorial();
    }
}
