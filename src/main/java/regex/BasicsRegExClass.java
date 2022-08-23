package regex;

public class BasicsRegExClass {
    public static void main(String[] args) {
        System.out.println("w");
        System.out.println("Lat".matches("\\wat"));//true; w - a-z, A-Z, 0-9, including _ (underscore)
        System.out.println("---------------------------------------------");

        System.out.println("d");
        System.out.println("5at".matches("\\dat"));//true; d - match any number from 0 to 9
        System.out.println("---------------------------------------------");

        System.out.println("Phone number");
        System.out.println("523-34-433".matches("\\d\\d\\d-\\d\\d-\\d\\d\\d"));//true
        System.out.println("523-34-433".matches("\\d{3}-\\d{2}-\\d{3}"));//true
        System.out.println("---------------------------------------------");

        System.out.println("IP number");
        System.out.println("523.34.433".matches("\\d{3}[-.]\\d{2}[-.]\\d{3}"));//true
        System.out.println("523-34-433".matches("\\d{3}[-.]\\d{2}[-.]\\d{3}"));//true
        System.out.println("523,34,433".matches("\\d{3}[-.,]\\d{2}[-.,]\\d{3}"));//true
        System.out.println("523 34 433".matches("\\d{3}[-., ]\\d{2}[-., ]\\d{3}"));//true
        System.out.println("523 34 433".matches("\\d{3}[-.,\\s]\\d{2}[-.,\\s]\\d{3}"));//true
        System.out.println("---------------------------------------------");

        System.out.println("Separators");
        System.out.println("523    34 433".matches("\\d{3}[-.,\\s]+\\d{2}[-.,\\s]\\d{3}"));//true; + - means 1 or more
        System.out.println("523    34433".matches("\\d{3}[-.,\\s]*\\d{2}[-.,\\s]*\\d{3}"));//true; * - means 0 or more
        System.out.println("523 34433".matches("\\d{3}[-.,\\s]?\\d{2}[-.,\\s]?\\d{3}"));//true; ? - means 0 or 1
        System.out.println("523 34 4332345".matches("\\d{3}[-.,\\s]?\\d{2}[-.,\\s]?\\d{3,}"));//true; 3, - means 3 or more numbers
        System.out.println("---------------------------------------------");

        System.out.println("Duplication of patterns");
        System.out.println("523 343 4332434".matches("(\\d{3}[-.,\\s]?){2}\\d{4,}"));//true; (){n} - means n times duplicate pattern
        System.out.println("523 343 343 43334".matches("(\\d{3}[-.,\\s]?){3}\\d{4,}"));//true
        System.out.println("24324.523 343 343 43334".matches("(\\d{3,}[-.,\\s]*)*(\\d{3}[-.,\\s]?){3}\\d{4,}"));//true
        System.out.println("---------------------------------------------");
    }
}
