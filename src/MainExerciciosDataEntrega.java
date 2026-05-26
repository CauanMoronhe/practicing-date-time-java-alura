import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MainExerciciosDataEntrega {
    public static void main(String[] args) {
        LocalDate dataDeInicio = LocalDate.of(2025, 3, 15);
        int prazoDias = 15;
        LocalDate dataFinal = dataDeInicio.plusDays(prazoDias);

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataFormatada = dataFinal.format(formatoData);

        System.out.println("Data de entrega: " + dataFormatada);

    }
}
