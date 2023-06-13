public class ElectronicsProduct extends Product implements Taxable{
    public ElectronicsProduct(String name, double price) {
        super(name, price);
    }
 
    // Override metode calculateTax()
    @Override
    public double calculateTax() {
        return price * 0.2; // Pajak khusus untuk produk elektronik
    }
 }