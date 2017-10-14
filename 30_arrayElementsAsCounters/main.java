import java.util.Random;

// one class needs to have a main() method
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)  {
	Random rand = new Random();
    int freq[]=new int[7];
    
    for(int i=1;i<1000;i++){
     ++freq[1+rand.nextInt(6)]; 
    }
    
    
    for(int i=1;i<freq.length;i++){
      System.out.println(i+"\t"+freq[i]);
    }               
  }
}

