/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_for;

import java.util.Scanner;

/**
 *
 * @author anago
 */
public class EVA2_11_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        int v1,v2,res;
        System.out.println("Introduzca el numero menor");
        v1=input.nextInt();
        System.out.println("Introduzca el numero mayor");
        v2=input.nextInt();
        for(int i=v1;i<=v2;i++){
            res=i%2;//saber si es par
            if(res==0)//es par
            System.out.print(i+"-");}
    }
    
}
