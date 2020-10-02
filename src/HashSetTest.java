import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class HashSetTest {

    public static void main(String[] args) {
        Set<String> hset = new HashSet<>();
        hset.add("Mango");
        hset.add("Apple");
        hset.add(" ");
        hset.add(" ");
        hset.add("Mango");
        hset.add("Guava");
        hset.add(null);
        hset.add(null);

        System.out.println(hset);
/*        System.out.println("HashSet !");
        List<String> list = hset.stream().peek(e -> System.out.println(e)).collect(Collectors.toList());*/

        Set<String> lhset = new LinkedHashSet<>();
        lhset.add("Mango");
        lhset.add("Apple");
        lhset.add("Mango");
        lhset.add("Guava");

        /*System.out.println("Linked HashSet !");
        List<String> llist = lhset.stream().peek(e -> System.out.println(e)).collect(Collectors.toList());*/

        /*for (String l:list
             ) {
            System.out.println(l);
        }*/
    }
}
