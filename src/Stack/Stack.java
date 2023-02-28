package Stack;

import java.util.*;

public class Stack {
    private int[] dataStore;
    private int top;

    Stack(){
        dataStore = new int[100];
        top = 0;
    }
    public void push(int element){
        this.dataStore[this.top++] = element;
    }

    public int peek(){
        return this.dataStore[this.top-1];
    }
    public int pop() {
        return this.dataStore[--this.top];
    }
    public void clear(){
        this.top = 0;
    }
    public int size(){
        return this.dataStore.length;
    }
    public boolean isEmpty(){
        if (top==0) return true;
        return false;
    }


}
