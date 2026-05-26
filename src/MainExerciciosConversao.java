import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class MainExerciciosConversao {
    public static void main(String[] args) {
        ZonedDateTime horarioSistema = ZonedDateTime.now();
        ZonedDateTime horarioSydney = horarioSistema.withZoneSameInstant(ZoneId.of("Australia/Sydney"));

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Horário atual no sistema: " + horarioSistema.format(formato));
        System.out.println("Horário atual em Sidney: " + horarioSydney.format(formato));
    }
}
