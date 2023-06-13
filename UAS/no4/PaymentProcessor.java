public interface PaymentProcessor {
    public void processPaymentWithDebitCard(double amount);
    public void processPaymentWithCreditCard(double amount);
    public void processPaymentWithCash(double amount);
 }
 