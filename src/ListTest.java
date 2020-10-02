import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTest {

//    static List<String> list = Collections.synchronizedList(new ArrayList<>());
    static List<String> list = new ArrayList<>();

    public static void main(String[] args){
        listMethod();
    }

    private static void listMethod() {
        list.add("apple");
        list.add("mango");
        list.add(" ");
        list.add(" ");
        list.add("apple");

        list.forEach(System.out::println);
    }
}
