
import java.util.Scanner;

public class vetor3 {
    public static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int N = 3;

        int[] vetor1 = iniciarVetor(N);
        System.out.println("Vetor 1");
        imprimirVetor(vetor1);

        int[] vetor2 = iniciarVetor(N);
        System.out.println("Vetor 2");
        imprimirVetor(vetor2);

        int[] vetorSoma = iniciarVetor(N);
        System.out.println("Vetor soma");
        imprimirVetor(vetorSoma);


        int numero = 5;
        imprimirMaior(vetorSoma, numero);
        imprimirMaior(vetor2, numero);
        imprimirMaior(vetor1, numero);
    }
    public static int[] intverterVetor(int[] v, int tamanho){
        int[] vetor = new int[v.length];


        for (int i = 0; i < tamanho; i++) {

            vetor[i] = v[vetor.length - 1 - i];

            return vetor;
        }


        return vetor;
    }
    public static void imprimirMaior(int[] v, int numero){
        for (int i = 0; i < v.length; i++) {
            System.out.printf("%d", v[i]);
        }
    }


    public static int[] somarVeto(int[] vetor1, int[] vetor2, int tamanho) {

        int[] vetorSoma = new int[tamanho];

        for (int i = 0; i < vetorSoma.length; i++) {
            vetorSoma[i] = vetor1[i] + vetor2[i];
        }

        return vetorSoma;

    }

    public static void imprimirVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.printf("%d", v[i]);

        }
        System.out.println();
    }

    public static int[] iniciarVetor(int tamanho) {

        int[] vetor = new int[tamanho];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = LER.nextInt();
        }
        return vetor;
    }
}
