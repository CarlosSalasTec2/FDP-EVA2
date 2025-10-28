/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_do_while;

import java.util.Scanner;

/**
 *
 * @author anago
 */
public class EVA2_19_DO_WHILE {
final static String USUARIO = "admin";
final static String PWD = "admin";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String usu, contra;
        do{System.out.println("Usuario:");
        usu = input.nextLine();
        System.out.println("Contraseña:");
        contra = input.nextLine();
        }while(!(usu.equals(USUARIO)&&contra.equals(PWD)));
        System.out.println("ACCESO CONCEDIDO,BIENVENIDO AL SISTEMA");
        /*if(usu.equals(USUARIO)&&contra.equals(PWD))
        System.out.println("ACCESO CONCEDIDO,BIENVENIDO AL SISTEMA");
        else System.out.println("ACCESO DENEGADO");*/
    }
    
}
