/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author felip
 */
import java.util.Scanner;
public class Exercício_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int i = 0;
        while(i <=100)
       {
        i+=1;
        
        if(i%2 == 0)
        {
            System.out.println("Numeros pares:"+i);
        }
        
        }
        
        i = 0;
        System.out.println("\n-----------------\n");
       while (i <=100)
       {
           
           i+=1;
           if(i%2!=0)
           {
               System.out.println("Numero impares:"+i);
           }
       }
}
}
