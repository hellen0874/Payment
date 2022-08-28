public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int loanTerm = 24;
        int loanAmount = 1000000;
        double interestRate = 9.99;
        double monthlyPayment = service.howMuchToPay(loanTerm, loanAmount, interestRate);
        System.out.println(monthlyPayment);
    }
}
