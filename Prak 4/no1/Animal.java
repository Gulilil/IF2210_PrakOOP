/**
 * Animal.java
 * [Jelaskan kegunaan class ini]
 * @author 13521116 Juan Christopher
 */
public abstract class Animal implements Comparable<Animal> {
    protected int numberOfLegs;
    protected long children;

    public int getNumberOfLegs(){
        return this.numberOfLegs;
    }
    public long getNumberOfChildren(){
        return this.children;
    }
    public void increaseChild(int n){
        this.children += n;
    }
    abstract long getAnimalPower();
    public int compareTo(Animal a) {
    // compareTo mengembalikan:
    // 0 bila this sama dengan m
    // 1 bila this lebih dari m
    // -1 bila this kurang dari m
        if(this.getAnimalPower() == a.getAnimalPower()){
            return 0;
        } else if (this.getAnimalPower() > a.getAnimalPower()){
            return 1;
        } else {
            return -1;
        }
    
    }
}
