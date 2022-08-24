package date;

import java.time.*;

public class TimeComparingDurationPeriodClass {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2000, 1, 1);
        LocalDate d2 = LocalDate.of(2002, 6, 1);
        System.out.println(d1.compareTo(d2));

        LocalTime t1 = LocalTime.of(10, 20);
        LocalTime t2 = LocalTime.of(14, 27, 35);
        System.out.println(t1.equals(t2));
        System.out.println("------------------------------------");

        LocalDateTime dateTime1 = LocalDateTime.of(d1, t1);
        LocalDateTime dateTime2 = LocalDateTime.of(d2, t2);
        System.out.println(dateTime1.equals(dateTime2));
        System.out.println("------------------------------------");

        System.out.println(Period.between(d1, d2));
        System.out.println(Period.between(d1, d2).toTotalMonths());
        System.out.println("------------------------------------");

        System.out.println(Duration.between(t1, t2));
        System.out.println(Duration.between(t1, t2).toDays());
        System.out.println(Duration.between(t1, t2).toMillis());
        System.out.println(Duration.between(t1, t2).toHours());
        System.out.println(Duration.between(t1, t2).toSeconds());
        System.out.println(Duration.between(t1, t2).toSecondsPart());
        System.out.println("------------------------------------");
    }
}
