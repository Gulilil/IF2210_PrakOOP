public class Order implements PaymentProcessor{
    private ShoppingCart shoppingCart;
 
 
    public Order(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
    
    public void processPaymentWithDebitCard(double amount) {
        // Process payment logic
        System.out.println("Payment processed successfully with debit card: $" + amount);
    }
 
    public void processPaymentWithCreditCard(double amount) {
        // Process payment logic
        System.out.println("Payment processed successfully with credit card: $" + amount);
    }
 
    public void processPaymentWithCash(double amount) {
        // Process payment logic
        System.out.println("Payment processed successfully with cash: $" + amount);
    }
 
    public void checkout(String checkoutMethod) {
        double totalPrice = shoppingCart.calculateTotalPrice();
        if (checkoutMethod.equalsIgnoreCase("Cash")) {
            processPaymentWithCash(totalPrice);
        } else if (checkoutMethod.equalsIgnoreCase("CreditCard")) {
            processPaymentWithCreditCard(totalPrice);
        } else if (checkoutMethod.equalsIgnoreCase("DebitCard")) {
            processPaymentWithDebitCard(totalPrice);
        } else {
            throw new IllegalArgumentException("Invalid payment method.");
        }
    }
 }
 