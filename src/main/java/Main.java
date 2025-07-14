public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService();

        long amount;
        boolean registered;

        int expected = 150;
        long actual = service.calculate(amount = 5_000, registered = true);
        System.out.println("1. " + expected + "== ? == " + actual);

        expected = 50;
        actual = service.calculate(amount = 5_000, registered = false);
        System.out.println("2. " + expected + "== ? == " + actual);

    }
}
