import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MainExerciciosVencimento {
    public static void main(String[] args) {
        LocalDate dataVencimento = LocalDate.of(2025, 03, 20);
        int adiantamentoMeses = 1;
        LocalDate novaDataVencimento = dataVencimento.plusMonths(adiantamentoMeses);

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataFormatada = novaDataVencimento.format(formatoData);

        System.out.println("Nova data de vencimento: " + dataFormatada);
    }
}
