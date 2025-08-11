class Bicicleta extends Veiculo{
    
    //Atributos específicos da subclasse
    public int rodas;
    public String tipo;
    public String Tipo_Guidao;

    public Bicicleta(String marca,String modelo, int ano, int rodas, String Tipo_Guidao,String tipo){
        super(marca,modelo,ano);

}
    

    public int getRodas() {
        return rodas;
    };

    public void setRodas(int rodas) {
        this.rodas = rodas;
    };

    
    public String getTipo() {
        return tipo;
    };

    public void setTipo(String tipo) {
        this.tipo = tipo;
    };
    
    public void ExibirInformacao(){
            
            // Chama o método da superclasse
            super.ExibirInformacao();
            System.out.println("Numero de portas = "+tipo);
            System.out.println("Numero de rodas = "+rodas);
            
        } 
}