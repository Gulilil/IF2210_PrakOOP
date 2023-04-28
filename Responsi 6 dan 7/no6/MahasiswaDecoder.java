import java.lang.reflect.*;

public class MahasiswaDecoder {
    private Mahasiswa ms;

  MahasiswaDecoder(Mahasiswa mahasiswa) {
    this.ms = mahasiswa;
  }

  public void addMatkul(String name) throws Exception {
    Method addMatkul = this.ms.getClass().getDeclaredMethod("addMatkul", String.class);
    addMatkul.setAccessible(true);
    addMatkul.invoke(ms, name);
  }



  public int getNIM() throws Exception {
    Field NIM = this.ms.getClass().getDeclaredField("NIM");
    NIM.setAccessible(true);
    return ((Integer) NIM.get(ms)).intValue();
  }



  public double getIPK() throws Exception {
    Field IPK = this.ms.getClass().getDeclaredField("IPK");
    IPK.setAccessible(true);
    return ((Double) IPK.get(ms)).doubleValue();
  }

}