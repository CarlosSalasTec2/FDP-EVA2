/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_triangulo;

import java.util.Scanner;

/**
 *
 * @author anago
 */
public class EVA2_24_TRIANGULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        String ab,ab2;
        ab2="*";
        ab="*";
        Scanner input= new Scanner (System.in);
        System.out.println("Cuantas filas de asteriscos quiere?");
        num= input.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println(ab);
           ab=ab+ab2;
        }
        
    }
    
}
