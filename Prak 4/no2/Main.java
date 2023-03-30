public class Main {
    public static void main(String[] args){
        DebitCard dc = new DebitCard();
        CreditCard cc = new CreditCard(1000, 1000);
        cc.pay(50);
        cc.endBillingCycle();
        cc.pay(50);
        cc.payOffBalance(75);
        System.out.println(cc.getMonthlyBalance());
        System.out.println(cc.getUnpaidBalance());
    }
}