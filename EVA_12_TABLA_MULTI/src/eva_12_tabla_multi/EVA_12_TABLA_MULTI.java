/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_12_tabla_multi;

import java.util.Scanner;

/**
 *
 * @author anago
 */
public class EVA_12_TABLA_MULTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        int num;
        System.out.println("de que numero quiere ver la tabla?");
        num=input.nextInt();
        for(int i=1;i<=10;i++){
            System.out.print(num+"x"+i+"=");
            System.out.println(num*i);}
    }
    
}
