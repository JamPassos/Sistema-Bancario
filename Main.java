import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double saldo = 0;
        boolean executando = true;
        int opcao;

        while (executando) {
            System.out.println("*****************");
            System.out.println("PROGRAMA BANCÁRIO");
            System.out.println("*****************");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Sair");
            System.out.println("*****************");

            System.out.print("Digite uma opção (1-4): ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> mostrarSaldo(saldo);
                case 2 -> saldo += depositar();
                case 3 -> saldo -= sacar(saldo);
                case 4 -> {
                    System.out.println("Encerrando o programa... Obrigado por utilizar nossos serviços!");
                    executando = false;
                }
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        }
        scanner.close();
    }

    static void mostrarSaldo(double saldo) {

        System.out.println("*****************");
        System.out.printf("Seu saldo atual é: R$ %.2f\n", saldo);
    }

    static double depositar() {

        double valor;

        System.out.print("Digite o valor para depósito: R$ ");
        valor = scanner.nextDouble();

        if (valor < 0) {
            System.out.println("O valor não pode ser negativo.");
            return 0;
        } else {
            System.out.println("Depósito realizado com sucesso!");
            return valor;
        }
    }

    static double sacar(double saldo) {
        double valor;

        System.out.print("Digite o valor para saque: R$ ");
        valor = scanner.nextDouble();

        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
            return 0;
        } else if (valor < 0) {
            System.out.println("O valor não pode ser negativo.");
            return 0;
        } else {
            System.out.println("Saque realizado com sucesso!");
            return valor;
        }
    }
}
