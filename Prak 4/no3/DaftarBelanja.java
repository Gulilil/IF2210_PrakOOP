public class DaftarBelanja{
    private Barang[] listBelanja;
    private int neff;
    private int size;

    public DaftarBelanja(int max){
        this.listBelanja= new Barang[max];
        this.neff = 0;
        this.size = max;
    }

    public void belanja(int lorong, String keterangan){
        if (neff < size){
            String tempNama = keterangan + " (lorong " + lorong + ")";
            Barang temp = new Barang(tempNama,1);
            listBelanja[neff] = temp;
            neff++;
        }
    }

    public void belanja(int lorong, int qty, String keterangan){
        if (neff < size){
            String tempNama = keterangan + " (lorong " + lorong + ")";
            Barang temp = new Barang(tempNama,qty);
            listBelanja[neff] = temp;
            neff++;
        }
    }
    public void belanja(String barang){
        if (neff < size){
            Barang temp = new Barang(barang,1);
            listBelanja[neff] = temp;
            neff++;
        }

    }

    public void belanja(String barang, int qty){
        if (neff < size){
            Barang temp = new Barang(barang, qty);
            listBelanja[neff] = temp;
            neff++;
        }
    }
    public void print(){
        for (int i =0 ; i < this.neff; i++){
            System.out.printf("%d. %s\n", (i+1), listBelanja[i].toString());
            // System.print.out(i+1);
            // System.print.out(". ");
            // System.print.outln(listBelanja[i].toString());
        }
    }

}