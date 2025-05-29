/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.veiculo;

/**
 *
 * @author guilh
 */
import java.util.Scanner;

class VeiculoB {
    String marca;
    String modelo;
    
public void exibirInformacoes (){
    System.out.println ("Marca: "+marca);
    System.out.println ("Modelo: "+modelo);
    }
}
class Carro extends VeiculoB{
int quantPortas;

public void qtdPortas(){
System.out.println ("Quantidade de portas: "+quantPortas);
    }
}
class Moto extends VeiculoB{
int cilindradas;

public void CilindradasMoto(){
System.out.println ("A moto possui: "+cilindradas+" cilindradas");
    }
}
    
public class Veiculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        boolean x = true;
        Carro[] carr = new Carro [2];
        Moto[] motinha = new Moto [2];
       
    do {
    System.out.println ("Menu opções:\n 1- Cadastrar novo carro\n 2- Cadastrar nova moto\n 3- Exibir informações de moto \n 4- Exibir informações de carro\n 5- Encerrar o programa.");
    int opcao = sc.nextInt();
    if (opcao ==1){
    for (int i=0; i<carr.length; i++){
    carr[i] = new Carro ();
    System.out.println ("Digite o nome da marca: ");
    carr[i].marca = sc.nextLine();
    sc.nextLine();
    System.out.println ("Digite o nome do modelo: ");
    carr[i].modelo = sc.nextLine();
    System.out.println ("Digite a quantidade de portas: ");
    carr[i].quantPortas = sc.nextInt();
    System.out.println ();
    }
    }
    if (opcao ==2){
    for (int i=0; i<motinha.length; i++){
    motinha[i] = new Moto ();
    System.out.println ("Digite o nome da marca: ");
    motinha[i].marca = sc.nextLine();
    sc.nextLine();
    System.out.println ("Digite o nome do modelo: ");
    motinha[i].modelo = sc.nextLine();
    System.out.println ("Digite a quantidade de cilindradas: ");
    motinha[i].cilindradas = sc.nextInt();
    System.out.println ();
    }
    }
    if (opcao ==3){
    for (int i=0; i<motinha.length; i++){
    motinha[i].exibirInformacoes();
    motinha[i].CilindradasMoto();

    }
    }
    if (opcao ==4){
    for (int i=0; i<carr.length; i++){
    carr[i].exibirInformacoes();
    carr[i].qtdPortas();
    }
    }
    if (opcao ==5){
    x = false;
        System.out.println("Programa encerrado! ");
    break;
    }
    
        }while (x=true);
    }
}
