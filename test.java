
import java.util.Scanner;


public class test {
    public static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        gerarNotasAlunos(0);

    }

    public static int[] gerarNotasAlunos(int qtdAlunos) {
        int[] notas = new int[qtdAlunos];
        for (int i = 0; i < qtdAlunos; i++) {
            notas[i] = LER.nextInt();
        }
        return notas;

    }

    int calcularMEdia(int[] notas) {
        int soma = 0;
        int tamanho = notas.length;
        for (int i = 0; i < tamanho; i++) {
            soma += notas[i];

        }
        double media = soma / tamanho;
        return (int) media;
    }
}
