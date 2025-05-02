/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        ArrayList<HistorialUsuario> historias = new ArrayList<>();

        System.out.print("¿Cuantas historias de usuario deseas ingresar?: ");
        int cantidad = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\n--- Ingresando historia #" + (i + 1) + " ---");

            System.out.print("ID: ");
            String id = scanner.nextLine();

            System.out.print("Rol: ");
            String rol = scanner.nextLine();

            System.out.print("Funcionalidad: ");
            String funcionalidad = scanner.nextLine();

            System.out.print("Razón: ");
            String razon = scanner.nextLine();

            System.out.print("Criterio: ");
            String criterio = scanner.nextLine();

            System.out.print("Contexto: ");
            String contexto = scanner.nextLine();

            System.out.print("Evento: ");
            String evento = scanner.nextLine();

            System.out.print("Resultado esperado: ");
            String resultadoEsperado = scanner.nextLine();

            historias.add(new HistorialUsuario(id, rol, funcionalidad, razon, criterio, contexto, evento, resultadoEsperado));
        }

        System.out.println("\n=== Historias ingresadas ===");
        for (HistorialUsuario historia : historias) {
            historia.imprimir();
        }

        scanner.close();
    }
    
}
