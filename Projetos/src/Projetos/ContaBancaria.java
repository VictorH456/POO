package Projetos;

import java.util.Scanner;

public class ContaBancaria {
    //Variaveis globais
    static Scanner input = new Scanner(System.in);
    static Scanner input_int = new Scanner(System.in);
    static String nome = "Victor Hugo";
    static String conta = "Corrente";
    static double saldo = 2500;
    static Boolean laco = true;
    public static void ConsultarSaldo(){
        System.out.printf("Seu saldo atualmente é de: R$ %.2f\n\n",saldo);
    }

    public static void DepositarValor(){
        System.out.print("Informe o valor a receber: ");
        double valor = input_int.nextDouble();
        saldo += valor;
        System.out.printf("Valor atualizado R$ %.2f\n\n",saldo);
    }

    public static void TransferirSaldo(){
        System.out.print("Informe o valor a Transferir: ");
        double valor = input_int.nextDouble();

        if (valor > saldo){
            System.out.println("Não há saldo suficiente.\n\n");
        }
        else {
            saldo -= valor;
            System.out.printf("Valor atualizado R$ %.2f\n\n",saldo);
        }

    }
    public static void MostrarDados() {
        System.out.printf("""
                    **************************************
                    Dados iniciais do cliente:
                    Nome:               %s
                    Tipo conta:         %s
                    Saldo incial:       R$ %.2f
                    **************************************
                    """, nome, conta, saldo);
    }
    public static boolean Sair(){
        return false;
    }

    public static void main(String[] args) {

        MostrarDados();

        while (laco) {

            System.out.print("""
                    Operações
                    
                    1- Consultar saldo
                    2- Receber valor
                    3- Transferir valor
                    4- Mostrar dados
                    5- Sair
                    
                    Digite a opção desejada:
                    """);
            String opcao = input.nextLine();

            switch (opcao) {
                case "1" -> ConsultarSaldo();
                case "2" -> DepositarValor();
                case "3" -> TransferirSaldo();
                case "5" -> laco = Sair();
                case "4" -> MostrarDados();
                default -> System.out.println("Digitou uma opção errada, tente novamente.");
            }
        }
    }
}

