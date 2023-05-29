package EstruturaDeRepeticaoAula;


import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("zerar fila do banco");
        System.out.println("digite quantas pessoas tem na fila");
        int fila = sc.nextInt();

        while (fila >0){
            System.out.println("saiu uma pessoa da fila");
            fila--;
        }
        System.out.println("fila zerada!!");
    }
}
