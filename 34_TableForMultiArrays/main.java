
// one class needs to have a main() method
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)  {
    int first_array[][]={{8,9,10,11},{12,13,14,15}};
    int second_array[][]={{3,4,5},{43},{5,6,7,9}};
    
    display(first_array);
    display(second_array);
  }
  
  public static void display(int x[][]){
    for(int row=0; row<x.length;row++){
      for(int column=0; column<x[row].length; column++){
        System.out.print(x[row][column]+"\t");
      }
      System.out.println();
    }
  }
  
}