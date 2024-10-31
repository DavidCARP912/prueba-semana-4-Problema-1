/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciotresprueba;

import java.util.Scanner;

/**
 *
 * @author sandr
 */
public class Ejerciciotresprueba {

   

   
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        int totaldeproductos = 0;
        
        while (true) {
            System.out.print("Ingrese el nombre del producto (o 'salir' para finalizar): ");
            String producto = scanner.nextLine();
            if (producto.equalsIgnoreCase("salir")) {
                break;
            }
            System.out.print("Cuantos productos hay en el almacen de " + producto + ": ");
            int cantidad = scanner.nextInt();
            scanner.nextLine(); 
            
            totaldeproductos += cantidad;
        }
        
        System.out.printf("La cantidad total de productos registrados es: %d\n", totaldeproductos);
        scanner.close();
    }
}
