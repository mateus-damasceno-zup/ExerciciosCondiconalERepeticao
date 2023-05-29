package ExerciciosDecisao;

//1 - Faça um programa que receba dois números e imprima o maior deles.


import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero");
        double numero1 =sc.nextDouble();

        System.out.println("digite outro numero");
        double numero2 = sc.nextDouble();

        if(numero1<numero2){
            System.out.println("numero "+ numero2 + " é maior que "+ numero1);
        } else if (numero1>numero2) {
            System.out.println("numero "+ numero1 + " é maior que "+ numero2);
        }else {
            System.out.println("numero "+ numero1 + " é igual ao "+ numero2);
        }
    }
}
