/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author felip
 */
public class Exercício_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        float Populaçao_B = 200000;
        int i = 0;
        for(float Populaçao_A = 80000; Populaçao_A <=Populaçao_B; i++)
        {
            Populaçao_A = Populaçao_A*1.03f;
            Populaçao_B = Populaçao_B*1.015f;
        }
        System.out.print("A populaçao da cidade A se igualara a da cidade B em "+i+" anos");
    }
}
