/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_28_primo;

import java.util.Scanner;

/**
 *
 * @author anago
 */
public class EVA2_28_PRIMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner (System.in);
        int num;
        boolean esprimo = true;
        System.out.println("Introduzca que numero desea saber si es primo");
        num=input.nextInt();
        for (int i = 2; i < num; i++) {
            int res=num%i;
            if(res==0){
                esprimo=false;
                                break;
            }
        }if(esprimo)
            System.out.println("Si es primo!");
        else System.out.println("No es primo!");
    }
    
    
}
