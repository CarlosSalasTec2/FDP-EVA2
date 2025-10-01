/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_switch;

import java.util.Scanner;

/**
 *
 * @author anago
 */
public class EVA2_2_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opc;
                Scanner input = new Scanner(System.in);
        System.out.println("1=Consultar saldo");
        System.out.println("2=Retirar dinero");
        System.out.println("3=Depositar dinero");
        System.out.println("Seleccione una opcion");
        opc=input.nextInt();
        switch(opc){
            case 1:
                System.out.println("Elegiste imprimir saldo");
                break;//rompe o detiene la instruccion
            case 2:
                System.out.println("Elegiste retirar saldo");
                break;
            case 3:
                System.out.println("Elegiste depositar dinero");
                break;
            default://opcional
                System.out.println("Opción no valida bro");
        }
    }
    
}
