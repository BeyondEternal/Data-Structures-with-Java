package Stack;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Stack s=new Stack();
        Scanner in= new Scanner(System.in);

        do
        {System.out.println("\n******** MENU *******");
            System.out.println("\n1.PUSH");
            System.out.println("\n2.POP");
            System.out.println("\n3.PEEK");
            System.out.println("\n4.IS EMPTY");
            System.out.println("\n5.EXIT");
            System.out.println("\n enter your choice : ");
            switch (in.nextInt()) {
                case 1 -> {
                    System.out.println("\nenter the value ");
                    s.push(in.nextInt());
                }
                case 2 -> System.out.println("\n popped element : " + s.pop());
                case 3 -> System.out.println("\n top element : " + s.peek());
                case 4 -> System.out.println("\n is empty : " + s.isEmpty());
                case 5 -> System.exit(0);
                default -> System.out.println("\n Wrong Choice!");
            }
            System.out.println("\n do you want to continue? 1 = yes / 2 = no ");
        }while(in.nextInt()==1);
    }

}
