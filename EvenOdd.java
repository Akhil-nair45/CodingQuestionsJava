import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int n;
                Scanner sc = new Scanner (System.in);
                System.out.println("Enter number of your choice to check whether the number is odd or even");
                n=sc.nextInt();
                // System.out.println(n);
              if(n%2==0){
                System.out.println("Number is even");
              }
              else{
                System.out.println("Number is odd");
              }
    }
}
