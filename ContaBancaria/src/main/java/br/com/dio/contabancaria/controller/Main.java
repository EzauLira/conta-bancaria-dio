package br.com.dio.contabancaria.controller;


import br.com.dio.contabancaria.config.TempoDoCadastro;
import br.com.dio.contabancaria.model.ContaTerminal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ContaTerminal contaTerminal = new ContaTerminal();

        boolean continuar = true;

        do {

            try {
                System.out.println("  ==  Bem-vindo ao Aman Bank!  ==  ");

                System.out.println("Por favor digite seu nome: ");
                String nome = input.nextLine();
                contaTerminal.setNomeCliente(nome);

                System.out.println("Digite sua data de nascimento: ");
                String nascimento = input.nextLine();
                contaTerminal.setNascimento(nascimento);

                System.out.println("Digite seu documento: ");
                long documento = input.nextLong();
                contaTerminal.setDocumento(documento);
                input.nextLine();

                System.out.println("Digite uma senha: ");
                String senha = input.nextLine();
                contaTerminal.setSenha(senha);

                System.out.println("Aguarde cadastrando conta");

                TempoDoCadastro.tempo();

                System.out.println(".");

                TempoDoCadastro.tempo();

                System.out.println(".");

                TempoDoCadastro.tempo();

                System.out.println(".");

                TempoDoCadastro.tempo();

                System.out.println("Conta Cadastrada com sucesso!");

                System.out.println("Olá " + contaTerminal.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é: "
                        + contaTerminal.getAgencia() + ", conta: "
                        + contaTerminal.getConta() + " e seu saldo: "
                        + contaTerminal.getSaldo() + " já está disponível para saque ou depósito!");

                continuar = false;

            } catch (Exception e) {

                System.out.println("Erro! Colocou um caractere ao invés de um número.");

            }
        }while (continuar);
    }
}