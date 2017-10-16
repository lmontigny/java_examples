import java.lang.reflect.Array;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // create array and convert to list
        Character[] ray = {'p','w','n'};
        List<Character> l = Arrays.asList(ray);
        System.out.println("List is: ");
        output(l);

        // reverse
        Collections.reverse(l);
        System.out.println("after reverse");
        output(l);

        // create new array and new list
        Character[] newRay = new Character[3];
        List<Character> listCopy = Arrays.asList(newRay);

        Collections.copy(listCopy,l);
        System.out.println("Copy of a list");
        output(listCopy);

        Collections.fill(l, 'X');
        System.out.println("after filling the list: ");
        output(l);
    }

    private static void output(List<Character> thelist){
        for (Character thing:thelist)
            System.out.printf("%s ", thing);
        System.out.println();
    }


}
