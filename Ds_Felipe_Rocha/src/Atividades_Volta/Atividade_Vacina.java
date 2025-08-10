/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Atividades_Volta;

/**
 *
 * @author felip
 */
import java.util.Scanner;
public class Atividade_Vacina {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        try(Scanner Entrada = new Scanner(System.in)){
            System.out.println("Informe o tamanho do arranjo de genes:");
            int Quantidade_Genes = Entrada.nextInt();
            int[] Arranjo_Genes = new int[Quantidade_Genes];
            
            System.out.println("Agora, insira os genes:");
            for(int i = 0; i < Arranjo_Genes.length; i++){
                Arranjo_Genes[i] = Entrada.nextInt();
            }
            
            System.out.println("Informe qual gene deve ser procurado:");
            int Alvo = Entrada.nextInt();
            
            
            int Contador = 0;
            
            for(int i = 0; i < Arranjo_Genes.length; i++){
                if(Arranjo_Genes[i] == Alvo){
                    Contador++;
                }
            }
            
            if(Contador > 1){
                System.out.println("Achei o danado");
            }
            else if(Contador == 1){
                System.out.println("Ainda nao e o suficiente");
            }
            
            else{
                System.out.println("Sumiuu!");
            }
        }
    }
}
