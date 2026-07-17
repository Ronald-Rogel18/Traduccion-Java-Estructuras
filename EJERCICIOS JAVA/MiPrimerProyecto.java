/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miprimerproyecto;

import java.util.Scanner;

/**
 *
 * @author Ronald Rogel
 */
public class MiPrimerProyecto {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        int edad;
        String nombre;
        String carrera;
        double peso;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese su nombre");
        nombre = sc.nextLine();
        System.out.println("Ingrese su carrera");
        carrera =sc.nextLine();
        System.out.println("Ingrese su peso");
        peso = sc.nextDouble();
        System.out.println("DATOS INGRESADOS");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println("Peso: " + peso + "Kg");
        
        
        
                    }

    }


