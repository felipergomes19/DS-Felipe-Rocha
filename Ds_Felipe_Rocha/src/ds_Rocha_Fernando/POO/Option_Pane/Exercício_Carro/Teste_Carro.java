package ds_felipe_rocha.Java.POO.Option_Pane.Exercício_Carro;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Teste_Carro {
    public static void main(String args[]) {
        try (Scanner Entrada = new Scanner(System.in)) {
     
            int Escolha = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o tipo de veiculo:\n1)Carro\n2)Moto\n3)Quadriciclo\n4)Bicicleta"));
          

            // bloco para o carro
            if (Escolha == 1) {

                int Combustivel_Restante =Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a quantidade de combustivel no veiculo:"));

                String marca = JOptionPane.showInputDialog(null,"Insira a marca do seu carro:");

                String modelo = JOptionPane.showInputDialog(null,"Insira o modelo do seu carro:");

                int ano = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o ano de fabricacao do seu carro:"));
                
                int portas = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a quantidade de portas do seu carro:"));
                
                int rodas = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a quantidade de rodas do seu carro:"));

                String cor = JOptionPane.showInputDialog(null,"Insira a cor do seu carro:");

                Carro Novo_Carro = new Carro(Combustivel_Restante, marca, modelo, ano, portas, rodas, cor);

                do {
                   
                    Escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opção\n1)Ligar\n2)Desligar\n3)Acelerar\n4)Freiar\n5)Exibir informações"));
                 

                    if (Escolha == 1) {
                        Novo_Carro.Ligar();

                    } else if (Escolha == 2) {
                        Novo_Carro.Desligar();
                    } else if (Escolha == 3) {
                        Novo_Carro.Acelerar();
                    } else if (Escolha == 4) {
                        Novo_Carro.Frear();
                    } else if (Escolha == 5) {
                        Novo_Carro.ExibirInformacaoCarro();
                    }
                } while (Escolha != 0);

            }

            // Bloco para a moto
            if (Escolha == 2) {

                int Combustivel_Restante = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a quantidade de combustivel no veículo:"));

                String marca = JOptionPane.showInputDialog(null,"Insira a marca da sua moto:");

                String modelo = JOptionPane.showInputDialog(null,"Insira o modelo da sua moto:");

                int ano = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o ano de fabricação da sua moto:"));

                String tipo = JOptionPane.showInputDialog(null,"Insira o tipo da sua moto(OFF-Road, Cidade, etc):");

 
                int rodas =Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a quantidade de rodas da sua moto:"));

                String cor = JOptionPane.showInputDialog(null,"Insira a cor da sua moto:");

                Moto Nova_Moto = new Moto(marca, modelo, ano, tipo, rodas, cor, Combustivel_Restante);

                do {
                  
                    Escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opção\n1)Ligar\n2)Desligar\n3)Acelerar\n4)Freiar\n5)Exibir informações")); 

                    if (Escolha == 1) {
                        Nova_Moto.Ligar();

                    } else if (Escolha == 2) {
                        Nova_Moto.Desligar();
                    } else if (Escolha == 3) {
                        Nova_Moto.Acelerar();
                    } else if (Escolha == 4) {
                        Nova_Moto.Frear();
                    } else if (Escolha == 5) {
                        Nova_Moto.ExibirInformacaoMoto();
                    }
                } while (Escolha != 0);
            }

            // bloco para quadriciclo
            if (Escolha == 3) {

                System.out.println("Insira a quantidade de combustivel no veiculo:");
                
                int Combustivel_Restante = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a quantidade de combustivel no veículo:"));

                String marca = JOptionPane.showInputDialog(null,"Insira a marca do seu quadriciclo:");

                String modelo =JOptionPane.showInputDialog(null,"Insira o modelo do seu quadriciclo:");

                int ano = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o ano de fabricação do seu quadriciclo:"));
                
                String tipo = JOptionPane.showInputDialog(null,"Insira o tipo do seu quadriciclo(OFF-Road, Cidade, etc):");

                int rodas = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a quantidade de rodas no quadriciclo:"));

                String cor = JOptionPane.showInputDialog(null,"Insira a cor do seu quadriciclo:");

                Quadriciclo Novo_Quadriciclo = new Quadriciclo(marca, modelo, ano, tipo, rodas, cor, Combustivel_Restante);

                do {
                     Escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opção\n1)Ligar\n2)Desligar\n3)Acelerar\n4)Freiar\n5)Exibir informações")); 

                    if (Escolha == 1) {
                        Novo_Quadriciclo.Ligar();

                    } else if (Escolha == 2) {
                        Novo_Quadriciclo.Desligar();
                    } else if (Escolha == 3) {
                        Novo_Quadriciclo.Acelerar();
                    } else if (Escolha == 4) {
                        Novo_Quadriciclo.Frear();
                    } else if (Escolha == 5) {
                        Novo_Quadriciclo.ExibirInformacaoQuadriciclo();
                    }
                } while (Escolha != 0);

            }

            // bloco para bicicleta
            if (Escolha == 4) {

                int Combustivel_Restante = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a quantidade de combustivel no veículo:"));

                String marca =JOptionPane.showInputDialog(null,"Insira a marca da sua bicicleta:");

                String modelo = JOptionPane.showInputDialog(null,"Insira o modelo da sua bicicleta:");

                int ano = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o ano de fabricação do seu ano:"));
                
                String tipo = JOptionPane.showInputDialog(null,"Insira o tipo da sua bicicleta(OFF-Road,Cidade,etc):"); 

                int rodas = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a quantidade de rodas da sua bicicleta:"));

                String Tipo_Guidao = JOptionPane.showInputDialog(null,"Insira o tipo de guidão da sua bicicleta:");

                String cor = JOptionPane.showInputDialog(null,"Insira a cor da sua bicicleta:");

                Bicicleta Nova_Bicicleta = new Bicicleta(marca, modelo, ano, tipo, rodas, Tipo_Guidao, cor, Combustivel_Restante);

                do {
                    Escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opção\n1)Ligar\n2)Desligar\n3)Acelerar\n4)Freiar\n5)Exibir informações"));

                    if (Escolha == 1) {
                        Nova_Bicicleta.Ligar();

                    } else if (Escolha == 2) {
                        Nova_Bicicleta.Desligar();
                    } else if (Escolha == 3) {
                        Nova_Bicicleta.Acelerar();
                    } else if (Escolha == 4) {
                        Nova_Bicicleta.Frear();
                    } else if (Escolha == 5) {
                        Nova_Bicicleta.ExibirInformacaoBicicleta();
                    }
                } while (Escolha != 0);

            }

        }
    }
}
