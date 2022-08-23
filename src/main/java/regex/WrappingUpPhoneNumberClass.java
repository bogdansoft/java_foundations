package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WrappingUpPhoneNumberClass {
    public static void main(String[] args) {
        String regex = """
                # This is my regex expression
                (?:\\(?(?<countryCode>\\d{3})[-.,)\\s]*)* # Gets country code
                (?:(?<areaCode>\\d{3})[-.,\\s]?) # Gets area code
                (?:(?<exchange>\\d{3,})[-.,\\s]?) # Gets exchange
                """;
        String phoneNumber = "(523) 343-3732";

        System.out.println(phoneNumber.matches(regex));//true

        Pattern pattern = Pattern.compile(regex, Pattern.COMMENTS);
        Matcher matcher = pattern.matcher(phoneNumber);

        if (matcher.matches()) {
            System.out.format("Country code: %s\n", matcher.group("countryCode"));
            System.out.format("Area code: %s\n", matcher.group("areaCode"));
            System.out.format("Exchange: %s\n", matcher.group("exchange"));
        }
    }
}
