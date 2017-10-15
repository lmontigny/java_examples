import java.util.EnumSet;

public class Main{
    public static void main(String[] args){
        for(tuna people: tuna.values()){
            System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear()) ;
        }

        // get a specific set of data
        for(tuna people: EnumSet.range(tuna.bucky, tuna.candy)){
            System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());

        }
    }

}
