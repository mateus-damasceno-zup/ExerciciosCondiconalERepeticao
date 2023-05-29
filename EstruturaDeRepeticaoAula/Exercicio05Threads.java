package EstruturaDeRepeticaoAula;



import java.util.Scanner;


public class Exercicio05Threads extends Thread{
    static int i=0;
    static int fila=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("zerar fila do banco");
        System.out.println("digite quantas pessoas tem na fila");
        fila = sc.nextInt();

        new Thread(caixa1).start();
        new Thread(caixa2).start();





    }

    private static void caixa(String caixa){

        i++;
        System.out.println("senha n:"+i+" atualizado pelo caixa: " + caixa);
    }

    private static Runnable caixa1 = new Runnable() {

        @Override
        public void run() {
            try{
                while(i<fila){
                    caixa("caixa1");
                }
            } catch (Exception e){
            }
        }
    };



    private static Runnable caixa2 = new Runnable() {
        @Override
        public void run() {
            try{
                while (i<fila){
                    caixa("caixa2");
                }
            } catch (Exception e){
            }
        }
    };
}
