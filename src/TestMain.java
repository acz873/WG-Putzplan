import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestMain {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate lastDate = today.minusDays(7L);

        long daysBetween = ChronoUnit.DAYS.between(lastDate, today);
        System.out.printf("Tage dazwischen: %d", daysBetween);
    }
}
