import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class TreeSetTest {
    public static void main(String[] args){
        Set<String> tset = new TreeSet<>();
        tset.add("Mango");
        tset.add("Apple");
        tset.add(" ");
        tset.add("Mango");
        tset.add("Guava");
        System.out.println(tset);

        /*tset.forEach(System.out::println);
        tset.stream().map(e -> e.toUpperCase()).peek(e -> System.out.println(e)).collect(Collectors.toList());*/
    }
}
