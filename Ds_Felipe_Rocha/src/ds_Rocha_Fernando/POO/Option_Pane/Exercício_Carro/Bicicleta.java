/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ds_felipe_rocha.Java.POO.Option_Pane.Exercício_Carro;

import javax.swing.JOptionPane;

class Bicicleta extends Veiculo{
    
    //Atributos específicos da subclasse
    public int rodas;
    public String tipo;
    public String Tipo_Guidao;

    public Bicicleta(String marca, String modelo, int ano, String Tipo_Guidao, int rodas, String tipo,String cor, int Combustivel_Restante){
        super(marca,modelo,ano,cor,Combustivel_Restante);

}
    

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    };

    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    };
    public String getTipo_Guidao() {
        return Tipo_Guidao;
    }
    public void setTipo_Guidao(String Tipo_Guidao){
        this.Tipo_Guidao = Tipo_Guidao;
    };
    
    public void ExibirInformacaoBicicleta(){
            
            // Chama o método da superclasse
            super.ExibirInformacao();
            JOptionPane.showMessageDialog(null,"Tipo de bicicleta = "+tipo+"\nNumero de rodas = "+rodas+"\nTipo de guidao = "+Tipo_Guidao);
            
            
        } 
}