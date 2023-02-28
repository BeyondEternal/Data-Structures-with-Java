package Stack;

import LinkedList.LinkedList;

import java.util.Scanner;

public class DemoWithLinkedList {
    public static void main(String[] args) {
        StackWithLinkedList s=new StackWithLinkedList();
        LinkedList head=null;
        Scanner in=new Scanner(System.in);

        do
        {System.out.println("\n******** MENU *******");
            System.out.println("\n1.PUSH");
            System.out.println("\n2.POP");
            System.out.println("\n3.PEEK");
            System.out.println("\n4 IS EMPTY");
            System.out.println("\n5 DISPLAY");
            System.out.println("\n6.EXIT");
            System.out.println("\n enter ur choice : ");
            switch (in.nextInt()) {
                case 1 -> {
                    System.out.println("\nenter the value ");
                    head = s.push(in.nextInt(), head);
                }
                case 2 -> head = s.pop(head);
                case 3 -> System.out.println("\n top element : " + s.peek(head));
                case 4 -> System.out.println("\n is empty : " + s.isEmpty(head));
                case 5 -> s.display(head);
                case 6 -> System.exit(0);
                default -> System.out.println("\n Wrong Choice!");
            }
            System.out.println("\n do u want to cont... ");
        }while(in.nextInt()==1);

    }
}
