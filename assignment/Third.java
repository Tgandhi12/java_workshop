import java.util.List;

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
}

public class Third {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User("Tanishq", 22),
                new User("Ansh", 17),
                new User("Priyanshu", 25),
                new User("Akash", 40)
        );

        List<String> result = users.stream()
                .filter(u -> u.getAge() >= 18)
                .map(User::getName)
                .map(String::toUpperCase)
                .sorted()
                .toList();

        System.out.println(result);
    }
}