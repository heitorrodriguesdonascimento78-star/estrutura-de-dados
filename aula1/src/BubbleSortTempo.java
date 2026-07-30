import java.util.Random;

public class BubbleSortTempo {

    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (vetor[j] > vetor[j + 1]) {

                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;

                }

            }

        }

    }

    public static int[] gerarVetor(int tamanho) {

        Random random = new Random();

        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt(1000000);
        }

        return vetor;
    }

    public static void main(String[] args) {

        int[] tamanhos = {10, 100, 10000, 100000, 1000000};

        for (int tamanho : tamanhos) {

            int[] vetor = gerarVetor(tamanho);

            System.out.println("Ordenando vetor de tamanho: " + tamanho);

            long startTime = System.nanoTime();

            bubbleSort(vetor);

            long endTime = System.nanoTime();

            long duration = endTime - startTime;

            System.out.println("Tempo: " + (duration / 1000000.0) + " ms");
            System.out.println("======");

        }

    }

}