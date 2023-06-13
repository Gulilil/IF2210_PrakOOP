import java.util.*;

public class ProductCatalog implements ProductManagement{
    private List<Product> productList;

    public ProductCatalog(){
        productList = new ArrayList<>();
    }

    public ProductCatalog(List<Product> list){
        productList = list;
    }

    public int getIndexInListById(int id){
        int count = 0;
        for(Product p : productList){
            if (p.getId() == id){
                return count;
            }
            count++;
        }
        return -1;
    }

    @Override
    public void addProduct(Product p){
        productList.add(p);
    }
    @Override
    public Product removeProduct(int id){
        int foundIdx = getIndexInListById(id);
        if (foundIdx != -1){
            Product temp = productList.get(foundIdx);
            productList.remove(foundIdx);
            return temp;
        } else {
            return null;
        }
    }
    @Override
    public void updateProduct (int id, String name, int price, String description){
        int foundIdx = getIndexInListById(id);
        if (foundIdx != -1){
            Product temp = productList.get(foundIdx);
            temp.setName(name);
            temp.setPrice(price);
            temp.setDescription(description);
        } else {
            System.out.println("Product dengan id "+id+" tidak ditemukan"); // ati ati titik disini
        }
    }
    @Override
    public List<Product> getAllProduct(){
        return productList;
    }
    @Override
    public Product getProduct(int id){
        for(Product p : productList){
            if (p.getId() == id){
                return p;
            }
        }
        return null;
    }

    public static void main(String[] args){
        ProductCatalog pc = new ProductCatalog();
        pc.addProduct(new ElectronicProduct(0, "hehe", 1000, "ini deskripsi", "sampe sini"));
        System.out.println(pc.getProduct(0).getName());
    }
}
