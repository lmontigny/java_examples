import java.util.*;

public class Main {

    public static void main(String[] args) {

        String[] words = {"funk", "chunk", "furry", "baconator"};

        for(String w:words){
            if(w.startsWith("fu"))
                System.out.println(w+ "starts with fu");
        }

        String s ="buckyrobertsbuckyroberts";
        System.out.println(s.indexOf('k',5));

        String a = "bacon";
        String b = "monster  ";

        System.out.println(a.concat(b));
        System.out.println(a.replace('b', 'f'));
        System.out.println(b.toUpperCase());
        System.out.println(b.trim());
    }
}
