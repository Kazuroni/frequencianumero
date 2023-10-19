package frequencianumero;

import java.util.Random;

public class frequencianumero {

    public static void main(String[] args) {
        // Tamanho do array
        int tamanhoArray = 50;

        // Cria um objeto Random para gerar números aleatórios
        Random random = new Random();

        // Cria um array para armazenar os números aleatórios
        int[] numerosAleatorios = new int[tamanhoArray];

        // Preenche o array com números aleatórios entre 1 e 10
        for (int i = 0; i < tamanhoArray; i++) {
            numerosAleatorios[i] = random.nextInt(10) + 1;
        }

        // Cria um array para armazenar a frequência de cada número
        int[] frequencia = new int[10]; // Índices de 1 a 10 representam os números

        // Conta a frequência de cada número no array
        for (int i = 0; i < tamanhoArray; i++) {
            int numero = numerosAleatorios[i];
            frequencia[numero - 1]++; // Subtrai 1 para ajustar o índice do array
        }

        // Imprime a frequência de cada número
        for (int i = 0; i < 10; i++) {
            int numero = i + 1; // Adiciona 1 para obter o número real
            int contagem = frequencia[i];
            System.out.println("Número " + numero + ": " + contagem + " vezes");
        }
    }
}
