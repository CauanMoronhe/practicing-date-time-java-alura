import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MainExerciciosLog {
    public static void main(String[] args) {
        String tarefa = "Enviar novo relatório semanal";
        LocalDate dataAbertura = LocalDate.now();
        LocalTime horaAbertura = LocalTime.now();

        System.out.println("Tarefa: \"" + tarefa + "\"");
        System.out.println("Data atual: " + dataAbertura);
        System.out.println("Hora atual: " + horaAbertura);
    }
}
