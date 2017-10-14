import java.util.Random;

// one class needs to have a main() method
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)  {
    int bucky[]={3,4,5,6,7};
    change(bucky);
    
    for(int i:bucky){
     System.out.println(i); 
    }
  }
  
  public static void change(int x[]){
    for(int i=0; i<x.length; i++){
      x[i]+=5; 
    }
  }
}
