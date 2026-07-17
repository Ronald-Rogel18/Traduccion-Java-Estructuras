/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mayormenor;

import java.util.Scanner;

/**
 *
 * @author Core 5-Pro
 */
public class MayorMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Ingrese numero 1: ");
        num = sc.nextInt();
        int mayor = num;
        int menor = num;
        for (int i = 2; i <= 10; i++){
            System.out.println("Ingrse numero " + i + ":");
            num = sc.nextInt();
            if (num > mayor){
                mayor = num;
            }
            if (num < menor){
                menor = num;
            }
        }
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
    }
    
    
}
