import java.util.Scanner;

// one class needs to have a main() method
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {  
    Scanner input = new Scanner(System.in);
    tuna tunaObject = new tuna();
    
    String name = input.nextLine(); // nextLine() for string
    tunaObject.simpleMessage(name);
  }
}

public class tuna{
  public void simpleMessage(String name){
    System.out.println("Hello " + name);
  }
}
