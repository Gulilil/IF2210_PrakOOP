
public class ElectronicProduct extends Product{
    private String warrantyPeriod;

    public ElectronicProduct(int i, String n, int p, String d, String wp){
        super(i, n, p, d);
        warrantyPeriod = wp;
    }

    public String getWarrantyPeriod(){
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(String wp){
        warrantyPeriod = wp;
    }

    @Override
    public String getInfo(){
        return getId()+": "+ getName()+" - "+getPrice()+" - "+ getWarrantyPeriod()+" - "+getDescription();
    }
}
