package sena;

import java.util.Scanner;

public class EstratoEmpleado {

    int estrato;

    int pedirEstrato() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escriba el estrato: "); // Cambio aquí
        estrato = teclado.nextInt();
        return estrato;
    }
    
    void clasificar_estrato(int estrato){
        if(estrato>3){
            System.out.println("estrato alto");
        }else{
            System.out.println("estrato bajo");
        }
    }
    
    public void ejecutar_estrato(){
        int estra=pedirEstrato();
        clasificar_estrato(estra);
    }
}
