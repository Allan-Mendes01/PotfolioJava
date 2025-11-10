package java_fundamentos;

import java.util.Scanner;
import java.lang.Math;

class CalculadoraFinanceira {

    public static double jurossimples(float c, float i, int t) {
        return c*i*t;
    }

    public static double juroscompostos(float c, float i, int t) {
        double result = Math.pow((1+i), t);
        return c * result;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float capital = -1, taxa = -1;

        int tempo = -1;

        double result = -1;
    
        int op = -1;

        while (op != 0) {
            System.out.printf("Selecione a operação a se relizar: \n0 - sair da calculadora financeira \n1 - juros simples \n2 - juros compostos \n");
            op = scan.nextInt();
            scan.nextLine();

            if (op < 0 || op > 2) {
                System.out.println("opção inválida");
            } else if (op == 1) {
                System.out.println("insira seu capital:");
                capital = scan.nextFloat();

                System.out.println("insira a taxa de juros em porcentagem (atente-se a unidade, deve estar na mesma do tempo, ou seja, anual/mensal/trimestral...):");
                taxa = scan.nextFloat();
                taxa /= 100;

                System.out.println("Insira o tempo da aplicação:");
                tempo = scan.nextInt();

                result = jurossimples(capital,taxa,tempo);

                System.out.printf("o valor do juros é R$ %.2f \n", result);   
            } else{
                System.out.println("insira seu capital:");
                capital = scan.nextFloat();

                System.out.println("insira a taxa de juros em porcentagem (atente-se a unidade, deve estar na mesma do tempo, ou seja, anual/mensal/trimestral...):");
                taxa = scan.nextFloat();
                taxa /= 100;

                System.out.println("Insira o tempo da aplicação:");
                tempo = scan.nextInt();
            }
        }
        System.out.println("calculadora finalizada!");
        scan.close();
    }
}
