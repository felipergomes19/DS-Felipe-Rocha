/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercícios_Java;

/**
 *
 * @author CAMARGO
 */
public class ex6 {
    public static void main(String[] args) {
        
  float Consumo_Medio = 3.1f;      
  float Preço_Combustivel = 4.2f;
  float Distancia_Percorrida = 100.0f;
  float Combustivel_Necessario = Distancia_Percorrida*Consumo_Medio;
  float Gasto_Final = Combustivel_Necessario*Preço_Combustivel;
  System.out.println("O custo estimado nessa viagem de carro será de R$"+Gasto_Final);
    }
    
}
