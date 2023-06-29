package app_java_important;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTimeApi {
	public static void main(String[] args) {
        // Get the current time in the USA time zone
        ZoneId usaZone = ZoneId.of("America/New_York");
        LocalTime usaTime = LocalTime.now(usaZone);

        // Create a formatter with the USA time format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");

        // Format the time using the formatter
        String usaTimeFormat = usaTime.format(formatter);

        System.out.println("USA Time: " + usaTimeFormat);
    }
}
