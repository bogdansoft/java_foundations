package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParsingTextDocClass {
    public static void main(String[] args) {
        String transcript = """
                Student Number:	1234598872			Grade:		11
                Birthdate:		01/02/2000			Gender:	M
                State ID:		8923827123
                                
                Cumulative GPA (Weighted)		3.82
                Cumulative GPA (Unweighted)	3.46    
                """;

        String regex = """
                Student\\sNumber:\\s(?<studentNumber>\\d{10}).* # Grab student number
                Grade:\\s+(?<grade>\\d{1,2}).* # Grab grade
                Birthdate:\\s+(?<birthmonth>\\d{2})/(?<birthday>\\d{2})/(?<birthyear>\\d{4}).* # Grab birthdate
                Gender:\\s(?<gender>\\w).* # Grab gender
                State\\sID:\\s+(?<state>\\d{10}).* # Grab state
                Cumulative\\sGPA\\s\\(Weighted\\)\\s+(?<weighted>\\d[.]\\d{2}).* # Grab weighted
                Cumulative\\sGPA\\s\\(Unweighted\\)\\s+(?<unweighted>\\d[.]\\d{2}).* # Grab unweighted
                """;

        Pattern pattern = Pattern.compile(regex, Pattern.DOTALL | Pattern.COMMENTS);
        Matcher matcher = pattern.matcher(transcript);

        if (matcher.matches()) {
            System.out.format("Student Number: %s\n", matcher.group("studentNumber"));
            System.out.format("Grade: %s\n", matcher.group("grade"));
            System.out.format("Birthdate: %s/%s/%s\n", matcher.group("birthmonth"),
                    matcher.group("birthday"),
                    matcher.group("birthyear"));
            System.out.format("Gender: %s\n", matcher.group("gender"));
            System.out.format("State ID: %s\n", matcher.group("state"));
            System.out.format("Cumulative GPA (Weighted) %s\n", matcher.group("weighted"));
            System.out.format("Cumulative GPA (Unweighted) %s\n", matcher.group("unweighted"));
        }
    }
}
