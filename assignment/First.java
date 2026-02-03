interface NotificationService {
    void send(String message);

    default void sendWithRetry(String message, int retries) {
        for (int i = 1; i <= retries; i++) {
            try {
                send(message);
                return;
            } catch (Exception e) {
                System.out.println("Attempt " + i + " failed.");
            }
        }
    }
}

public class First {
    public static void main(String[] args) {
        // Simple lambda implementation of 'send'
        NotificationService service = (msg) -> {
            if (Math.random() > 0.5) throw new RuntimeException();
            System.out.println("Sent: " + msg);
        };

        service.sendWithRetry("Quick Test", 3);
    }
}