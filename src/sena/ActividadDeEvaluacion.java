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
public class ActividadDeEvaluacion {

    private void ejercicio1() {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum = sum + i;
            }
        }

        System.out.println("la suma de los numeros primo 3 y 5 es:  " + sum);
    }

    private void ejercicio2() {
        String texto = "hola mundo de la paz";
        char[] letras = texto.toCharArray();

        int count=0;
        for (char letra : letras) {
            if ( letra== 'a'){
                count+=1;
            }
        }
        
        System.out.println("del texto, hola mundo de la paz, la letra a se repite: "+ count);
    }
    
    
 private void ejercicio3() {
        int numero = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escriba un numero: ");
        numero = teclado.nextInt();

        if (esPrimo(numero)) {
            System.out.println("El número ingresado es primo.");
        } else {
            System.out.println("El número ingresado NO es primo.");
        }
    }

    private boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public void ejecute(){
        ejercicio1();
        ejercicio2();
        ejercicio3();
    }

}
