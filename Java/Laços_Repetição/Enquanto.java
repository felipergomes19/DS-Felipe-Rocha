/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class Enquanto {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner Entrada = new Scanner (System.in);
        System.out.println("Digite um numero:");
        int Numero = Entrada.nextInt();
        
        while (Numero <= 10)
        {
            System.out.println("O seu numero e:"+Numero++);
            
            
        }
        // TODO code application logic here
    }
}
