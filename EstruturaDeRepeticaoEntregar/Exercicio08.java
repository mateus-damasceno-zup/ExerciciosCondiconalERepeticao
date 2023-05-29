package EstruturaDeRepeticaoEntregar;

import java.util.Scanner;
//8. Faça um programa que calcule e mostre a soma dos 50 primeiros números ímpares.
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        for(int i=1;i<=100;i=i+2){

            soma += i;

            System.out.println("soma"+ soma + " i "+i);
        }
        System.out.println("a soma dos 50 primeiros numeros impares "+ soma);
    }
}
