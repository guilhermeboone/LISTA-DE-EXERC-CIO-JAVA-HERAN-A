/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pessoa;

/**
 *
 * @author g.boone
 */
import java.util.Scanner;
class PessoaB {
    String nome;
    int idade;

public void mostrar (){
    System.out.println("Nome "+nome);
    System.out.println("Idade "+idade);
    }
}
    
class Funcionario extends PessoaB {
    double salario;
    
public void mostrarSalario() {
    System.out.println (nome+" Recebe o salário de: "+salario);
    
    }    
}

class Aluno extends PessoaB{
    double nota;
    
public void mostrarNota() {
    System.out.println (nome+" Obteve a nota: "+nota);
}
}
        
public class Pessoa {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    Funcionario func = new Funcionario();
    Aluno aluno = new Aluno();
    System.out.println ("Informe se você é aluno ou professor: \n 1- Aluno \n 2-Professor");
    int opcao = sc.nextInt();
    
    if (opcao == 1) {
        System.out.println ("Informe seu o nome: ");
            aluno.nome = sc.nextLine();
            sc.nextLine();
        System.out.println ("Informe sua idade: ");
            aluno.idade = sc.nextInt ();
        System.out.println ("Informe sua nota: ");
            aluno.nota = sc.nextDouble();
            
            aluno.mostrar();
            aluno.mostrarNota();
        }
    if (opcao == 2) {
        System.out.println ("Informe seu o nome: ");
            func.nome = sc.nextLine();
            sc.nextLine();
        System.out.println ("Informe sua idade: ");
            func.idade = sc.nextInt ();
        System.out.println ("Informe seu salario: ");
            func.salario = sc.nextDouble();
            sc.nextLine();
            func.mostrar();
            func.mostrarSalario();
        }
    sc.close();
    }
}
