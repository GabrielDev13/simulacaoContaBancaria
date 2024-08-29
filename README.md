# Simulação de Conta Bancária

Este repositório contém uma simulação básica de uma conta bancária, desenvolvida como parte do desafio da trilha de Java Básico da [Digital Innovation One](https://www.dio.me). O projeto foi implementado em Java e permite que os usuários criem uma conta bancária, depositem e saquem dinheiro, além de consultar o saldo.

## Funcionalidades

- **Criação de Conta Bancária:** Permite que o usuário insira informações como nome do cliente, número da agência e número da conta.
- **Depósito de Dinheiro:** O usuário pode adicionar um valor ao saldo da conta.
- **Saque de Dinheiro:** O usuário pode sacar um valor do saldo da conta, desde que haja saldo suficiente.
- **Consulta de Saldo:** Após cada operação, o saldo atualizado é exibido para o usuário.

## Estrutura do Projeto

O projeto é composto por dois arquivos principais:

1. **`ContaTerminal.java`**
   - Define a classe `ContaTerminal`, que representa uma conta bancária. Essa classe contém métodos para sacar e depositar dinheiro, além de armazenar as informações da conta e do cliente.

2. **`ContaBanco.java`**
   - Contém o método `main`, que interage com o usuário para coletar as informações necessárias e realizar as operações de depósito e saque. Este arquivo utiliza a classe `ContaTerminal` para manipular os dados da conta.

## Exemplo de Uso

Ao executar o programa, o usuário será solicitado a fornecer seu nome, número da agência, número da conta e valores para depósito e saque. Após cada operação, o saldo atualizado é exibido.

```java
Digite seu nome:
Gabriel Lima
Digite sua Agência:
067-8
Digite sua Conta:
1021
Qual saldo você quer adicionar?
500.00
Depósito realizado com sucesso.
Seu saldo é: R$737.48
Qual valor você quer sacar?
200.00
Saque realizado com sucesso.
Seu saldo é: R$537.48
