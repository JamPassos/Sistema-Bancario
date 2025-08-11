Sistema Bancário

Descrição do Projeto

Este projeto é um sistema bancário simples, desenvolvido como parte dos requisitos de um trabalho acadêmico, utilizando Java. O programa simula as operações essenciais de uma conta bancária, permitindo ao usuário interagir com o sistema através de um menu de opções, tudo executado diretamente no console.

Funcionalidades

O sistema oferece as seguintes funcionalidades principais, conforme implementado no código:

    Consultar Saldo: Permite ao usuário visualizar o saldo atual de sua conta, formatado com duas casas decimais.

    Depositar: Habilita o depósito de um valor na conta. O programa verifica se o valor a ser depositado é negativo, rejeitando a operação caso seja.

    Sacar: Permite a retirada de um valor da conta. Esta operação inclui duas validações importantes:

        Verifica se o saldo é suficiente para cobrir o valor do saque.

        Verifica se o valor do saque não é negativo.

    Sair: Encerra a execução do programa, exibindo uma mensagem de agradecimento.

Como Executar:

Para rodar o projeto, basta compilar e executar o arquivo Main.java em um ambiente Java.
Bash

javac Main.java
java Main

Estrutura do Código

O código está organizado em uma única classe Main com os seguintes métodos:

    main(String[] args): O ponto de entrada do programa, que controla o fluxo principal através de um while loop e um switch para o menu de opções.

    mostrarSaldo(double saldo): Exibe o saldo atual do usuário de forma formatada.

    depositar(): Solicita um valor para depósito, realiza a validação de valor negativo e retorna o valor a ser adicionado ao saldo.

    sacar(double saldo): Solicita um valor para saque, realiza as validações de saldo insuficiente e valor negativo, e retorna o valor a ser subtraído do saldo.
