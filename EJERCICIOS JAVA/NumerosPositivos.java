/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerospositivos;

import java.util.Scanner;

/**
 *
 * @author Ronald Rogel 
 */
public class NumerosPositivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int suma = 0;
        int contador = 0;
        do {
            System.out.println("Ingrese un numero positivo: ");
            num = sc.nextInt();
            if (num > 0) {
                suma = suma + num;
                contador = contador +1;
            }
        } while (num > 0);
        System.out.println("La suma total es: " + suma);
        System.out.println("La cantidad de numeros ingresados son: " + contador);
    }
    
}
