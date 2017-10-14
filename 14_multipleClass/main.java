// one class needs to have a main() method
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {  
    tuna tunaObject = new tuna();
    tunaObject.simpleMessage();
  }
}

public class tuna{
  public void simpleMessage(){
    System.out.println("other class");
  }
}
