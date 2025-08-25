/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ds_felipe_rocha.Java.POO.Option_Pane.Exercício_Carro;

import javax.swing.JOptionPane;

 class Moto extends Veiculo{
    
    //Atributos específicos da subclasse
    public int rodas;
    public String tipo;


    public Moto(String marca, String modelo, int ano, String cor, int rodas, String tipo,int Combustivel_Restante){
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
    
    public void ExibirInformacaoMoto(){
            
            // Chama o método da superclasse
            
           super.ExibirInformacao();
            JOptionPane.showMessageDialog(null,"Tipo da moto = " + tipo+"\nNumero de rodas = "+rodas);
            
        } 
}
