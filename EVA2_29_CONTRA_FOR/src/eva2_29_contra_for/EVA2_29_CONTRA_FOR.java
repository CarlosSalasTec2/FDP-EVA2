/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_29_contra_for;

import java.util.Scanner;

/**
 *
 * @author anago
 */
public class EVA2_29_CONTRA_FOR {
final static String USUARIO="usuario";
    final static String PWD="1234";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String usu,con;
        boolean acceso = false;
        for (int i = 0; i < 4; i++) {
            System.out.println("Introduca el usuario");
            usu=input.next();
            System.out.println("Introduca la clave");
            con=input.next();
            if(usu.equals(USUARIO)&&con.equals(PWD)){
                acceso = true;
                break;
            }
        }if(acceso)System.out.println("ACCESO CONCEDIDO");
        else System.out.println("ACCESO DENEGADO");
    }
    
}
