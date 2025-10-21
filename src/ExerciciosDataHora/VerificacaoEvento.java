package ExerciciosDataHora;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class VerificacaoEvento {
    public static void main(String[] args) {
        LocalDate dataEvento = LocalDate.of(2025,10,23);
        LocalDate dataAtual = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Data do evento: " + dataEvento.format(formatter));
        System.out.println("Data do atual: " + dataAtual.format(formatter));

        if(dataEvento.isAfter(dataAtual)){
            System.out.println("O evento ainda não passou");
        }else{
            System.out.println("O evento já ocorreu");
        }
    }
}
