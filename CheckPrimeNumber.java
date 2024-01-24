import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number to check whether it is prime or not :");
        int no= sc.nextInt();

        int temp=0;


        for(int i =2; i<=no-1; i++)
        {
            if(no%i==0)
            {
                temp=temp+1;
            }
            
        }
        if(temp>0)
        {
            System.out.println("No is not a Prime Number");
        }
        else{
            System.out.println(no+" is a prime Number");
        }

        
    }
}
