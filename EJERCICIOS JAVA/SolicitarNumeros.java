/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solicitarnumeros;

import java.util.Scanner;

/**
 *
 * @author Ronald Rogel 
 */
public class SolicitarNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1,numero2;
        System.out.println("Ingrese un numero: ");
        numero1 = sc.nextInt();
        System.out.println("Ingrse otro numero: ");
        numero2 = sc.nextInt();
        System.out.println("SUMA: " + (numero1 + numero2));
        System.out.println("RESTA: " + (numero1 - numero2));
        System.out.println("MULTIPLICACION: " + (numero1 * numero2));
        System.out.println("DIVISION: " + (numero1/numero2));
        System.out.println("RESIDUO: " + (numero1 % numero2));
    }
    
}
