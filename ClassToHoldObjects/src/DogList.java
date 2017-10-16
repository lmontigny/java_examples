public class DogList {
    private dog[] thelist = new dog[5];
    private int i=0;

    public void add(dog d){
        if(i<thelist.length){
            thelist[i] = d;
            System.out.println("dog at inded"+i);
            i++;
        }
    }
}
