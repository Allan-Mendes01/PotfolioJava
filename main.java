import java.util.Scanner;

class Media{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite N1");
        float n1 = scan.nextFloat();

        System.out.println("Digite N2");
        float n2 = scan.nextFloat();

        System.out.println("Digite N3");
        float n3 = scan.nextFloat();

        scan.close();

        float media = (n1+n2+n3)/3;

        System.out.printf("Sua média foi %.2f", media);
    }
}