/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author felip
 */
import java.util.Scanner;
public class Exercício_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Insira os numeros:");
        
        int[] Numeros = new int[10];
        for(int i = 0; i < Numeros.length; i++)
        {
            Numeros[i] = Entrada.nextInt();
        }
        
        System.out.println("-----------------------------");
        
        for(int i = 0; i < Numeros.length; i++)
        {
            if(Numeros[i] < 0)
            {
                Numeros[i] = 0;
                System.out.println(Numeros[i]);
            }
            else{
            System.out.println(Numeros[i]);
            }
        }
    }
}
