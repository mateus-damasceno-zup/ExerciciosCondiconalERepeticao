package EstruturaDeRepeticaoEntregar;

//1 - Escreva um programa que escreva na tela, de 1 até 100, de 1 em 1, 2 vezes.
// A primeira vez com "for" e a segunda com "while".
public class Exercicio01 {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            System.out.println("for: "+i);
        }
        int i=0;
        while( i<100){
            i++;
            System.out.println("while: "+ i);
        }
    }
}
