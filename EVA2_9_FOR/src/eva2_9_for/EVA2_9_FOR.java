/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_for;

import java.util.Scanner;

/**
 *
 * @author anago
 */
public class EVA2_9_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        int rep;
        String men;
        System.out.println("Mensaje a repetir");
        men=input.nextLine();
        System.out.println("Cantidad de repeticiones");
        rep=input.nextInt();
        for (int i= 1;i<=rep;i++){
            System.out.println(men);        }
        }
    }
    

