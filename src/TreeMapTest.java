import java.util.*;

public class TreeMapTest {
    public static void main(String[] args){
        singleValue();
//        multipleValue();
    }

    private static void singleValue() {
        Map<Integer, String> hmap = new TreeMap<>();
        hmap.put(3,"Mango");
        hmap.put(2,"Apple");
        hmap.put(1,"he");

        /*for (int i:hmap.keySet()
             ) {
            System.out.println(hmap.get(i));
        }*/

        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry mentry = (Map.Entry) iterator.next();
            System.out.println("Key is " + mentry.getKey() + " & Value is " + mentry.getValue());
        }
    }
}
