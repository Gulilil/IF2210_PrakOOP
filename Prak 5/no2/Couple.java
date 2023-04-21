class Couple <K, V> {
    private K key;
    private V value;

    public Couple (K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey(){
        return this.key;
    }

    public V getVal(){
        return this.value;
    }

    public void setKey(K k){
        this.key = k;
    }

    public void setVal(V v){
        this.value = v;
    }

    public boolean isEqual(Couple c){
        return this.key == c.getKey() && this.value == c.getVal();
    }

    public int nearEQ(Couple couple){
        int res = 0;
        if (this.key == couple.getKey()){
            res +=1;
        }
        if (this.value == couple.getVal()){
            res +=2;
        }
        return res;
    }
}