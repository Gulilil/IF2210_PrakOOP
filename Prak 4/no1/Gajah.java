/**
 * Gajah.java
 * [Jelaskan kegunaan class ini]
 * @author 13521116 Juan Christopher Santoso
 */
public class Gajah extends Animal {
    private int basePower;
    private int age;

    public Gajah(int bp, int a){
        this.children = 0;
        this.basePower = bp;
        this.age = a;
        this.numberOfLegs = 4;
    }
    public int getAge(){
        return this.age;
    }
    public long getAnimalPower(){
        return 3* (this.basePower + this.age+ this.children);
    }
}