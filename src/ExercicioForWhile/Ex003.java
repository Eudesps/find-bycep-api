package ExercicioForWhile;

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número ");
        int numero = leitor.nextInt();

        int produto = numero;
        for (int i = numero -1; i >= 1 ; i--) {
            produto *= i;
        }
        leitor.close();

        System.out.println("O fatorial de "+ numero +" é: " + produto);
    }
}
