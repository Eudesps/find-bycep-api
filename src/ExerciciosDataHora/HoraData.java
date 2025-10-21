package ExerciciosDataHora;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class HoraData {
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        LocalTime horaAtual = LocalTime.now();

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");


        System.out.println("Data: " + dataAtual.format(formatoData) + " Hora: " + horaAtual.format(formatoHora));

        //DIFERENÇA DE HORAS
        LocalTime horaInicial = LocalTime.now();
        LocalTime horaFinal = horaInicial.plusHours(12);

        LocalTime inicio = LocalTime.of(14,30);
        LocalTime fim = LocalTime.of(16, 45);

        Duration duracao = Duration.between(inicio,fim);
        //Duration duracao = Duration.between(horaInicial,horaFinal);
        System.out.println("diferença de tempo: " + duracao.toHoursPart() + ":" + duracao.toMinutesPart());
    }
}
