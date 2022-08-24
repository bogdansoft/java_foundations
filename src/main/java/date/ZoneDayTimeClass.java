package date;

import java.time.*;

public class ZoneDayTimeClass {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2001, 1, 1);
        LocalDate d2 = LocalDate.of(2002, 6, 1);
        System.out.println(d1.compareTo(d2));

        LocalTime t1 = LocalTime.of(10, 20);
        LocalTime t2 = LocalTime.of(14, 27, 35);

        LocalDateTime dateTime1 = LocalDateTime.of(d1, t1);
        LocalDateTime dateTime2 = LocalDateTime.of(d2, t2);


        System.out.println(ZonedDateTime.of(dateTime1, ZoneId.systemDefault().normalized()));
        System.out.println(ZonedDateTime.of(dateTime2, ZoneId.systemDefault()));

        LocalDateTime xmas = LocalDateTime.of(2022, 12, 25, 12, 00, 00);

        ZonedDateTime zxmas = ZonedDateTime.of(xmas, ZoneId.of("-8"));
        System.out.println(zxmas.withZoneSameInstant(ZoneId.of("+0")));
        System.out.println("----------------------------------------------------");

        ZoneId.getAvailableZoneIds().forEach(System.out::println);
    }
}
