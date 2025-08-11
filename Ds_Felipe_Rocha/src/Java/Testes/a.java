import java.util.Arrays;

public class a {
    public static void main(String[] args) {
        int[] arr = {3, 10, 2, 1, 20, 4, 5, 6, 7, 8, 9, 12, 15, 18, 16, 17, 19, 21, 22, 23, 24, 25, 11, 13, 14, 26, 27, 28, 29, 30};
        int n = arr.length;

        // Arrays para armazenar o tamanho da LIS e os índices anteriores
        int[] lis = new int[n];
        int[] prev = new int[n];

        // Inicialização
        Arrays.fill(lis, 1);
        Arrays.fill(prev, -1);

        int maxLength = 0, endIndex = -1;

        // Preenchendo LIS para cada elemento
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i] && lis[j] + 1 > lis[i]) {
                    lis[i] = lis[j] + 1;
                    prev[i] = j;
                }
            }
            if (lis[i] > maxLength) {
                maxLength = lis[i];
                endIndex = i;
            }
        }

        // Reconstruindo a subsequência
        int[] sequence = new int[maxLength];
        int index = endIndex;
        int count = maxLength - 1;

        while (index != -1) {
            sequence[count--] = arr[index];
            index = prev[index];
        }

        // Imprimindo a subsequência crescente mais longa
        System.out.println("Subsequência crescente mais longa: " + Arrays.toString(sequence));
    }
}
//codificar um exemplo de herança e encapsulamento POO
//
