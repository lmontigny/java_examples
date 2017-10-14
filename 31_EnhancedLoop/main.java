
import java.util.Random;

// one class needs to have a main() method
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)  {
    int bucky[]={3,4,6,7};
    int total=0;
    
    for(int x: bucky){
     total +=x; 
    }
    
    System.out.println(total);

  }
}
