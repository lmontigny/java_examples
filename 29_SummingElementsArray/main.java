// one class needs to have a main() method
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)  {
    int bucky[]={23,45,78,4};	
    int sum=0;
    
    for(int i=0; i<bucky.length;i++){
    	sum+=bucky[i];
    }
    
    System.out.println("sum: " + sum);
  }
}

