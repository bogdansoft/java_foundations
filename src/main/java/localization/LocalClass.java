package localization;

import java.util.Locale;

public class LocalClass {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println(locale);

        Locale locale1 = new Locale.Builder()
                .setLanguage("de")
                .setRegion("DE")
                .build();
        System.out.println(locale1);
    }
}
