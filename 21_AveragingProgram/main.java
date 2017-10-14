
import java.lang.Math; // headers MUST be above the first class
import java.util.Scanner;

// one class needs to have a main() method
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
		Scanner input = new Scanner(System.in);
    	int total = 0;
    	int grade;
    	int average;
    	int counter = 0;
            
        while(counter < 10) {
            
            total += input.nextInt();
            
            counter++;
        }
        average = total / 10;
       
        System.out.println("Your average = " + average);

}
}
