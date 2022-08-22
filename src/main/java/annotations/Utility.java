package annotations;


public class Utility {

    void doStuff() {
        System.out.println("Do smth");
    }

    @MostUsed("JS")
    void doStuff(String... arg) {
        System.out.println("Do smth " + arg);
    }

    void doStuff(int i) {
        System.out.println("Do smth " + i);
    }
}
