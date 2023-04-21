

import java.util.ArrayList;

public class Queue<T> {

  private ArrayList<T> data;

  private int lastElmIdx, size;

  private final static int DEFAULT_QUEUE_SIZE = 500;



//Instantiate dengan size default

  public Queue() {
    this.lastElmIdx = -1;
    this.size = DEFAULT_QUEUE_SIZE;
    this.data = new ArrayList<T> ();
  }

//Instantiate dengan size = n

  public Queue(int n){
    this.lastElmIdx = -1;
    this.size = n;
    this.data = new ArrayList<T> ();
  }

//Copy queue

  public Queue(final Queue<T> q){
    this.lastElmIdx = q.lastElmIdx;
    this.size = q.size;
    this.data = new ArrayList<T> ();
    for (int i = 0; i <= q.lastElmIdx; i++){
        this.data.add(q.data.get(i));
    }
  }

  public void push(T t){
    if (this.lastElmIdx < this.size){
        this.data.add(t);
        this.lastElmIdx++;
    }
  }

  public T pop(){
    T res = this.data.get(0);
    this.data.remove(0);
    this.lastElmIdx--;
    return res;
  }

  public boolean isEmpty(){
    return this.lastElmIdx == -1;
  }

  public boolean isFull(){
    return this.lastElmIdx == this.size-1;
  }

  public void display(){
    for (int i=0; i <= this.lastElmIdx; i++){
        System.out.println(this.data.get(i));
    }
  }

  public static void main (String[] args){
    Queue<Integer> q = new Queue<Integer>(3);
    System.out.println(q.isEmpty());
    q.push(30);
    q.push(40);
    q.push(50);
    System.out.println(q.isFull());
    System.out.println("Pop: " + q.pop());
    q.display();

    Queue<Integer> q2 = new Queue<Integer>(q);
    System.out.println(q2.lastElmIdx);
    System.out.println(q2.data.size());
    q2.display();
  }
}