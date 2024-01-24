package Enums;

enum Status{
    Active, Offline, Not_Available
}

public class Enum2 {
    public static void main(String[] args) {
        
        Status s = Status.Not_Available;

        switch(s)
        {
            case Active -> System.out.println("The user is currently online");
            case Not_Available -> System.out.println("The user has been offline for a while!");
            case Offline -> System.out.println("The user is currently offline");
            default -> System.out.println("Done");
        }


       
    }
}
