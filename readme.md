# this is simple calculator

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Hello test project!");
        Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$");
        Matcher matcher = pattern.matcher("987654rtQWERTY+_");
        System.out.println("matcher.matches() = " + matcher.matches());
    }
}
```