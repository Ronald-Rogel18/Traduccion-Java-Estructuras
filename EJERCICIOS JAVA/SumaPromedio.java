/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumapromedio;

import java.util.Scanner;

/**
 *
 * @author Ronald Rogel 
 */
public class SumaPromedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int suma = 0;
        double prom;
        for (int i = 1; i <= 10; i++){
            System.out.println("Ingrese numero " + i + ":");
            num = sc.nextInt();
            suma = suma + num;
        }
        prom = (double) suma / 10;
        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es: " + prom);
    }
    
}
