public class tuna {
    private String first;
    private String last;

    // change with all object
    private static int members = 0;

    public tuna(String fn, String ln){
        first = fn;
        last = ln;
        members++;
        System.out.printf("%s %s %d \n", first, last, members);
    }

    public String getFirst(){
        return first;
    }

    public String getLast(){
        return last;
    }

    public static int getMembers(){
        return members;
    }
}
