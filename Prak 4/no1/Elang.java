/**
 * Elang.java
 * [Jelaskan kegunaan class ini]
 * @author [NIM] [Nama]
 */
public class Elang extends Animal {
    private int basePower;
    private int jumlahTelur;

    public Elang(int bp) {
        this.children = 0;
        this.basePower = bp;
        this.numberOfLegs = 2;
        this.jumlahTelur = 0;
    }

    public int getJumlahTelur() {
        return this.jumlahTelur;
    }
    public void bertelur(){
        this.jumlahTelur++;
    }
    public long getAnimalPower() {
        return this.basePower * this.children - this.jumlahTelur;
    }
}
