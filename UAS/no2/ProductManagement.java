import java.util.*;

public interface ProductManagement {
    public void addProduct(Product p);
    public Product removeProduct(int id);
    public void updateProduct (int id, String name, int price, String description);
    public List<Product> getAllProduct();
    public Product getProduct(int id);
}
