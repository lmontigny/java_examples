// one class needs to have a main() method
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {  
    tuna tunaObject = new tuna("Marie");
    tunaObject.saying();
  }
}

public class tuna{
  private String girlName;
  
  public tuna(String name){
   	girlName = name; 
  }
    
  public void setName(String name){
  	girlName = name;
  }
  public String getName(){
  	return girlName;
  }
  public void saying(){
  	System.out.printf("foo was %s", getName());
  }
  
}
