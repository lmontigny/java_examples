public class Main {

    public static void main(String[] args) {
        DogList DLO = new DogList();
        dog d = new dog();
        DLO.add(d);

        AnimalList ALO = new AnimalList();
        dog d = new dog();
        fish f = new fish();
        ALO.add(d);
        DLO.add(f);


    }
}
