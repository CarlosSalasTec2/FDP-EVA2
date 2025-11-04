/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_26_factorial;

import java.util.Scanner;

/**
 *
 * @author anago
 */
public class EVA2_26_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner (System.in);
        int num,fac=1;
        System.out.println("Introduce el numero");
        num=input.nextInt();
        for (int i = 0; i < num; i++) {
            fac=fac*i;
            
        }
        System.out.println("Factorial de "+num+"="+fac);
    }
    
}
