import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MainExerciciosPagamento {
    public static void main(String[] args) {
        LocalDate dataVencimento = LocalDate.of(2025, 03, 30);
        int diasAntecedencia = 5;
        LocalDate dataLembrete = dataVencimento.minusDays(diasAntecedencia);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataAtualizada = dataLembrete.format(formato);

        System.out.println("Data do lembrete: " + dataAtualizada);
    }
}
