sealed interface Payment {}

final class CardPayment implements Payment {
    String number = "1234-5678";
}

final class UpiPayment implements Payment {
    String id = "user@upi";
}

public class Seventh {
    public static void main(String[] args) {
        Payment myPay = new UpiPayment();
        process(myPay);
    }

    public static void process(Payment p) {
        if (p instanceof CardPayment c) {
            System.out.println("Using Card: " + c.number);
        } else if (p instanceof UpiPayment u) {
            System.out.println("Using UPI: " + u.id);
        }
    }
}