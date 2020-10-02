import java.util.*;

public class HashMapTest {
    public static void main(String[] args){
//        singleValue();
        multipleValue();
    }

    private static void multipleValue() {
        List<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Apple");

        Map<Integer, List<String>> hmap = new HashMap<>();
        hmap.put(1, list);
        hmap.put(2, Arrays.asList("Car", "Van", "Bike"));

        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry mentry = (Map.Entry) iterator.next();
            System.out.println("Key is " + mentry.getKey() + " & Value is " + mentry.getValue());
        }

        // iterate and display values
        System.out.println("Fetching Keys and corresponding [Multiple] Values n");
        for (Map.Entry<Integer, List<String>> entry : hmap.entrySet()) {
            int key = entry.getKey();
            List<String> values = entry.getValue();
            System.out.println("Key = " + key);
            System.out.println("Values = " + values + "n");
        }
    }

    private static void singleValue(){
        Map<Integer, String> hmap = new HashMap<>();
        hmap.put(1,"Mango");
        hmap.put(2,"Apple");
        hmap.put(3,"he");

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
