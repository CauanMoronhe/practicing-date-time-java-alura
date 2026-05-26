import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class MainExerciciosViagem {
    public static void main(String[] args) {
        ZonedDateTime horarioTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("MM:mm:ss");
        String horarioFormatado = horarioTokyo.format(formato);

        System.out.println("Horário atual em Tokyo: " + horarioFormatado);
    }
}
