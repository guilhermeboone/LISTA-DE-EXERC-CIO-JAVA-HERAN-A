/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.empregadob;

/**
 *
 * @author guilh
 */
import java.util.Scanner;

class Empregado {
    String nome;
    double salBase;

    public double calcularSalario() {
        return salBase;
    }
}
class Gerente extends Empregado {
    double bonus;

    public double calcularSalario() {
        return salBase + bonus;
    }
}

class Desenvolvedor extends Empregado {
    int horasExtras;
    double valorHoraExtra;

    public double calcularSalario() {
        return salBase + (horasExtras * valorHoraExtra);
    }
}
public class EmpregadoB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Gerente gerente = new Gerente();
        Desenvolvedor dev = new Desenvolvedor();

        System.out.println("~~~~~ Cadastro do Gerente ~~~~~");
        
        System.out.print("Nome: ");
        gerente.nome = sc.nextLine();
        
        System.out.print("Salário base: ");
        gerente.salBase = sc.nextDouble();
        
        System.out.print("Bônus: ");
        gerente.bonus = sc.nextDouble();
        
        sc.nextLine();
        
        System.out.println("~~~~~Cadastro do Desenvolvedor ~~~~~");
        
        System.out.print("Nome: ");
        dev.nome = sc.nextLine();
        
        System.out.print("Salário base: ");
        dev.salBase = sc.nextDouble();
        
        System.out.print("Horas extras: ");
        dev.horasExtras = sc.nextInt();
        
        System.out.print("Valor por hora extra: ");
        dev.valorHoraExtra = sc.nextDouble();

        System.out.println("\nSalário do Gerente " + gerente.nome + ": R$ " + gerente.calcularSalario());
        System.out.println("Salário do Desenvolvedor " + dev.nome + ": R$ " + dev.calcularSalario());

    
    }
}

