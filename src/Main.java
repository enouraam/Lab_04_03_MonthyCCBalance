public class Main {
    public static void main(String[] args) {
        double balance = 5000;
        double INTEREST_RATE = .17;
        double oneMonth = balance * INTEREST_RATE;
        double twoMonth = (balance + oneMonth) * INTEREST_RATE;

        System.out.println("your interest due after one month "+oneMonth);
        System.out.println("your interest due after two months "+twoMonth);
    }
}