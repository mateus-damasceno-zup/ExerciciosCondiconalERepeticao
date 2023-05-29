package EstruturaDeRepeticaoEntregar;
//9. Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero para o calculo do fatorial");
        int numero = sc.nextInt();
        int fatorial =0;
        for(int i=0;i<=numero;i++) {
            if (i == 0 || i == 1) {
                fatorial = 1;
            } else {
            fatorial = fatorial *i;
            }
        }
        System.out.println("o fatorial de N "+ numero + "! é "+ fatorial);

    }
}
