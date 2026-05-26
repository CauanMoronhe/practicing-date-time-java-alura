import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MainExerciciosRelatorios {
    public static void main(String[] args) {
        LocalDate dataRelatorio = LocalDate.now();
        LocalTime horaRelatorio = LocalTime.now();

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");

        String dataFormatada = dataRelatorio.format(formatoData);
        String horaFormatada = horaRelatorio.format(formatoHora);

        System.out.println("Data atual do relatório: " + dataFormatada);
        System.out.println("Hora atual do relatório: " + horaFormatada);
    }
}
