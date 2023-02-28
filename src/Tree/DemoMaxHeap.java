package Tree;

import java.util.Scanner;

public class DemoMaxHeap {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];

        System.out.println("enter the elements of array");

        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        MaxHeap ob=new MaxHeap();

        ob.buildMaxHeap(a);
        ob.print_heap(a);


        System.out.println("maximum element is : "+ob.extractMax(a));
        ob.print_heap(a);
        System.out.println("maximum element is : "+ob.extractMax(a));
        ob.increaseKey(a,6,800);
        ob.print_heap(a);
    }
}
