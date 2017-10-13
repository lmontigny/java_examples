import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner bucky = new Scanner(System.in);

        int tuna = 5;
        int bass = 18;
        ++tuna;
        System.out.println(tuna);
        System.out.println(++tuna);
        System.out.println(tuna++);
        System.out.println(tuna);
        tuna += 8;
    }
}