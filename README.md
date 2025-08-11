 Sistema Bancário em Java

Este projeto tem como objetivo simular as operações básicas de uma conta bancária através do console, permitindo interação com o usuário por meio de um menu de opções simples e funcional.

🛠 Etapa 1 — Funcionalidades do Sistema

    Consultar Saldo

        Exibe o saldo atual formatado com duas casas decimais.

    Depositar

        Adiciona um valor ao saldo.

        Bloqueia depósitos com valores negativos.

    Sacar

        Retira um valor do saldo, com validações:

            Saldo suficiente para a operação.

            Valor não pode ser negativo.

    Sair

        Encerra o programa exibindo mensagem de agradecimento.


📦 Etapa 2 — Estrutura do Código

    Classe Principal: Main

    Métodos implementados:

        main(String[] args) — Controla o fluxo do programa e o menu interativo.

        mostrarSaldo(double saldo) — Exibe o saldo formatado.

        depositar() — Solicita valor, valida e retorna quantia para adicionar ao saldo.

        sacar(double saldo) — Solicita valor, valida e retorna quantia para subtrair do saldo.

Para rodar o projeto, certifique-se de ter o Java instalado.

javac Main.java
java Main
