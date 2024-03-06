/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sena;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class EstratoEstudiante {

    private String[] nombreEstudiante = new String[2];
    private int[] estratoEstudiante = new int[2];
    
    private String ciudad, nombreCompleto;
    private float estatura;
    private double distancia;

    EstratoEmpleado pedida = new EstratoEmpleado();

    public String pedir_nombre() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escriba el nombre: "); // Cambio aquí
        String nombre = teclado.next();
        return nombre;
    }

    private void pedirNombreYEstrato() {
        for (int i = 0; i < nombreEstudiante.length; i++) {
            estratoEstudiante[i] = pedida.pedirEstrato();
            nombreEstudiante[i] = pedir_nombre();
        }
    }

    public void mostrarEstudianteTres() {
        pedirNombreYEstrato();
        for (int i = 0; i < nombreEstudiante.length; i++) {
            if(estratoEstudiante[i]==3){
                System.out.println("estudiante  "+ nombreEstudiante[i]+"estrato 3");
            }
        }
    }
    
    public void pedir_ciudad(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escriba la ciudad: "); 
        ciudad = teclado.next();
        
        System.out.print("Escriba la estatura: ");
        estatura = teclado.nextFloat();
        System.out.print("Escriba la distancia: ");
        distancia = teclado.nextDouble();
        System.out.print("Escriba los Apellidos: ");
        nombreCompleto = teclado.next();
    }

}
