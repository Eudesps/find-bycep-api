package ClassesAbstratasInterfaceHeranca.main;

import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = "";

        System.out.println("Digite seu nome: ");
        nome = scanner.nextLine();
        scanner.close();

        System.out.println("Com espaço: " + nome);
        System.out.println("Sem espaço: " + nome.trim());

    }
}
