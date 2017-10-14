import java.lang.Math; // headers MUST be above the first class
import java.util.Scanner;
import java.util.Random;

// one class needs to have a main() method
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)  {
	Random dice = new Random();
    int number;
    
    for(int counter=1; counter<=10; counter++){
    	number = 1+dice.nextInt(6);
      	System.out.println(number);
    }

    
  }
}
