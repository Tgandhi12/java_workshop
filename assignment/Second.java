@FunctionalInterface
interface StringValidator {
    boolean check(String s);
}

public class Second {
    public static void main(String[] args) {
        String input = "Java17";

        validate(input, s -> !s.isEmpty());

        validate(input, s -> s.length() > 5);

        validate(input, s -> Character.isUpperCase(s.charAt(0)));
    }

    static void validate(String val, StringValidator validator) {
        System.out.println("Input: " + val + " | Result: " + validator.check(val));
    }
}