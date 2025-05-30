/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.formab;

/**
 *
 * @author guilh
 */
import java.util.Scanner;

class Forma {
    public double calcularArea() {
        return 0;
    }
}

class Retangulo extends Forma {
    double base;
    double altura;

    public double calcularArea() {
        return base * altura;
    }
}

class Circulo extends Forma {
    double raio;

    public double calcularArea() {
        return 3.14 * raio * raio;
    }
}

public class FormaB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("~~~~~Menu Calcular Área ~~~~~");
        
        System.out.print("Digite (1) para Retângulo - \n(2) para Círculo: ");
        int escolha = sc.nextInt();

        if (escolha == 1) {
            Retangulo retangulo = new Retangulo();
            System.out.print("Informe a base: ");
            retangulo.base = sc.nextDouble();
            
            System.out.print("Informe a altura: ");
            retangulo.altura = sc.nextDouble();
            
            System.out.println("Área do Retângulo: " + retangulo.calcularArea());
        }
        else if (escolha == 2) {
            Circulo circulo = new Circulo();
            System.out.print("Informe o raio: ");
            circulo.raio = sc.nextDouble();
            
            System.out.println("Área do Círculo: " + circulo.calcularArea());
        }
        else {
            System.out.println("Opção inválida.");
        }
    }
}
