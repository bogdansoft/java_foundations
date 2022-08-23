package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NamedCaptureGroupsRegExClass {
    public static void main(String[] args) {
        String regex = "(?:(?<countryCode>\\d{1,2})[-.,\\s]?)?(?:(?<areaCode>\\d{3})[-.,\\s]?)(?:(?<exchange>\\d{3})[-.,\\s]?)(?<line>\\d{4})";
        String phoneNumber = "24.523.343.3432";

        System.out.println(phoneNumber.matches(regex));//true

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);

        if (matcher.matches()) {
            System.out.format("Country code: %s\n", matcher.group("countryCode"));
            System.out.format("Area code: %s\n", matcher.group("areaCode"));
            System.out.format("Exchange: %s\n", matcher.group("exchange"));
            System.out.format("Line number: %s\n", matcher.group("line"));
        }
    }
}

