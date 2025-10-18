package ExercicioForWhile;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        String digitado = "";

        //Essa variável (acaoKey) vai monitorar se o nome que se deseja
        //adicionar é igual a algum já presente no array. -1 para presente e 0 para sem ocorrências.
        int acaoKey = 0;

        String comando = "";
        ArrayList<String> convidados = new ArrayList<>();

        Scanner leitor = new Scanner(System.in);

        while (!comando.contentEquals("sair")){
            System.out.println("Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar): ");
            digitado = leitor.nextLine();
            if (digitado.equalsIgnoreCase("ver")) {
                System.out.println(convidados);
            } else if (digitado.equalsIgnoreCase("sair")) {
                comando = digitado;
            }else{
                for(String nome: convidados){
                    if (nome.equalsIgnoreCase(digitado)) {
                        System.out.println("Nome já existente na lista");
                        acaoKey = -1;
                    }
                }
                if (acaoKey == 0) {
                    convidados.add(digitado);
                    System.out.println("Salvo com sucesso!!");
                }else{
                    acaoKey = 0;
                }
            }
        }
        leitor.close();
    }
}
