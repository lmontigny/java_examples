import java.util.*;
public class Main {

    public static void main(String[] args) {

        // hashset = no duplicate
        String[] things = {"apples", "bob", "bacon", "bob"};
        List<String> list = Arrays.asList(things);

        System.out.printf("%s ", list);
        System.out.println();

        Set<String> set = new HashSet<String>(list);
        System.out.printf("%s ", set);
        }
    }

