/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author felip
 */
public class Exercício_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int Primeiro_Termo = 0;
        int Segundo_Termo = 1;
        System.out.println("Sequência de Fibonacci ate ser maior que 500:");
        for(; Primeiro_Termo <= 500;)
        {
            System.out.println(Primeiro_Termo+" ");
            int Proximo_Termo = Primeiro_Termo + Segundo_Termo;
            Primeiro_Termo = Segundo_Termo;
            Segundo_Termo = Proximo_Termo;
            if( Proximo_Termo > 500)
            {
                break;
            }
        }
    }
}
