
public class driver {
    
    public static void main (String[] args) {
        Mahasiswa m = new Mahasiswa(13521116, 3.84);
        MahasiswaDecoder md = new MahasiswaDecoder(m);

        md.addMatkul("OS");
        System.out.println(md.getIPK()); 
        System.out.println(md.getNIM()); 
        
    }
}
