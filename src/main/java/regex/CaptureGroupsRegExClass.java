package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CaptureGroupsRegExClass {
    public static void main(String[] args) {
        String regex = "((\\d{1,2})[-.,\\s]?)?((\\d{3})[-.,\\s]?)((\\d{3})[-.,\\s]?)(\\d{4})";
        String phoneNumber = "24.523.343.3432";

        System.out.println(phoneNumber.matches(regex));//true

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);

        if (matcher.matches()) {
            System.out.format("Country code: %s\n", matcher.group(2));
            System.out.format("Area code: %s\n", matcher.group(4));
            System.out.format("Exchange: %s\n", matcher.group(6));
            System.out.format("Line number: %s\n", matcher.group(7));
        }
    }
}
