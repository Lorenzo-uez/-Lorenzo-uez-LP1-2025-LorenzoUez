import java.util.Scanner;

public class vet4 {
    public static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        int[] v1 = crairVetorAleatorio(0, 0);
        int[] v2 = crairVetorAleatorio(0, 0);

        int a = 5;
        System.out.println("a do main" + a);
        dobrarValor(a);
        System.out.println("a do main depois do métod" + a);
    }

    public static void dobrarValor(int b) {
        b = b + 2;
        System.out.println("b do método:" + b);
    }

    public static int[] crairVetorAleatorio(int tamanho, int maxValor) {
        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = (int) (Math.random() * maxValor);

        }

        return vetor;

    }

    public static void imprimirVetorAleatorio() {
        int[] vet5 = crairVetorAleatorio(0, 0);
        for (int i = 0; i < vet5.length; i++) {
            System.out.println(vet5);
        }

    }
}
