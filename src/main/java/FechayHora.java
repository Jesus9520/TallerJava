
import java.time.*;
import java.time.format.DateTimeFormatter;

public class FechayHora {

    public static void main(String[] args) {
        LocalDateTime fecha = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = fecha.format(myFormatObj);

        System.out.println(formattedDate);
    }
}


