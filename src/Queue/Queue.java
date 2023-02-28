package Queue;
import java.util.*;

public class Queue {
    private int[] dataStore;
    private int front, back;

    Queue(){
        dataStore = new int[100];
        front = back = 0;
    }
    public void enqueue(int element){
        if (!this.isFull()) dataStore[++back]=element;
        else System.out.println("Overflow");
    }
    public int dequeue(){
        if (!this.isEmpty()) return dataStore[front++];
        else System.out.println("Underflow");
        return -1;
    }
    public boolean isFull() {
        if (back == dataStore.length-1) return true;
        return false;
    }
    public boolean isEmpty(){
        if (back==0) return true;
        return false;
    }
    public int getFront(){
        return front;
    }
    public int getBack() {
        return back;
    }
    public void display()
    {
        for(int i=front+1;i<=back;i++)
            System.out.print(dataStore[i]+" ");

        System.out.println();


    }

}
