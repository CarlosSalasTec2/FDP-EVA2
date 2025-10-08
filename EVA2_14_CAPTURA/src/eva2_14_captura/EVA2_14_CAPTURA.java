/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_captura;

import java.util.Scanner;

/**
 *
 * @author anago
 */
public class EVA2_14_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int tama;
        System.out.println("Cuantas califiaciones necesitas?");
        tama=input.nextInt();
        int califas[]=new int[tama];
        for(int i=0;i<califas.length;i++){
            System.out.println("Calificacion "+(i+1)+":");
            califas[i]=input.nextInt();
        }
        for(int i=0;i<califas.length;i++){
            System.out.print("["+califas[i]+"]");
            
        }
    }
    
}
