import java.util.Optional;

record Users(String name, boolean isActive) {}

public class Fifth {
    public static void main(String[] args) {
        String targetId = "user123";

        findUser(targetId)
                .filter(Users::isActive)
                .map(Users::name)
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("User not found")
                );
    }

    static Optional<Users> findUser(String id) {
        if ("user123".equals(id)) {
            return Optional.of(new Users("Ansh", false));
        }
        return Optional.empty();
    }
}