import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        // int a = 10;
        // int b = 20;

        // a= a+b;
        // b= a-b;
        // a= a-b;

        // System.out.println(a);
        // System.out.println(b);

        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number a: ");
        a=sc.nextInt();


        int b;
        Scanner sc2= new Scanner(System.in);
        System.out.println("Enter the second number b");
        b= sc.nextInt();

        int t;

        t=a;
        a=b;
        b=t;

        System.out.println("value of a after swapping is :"+a);
        System.out.println("Value of b after swapping is :"+b);


        


    }
}
