public class Product implements Taxable {
    protected String name;
    protected double price;
 
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
 
    public String getName() {
        return name;
    }
 
    public double getPrice() {
        return price;
    }
 
    // Metode untuk menghitung pajak
    public double calculateTax() {
        return price * 0.1;
    }
 }
