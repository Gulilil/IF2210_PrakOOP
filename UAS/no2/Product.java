public abstract class Product {
    private int id;
    private String name;
    private int price;
    private String description;

    public Product(){
        id = 0;
        name = "";
        price = 0;
        description = "";
    }

    public Product(int i, String n, int p, String d){
        id = i;
        name = n;
        price = p;
        description = d;
    }

    public abstract String getInfo();

    public void setId(int n){
        id  = n;
    }
    public void setName(String n){
        name = n;
    }
    public void setPrice(int p){
        price = p;
    }
    public void setDescription(String d){
        description = d;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public String getDescription(){
        return description;
    }
}
