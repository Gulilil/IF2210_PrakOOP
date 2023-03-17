// package no3;

public class TempatTinggal {
    protected int luas;
    protected double hargaBahanBangunan;

    public TempatTinggal(){
        this.luas = 0;
        this.hargaBahanBangunan = 0;
    }

    public TempatTinggal(int l, double hbb){
        this.luas = l;
        this.hargaBahanBangunan = hbb;
    }
    public int getLuas(){
        return this.luas;
    }
    public double getHargaBahanBangunan(){
        return this.hargaBahanBangunan;
    }
    public void setLuas(int l){
        this.luas = l;
    }
    public void setHargaBahanBangunan(double hbb) {
        this.hargaBahanBangunan = hbb;
    }
    public double hitungBiayaBangun(){
        return luas * hargaBahanBangunan;
    }
}

class Rumah extends TempatTinggal{

    public Rumah(int l, double hbb){
        this.luas = l;
        this.hargaBahanBangunan = hbb;
    }
    public Rumah(int lebar, int panjang, double hbb){
        this.luas = lebar*panjang;
        this.hargaBahanBangunan = hbb;
    }

    public int getLuas() {
        return this.luas;
    }
    public double getHargaBahanBangunan(){
        return this.hargaBahanBangunan;
    }
    public void setLuas(int l) {
        this.luas = l;
    }
    public void setLuas(int lebar, int panjang){
        this.luas = lebar*panjang;
    }
    public void setHargaBahanBangunan(double hbb){
        this.hargaBahanBangunan = hbb;
    }
    public double hitungBiayaBangun() {
        return this.luas * this.hargaBahanBangunan;
    }
    public double hitungBiayaBangun(double biayaOrmas){
        return (this.luas * this.hargaBahanBangunan) + biayaOrmas;
    }
}

interface Kendaraan {
    public float hitungJarakTempuh();
}

class Karavan extends TempatTinggal implements Kendaraan {
    private float bensin;
    private float pemakaianBensin;

    public void setBensin(float b){
        this.bensin = b;
    }
    public void setPemakaianBensin(float pb){
        this.pemakaianBensin = pb;
    }
    public float getBensin(){
        return this.bensin;
    }
    public float getPemakaianBensin(){
        return this.pemakaianBensin;
    }
    public void setLuas (int lebar , int panjang){
        this.luas = lebar*panjang;
    }
    public void setLuas(int l) {
        this.luas = l;
    }
    public void setHargaBahanBangunan(double hbb){
        this.hargaBahanBangunan = hbb;
    }
    public int getLuas(){
        return this.luas;
    }
    public double getHargaBahanBangunan(){
        return this.hargaBahanBangunan;
    }

    public double hitungBiayaBangun() {
        return this.luas * this.hargaBahanBangunan * 3;
    }
    public float hitungJarakTempuh() {
        return this.bensin * this.pemakaianBensin;
    }
}
