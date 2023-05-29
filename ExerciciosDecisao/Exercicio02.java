package ExerciciosDecisao;
//2 - Faça um programa que receba o preço de três produtos e informe qual produto você deve comprar,
// sabendo que a decisão é sempre pelo mais barato.

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("insira o 1° valor do produto misterioso:");
            double preco1 = sc.nextDouble();
            System.out.println("insira o 2° valor do produto misterioso:");
            double preco2 = sc.nextDouble();
            System.out.println("insira o 3° valor do produto misterioso:");
            double preco3 = sc.nextDouble();

            if (preco1 < preco2) {
                if (preco1 < preco3) {
                    System.out.println("preço 01 mais barato");
                } else {
                    System.out.println("preco 03 mais barato");
                }
            }else{
                if (preco2 < preco3){
                    System.out.println("preço 02 mais barato");
                }else{
                    System.out.println("preco 03 mais barato");
                }
            }



    }
}
