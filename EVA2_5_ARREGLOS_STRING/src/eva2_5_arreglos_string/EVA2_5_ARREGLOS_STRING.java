/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_arreglos_string;

import java.util.Scanner;

/**
 *
 * @author anago
 */
public class EVA2_5_ARREGLOS_STRING {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner captu= new Scanner (System.in);
         int dia;
        String diassemana[]=new String[7];
        diassemana[0]="Domingo";
        diassemana[1]="Lunes";
        diassemana[2]="Martes";
        diassemana[3]="Miercoles";
        diassemana[4]="Jueves";
        diassemana[5]="Viernes";
        diassemana[6]="Sabado";
        System.out.println("Introduzca el numero del dia(0-7)");
        dia=captu.nextInt();
        System.out.println("El dia es"+diassemana[dia]);
       
    }
    
}
