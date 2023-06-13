
public class FashionProduct extends Product {
    private String size;

    public FashionProduct(int i, String n, int p, String d, String size){
        super(i, n, p, d);
        this.size = size;
    }

    public String getSize(){
        return size;
    }

    public void setSize(String s){
        size = s;
    }

    @Override
    public String getInfo(){
        return getId()+": "+ getName()+" - "+getPrice()+" - "+ getSize()+" - "+getDescription();
    }
}
