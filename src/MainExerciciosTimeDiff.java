import java.time.Duration;
import java.time.LocalTime;

public class MainExerciciosTimeDiff {
    public static void main(String[] args) {
        LocalTime horarioInicio = LocalTime.of(8, 0);
        LocalTime horarioFinal = LocalTime.of(18, 10);

        Duration diferenca = Duration.between(horarioInicio, horarioFinal);

        System.out.println("Diferença de tempo: " + diferenca.toHours() + " horas e " + diferenca.toMinutesPart() + " minutos");
    }
}
