import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Hello test project!");
        int a = 1;
        int b = 2;
        int c = a + b;
        System.out.println(c);
        Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$");
        Matcher matcher = pattern.matcher("987654rtQWERTY+_");
        System.out.println("matcher.matches() = " + matcher.matches());


    }
}