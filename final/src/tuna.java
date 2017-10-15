public class tuna {
    private int sum;
    private final int NUMBER; // equivalent to const

    public tuna(int x){
        NUMBER = x;
    }

    public void add(){
        sum += NUMBER;
    }

    public String toString(){
        return String.format("sum %d\n", sum);
    }
}
