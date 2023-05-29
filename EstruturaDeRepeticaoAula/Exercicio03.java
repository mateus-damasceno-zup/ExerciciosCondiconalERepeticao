package EstruturaDeRepeticaoAula;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma=0;
        double numero;
        for (int i=0;i<5;i++){
            System.out.println("digite o "+ (i+1) +"º numero ");
            numero=sc.nextDouble();
            soma += numero;
        }
        System.out.println("o resultado da soma é "+ soma);
    }
}
