package Tree;
import java.util.*;

public class MaxHeap {
    int heapSize;

    void buildMaxHeap(int[] dataStore){
        heapSize = dataStore.length;
        for (int index = (heapSize/2); index>=0; index--) maxHeapify(dataStore, index);
    }

    void maxHeapify (int[] dataStore, int index) {
        int left = 2*index+1;
        int right = 2*index+2;
        int largest = index;
        if (left<heapSize && dataStore[left]>dataStore[largest]) largest = left;
        if (right<heapSize && dataStore[right]>dataStore[largest]) largest = right;
        if (largest!=index) {
            int temp = dataStore[index];
            dataStore[index] = dataStore[largest];
            dataStore[largest] = temp;
            maxHeapify(dataStore, largest);
        }
    }
    int extractMax (int[] dataStore) {
        if (heapSize<0) System.out.println("underflow");
        int max = dataStore[0];
        dataStore[0] = dataStore[heapSize-1];
        heapSize--;
        maxHeapify(dataStore, 0);
        return max;
    }

    void increaseKey (int[] dataStore, int index, int key) {
        if (key<dataStore[index]) System.out.println("error");
        dataStore[index] = key;
        while (index>=0 && dataStore[(index-1)/2]<dataStore[index]){
            int temp = dataStore[(index-1)/2];
            dataStore[(index-1)/2] = dataStore[index];
            index = (index-1)/2;
        }
    }
    void print_heap(int a[]) {
        for(int i=0;i<heapSize;i++)
            System.out.println(a[i]+" ");
    }
}
