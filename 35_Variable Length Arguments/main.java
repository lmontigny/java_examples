
// one class needs to have a main() method
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)  {
 	System.out.println(average(4,4,5,7));
  }
  

  public static int average(int...numbers){
   	int total = 0;
    for(int x:numbers){
      total+=x;
    }
    return total/numbers.length;
  }
}


