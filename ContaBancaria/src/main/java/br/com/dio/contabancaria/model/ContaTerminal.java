package br.com.dio.contabancaria.model;

import java.util.Random;

public class ContaTerminal {

    Random numeros = new Random();

    private int conta, agencia;
    private String nomeCliente, nascimento, senha;
    private double saldo = 0;
    private long documento;


    public String getNomeCliente() {
        this.nomeCliente = nomeCliente;
        return nomeCliente;
    }

    public String setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
        return nomeCliente;
    }

    public String getNascimento() {
        this.nascimento = nascimento;
        return nascimento;
    }

    public String setNascimento(String nascimento) {
        this.nascimento = nascimento;
        return nascimento;
    }

    public String getSenha() {
        this.senha = senha;
        return senha;
    }

    public String setSenha(String senha) {
        this.senha = senha;
        return senha;
    }

    public int getConta() {
        this.conta = 10000 + numeros.nextInt(90000);
        return conta;
    }

    public int getAgencia() {
        this.agencia = 1000 + numeros.nextInt(9000);
        return agencia;
    }

    public double getSaldo() {
        this.saldo = saldo;
        return saldo;
    }

    public long getDocumento() {
        this.documento = documento;
        return documento;
    }

    public long setDocumento(long documento) {
        this.documento = documento;
        return documento;
    }

}
