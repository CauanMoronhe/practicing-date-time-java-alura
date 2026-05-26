import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MainExerciciosExpediente {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        System.out.print("Digite o horário de entrada (HH:mm): ");
        LocalTime entrada = LocalTime.parse(input.next(), formatter);
        System.out.print("Digite sua carga horária: ");
        int cargaHoraria = input.nextInt();
        System.out.print("Digite seu horário real de saida (HH:mm): ");
        LocalTime saidaReal = LocalTime.parse(input.next(), formatter);

        input.close();

        LocalTime saidaPrevista = entrada.plusHours(cargaHoraria);
        String saidaPrevistaFormat = saidaPrevista.format(formatter);

        Duration diferenca = Duration.between(saidaPrevista, saidaReal);
        long horasExtras = diferenca.toHours();
        long minutosExtra = diferenca.toMinutesPart();

        System.out.println("\nHorário de entrada: " + entrada);
        System.out.println("Horário de saída previsto: " + saidaPrevistaFormat);
        System.out.println("Horário de saída real: " + saidaReal);

        String sinal = "";

        if (horasExtras == 0 && minutosExtra == 0) {
            System.out.println("Saldo de horas: 0h 0min");
        } else {
            if (horasExtras > 0 || minutosExtra > 0) {
                sinal = "+";
            } else {
                sinal = "-";
            }
        }
        System.out.println("Saldo de horas: " + sinal + Math.abs(horasExtras) + "h " + Math.abs(minutosExtra) + "min");
    }
}
