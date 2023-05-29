package EstruturaDeRepeticaoAula;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        double numero;
        System.out.println("digite quantas notas quer");
        int n = sc.nextInt();
        int m=n;
        while (n>0){
            System.out.println("digite a nota");
            double nota = sc.nextDouble();
            soma += nota;

            n--;
        }
        double media = soma/m;

        System.out.println("media é: "+ media);
    }
}
