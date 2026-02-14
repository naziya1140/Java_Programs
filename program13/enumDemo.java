enum Status{
    Running, Failed, Pending, Success;
    //each value is given ordinal
    //  values(0, 1, 2, 3);
    //Running: 0, Failed: 1, Pending: 2, Success: 3;
}

enum Day{
    //ENUM constants can be written with all caps letter. 
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

public class enumDemo {
    public static void main(String[] args) {
        Status s = Status.Running;
        Status statusArr[] = Status.all();



        System.out.println(s);
        System.out.println(s.ordinal()); //printing ordinal value of enum type.
        System.out.println(statusArr);









    }
}
