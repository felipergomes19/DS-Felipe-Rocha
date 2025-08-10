/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Atividades_Volta;

/**
 *
 * @author felip
 */
import java.math.RoundingMode;
import java.util.Scanner;
import java.util.Arrays;
import java.text.DecimalFormat;
public class Atividade_Patinete {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        try(Scanner Entrada= new Scanner(System.in)){
            double Soma = 0;
            double[] Notas1 = new double[4];
            double[] Notas2 = new double[4];
            double[] Notas_Organizadas = new double[8];
            double Media;
            String[] Notas_Arrendondadas = new String[8];
            
            //Bloco para a inserção do primeiro grupo de notas
            for(int i = 0; i < Notas1.length; i++){
                System.out.println("Insira as notas do primeiro avaliador:");
                Notas1[i] = Entrada.nextDouble();
            }
            
            //Bloco para a inserção do segundo grupo de notas
            for(int i = 0; i < Notas2.length; i++){
                System.out.println("Agora, insira as notas do segundo avaliador:");
                Notas2[i] = Entrada.nextDouble();
            }
            
            //Bloco para a organização das notas em ordem crescente
            for(int i = 0; i < Notas_Organizadas.length; i++){
                if(i <4){
                    Notas_Organizadas[i] = Notas1[i];
                }
                else{
                    Notas_Organizadas[i] = Notas2[i-4];
                }
            }
            Arrays.sort(Notas_Organizadas);
            
            //Bloco para a soma total das notas
            for(int i = 0; i < Notas_Organizadas.length; i++){
                Soma += Notas_Organizadas[i];
            }
            
            Media = Soma/Notas_Organizadas.length;
            String Nova_Media = Arredondar(Media);
                        
            //bloco para a saída das notas junto com a média
            for(int i = 0; i < 8; i++){
               System.out.print(Notas_Organizadas[i] + " ");
            }
            System.out.println("- " + Nova_Media);
        }
         
    }
public static String Arredondar(double Media){
    DecimalFormat df= new DecimalFormat("0.");
    df.setRoundingMode(RoundingMode.HALF_DOWN);
    return df.format(Media);
}
    
}

