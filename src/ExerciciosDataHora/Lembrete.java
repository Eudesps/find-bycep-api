package ExerciciosDataHora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Lembrete {
    public static void main(String[] args) {
        LocalDate dataCompra = LocalDate.of(2025,3,30);
        int diasLembrete = 5;
        LocalDate dataLembrete = dataCompra.minusDays(diasLembrete);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Data do lembrete: " + dataLembrete.format(formatter));
    }
}
