import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] stuff ={"babies", "watermelong", "melons", "fudge"};
        LinkedList<String> thelist = new LinkedList<String>(Arrays.asList(stuff));

        thelist.add("pumpikinf");
        thelist.addFirst("firstthing");

        // convert back to array
        stuff = thelist.toArray(new String[thelist.size()]);

        for (String x:stuff)
            System.out.printf("%s ", x);
    }
}
