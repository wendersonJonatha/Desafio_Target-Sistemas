package Desafio_Target;

public class DesafioString {

    public static void main(String[] args) {
        // Definindo a string a ser invertida
        String original = "Hello, World!";

        // Para receber entrada do usuário, descomente as linhas abaixo:
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Informe uma string para inverter: ");
        // String original = scanner.nextLine();

        // String para armazenar a string invertida
        String invertida = "";

        // Invertendo a string
        for (int i = original.length() - 1; i >= 0; i--) {
            invertida += original.charAt(i);
        }

        // Exibindo o resultado
        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida);
    }
}
