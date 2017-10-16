import  java.io.*;
import java.lang.*;
import java.util.*;

public class createFile {
    private Formatter x;
    public void openFile(){
        try{
            x = new Formatter("chinese.txt");
        }
        catch (Exception e){
            System.out.println("error");
        }
    }

    public void addRecords(){
        x.format("%s %s %s", "20", "bucky", "roberts");
    }

    public void closeFile(){
        x.close();
    }
}
