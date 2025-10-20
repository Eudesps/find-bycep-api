package ExerciciosDataHora;

import java.time.LocalDate;
import java.time.LocalTime;

public class HoraData {
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        LocalTime horaAtual = LocalTime.now();

        System.out.println("Data: " + dataAtual + " Hora: " + horaAtual);
    }
}
