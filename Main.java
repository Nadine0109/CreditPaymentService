public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double monthlyPayment1Year = service.calculate (1_000_000, 12);
        System.out.println(monthlyPayment1Year);

        double monthlyPayment2Years = service.calculate (1_000_000, 24);
        System.out.println(monthlyPayment2Years);

        double monthlyPayment3Years = service.calculate (1_000_000, 36);
        System.out.println(monthlyPayment3Years);

    }
}
