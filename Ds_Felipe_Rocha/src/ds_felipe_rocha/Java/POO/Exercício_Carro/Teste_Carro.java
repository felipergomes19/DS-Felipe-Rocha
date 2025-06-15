package ds_Rocha_Fernando.POO;
import java.util.Scanner;

public class Teste_Carro {
    public static void main(String args[]) {
        try (Scanner Entrada = new Scanner(System.in)) {
            System.out.println("Insira o tipo de veiculo:\n1)Carro\n2)Moto\n3)Quadriciclo\n4)Bicicleta");
            int Escolha = Entrada.nextInt();
            Entrada.nextLine(); 

            // bloco para o carro
            if (Escolha == 1) {

                System.out.println("Insira a quantidade de combustivel no veiculo:");
                int Combustivel_Restante = Entrada.nextInt();
                Entrada.nextLine(); 

                System.out.println("Insira a marca do seu carro:");
                String marca = Entrada.nextLine();

                System.out.println("Insira o modelo do seu carro:");
                String modelo = Entrada.nextLine();

                System.out.println("Insira o ano de fabricação do seu carro:");
                int ano = Entrada.nextInt();
                Entrada.nextLine(); 

                System.out.println("Insira a quantidade de portas do seu carro:");
                int portas = Entrada.nextInt();
                Entrada.nextLine(); 

                System.out.println("Insira a quantidade de rodas do seu carro:");
                int rodas = Entrada.nextInt();
                Entrada.nextLine(); 

                System.out.println("Insira a cor do seu carro:");
                String cor = Entrada.nextLine();

                Carro Novo_Carro = new Carro(Combustivel_Restante, marca, modelo, ano, portas, rodas, cor);

                do {
                    System.out.println("------------Escolha uma opção------------------");
                    System.out.println("1)Ligar\n2)Desligar\n3)Acelerar\n4)Freiar\n5)Exibir informações");
                    Escolha = Entrada.nextInt();
                    Entrada.nextLine(); 

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

                System.out.println("Insira a quantidade de combustivel no veiculo:");
                int Combustivel_Restante = Entrada.nextInt();
                Entrada.nextLine(); 

                System.out.println("Insira a marca da sua moto:");
                String marca = Entrada.nextLine();

                System.out.println("Insira o modelo da sua moto:");
                String modelo = Entrada.nextLine();

                System.out.println("Insira o ano de fabricação da sua moto:");
                int ano = Entrada.nextInt();
                Entrada.nextLine();

                System.out.println("Insira o tipo da sua moto (Off-Road, Cidade,etc):");
                String tipo = Entrada.nextLine();

                System.out.println("Insira a quantidade de rodas da sua moto:");
                int rodas = Entrada.nextInt();
                Entrada.nextLine();

                System.out.println("Insira a cor do seu carro:");
                String cor = Entrada.nextLine();

                Moto Nova_Moto = new Moto(marca, modelo, ano, tipo, rodas, cor, Combustivel_Restante);

                do {
                    System.out.println("------------Escolha uma opção------------------");
                    System.out.println("1)Ligar\n2)Desligar\n3)Acelerar\n4)Freiar\n5)Exibir informações");
                    Escolha = Entrada.nextInt();
                    Entrada.nextLine(); 

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
                int Combustivel_Restante = Entrada.nextInt();
                Entrada.nextLine(); 

                System.out.println("Insira a marca da sua quadriciclo:");
                String marca = Entrada.nextLine();

                System.out.println("Insira o modelo da sua quadriciclo:");
                String modelo = Entrada.nextLine();

                System.out.println("Insira o ano de fabricação do seu quadriciclo:");
                int ano = Entrada.nextInt();
                Entrada.nextLine();

                System.out.println("Insira o tipo do seu quadriciclo (Off-Road, Cidade,etc):");
                String tipo = Entrada.nextLine();

                System.out.println("Insira a quantidade de rodas do seu quadriciclo:");
                int rodas = Entrada.nextInt();
                Entrada.nextLine(); // 

                System.out.println("Insira a cor do seu quadriciclo:");
                String cor = Entrada.nextLine();

                Quadriciclo Novo_Quadriciclo = new Quadriciclo(marca, modelo, ano, tipo, rodas, cor, Combustivel_Restante);

                do {
                    System.out.println("------------Escolha uma opção------------------");
                    System.out.println("1)Ligar\n2)Desligar\n3)Acelerar\n4)Freiar\n5)Exibir informações");
                    Escolha = Entrada.nextInt();
                    Entrada.nextLine(); 

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

                System.out.println("Insira a quantidade de combustivel no veiculo:");
                int Combustivel_Restante = Entrada.nextInt();
                Entrada.nextLine(); 

                System.out.println("Insira a marca da sua bicicleta:");
                String marca = Entrada.nextLine();

                System.out.println("Insira o modelo da sua bicicleta:");
                String modelo = Entrada.nextLine();

                System.out.println("Insira o ano de fabricação da sua bicicleta:");
                int ano = Entrada.nextInt();
                Entrada.nextLine();

                System.out.println("Insira o tipo da sua bicicleta (Off-Road, Cidade,etc):");
                String tipo = Entrada.nextLine();

                System.out.println("Insira a quantidade de rodas da sua bicicleta:");
                int rodas = Entrada.nextInt();
                Entrada.nextLine(); 

                System.out.println("Insira o tipo de guidao da sua bicicleta:");
                String Tipo_Guidao = Entrada.nextLine();

                System.out.println("Insira a cor da sua bicicleta:");
                String cor = Entrada.nextLine();

                Bicicleta Nova_Bicicleta = new Bicicleta(marca, modelo, ano, tipo, rodas, Tipo_Guidao, cor, Combustivel_Restante);

                do {
                    System.out.println("------------Escolha uma opção------------------");
                    System.out.println("1)Ligar\n2)Desligar\n3)Acelerar\n4)Freiar\n5)Exibir informações");
                    Escolha = Entrada.nextInt();
                    Entrada.nextLine();

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
