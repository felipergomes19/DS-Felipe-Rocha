/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ds_Rocha_Fernando.POO;

/**
 *
 * @author CAMARGO
 */

    // Subclasse que herda da superclasse (Veiculo)
class Carro extends Veiculo{
    
        // Atributos privados específicos da subclasse
    public int portas;
    public int rodas;
    
    
        // Construtor da classe Carro
    public Carro(int ano, String marca, String modelo, int portas, int rodas, int Combustivel_Restante, String cor){
        
        // Usando o super para chamar o construtor da superclasse
        super(marca, modelo, ano,cor,Combustivel_Restante);
        this.portas = portas;
        this.rodas = rodas;

       
       
    }
    // Getters e Setters
    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas= portas;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int Rodas) {
        this.rodas = rodas;
    }

    
             // Sobrescrevendo o método da superclasse para adicionar mais informações
 
        public void ExibirInformacaoCarro(){
            
            // Chama o método da superclasse
            super.ExibirInformacao();
            System.out.println("Numero de portas = "+portas);
            System.out.println("Numero de rodas = "+rodas);
           
        } 

      
}