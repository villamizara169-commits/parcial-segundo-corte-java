/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Profesor extends Persona {
    // Atributos privados (-) según el diagrama
    private String area;
    private double salarioBase;
    private int horasCatedra;

    // Constructor que incluye los atributos de Persona
    public Profesor(String nombre, int edad, String documento, String area, double salarioBase, int horasCatedra) {
        super(nombre, edad, documento);
        this.area = area;
        this.salarioBase = salarioBase;
        this.horasCatedra = horasCatedra;
    }

    public double calcularSalario() {
        // Lógica de ejemplo para calcular el salario en base a las horas cátedra
        return salarioBase + (horasCatedra * 50.0); 
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Área: " + area);
        System.out.println("Salario Base: " + salarioBase);
        System.out.println("Horas Cátedra: " + horasCatedra);
        System.out.println("Salario Total: " + calcularSalario());
    }

    @Override
    public String getRol() {
        return "Profesor";
    }
}
