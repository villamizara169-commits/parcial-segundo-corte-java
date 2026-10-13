/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== REGISTRO DE ESTUDIANTE ===");
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombreEst = scanner.nextLine();
        
        System.out.print("Ingrese la edad: ");
        int edadEst = scanner.nextInt();
        
        System.out.print("Ingrese el documento: ");
        scanner.nextLine(); // Limpiar el buffer
        String docEst = scanner.nextLine();
        
        System.out.print("Ingrese el programa académico: ");
        String programa = scanner.nextLine();
        
        System.out.print("Ingrese el promedio: ");
        double promedio = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer

        // Crear objeto Estudiante con los datos ingresados
        Estudiante estudiante = new Estudiante(nombreEst, edadEst, docEst, programa, promedio);


        System.out.println("\n=== REGISTRO DE PROFESOR ===");
        System.out.print("Ingrese el nombre del profesor: ");
        String nombreProf = scanner.nextLine();
        
        System.out.print("Ingrese la edad: ");
        int edadProf = scanner.nextInt();
        
        System.out.print("Ingrese el documento: ");
        scanner.nextLine(); // Limpiar el buffer
        String docProf = scanner.nextLine();
        
        System.out.print("Ingrese el área: ");
        String area = scanner.nextLine();
        
        System.out.print("Ingrese el salario base: ");
        double salarioBase = scanner.nextDouble();
        
        System.out.print("Ingrese las horas cátedra: ");
        int horasCatedra = scanner.nextInt();

        // Crear objeto Profesor con los datos ingresados
        Profesor profesor = new Profesor(nombreProf, edadProf, docProf, area, salarioBase, horasCatedra);


        // Mostrar la información de ambos
        System.out.println("\n----------------------------------------");
        System.out.println("--- MOSTRANDO DATOS DEL ESTUDIANTE ---");
        System.out.println("----------------------------------------");
        estudiante.mostrarInfo();
        System.out.println("Rol: " + estudiante.getRol());

        System.out.println("\n----------------------------------------");
        System.out.println("--- MOSTRANDO DATOS DEL PROFESOR ---");
        System.out.println("----------------------------------------");
        profesor.mostrarInfo();
        System.out.println("Rol: " + profesor.getRol());

        scanner.close();
    }
}