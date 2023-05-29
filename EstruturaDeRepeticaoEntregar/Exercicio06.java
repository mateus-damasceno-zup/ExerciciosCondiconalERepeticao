package EstruturaDeRepeticaoEntregar;

import java.util.Scanner;

//6. Faça um programa que some os números ímpares contidos em um intervalo definido pelo usuário.
// O usuário define o valor inicial do intervalo e o valor final deste intervalo
// e o programa deve somar todos os números ímpares contidos neste intervalo.
// Caso o usuário digite um intervalo inválido (começando por um valor maior que o valor final)
// deve ser escrito uma mensagem de erro na tela, “Intervalo de valores inválido” e o programa termina.
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o limite inferior");
        int limiteInferior = sc.nextInt();
        System.out.println("digite o limite superior");
        int limiteSuperior= sc.nextInt();
        int soma =0;
        if (limiteInferior<=limiteSuperior){
                if ((limiteInferior % 2) >= 1) {
                    for (int i = limiteInferior; i <= limiteSuperior; i = i + 2) {
                        soma += i;
                    }
                } else if ((limiteInferior % 2) == 0) {
                    for (int i = limiteInferior + 1; i <= limiteSuperior; i = i + 2) {
                        soma += i;
                    }
                }
            System.out.println("soma dos numeros impares de "+ limiteInferior+" a "+  limiteSuperior +" é "+ soma);
        }else {
            System.out.println("Intervalo de valores inválidos");
        }
    }
}
