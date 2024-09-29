package Desafio_Target;

public class DesafioFaturamento {

    public static void main(String[] args) {
        // Vetor de faturamento diário
        double[] faturamento = { 1500.0, 2000.0, 1800.0, 2500.0, 3000.0, 2200.0, 2700.0,
                1600.0, 2100.0, 2300.0, 2600.0, 1900.0, 2400.0 };

        // Inicializa as variáveis
        double menor = faturamento[0];
        double maior = faturamento[0];
        double soma = 0;
        int diasAcimaDaMedia = 0;

        // Calcular soma, menor e maior faturamento
        for (double valor : faturamento) {
            soma += valor;
            if (valor < menor) {
                menor = valor;
            }
            if (valor > maior) {
                maior = valor;
            }
        }

        // Calcular média mensal
        double media = soma / faturamento.length;

        // Contar dias acima da média
        for (double valor : faturamento) {
            if (valor > media) {
                diasAcimaDaMedia++;
            }
        }

        // Exibir resultados
        System.out.println("Menor faturamento: R$ " + menor);
        System.out.println("Maior faturamento: R$ " + maior);
        System.out.println("Número de dias com faturamento acima da média: " + diasAcimaDaMedia);
    }
}
