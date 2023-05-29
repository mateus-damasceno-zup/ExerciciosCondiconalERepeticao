package ExerciciosDecisao;


//4 - Os gestores da Zup resolveram dar um aumento de salário aos seus colaboradores e
//        lhe contrataram para desenvolver o programa que calcula os reajustes.
//        Portanto, faça um programa que recebe o salário de um colaborador
//        e o reajuste segundo o seguinte critério, baseado no salário atual:
//        Salários até R$ 280,00 (incluindo), receberão aumento de 20%
//        Salários entre R$ 280,00 e R$ 700,00 (incluindo), receberão aumento de 15%
//        Salários entre R$ 700,00 e R$ 1500,00 (incluindo), receberão aumento de 10%
//        Salários de R$ 1500,00 em diante, receberão aumento de 5%
//Após o aumento ser realizado, informe na tela:
//        O salário antes do reajuste;
//        O percentual de aumento aplicado;
//        O valor do aumento;
//        O novo salário, após o aumento;



import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("calculo de reajuste");
        System.out.println("digite o seu salario atual");
        double salario = sc.nextDouble();
        double reajuste=0;
        double percentual=0;
        if(salario >0 && salario <=280){
            percentual=20;
        } else if (salario>280 && salario<=700) {
           percentual=15;
        }else if (salario >700 && salario <=1500){
            percentual=10;
        }else{
           percentual=5;
        }
        reajuste = salario * (percentual/100);
        double novoSalario = salario + reajuste;

        System.out.println("salario antes do reajuste: "+ salario);
        System.out.println("percentual do aumento: " + percentual);
        System.out.println("valor do aumento: "+ reajuste);
        System.out.println("Novo salario " + novoSalario);
    }
}
