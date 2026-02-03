import java.util.List;
import java.util.function.Predicate;

public class Fourth {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(-10, -5, 0, 2, 4, 7, 10, 15);

        Predicate<Integer> isPositive = n -> n > 0;
        Predicate<Integer> isEven = n -> n % 2 == 0;

        Predicate<Integer> isPositiveEven = isPositive.and(isEven);

        numbers.stream()
                .filter(isPositiveEven)
                .forEach(System.out::println);

    }
}