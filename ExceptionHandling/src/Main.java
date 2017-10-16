import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("First num:");
            int n1 = input.nextInt();
            System.out.println("Second num:");
            int n2 = input.nextInt();

            int sum = n1 / n2;
            System.out.println(sum);
        }
        catch (Exception e){

        }
    }
}
