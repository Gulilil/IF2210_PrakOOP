
public class Barang {
    private String nama;
    private int amount;

    public Barang(String n, int a){
        this.nama = n;
        this.amount = a;
    }

    public String toString(){
        return this.amount + " " + this.nama;
    }
}