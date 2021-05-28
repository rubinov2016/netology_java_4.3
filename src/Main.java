public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double interest = 9.99 / 100;       //процентная ставка
        long amount = 1_000_000;            //размер кредита до 2 млрд руб

        int maturityYear = 1;           //срок кредита в годах
        double monthlyAnnuity = service.calculate(interest, maturityYear, amount); //итоговый ежемесячный платеж
        System.out.printf("%.0f%n", monthlyAnnuity);

        maturityYear = 2;
        monthlyAnnuity = service.calculate(interest, maturityYear, amount);
        System.out.printf("%.0f%n", monthlyAnnuity);

        maturityYear = 3;
        monthlyAnnuity = service.calculate(interest, maturityYear, amount);
        System.out.printf("%.0f%n", monthlyAnnuity);
    }
}
