package Hash;
import java.util.*;

public class MyHashSet {
    static boolean isUnique(String s)
    {
        HashSet<Character> set =new HashSet<Character>();

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c==' ')
                continue;
            if(!set.add(c))
                return false;

        }

        return true;
    }


    public static void main(String[] args)
    {
        String s="helo wqty ";
        boolean ans=isUnique(s);
        if(ans)
            System.out.println("string has unique characters");
        else
            System.out.println("string does not have unique characters");



    }
}
