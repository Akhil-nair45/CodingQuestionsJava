import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a desired number to be reversed :");
        int no = sc.nextInt();

        int rev =0;
        int rem;

        while(no != 0)
        {
            rem=no%10;
            rev= rev*10+rem;
            no=no/10;
        }
        System.out.println(rev);
    }
}
