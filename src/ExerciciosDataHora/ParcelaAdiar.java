package ExerciciosDataHora;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParcelaAdiar {
    public static void main(String[] args) {
        LocalDate dataCompra = LocalDate.now();
        int mesesVencimento = 3;
        LocalDate dataVencimento = dataCompra.plusMonths(mesesVencimento);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data vencimento atual: " + dataVencimento.format(formatter));

        LocalDate novaDataVencimento = dataVencimento.plusMonths(1);
        System.out.println("Nova data de vencimento "+ novaDataVencimento.format(formatter));
    }
}
