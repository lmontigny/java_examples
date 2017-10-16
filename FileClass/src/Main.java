import java.io.File;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        File x = new File("C:\\test\\greg.txt");
        if(x.exists())
            System.out.println(x.getName()+ " exist");
        else
            System.out.println(x.getName()+ " not exist");

        final Formatter y;
        try{
            y = new Formatter("fred.txt");
            System.out.println("file created");
        }
        catch(Exception e){
            System.out.println("error not created");

        }

        createFile g = new createFile();
        g.openFile();
        g.addRecords();
        g.closeFile();

        readfile r = new readfile();
        r.openFile();
        r.readFile();
        r.closeFile();

    }
}
