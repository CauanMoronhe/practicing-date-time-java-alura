import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MainExerciciosEventos {
    public static void main(String[] args) {
        LocalDate dataEvento = LocalDate.of(2026, 9, 11);
        LocalDate dataAtual = LocalDate.now();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataEventoFormatado = dataEvento.format(formato);
        String dataAtualFormatada = dataAtual.format(formato);

        System.out.println("Data do evento: " + dataEventoFormatado);
        System.out.println("Data atual: " + dataAtualFormatada);

        if (!dataAtual.isEqual(dataEvento)) {
            System.out.println("O evento ainda está por vir");
        } else {
            System.out.println("O evento já ocorreu");
        }
    }
}
