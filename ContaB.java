/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contab;

/**
 *
 * @author guilh
 */
import java.util.Scanner;

class Conta {

    int numero;
    double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }
}

class ContaCorrente extends Conta {

    double taxa;

    public void sacar(double valor) {
        double valorComTaxa = valor + taxa;
        if (valorComTaxa <= saldo) {
            saldo -= valorComTaxa;
        } else {
            System.out.println("Saldo insuficiente para saque com taxa.");
        }
    }
}

class ContaPoupanca extends Conta {

    double rendimentoMensal;

    public void aplicarRendimento() {
        saldo += saldo * rendimentoMensal / 100;
    }
}

public class ContaB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ContaCorrente corrente = new ContaCorrente();
        ContaPoupanca poupanca = new ContaPoupanca();

        System.out.println("~~~~~ Cadastro da Conta Corrente ~~~~~");
        System.out.print("Informe o número da conta: ");
        corrente.numero = sc.nextInt();
        
        
        System.out.print("Informe a taxa (R$): ");
        corrente.taxa = sc.nextDouble();
        
        
        System.out.print("Informe o depósito: ");
        corrente.depositar(sc.nextDouble());

        System.out.println("\n~~~~~ Cadastro da Conta Poupança ~~~~~:");
        System.out.print("Informe o número da conta: ");
        poupanca.numero = sc.nextInt();
        
        System.out.print("Informe a porcentagem do rendimento mensal (%): ");
        poupanca.rendimentoMensal = sc.nextDouble();
        
        System.out.print("Depósito: ");
        poupanca.depositar(sc.nextDouble());

        System.out.println("\n~~~~~ Operações ~~~~~");
        System.out.print("Saque da conta corrente (R$): ");
        corrente.sacar(sc.nextDouble());
        corrente.mostrarSaldo();

        System.out.print("Aplicar rendimento na conta poupança? (s/n): ");
        
        sc.nextLine();
        
        if (sc.nextLine().equalsIgnoreCase("s")) {
            poupanca.aplicarRendimento();
        }
        poupanca.mostrarSaldo();
    }
}
