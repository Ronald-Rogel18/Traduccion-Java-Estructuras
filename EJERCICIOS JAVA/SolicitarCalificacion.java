/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solicitarcalificacion;

import java.util.Scanner;

/**
 *
 * @author Ronald Rogel 
 */
public class SolicitarCalificacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double calif;
        System.out.println("Ingrese la calificacion: ");
        calif = sc.nextDouble();
        if (calif >= 9 && calif <= 10){
            System.out.println("EXCELENTE");
    } else if (calif >= 8){ 
        System.out.println("MUY BUENO");
    } else if (calif >= 7){
        System.out.println("BUENO");
    } else if (calif >= 5){
        System.out.println("REGULAR");
    } else if (calif >= 0){
        System.out.println("DEFICIENTE");
    }
    
}
}