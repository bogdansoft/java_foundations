package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleMatchingRegExClass {
    public static void main(String[] args) {
        String text = """
                Flinstone, Fred, 1/1/1900 
                Rubble, Barney, 2/2/1905
                Flinstone, Wilma, 3/3/1910 
                Rubble, Betty, 4/4/1915
                """;
        String regex = "(?<surname>\\w+),\\s*(?<name>\\w+),\\s*(?<birthday>\\d{1,2}/\\d{1,2}/\\d{4})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.format("Surname: %s, Name: %s, Birthdate: %s \n",
                    matcher.group("surname"),
                    matcher.group("name"),
                    matcher.group("birthday")
            );
        }
    }
}
