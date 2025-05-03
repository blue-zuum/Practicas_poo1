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
    private int edad;
    private ArrayList<String> historial;

    public HistorialUsuario() {
        historial = new ArrayList<>();
    }

    public HistorialUsuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        historial = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void agregarHistorial(String entrada) {
        historial.add(entrada);
    }

    public void mostrarHistorial() {
        System.out.println("Historial de " + nombre + ":");
        for (String entrada : historial) {
            System.out.println("- " + entrada);
        }
    }
}
