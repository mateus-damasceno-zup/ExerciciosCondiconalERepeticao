package EstruturaDeRepeticaoEntregar;

import java.util.Scanner;

//2. Faça um programa que leia n números inteiros e imprima sua média.
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota = 0;
        int cont = 1;
        double media = 0;
        double soma = 0;
        while (nota != -1) {
            System.out.println("calculo de medias: ");
            System.out.println("digite -1 para sair");
            nota = sc.nextDouble();

            if (nota == -1) {
                System.out.println("fim do programa");
                break;
            }

            soma += nota;
            media = soma / cont;

            System.out.println("media: " + media);
            System.out.println("soma: " + soma);
            System.out.println("numero de entradas: " + cont);
            cont++;
    }
    }
}
