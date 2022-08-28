public class CreditPaymentService {
    public double howMuchToPay (double period, int amount, double iR) {
        double mRate = iR / 12 / 100; // привести проц.ставку из годового значения к месячному
        double mPayment = amount * (mRate * Math.pow(1 + mRate, period)) / (Math.pow(1 + mRate, period) - 1);
        return mPayment;
    }
}
 // Math.pow(100+iR, 1.0/12)-1;