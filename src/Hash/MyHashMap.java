package Hash;
import java.util.*;
public class MyHashMap {
    static void check(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i<str.length(); i++) {
            char character = str.charAt(i);
            if (!map.containsKey(character)) map.put(character,1);
            else map.put(character, map.get(character)+1);
        }
        for (Object next : map.keySet()) {
            System.out.println("count of " + next + " : " + map.get(next));
        }
    }
    public static void main(String[] args)
    {
        String s="hello";
        check(s);
    }

}
