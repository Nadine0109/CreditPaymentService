public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double monthlyPaymentOneYear = service.calculate(1_000_000, 12);
        System.out.println(monthlyPaymentOneYear);

        double monthlyPaymentTwoYears = service.calculate(1_000_000, 24);
        System.out.println(monthlyPaymentTwoYears);

        double monthlyPaymentThreeYears = service.calculate(1_000_000, 36);
        System.out.println(monthlyPaymentThreeYears);

    }
}
