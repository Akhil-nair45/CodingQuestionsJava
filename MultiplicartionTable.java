import java.util.Scanner;

public class MultiplicartionTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to get the table: ");
        int a = sc.nextInt();

        System.out.println("------------------------------------------");

        for(int i =1; i<=10; i++)
        {
            System.out.println(a+"*"+i+"="+a*i);
        }
    }
}
