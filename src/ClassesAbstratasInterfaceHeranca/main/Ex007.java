package ClassesAbstratasInterfaceHeranca.main;

import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o texto: ");
        String texto = scanner.nextLine();
        System.out.println("Digite a palavra a ser substituída: ");
        String palavraSubstituir = scanner.nextLine();

        if (!texto.contains(palavraSubstituir)) {
            System.out.println("Palavra não encontrada.");
            scanner.close();
            return;
        }

        System.out.println("Digite a nova palavra: ");
        String novaPalavra = scanner.nextLine();
        scanner.close();

        System.out.println("Texto modificado: " + texto.replace(palavraSubstituir, novaPalavra));
    }
}
