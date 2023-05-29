package EstruturaDeRepeticaoEntregar;

import java.util.Scanner;

//4. Faça um programa que leia n números positivos e calcule a soma desses números.
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double entrada = 0;
        double soma=0;
        int cont=0;

        while (entrada >=0) {

            System.out.println("====Somas Consecutivas====");

            entrada = sc.nextDouble();
            if(entrada <0){
                System.out.println("fim");
                System.out.close();

            }
            soma += entrada;
            cont++;
            System.out.println("soma atual: "+ soma);
            System.out.println("quantidade de numeros somados: "+ cont);
            System.out.println("- Digite um numero negativo para sair");


        }
    }
}
