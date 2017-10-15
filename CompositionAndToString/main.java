
public class tuna{
    private String name;
    private potpie birthday;
    
    public tuna(String theName, potpie theDate){
         name = theName;
      birthday = theDate;
      
    }
    
    public String toString(){
         return String.format("%s, %s", name, birthday);
    }

    /*
    Equivalent in C++ to the overload operator
    class A {
        public:
          int i;
        };
        
        std::ostream& operator<<(std::ostream &strm, const A &a) {
          return strm << "A(" << a.i << ")";
        }
    */
    
  }
  
  public class potpie{
    private int month; 
    private int day;
    private int year;
    
    public potpie(int m, int d, int y){
        month = m;
      day = d;
      year = y;
      
      System.out.printf("%s\n",this);
    
    }
    
    public String toString(){
         return String.format("%d/%d/%d",month, day, year); 
    }
  }
  
  public class apples{
    public static void main(String[] args){
      potpie potObject = new potpie(4,5,6);
      tuna tunaObject = new tuna("toto", potObject);
      
      System.out.println(tunaObject);
      
    }
    
  }