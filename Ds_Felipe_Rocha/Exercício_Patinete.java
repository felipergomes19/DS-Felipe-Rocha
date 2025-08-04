/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
import java.util.Arrays;
import java.math.RoundingMode;
public class Exercício_Patinete {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        try ( Scanner Entrada = new Scanner(System.in)){
            double[] Notas = new double[4];
            double[] Notas2 = new double[4];
            double[] Notas_Organizadas = new double[8];
            double Soma = 0;
            
            for(int i = 0; i < 4; i++){
                System.out.println("Insira suas notas:");
                Notas[i] = Entrada.nextDouble();
            }

            for(int i = 0; i < 4; i++){
                   System.out.println("Insira suas notas:");
                   Notas2[i] = Entrada.nextDouble();
            }

            for (int i = 0; i < 4; i++){
                Soma =+ Notas[i] + Notas2[i];
            }

            for(int i = 0; i < 8; i++){
            if(i < 4){
                Notas_Organizadas[i] = Notas[i];
            }
            else{
                Notas_Organizadas[i] = Notas2[i];
            }
}
            Arrays.sort(Notas_Organizadas);
            double Media = Soma/8;
            
        }
    }
}

public static String Arrendondar_Media(double Media){
    DecimalFormat DF = new DecimalFormat("0.");
    DF.setRoundingMode(RoundingMode.DOWN);
    return DF.format(Media);

}


public static String Arrendondar_Valores(double Notas_Organizadas[]){
    DecimalFormat DF = new DecimalFormat("0.");
    DF.setRoundingMode(RoundingMode.DOWN);
    
    for(int i = 0;i < Notas_Organizadas.length;i++){
    result.append(DF.format(Notas_Organizadas[i])).append(" ");
}
    return DF.format(Notas_Organizadas[]);

}

