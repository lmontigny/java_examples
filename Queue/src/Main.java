import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here

        PriorityQueue<String> q = new PriorityQueue<String>();

        q.offer("first");
        q.offer("second");
        q.offer("third");

        System.out.printf("%s", q);

        System.out.printf("%s", q.peek());
        System.out.println();

    }
}
