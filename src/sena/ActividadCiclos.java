/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sena;

/**
 *
 * @author mario
 */
public class ActividadCiclos {

    private String[] lista_nombre = new String[3];

    public void ciclo_mientras() {
        lista_nombre = new String[3];
        lista_nombre[0] = "edwar";
        lista_nombre[1] = "stiven";
        lista_nombre[2] = "santiago";
        

        int i = 0;

        while (i < lista_nombre.length) {
            if (lista_nombre[i].startsWith("s")) {
                System.out.println("el aprendiz " + i + " " + lista_nombre[i]);
            }
            i++;
        }
    }

    public void comienzaPorSt() {
        int i = 0;
        do {
            if (lista_nombre[i].startsWith("st")) {
                System.out.println("el aprendiz " + i + " " + lista_nombre[i]);
            }
            i++;
        } while (i < lista_nombre.length);
    }
}
