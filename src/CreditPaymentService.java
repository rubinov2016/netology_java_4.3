public class CreditPaymentService {
    public double calculate(double interest, int maturityYear, long amount) {
        double monthlyInterest = interest / 12;
        double monthlyAnnuity = monthlyInterest / (1 - Math.pow(1 + monthlyInterest, -maturityYear * 12)) * amount;
        return monthlyAnnuity;
    }
}
