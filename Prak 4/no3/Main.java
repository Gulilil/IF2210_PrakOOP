public class Main{
    public static void main(String[] args){
        DaftarBelanja d = new DaftarBelanja(5);
        d.belanja(10, "kotak merah");
        d.belanja(10, 5, "di pojokan");
        d.belanja("bawang");
        d.belanja("mie", 5);
        d.belanja("nasi");
        d.belanja("roti");
        d.print();
    }
}