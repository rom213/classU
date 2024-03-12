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
public class TareaHoroscopo {

    String signoZodiacal = "";

    private void pedirDatos() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escriba su signo zodiacal: ");
        signoZodiacal = teclado.nextLine();
    }

    private void procesarDatos() {
        signoZodiacal.trim();
        signoZodiacal.toLowerCase();
    }

    public void mostrarMensaje() {
        System.out.println("tu horoscopo es");
        pedirDatos();
        procesarDatos();
        switch (signoZodiacal) {
            case "aries":
                System.out.println("tu signo es Aries");
                break;
            case "pisis":
                System.out.println("tu signo es pisis");
                break;
            case "tauro":
                System.out.println("tu signo es tauro");
                break;
            default:
                System.out.println("signo no exisre");
        }

    }
}
