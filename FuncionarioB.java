/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.funcionariob;

/**
 *
 * @author guilh
 */
import java.util.Scanner;

class Funcionario {
    String nome;
    String departamento;

    public void exibirDados() {
        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Departamento do funcionário: " + departamento);
    }
}

class Professor extends Funcionario {
    String disciplina;

    public void exibirDados() {
        super.exibirDados();
        System.out.println("Informe a disciplina do professor: " + disciplina);
    }
}

class Tecnico extends Funcionario {
    String funcao;

    public void exibirDados() {
        super.exibirDados();
        System.out.println("Função do técnico: " + funcao);
    }
}
public class FuncionarioB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("~~~~~Menu Escolha ~~~~~");
        System.out.println("Digite (1) para professor - \n(2) Para técnico:");
        int escolha = sc.nextInt();
        
        sc.nextLine();

        if (escolha == 1) {
            Professor professor = new Professor();
            System.out.print("Nome do professor: ");
            professor.nome = sc.nextLine();
            
            System.out.print("Departamento do professor: ");
            professor.departamento = sc.nextLine();
            
            System.out.print("Disciplina que o professor lesiona: ");
            professor.disciplina = sc.nextLine();
            
            professor.exibirDados();
        }
        else {
            Tecnico tecnico = new Tecnico();
            System.out.print("Nome do técnico: ");
            tecnico.nome = sc.nextLine();
            
            System.out.print("Departamento do técnico: ");
            tecnico.departamento = sc.nextLine();
            
            System.out.print("Função do técnico : ");
            tecnico.funcao = sc.nextLine();
            
            tecnico.exibirDados();
        }
    }
}
