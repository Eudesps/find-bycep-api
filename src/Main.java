import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String cep = "";

        System.out.println("DIGITE O CEP: ");
        cep = leitor.nextLine();

        Service resposta = new Service();

        System.out.println(resposta.consutar(cep));
    }
}