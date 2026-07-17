/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solicitarnota;

import java.util.Scanner;

/**
 *
 * @author Ronald Rogel 
 */
public class SolicitarNota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;
        System.out.println("Ingrese la nota: ");
        nota = sc.nextDouble();
        if (nota >= 7){
            System.out.println("Aprobado");
        }   else { 
                    System.out.println("REPROBADO");
                    }
        
    }
    
}
