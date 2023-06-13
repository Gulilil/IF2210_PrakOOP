
public class FoodProduct extends Product{
    private String expiryDate;

    public FoodProduct(int i, String n, int p, String d, String ed){
        super(i, n, p, d);
        expiryDate = ed;
    }

    public String getExpiryDate(){
        return expiryDate;
    }

    public void setExpiryDate(String ed){
        expiryDate = ed;
    }
    
    @Override
    public String getInfo(){
        return getId()+": "+ getName()+" - "+getPrice()+" - "+ getExpiryDate()+" - "+getDescription();
    }
}
