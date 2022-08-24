package date;

import java.time.LocalDate;
import java.time.Period;

public class LocalDateBasicsClass {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalDate.now().plusYears(2000));
        System.out.println(LocalDate.now().plusDays(2));
        System.out.println(LocalDate.now().plusWeeks(2));
        System.out.println(LocalDate.now().plusMonths(2));
        System.out.println(LocalDate.now().getYear());
        System.out.println(LocalDate.now().getDayOfMonth());
        System.out.println(LocalDate.now().getDayOfWeek());
        System.out.println(LocalDate.now().getDayOfYear());
        System.out.println(LocalDate.now().getChronology().dateNow());
        System.out.println("--------------------------------------");

        System.out.println(LocalDate.EPOCH);//1970-01-01
        System.out.println("--------------------------------------");

        LocalDate.now()
                .datesUntil(LocalDate.now().plusYears(10), Period.ofYears(1))
                .filter(LocalDate::isLeapYear)
                .toList()
                .forEach(System.out::println);
    }
}
