package ExerciciosDataHora;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class HoraPorFusos {
    public static void main(String[] args) {
        ZonedDateTime horarioTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horarioFormatado = horarioTokyo.format(formatter);

        System.out.println("Horário atual em Tóquio: " + horarioFormatado);

        ZonedDateTime dataTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        DateTimeFormatter formatterDt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataFormatada = dataTokyo.format(formatterDt);

        System.out.println("Data atual em Tóquio: " + dataFormatada);

        //É possível usar o withZoneSameInstant(ZoneId.of("Australia/Sydney")) para converter o
        //horário atual para o da Zona esperada, passada pelo ID.
    }
}
