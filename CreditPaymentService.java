public class CreditPaymentService {
    public double calculate(double creditSum, double time) {
        double annualPercent = 9.99;
        double monthlyPercent = annualPercent / 12 / 100;
        double annuityCoefficient = monthlyPercent * Math.pow(1 + monthlyPercent, time) / ((Math.pow(1 + monthlyPercent, time)) - 1);
        double monthlyPayment = annuityCoefficient * creditSum;

        return monthlyPayment;
    }
}
