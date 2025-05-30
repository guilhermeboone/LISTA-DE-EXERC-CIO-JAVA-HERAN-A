/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.transporte;

/**
 *
 * @author guilh
 */

import java.util.Scanner;
class TransporteB {
    int capacidade;

    public void exibirInfo() {
        System.out.println("Capacidade: " + capacidade + " pessoas");
    }
}

class Aviao extends TransporteB {
    int altitudeMaxima;

    public void mostrarInformacoes() {
        super.exibirInfo();
        System.out.println("Altitude máxima = " + altitudeMaxima + " metros");
    }
}

class Navio extends TransporteB {
    int profundidadeMaxima;


    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Profundidade máxima = " + profundidadeMaxima + " metros");
    }
}

public class Transporte {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite (1) para Avião - \n(2) Para Navio: ");
        int escolha = sc.nextInt();

        if (escolha == 1) {
            Aviao aviao = new Aviao();
            System.out.print("Capacidade máxima: ");

            aviao.capacidade = sc.nextInt();
            System.out.print("Altitude máxima: ");

            aviao.altitudeMaxima = sc.nextInt();
            aviao.exibirInfo();
        }
        else if (escolha == 2) {
            Navio navio = new Navio();
            System.out.print("Capacidade mpaxima: ");
            navio.capacidade = sc.nextInt();

            System.out.print("Profundidade máxima: ");
            navio.profundidadeMaxima = sc.nextInt();

            navio.exibirInfo();
        }
        else {
            System.out.println("Opção inválida.");
        }
    }
}
