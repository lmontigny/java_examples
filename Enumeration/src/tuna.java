
public enum tuna{
    bucky("nice", "22"),
    sarah("cutie", "10"),
    marie("bigmistake","12"),
    nicole("spanien","13"),
    candy("different", "14"),
    erin("iw", "16");

    private final String desc;
    private final String year;

    tuna(String description, String birthday){
        desc = description;
        year = birthday;
    }

    public String getDesc(){
        return desc;
    }

    public String getYear(){
        return year;
    }
}


