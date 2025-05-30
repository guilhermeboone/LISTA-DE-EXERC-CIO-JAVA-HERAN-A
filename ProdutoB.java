/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.produtob;

/**
 *
 * @author guilh
 */
import java.util.Scanner;

class Produto {
    String nome;
    double preco;

    public void Exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
    }
}

class Livro extends Produto {
    String autor;
    
    public void Exibir() {
        super.Exibir();
        System.out.println("Autor: " + autor);
    }
}

class Eletronico extends Produto {
    String marca;

    public void mostrarDetalhes() {
        super.Exibir();
        System.out.println("Marca: " + marca);
    }
}
public class ProdutoB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite 1 para Livro ou 2 para Eletrônico: ");
        int opcao = sc.nextInt();
        sc.nextLine(); // limpar buffer

        if (opcao == 1) {
            Livro livro = new Livro();
            System.out.print("Nome do livro: ");
            livro.nome = sc.nextLine();
            
            System.out.print("Preço: ");
            livro.preco = sc.nextDouble();
            
            sc.nextLine(); 
            
            System.out.print("Autor: ");
            livro.autor = sc.nextLine();

            livro.Exibir();
        } 
        
        else if (opcao == 2) {
            Eletronico eletronico = new Eletronico();
            System.out.print("Nome do produto: ");
            eletronico.nome = sc.nextLine();
            
            System.out.print("Preço: ");
            eletronico.preco = sc.nextDouble();
            
            sc.nextLine();
            
            System.out.print("Marca: ");
            eletronico.marca = sc.nextLine();

            eletronico.mostrarDetalhes();
        }
        
        else {
            System.out.println("Opção inválida.");
        }
    }
}
