import java.util.*;
public class Main {

    public static void main(String[] args) {
        Integer[] iray = {1,2,3,4};
        Character[] cray = {'b','u','c','y'};

        printME(iray);
        printME(cray);

        System.out.println(max(23,42,1));
        System.out.println(max("apple", "tot", "chickens"));
    }

    /*
    public static void printME(Integer[] i){
        for (Integer x:i)
            System.out.printf("%s ", x);
        System.out.println();
    }

    public static void printME(Character[] i){
        for (Character x:i)
            System.out.printf("%s ", x);
        System.out.println();
    }
    */

    // generic method
    public static <T> void printME(T[] i){
        for (T x:i)
            System.out.printf("%s ", x);
        System.out.println();
    }

    public static <T extends Comparable<T>> T max(T a, T b, T c){
        T m = a;

        if(b.compareTo(a) > 0)
            m = b;

        if(c.compareTo(m) > 0)
            m = c;

        return m;
    }
}
