import java.lang.Math; // headers MUST be above the first class
import java.util.Scanner;

// one class needs to have a main() method
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)  {
   	double amount;
    double principal = 10000;
    double rate = .01;
    
    for(int day=1; day<=20; day++){
    	amount = principal *Math.pow(1+rate,day);	
      	System.out.println(day + " " + amount);
    }

  }
}