import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of your choice: ");
        String name = sc.next();

        int length= name.length();

        String rev="";
        for(int i=length-1; i>=0; i--)
        {
            rev = rev +name.charAt(i);
        }
        System.out.println(rev);
    }
}
