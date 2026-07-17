/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablamultiplicar;

import java.util.Scanner;

/**
 *
 * @author Ronald Rogel 
 */
public class TablaMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero:");
        num = sc.nextInt();
        for (int i = 1; i <= 12; i ++){
            System.out.println(num + "x" + i + "=" + (num * i));        
    }
    }
}
