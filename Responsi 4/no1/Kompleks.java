// package no1;
import java.lang.System;
import java.util.*;

public class Kompleks {
    private static int n_kompleks = 0;
    private int real;
    private int imaginer;

    public Kompleks(){
        this.real = 0;
        this.imaginer = 0;
        n_kompleks++;
    }

    public Kompleks (int real, int imaginer){
        this.real = real;
        this.imaginer = imaginer;
        n_kompleks++;
    }

    public final int getReal() {
        return this.real;
    }

    public final int getImaginer(){
        return this.imaginer;
    }

    public void setReal(int r){
        this.real = r;
    }

    public void setImaginer(int i){
        this.imaginer = i;
    }

    public Kompleks plus (Kompleks b){
        Kompleks temp = new Kompleks();
        temp.setReal(this.real + b.getReal());
        temp.setImaginer(this.imaginer + b.getImaginer());
        return temp;
    }

    public Kompleks minus (Kompleks b){
        Kompleks temp = new Kompleks();
        temp.setReal(this.real - b.getReal());
        temp.setImaginer(this.imaginer - b.getImaginer());
        return temp;
    }

    public Kompleks multiply (Kompleks b){
        Kompleks temp = new Kompleks();
        temp.setReal(this.real*b.getReal() - this.imaginer*b.getImaginer());
        temp.setImaginer(this.imaginer*b.getReal() + this.real*b.getImaginer());
        return temp;
    }

    public Kompleks multiply(final int n){
        Kompleks temp = new Kompleks();
        temp.setReal(this.real*n);
        temp.setImaginer(this.imaginer*n);
        return temp;
    }

    public Kompleks multiply(final int n, Kompleks k){
        return k.multiply(n);
    }

    public static int countKompleksInstance(){
        return n_kompleks;
    }

    public void print(){
        if (this.imaginer == 0 && this.real == 0){
            System.out.print(0);
        }
        if (this.real != 0){
            System.out.print(this.real);
        }
        if(this.imaginer != 0){
            if (this.imaginer > 0 && this.real !=0){
                System.out.print("+");
            }
            System.out.print(this.imaginer);
            System.out.print("i");
        }
        System.out.println();
    }

}