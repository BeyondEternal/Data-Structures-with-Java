package Hash;
import java.util.*;
public class MyHashMap {
    static void check(String str){
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i<str.length(); i++) {
            char character = str.charAt(i);
            if (!map.containsKey(character)) map.put(character,1);
            else map.put(character, map.get(character)+1);
        }
        Iterator<Character> itr = map.keySet().iterator();
        while (itr.hasNext()){
            Object next = itr.next();
            System.out.println("count of "+ next + " : " + map.get(next));
        }
    }
    public static void main(String[] args)
    {
        String s="hello";
        check(s);
    }

}
