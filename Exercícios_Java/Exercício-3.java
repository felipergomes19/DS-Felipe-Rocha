/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercícios_Java;

/**
 *
 * @author CAMARGO
 */
public class ex3 {
    public static void main(String[] args) {
        
        
        String NomeVendedor = "Zezinho";
        int salario = 1600;
        int vendas = 4500;
        float comissao;
        float salariototal;
        float Porc = 0.15f;
        comissao = vendas * Porc;
        salariototal= comissao + salario;
        
        System.out.println("Salario total é "+salariototal);
       
        
    }
}
