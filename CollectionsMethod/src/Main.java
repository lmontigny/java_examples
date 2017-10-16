import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] crap = {"apples", "lemons", "gesse", "bacon"};
        List<String > l1 = Arrays.asList(crap);

        Collections.sort(l1);
        System.out.printf("%s \n", l1);
    }
}
