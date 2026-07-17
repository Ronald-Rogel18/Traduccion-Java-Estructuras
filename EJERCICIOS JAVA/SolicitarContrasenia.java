/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solicitarcontrasenia;

import java.util.Scanner;

/**
 *
 * @author Ronald Rogel 
 */
public class SolicitarContrasenia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String clave;
        String claveCorrecta = "java2026";
        do {
            System.out.println("Ingrese la clave:");
            clave = sc.nextLine();
            if (!clave.equals (claveCorrecta));
            System.out.println("Contraseña Incorrecta. Intente de nuevo.");
        } while (!clave.equals (claveCorrecta));  
        System.out.println("Acceso concedido");
        
    }
    
}
