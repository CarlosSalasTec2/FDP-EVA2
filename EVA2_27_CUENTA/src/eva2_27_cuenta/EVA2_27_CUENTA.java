/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_27_cuenta;

import java.util.Scanner;

/**
 *
 * @author anago
 */
public class EVA2_27_CUENTA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner (System.in);
        int num;
        int cuenta = 1000000;
        do{
            System.out.println("Cantidad a retirar");
            num=input.nextInt();
            cuenta=cuenta-num;
        }while(cuenta>0);
        System.out.println("Tu saldo es: "+cuenta);
    }
    
}
