/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Conecta_Banco;

/**
 *
 * @author CAMARGO
 */

public class Conecta_Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Conexao.Conectabanco();
        Inserir_Dados.InserirAlunos("teste","teste");
        Consulta.Consultar_Dados();
        
    }
}
