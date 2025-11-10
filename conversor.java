import java.util.Scanner;

class Conversor {
    
    public static void main(String[] args){

        int medidaA = -1, medidaB = -1;
        float tempA = -1;
        double result = -1;

        Scanner scan = new Scanner(System.in);

        while (medidaA == -1) {

            System.out.printf("Selecione a medida de temperatura inicial:\n1- fahrenheit\n2- Celsius\n3- Kelvin\n");
            medidaA = scan.nextInt();

            if (medidaA<1 || medidaA > 3){
                System.out.println("opção inválida");
                medidaA = -1;
            }else {
                System.out.println("digite a temperatura:");
                tempA = scan.nextFloat();
            }

            if (medidaA != -1) {

                while (medidaB == -1) {
                    System.out.printf("Selecione a medida de temperatura final:\n1- fahrenheit\n2- Celsius\n3- Kelvin\n");
                    medidaB = scan.nextInt();                    
                
                    if (medidaB<1 || medidaB > 3){
                        System.out.println("opção inválida");
                        medidaB = -1;
                    }
                }
            }
        }
        scan.close();

        switch (medidaA) {
            case 1:
                if (medidaB == 1) {
                    System.out.printf("O resultado da conversão foi %.1f graus fahrenheit", tempA);
                } else if (medidaB == 2) {
                    result = (tempA - 32) / 1.8;
                    System.out.printf("O resultado da conversão foi %f graus celsius", result);
                } else {
                    result = (tempA-32) * 5/9 + 273.15;
                    System.out.printf("O resultado da conversão foi %f Kelvin", result);
                }
                break;
            case 2: 
                if (medidaB == 1) {
                    result = (tempA*9/5)+32;
                    System.out.printf("O resultado da conversão foi %f graus fahrenheit", result);
                } else if (medidaB == 2) {
                    System.out.printf("O resultado da conversão foi %.1f graus celsius", tempA);
                } else {
                    result = tempA + 273.15;
                    System.out.printf("O resultado da conversão foi %f Kelvin", result);
                }
                break;
            case 3:
                if (medidaB == 1) {
                    result = (tempA-273.15)*9/5+32;
                    System.out.printf("O resultado da conversão foi %f graus fahrenheit", result);
                } else if (medidaB == 2) {
                    result = tempA - 273.15;
                    System.out.printf("O resultado da conversão foi %f graus celsius", result);
                } else {
                    System.out.printf("O resultado da conversão foi %1.f Kelvin", tempA);
                }
                break;
            default:
                break;
        }

    }

}
