package java_fundamentos;

import java.util.Scanner;

class Votacao {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int qtd_candidatos = 0, voto = 0, maior = 0, indice = 0;

        System.out.println("Digite a quantidade de candidatos:");
        qtd_candidatos = scan.nextInt();
        scan.nextLine();

        // matrizes para os nomes e votos
        String[] nomes = new String[qtd_candidatos];
        int[] votos = new int[qtd_candidatos];
        
        for (int i = 0; i < qtd_candidatos; i++) {
            System.out.printf("digite o nome do candidato %d: ", i+1);
            nomes[i] = scan.nextLine();
            votos[i] = 0;
        }

        while (voto != -1) {
            System.out.println("Digite o numero do seu candidato");
            System.out.println("0 - encerrar votação");
            for(int i = 0; i < nomes.length; i++){
                System.out.printf("%d - %s \n", i+1, nomes[i]);
            }
            voto = scan.nextInt();
            scan.nextLine(); 

            if (voto < 0 || voto > 4) {
                System.out.println("opção inválida!");
            }else if (voto > 0) {
                voto--;
                votos[voto]++;
                System.out.println("Voto Contabilizado!");
            } else {
                voto--;
                System.out.println("Votação encerrada!");
            }

        }

        for (int i = 0; i < votos.length; i++) {
            System.out.printf("O candidato %s recebeu %d votos \n", nomes[i], votos[i]);

            if (maior < votos[i]) {
                maior = votos[i];
                indice = i;
            }
        }

        System.out.printf("O candidato %s foi o vencedor com %d votos \n", nomes[indice], votos[indice]);

        scan.close();
    }
}
