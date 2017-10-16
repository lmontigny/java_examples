public class Main {

    public static void main(String[] args) {
        food bucky[] = new food[2];
        bucky[0] = new potpie();
        bucky[1] = new tuna();

        for(int x=0; x<2; ++x){
            bucky[x].eat();
        }

        fatty toto = new fatty();
        food fo = new food();
        food po = new potpie();

        toto.digest(po);

    }
}
