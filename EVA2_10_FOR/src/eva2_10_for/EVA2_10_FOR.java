/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_for;

import java.util.Scanner;

/**
 *
 * @author anago
 */
public class EVA2_10_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //IMPRIMIR los numeros del añ 20
        for(int i=1;i<=20;i++){
        System.out.print(i+"-");}
        //pares
        //+= suma, -=resta, *= multiplica, /= divide
        System.out.println("");
        for(int i=0;i<=100;i+=2){
            System.out.print(i+"-");}
        //anterior en orden inverso
        //imprimir la lista entre dos numeros de cualquier valor
        System.out.println("");
        for(int i=100;i>=0;i-=2){
            System.out.print(i+"-");}
        //cualquier valor
        System.out.println("");
         Scanner input= new Scanner(System.in);
        int v1,v2;
        System.out.println("Introduzca el numero menor");
        v1=input.nextInt();
        System.out.println("Introduzca el numero mayor");
        v2=input.nextInt();
        for(int i=v1;i<=v2;i++){
            System.out.print(i+"-");}
        System.out.println("");
        for(int i=v2;i>=v1;i--){
            System.out.print(i+"-");}
        //tabla de multiplacion de cualquier numero que quiera el usuario(1-10
        System.out.println("");
        int num;
        System.out.println("de que numero quiere ver la tabla?");
        num=input.nextInt();
        for(int i=1;i<=10;i++){
            System.out.print(num*i+"-");}
    }
    
}
