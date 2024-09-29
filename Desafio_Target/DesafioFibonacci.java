package Desafio_Target;

import java.util.Scanner;

public class DesafioFibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        // Variáveis para calcular a sequência de Fibonacci
        int a = 0;
        int b = 1;
        boolean pertence = false;

        // Verifica se o número informado é 0 ou 1
        if (numero == 0 || numero == 1) {
            pertence = true;
        } else {
            // Calcular a sequência de Fibonacci
            while (b <= numero) {
                if (b == numero) {
                    pertence = true;
                    break;
                }
                // Atualiza os valores de a e b
                int proximo = a + b;
                a = b;
                b = proximo;
            }
        }

        // Exibir o resultado
        if (pertence) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}
