/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ds_felipe_rocha.POO;

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
    
    public void ExibirInformacao(){
            
            // Chama o método da superclasse
            super.ExibirInformacao();
            System.out.println("tipo de bicicleta = "+tipo);
            System.out.println("Numero de rodas = "+rodas);
            System.out.println("tipo de guidao = "+Tipo_Guidao);
            
        } 
}