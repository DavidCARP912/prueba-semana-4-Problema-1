/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciounodeprueba;

import java.util.Scanner;

/**
 *
 * @author sandr
 */
public class Ejerciciounodeprueba {

    /**
     * @param args the command line arguments
     */
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Cuantos productos compro: ");
        int productos = scanner.nextInt();

        double costo = 0;

        
        for (int i = 1; i <= productos; i++) {
            System.out.print("Cuanto costo el producto " + i + ": ");
            double precio = scanner.nextDouble();

            System.out.print("Cuantos productos compro " + i + ": ");
            int cantidad = scanner.nextInt();

            
            costo += precio * cantidad;
        }

       
        System.out.printf("El costo es: %.2f\n", costo);

        scanner.close();
    }
}

      
    

