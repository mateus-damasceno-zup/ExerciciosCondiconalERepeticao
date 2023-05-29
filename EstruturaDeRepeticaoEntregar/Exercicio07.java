package EstruturaDeRepeticaoEntregar;

import java.util.Scanner;

//7. Faça um programa que peça um número inteiro e determine se ele é ou não um número primo.
// Um número primo é aquele que é divisível somente por ele mesmo e por 1.
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("calculo de numero primo");
        double numero = sc.nextDouble();
        double divisao;
        int naoPrimo=0;
        int primo=0;
        for (int i =1;i<=numero;i++){
            divisao = numero % i;
            System.out.println(i+ " divisao "+divisao);
            if (divisao==0){
                primo++;
               // System.out.println(i+ " Primo "+primo);
            }
        }
        if(primo<=2) {
            System.out.println("o numero " + numero + " é primo");
        }else{
            System.out.println("o numero " + numero + " não é primo");
        }
    }
}
