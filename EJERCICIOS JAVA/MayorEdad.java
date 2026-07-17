/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mayoredad;

import java.util.Scanner;

/**
 *
 * @author Ronald Rogel 
 */
public class MayorEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        System.out.println("Ingrse su edad");
        edad = sc.nextInt();
        if (edad >= 18){
            System.out.println("Es mayor de edad ");
        }
        
        
    }
}