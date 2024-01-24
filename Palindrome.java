import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        System.out.println("Enter a number to check whether it is palindrome or not");
        int no=sc.nextInt(); 

        int temp=no;
        int rev=0;
        int rem;

        while(temp!=0)
        {
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }

        if(no == rev)
        {
            System.out.println(no+" no is a palindrome number");
        }
        else{
            System.out.println(no+" no is not a palindrome number");
        }




        // int rev=0;
        // int rem;

        // while(no!=0){
        //     rem=no%10;
        //     rev=rev*10+rem;
        //     no=no/10;
        // }

        // if(no == rev)
        // {
        //     System.out.println("no is a palindrome number");
        // }
        // else
        // {
        //     System.out.println("no is not a palindrom number");
        // }
    }
}

