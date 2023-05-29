package EstruturaDeRepeticaoEntregar;

import java.util.Scanner;

//3. Escreva um programa que leia 10 números e escreva o menor valor lido é o maior valor lido.
public class Exercicio03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double menor=Double.MAX_VALUE;
        double maior= Double.MIN_VALUE;
        for (int i=0;i<10;i++){
            System.out.println("digite o numero "+(i+1)+"/10");
            double numero=sc.nextDouble();

            if (numero<=menor){
                menor=numero;
            }else{
                maior=numero;
            }

            System.out.println("maior:"+ maior);
            System.out.println("menor: "+ menor);
        }
    }

}
