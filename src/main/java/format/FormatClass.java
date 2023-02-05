package format;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class FormatClass {
    public static void main(String[] args) {
        double d = 12345.678;
        System.out.println(new DecimalFormat("###,###,###.00").format(d));//12,345.68
        System.out.println(new DecimalFormat("000,000,000.00000").format(d));//000,012,345.67800
        System.out.println(new DecimalFormat("Your Balance $#,###,###.##").format(d));//Your Balance $12,345.68

        LocalDate date = LocalDate.of(2022, Month.OCTOBER, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dt = LocalDateTime.of(date, time);
        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        var f = DateTimeFormatter.ofPattern("MMMM dd, yyyy 'at' hh:mm");
        System.out.println(dt.format(f));//October 20, 2022 at 11:12
    }
}
