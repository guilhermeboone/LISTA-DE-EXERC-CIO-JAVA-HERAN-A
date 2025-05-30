/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ingressob;

/**
 *
 * @author guilh
 */
import java.util.Scanner;

class Ingresso {
    double valor;

    public void exibirValor() {
        System.out.println("Valor do ingresso: R$ " + valor);
    }
}
class IngressoVIP extends Ingresso {
    double acrescimo;

    public void exibirValor() {
        System.out.println("Ingresso VIP: R$ " + (valor + acrescimo));
    }
}

class IngressoNormal extends Ingresso {
    
    public void exibirValor() {
        System.out.println("Ingresso Normal: R$ " + valor);
    }
}
public class IngressoB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite 1 para Ingresso Normal ou 2 para VIP: ");
        int tipo = sc.nextInt();

        if (tipo == 1) {
            IngressoNormal normal = new IngressoNormal();
            System.out.print("Valor do ingresso: ");
            normal.valor = sc.nextDouble();
            
            normal.exibirValor();
        }
        else if (tipo == 2) {
            IngressoVIP vip = new IngressoVIP();
            System.out.print("Valor base: ");
            vip.valor = sc.nextDouble();
            
            System.out.print("Acréscimo VIP: ");
            vip.acrescimo = sc.nextDouble();
            
            vip.exibirValor();
        }
        else {
            System.out.println("Tipo inválido.");
        }
    }
}
