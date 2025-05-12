
    // Superclasee
class Veiculo{
        // Atributos privados (encapsulados)
    private String marca;
    private String modelo;
    private int ano; 
    
        // Construtor da classe Veiculo
    public Veiculo(String marca,String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
}
     // Métodos Setters
     public String setMarca(){
        this.marca = marca;
     }

     Public String setModelo(){
        this.modelo = modelo;
     }

     public int setAno(){
        this.ano = ano;
     }

     // Métodos getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }
        // Metodo para exibir as informações basicas
    public void ExibirInformacao(){
    System.out.println("Marca = "+marca);
    System.out.println("Modelo = "+modelo);
    System.out.println("Ano = "+ano);
}
}