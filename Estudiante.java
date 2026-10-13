/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Estudiante extends Persona {
    // Atributos privados (-) según el diagrama
    private String programa;
    private double promedio;

    // Constructor que incluye los atributos de Persona
    public Estudiante(String nombre, int edad, String documento, String programa, double promedio) {
        super(nombre, edad, documento);
        this.programa = programa;
        this.promedio = promedio;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Programa: " + programa);
        System.out.println("Promedio: " + promedio);
    }

    @Override
    public String getRol() {
        return "Estudiante";
    }
}