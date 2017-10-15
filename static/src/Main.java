public class Main {

    public static void main(String[] args) {
        tuna member1 = new tuna("Megan", "fox");
        tuna member2 = new tuna("nathalie", "portman");
        tuna member3 = new tuna("taylor", "fu");

        System.out.println();
        System.out.println(member2.getFirst());
        System.out.println(member2.getLast());
        System.out.println(member2.getMembers());

        // Can use directly the class name for static method
        System.out.println(tuna.getMembers());
    }


}
